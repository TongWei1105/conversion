package com.tongwei.bigdata.parser;

import com.tongwei.bigdata.spark.SparkSqlParser;
import com.tongwei.bigdata.trino.TrinoSqlParser;

/**
 * Created on 2021/8/10.
 *
 * @author 黑皮大野猪
 */
public class ParserFactory {

    public static IParser getParser(EngineType engine){
        if (EngineType.TRINO == engine) {
            return new TrinoSqlParser();
        } else if (EngineType.SPARK == engine) {
            return new SparkSqlParser();
        } else {
            throw new UnsupportedOperationException("Unsupported engine: " + engine.name());
        }
    }
}
