package com.tongwei.bigdata.spark;

import java.util.SortedMap;

/**
 * Created on 2021/8/12.
 *
 * @author 黑皮大野猪
 */
public final class SparkSqlFormatter {

    private SparkSqlFormatter() {
    }

    public static String formatSql(String query, SortedMap<Integer, Substitute> substitutes) {
        StringBuilder formatQuery = new StringBuilder();
        int start;
        int stop = -1;

        for(Substitute substitute: substitutes.values()){
            start = stop + 1;
            stop = substitute.getStart();
            formatQuery.append(query, start, stop);
            formatQuery.append(substitute.getValue());
            stop = substitute.getStop();
        }

        return formatQuery.append(query, stop + 1, query.length()).toString();
    }
}
