package com.tongwei.bigdata.trino;

import com.tongwei.bigdata.parser.IParser;
import io.trino.sql.parser.ParsingOptions;
import io.trino.sql.parser.SqlParser;
import io.trino.sql.tree.Statement;

/**
 * Created on 2021/8/10.
 *
 * @author 黑皮大野猪
 */
public class TrinoSqlParser implements IParser {

    private SqlParser sqlParser;
    private ParsingOptions parsingOptions;

    public TrinoSqlParser() {
        this.sqlParser = new SqlParser();
        this.parsingOptions = new ParsingOptions(ParsingOptions.DecimalLiteralTreatment.AS_DECIMAL);
    }

    @Override
    public String parser(String query) {
        Statement wrappedStatement = sqlParser.createStatement(query, parsingOptions);
        return (TrinoSqlFormatter.formatSql(wrappedStatement));
    }
}
