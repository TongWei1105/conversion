import com.tongwei.bigdata.parser.EngineType;
import com.tongwei.bigdata.parser.IParser;
import com.tongwei.bigdata.parser.ParserFactory;
import org.junit.Test;

/**
 * Created on 2021/12/15.
 *
 * @author 黑皮大野猪
 */
public class SqlParserSuite {

    @Test
    public void parseSpark() {
        IParser sparkParser = ParserFactory.getParser(EngineType.SPARK);
        String sql0 = "select rand();";
        String sql1 = "select rand_new();";
        System.out.println(sparkParser.parser(sql0));
        System.out.println(sparkParser.parser(sql1));
        assert sparkParser.parser(sql0).equals(sparkParser.parser(sql1));
    }

    @Test
    public void parseTrino() {
        IParser trinoParser = ParserFactory.getParser(EngineType.TRINO);
        String trinoFormatSql = trinoParser.parser("SELECT cast(c as float) from a.1w where id in (\"我\", '问问') and pt = max_pt(a.1w)");
        System.out.println(trinoFormatSql);
    }
}
