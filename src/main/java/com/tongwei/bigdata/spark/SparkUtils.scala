package com.tongwei.bigdata.spark

import java.util
import java.util.{ArrayList => JArrayList, List => JList}

/**
 * Created on 2022/1/24.
 *
 * @author 黑皮大野猪
 */
object SparkUtils {

  // Adapted splitSemiColon from Hive 2.3's CliDriver.splitSemiColon.
  // Note: [SPARK-31595] if there is a `'` in a double quoted string, or a `"` in a single quoted
  // string, the origin implementation from Hive will not drop the trailing semicolon as expected,
  // hence we refined this function a little bit.
  // Note: [SPARK-33100] Ignore a semicolon inside a bracketed comment in spark-sql.
  def splitSemiColon(line: String): JList[String] = {
    var insideSingleQuote = false
    var insideDoubleQuote = false
    var insideSimpleComment = false
    var bracketedCommentLevel = 0
    var escape = false
    var beginIndex = 0
    var leavingBracketedComment = false
    var isStatement = false
    val ret = new JArrayList[String]
    val substitutes: util.Map[Int, Char] = new util.HashMap()

    def insideBracketedComment: Boolean = bracketedCommentLevel > 0
    def insideComment: Boolean = insideSimpleComment || insideBracketedComment
    def statementInProgress(index: Int): Boolean = isStatement || (!insideComment &&
      index > beginIndex && !s"${line.charAt(index)}".trim.isEmpty)
    def replaceChineseChar(line: String, substitutes: util.Map[Int, Char]): String = {
      val statement = new StringBuilder(line)
      substitutes.keySet().forEach(key =>
        statement.setCharAt(key, substitutes.get(key))
      )
      statement.toString()
    }

    for (index <- 0 until line.length) {
      // Checks if we need to decrement a bracketed comment level; the last character '/' of
      // bracketed comments is still inside the comment, so `insideBracketedComment` must keep true
      // in the previous loop and we decrement the level here if needed.
      if (leavingBracketedComment) {
        bracketedCommentLevel -= 1
        leavingBracketedComment = false
      }

      if (line.charAt(index) == '\'' && !insideComment) {
        // take a look to see if it is escaped
        // See the comment above about SPARK-31595
        if (!escape && !insideDoubleQuote) {
          // flip the boolean variable
          insideSingleQuote = !insideSingleQuote
        }
      } else if (line.charAt(index) == '\"' && !insideComment) {
        // take a look to see if it is escaped
        // See the comment above about SPARK-31595
        if (!escape && !insideSingleQuote) {
          // flip the boolean variable
          insideDoubleQuote = !insideDoubleQuote
        }
      } else if (line.charAt(index) == '-') {
        val hasNext = index + 1 < line.length
        if (insideDoubleQuote || insideSingleQuote || insideComment) {
          // Ignores '-' in any case of quotes or comment.
          // Avoids to start a comment(--) within a quoted segment or already in a comment.
          // Sample query: select "quoted value --"
          //                                    ^^ avoids starting a comment if it's inside quotes.
        } else if (hasNext && line.charAt(index + 1) == '-') {
          // ignore quotes and ; in simple comment
          insideSimpleComment = true
        }
      } else if (line.charAt(index) == '（' || line.charAt(index) == '）' || line.charAt(index) == '，') {
        if (insideSingleQuote || insideDoubleQuote || insideComment) {
          // do nothing
        } else {
          substitutes.put(index, (line.charAt(index).toInt - 65248).toChar)
        }
      } else if (line.charAt(index) == ';' || line.charAt(index) == '；') {
        if (insideSingleQuote || insideDoubleQuote || insideComment) {
          // do not split
        } else {
          if (isStatement) {
            // split, do not include ; itself
            val statement = replaceChineseChar(line, substitutes)
            ret.add(statement.substring(beginIndex, index))
            substitutes.clear()
          }
          beginIndex = index + 1
          isStatement = false
        }
      } else if (line.charAt(index) == '\n') {
        // with a new line the inline simple comment should end.
        if (!escape) {
          insideSimpleComment = false
        }
      } else if (line.charAt(index) == '/' && !insideSimpleComment) {
        val hasNext = index + 1 < line.length
        if (insideSingleQuote || insideDoubleQuote) {
          // Ignores '/' in any case of quotes
        } else if (insideBracketedComment && line.charAt(index - 1) == '*' ) {
          // Decrements `bracketedCommentLevel` at the beginning of the next loop
          leavingBracketedComment = true
        } else if (hasNext && !insideBracketedComment && line.charAt(index + 1) == '*') {
          bracketedCommentLevel += 1
        }
      }
      // set the escape
      if (escape) {
        escape = false
      } else if (line.charAt(index) == '\\') {
        escape = true
      }

      isStatement = statementInProgress(index)
    }
    if (isStatement) {
      val statement = replaceChineseChar(line, substitutes)
      ret.add(statement.substring(beginIndex))
      substitutes.clear()
    }
    ret
  }
}
