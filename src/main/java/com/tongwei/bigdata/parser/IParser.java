package com.tongwei.bigdata.parser;

/**
 * Created on 2021/8/10.
 *
 * @author 黑皮大野猪
 */
public interface IParser {

    /**
     * convert query to spark/trino query format
     * @param query
     * @return spark/trino query string
     */
    String parser(String query);
}
