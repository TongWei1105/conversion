package com.tongwei.bigdata.spark;

import antlr4.org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import antlr4.org.apache.spark.sql.catalyst.parser.SqlBaseParser;
import org.antlr.v4.runtime.*;

import java.util.SortedMap;

/**
 * Created on 2021/8/12.
 *
 * @author 黑皮大野猪
 */
public class SqlParser {

    private static final BaseErrorListener LEXER_ERROR_LISTENER = new BaseErrorListener()
    {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String message, RecognitionException e)
        {
            throw new ParsingException(message, e, line, charPositionInLine + 1);
        }
    };

    public SqlParser() {
    }

    public SortedMap<Integer, Substitute> createStatement(String query) {
        SparkSqlVisitor sparkSqlVisitor = new SparkSqlVisitor();
        SqlBaseLexer lexer = new SqlBaseLexer(new UpperCaseCharStream(CharStreams.fromString(query)));
        lexer.removeErrorListeners();
        lexer.addErrorListener(LEXER_ERROR_LISTENER);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(LEXER_ERROR_LISTENER);
        sparkSqlVisitor.visitSingleStatement(parser.singleStatement());
        return sparkSqlVisitor.sortedMap;
    }


}
