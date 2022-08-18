package com.tongwei.bigdata.spark;

import com.tongwei.bigdata.parser.IParser;

import java.util.List;
import java.util.SortedMap;

/**
 * Created on 2021/8/11.
 *
 * @author 黑皮大野猪
 */
public class SparkSqlParser implements IParser {

    private SqlParser sqlParser;

    public SparkSqlParser() {
        this.sqlParser = new SqlParser();
    }

    @Override
    public String parser(String query) {
        List<String> queries = SparkUtils.splitSemiColon(query);
        StringBuilder sb = new StringBuilder();
        for (String qs: queries){
            SortedMap<Integer, Substitute> replaceList = this.sqlParser.createStatement(qs);
            String rq = SparkSqlFormatter.formatSql(qs, replaceList);
            if (!rq.trim().equals("")){
                sb.append(rq).append(";\n");
            }
        }
        return sb.toString();
    }
}

