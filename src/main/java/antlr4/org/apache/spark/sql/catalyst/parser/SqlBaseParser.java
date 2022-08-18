// Generated from /Users/weitong/Data/conversion/src/main/java/antlr4/org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.9.2
package antlr4.org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		COST=52, CREATE=53, CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, 
		CURRENT_TIMESTAMP=59, CURRENT_USER=60, DATA=61, DATABASE=62, DATABASES=63, 
		DBPROPERTIES=64, DEFAULT=65, DEFINED=66, DELETE=67, DELIMITED=68, DESC=69, 
		DESCRIBE=70, DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, DISTRIBUTE=75, 
		DIV=76, DROP=77, ELSE=78, END=79, ESCAPE=80, ESCAPED=81, EXCEPT=82, EXCHANGE=83, 
		EXISTS=84, EXPLAIN=85, EXPORT=86, EXTENDED=87, EXTERNAL=88, EXTRACT=89, 
		FALSE=90, FETCH=91, FIELDS=92, FILTER=93, FILEFORMAT=94, FIRST=95, FOLLOWING=96, 
		FOR=97, FOREIGN=98, FORMAT=99, FORMATTED=100, FROM=101, FULL=102, FUNCTION=103, 
		FUNCTIONS=104, GLOBAL=105, GRANT=106, GROUP=107, GROUPING=108, HAVING=109, 
		IF=110, IGNORE=111, IMPORT=112, IN=113, INDEX=114, INDEXES=115, INNER=116, 
		INPATH=117, INPUTFORMAT=118, INSERT=119, INTERSECT=120, INTERVAL=121, 
		INTO=122, IS=123, ITEMS=124, JOIN=125, KEYS=126, LAST=127, LATERAL=128, 
		LAZY=129, LEADING=130, LEFT=131, LIFECYCLE=132, LIKE=133, LIMIT=134, LINES=135, 
		LIST=136, LOAD=137, LOCAL=138, LOCATION=139, LOCK=140, LOCKS=141, LOGICAL=142, 
		MACRO=143, MAP=144, MATCHED=145, MERGE=146, MSCK=147, NAMESPACE=148, NAMESPACES=149, 
		NATURAL=150, NO=151, NOT=152, NULL=153, NULLS=154, OF=155, ON=156, ONLY=157, 
		OPTION=158, OPTIONS=159, OR=160, ORDER=161, OUT=162, OUTER=163, OUTPUTFORMAT=164, 
		OVER=165, OVERLAPS=166, OVERLAY=167, OVERWRITE=168, PARTITION=169, PARTITIONED=170, 
		PARTITIONS=171, PERCENTLIT=172, PIVOT=173, PLACING=174, POSITION=175, 
		PRECEDING=176, PRIMARY=177, PRINCIPALS=178, PROPERTIES=179, PURGE=180, 
		QUERY=181, RANGE=182, RECORDREADER=183, RECORDWRITER=184, RECOVER=185, 
		REDUCE=186, REFERENCES=187, REFRESH=188, RENAME=189, REPAIR=190, REPLACE=191, 
		RESET=192, RESTRICT=193, REVOKE=194, RIGHT=195, RLIKE=196, ROLE=197, ROLES=198, 
		ROLLBACK=199, ROLLUP=200, ROW=201, ROWS=202, SCHEMA=203, SELECT=204, SEMI=205, 
		SEPARATED=206, SERDE=207, SERDEPROPERTIES=208, SESSION_USER=209, SET=210, 
		SETMINUS=211, SETS=212, SHOW=213, SKEWED=214, SMALLFILES=215, SOME=216, 
		SORT=217, SORTED=218, START=219, STATISTICS=220, STORED=221, STRATIFY=222, 
		STRUCT=223, SUBSTR=224, SUBSTRING=225, TABLE=226, TABLES=227, TABLESAMPLE=228, 
		TBLPROPERTIES=229, TEMPORARY=230, TERMINATED=231, THEN=232, TIME=233, 
		TO=234, TOUCH=235, TRAILING=236, TRANSACTION=237, TRANSACTIONS=238, TRANSFORM=239, 
		TRIM=240, TRUE=241, TRUNCATE=242, TYPE=243, UNARCHIVE=244, UNBOUNDED=245, 
		UNCACHE=246, UNION=247, UNIQUE=248, UNKNOWN=249, UNLOCK=250, UNSET=251, 
		UPDATE=252, USE=253, USER=254, USING=255, VALUES=256, VIEW=257, VIEWS=258, 
		WHEN=259, WHERE=260, WINDOW=261, WITH=262, ZONE=263, EQ=264, NSEQ=265, 
		NEQ=266, NEQJ=267, LT=268, LTE=269, GT=270, GTE=271, PLUS=272, MINUS=273, 
		ASTERISK=274, SLASH=275, PERCENT=276, TILDE=277, AMPERSAND=278, PIPE=279, 
		CONCAT_PIPE=280, HAT=281, STRING=282, BIGINT_LITERAL=283, SMALLINT_LITERAL=284, 
		TINYINT_LITERAL=285, INTEGER_VALUE=286, EXPONENT_VALUE=287, DECIMAL_VALUE=288, 
		FLOAT_LITERAL=289, DOUBLE_LITERAL=290, BIGDECIMAL_LITERAL=291, IDENTIFIER=292, 
		BACKQUOTED_IDENTIFIER=293, SIMPLE_COMMENT=294, BRACKETED_COMMENT=295, 
		WS=296, UNRECOGNIZED=297;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_defaultSpec = 16, RULE_commentSpec = 17, 
		RULE_lifecycleSpec = 18, RULE_query = 19, RULE_insertInto = 20, RULE_partitionSpecLocation = 21, 
		RULE_partitionSpec = 22, RULE_partitionVal = 23, RULE_namespace = 24, 
		RULE_describeFuncName = 25, RULE_describeColName = 26, RULE_ctes = 27, 
		RULE_namedQuery = 28, RULE_tableProvider = 29, RULE_createTableClauses = 30, 
		RULE_tablePropertyList = 31, RULE_tableProperty = 32, RULE_tablePropertyKey = 33, 
		RULE_tablePropertyValue = 34, RULE_constantList = 35, RULE_nestedConstantList = 36, 
		RULE_createFileFormat = 37, RULE_fileFormat = 38, RULE_storageHandler = 39, 
		RULE_resource = 40, RULE_dmlStatementNoWith = 41, RULE_queryOrganization = 42, 
		RULE_multiInsertQueryBody = 43, RULE_queryTerm = 44, RULE_queryPrimary = 45, 
		RULE_sortItem = 46, RULE_fromStatement = 47, RULE_fromStatementBody = 48, 
		RULE_querySpecification = 49, RULE_transformClause = 50, RULE_selectClause = 51, 
		RULE_setClause = 52, RULE_matchedClause = 53, RULE_notMatchedClause = 54, 
		RULE_matchedAction = 55, RULE_notMatchedAction = 56, RULE_assignmentList = 57, 
		RULE_assignment = 58, RULE_whereClause = 59, RULE_havingClause = 60, RULE_hint = 61, 
		RULE_hintStatement = 62, RULE_fromClause = 63, RULE_aggregationClause = 64, 
		RULE_groupByClause = 65, RULE_groupingAnalytics = 66, RULE_groupingElement = 67, 
		RULE_groupingSet = 68, RULE_pivotClause = 69, RULE_pivotColumn = 70, RULE_pivotValue = 71, 
		RULE_lateralView = 72, RULE_setQuantifier = 73, RULE_relation = 74, RULE_joinRelation = 75, 
		RULE_joinType = 76, RULE_joinCriteria = 77, RULE_sample = 78, RULE_sampleMethod = 79, 
		RULE_identifierList = 80, RULE_identifierSeq = 81, RULE_orderedIdentifierList = 82, 
		RULE_orderedIdentifier = 83, RULE_identifierCommentList = 84, RULE_identifierComment = 85, 
		RULE_relationPrimary = 86, RULE_inlineTable = 87, RULE_functionTable = 88, 
		RULE_tableAlias = 89, RULE_rowFormat = 90, RULE_multipartIdentifierList = 91, 
		RULE_multipartIdentifier = 92, RULE_tableIdentifier = 93, RULE_functionIdentifier = 94, 
		RULE_namedExpression = 95, RULE_namedExpressionSeq = 96, RULE_partitionFieldList = 97, 
		RULE_partitionField = 98, RULE_transform = 99, RULE_transformArgument = 100, 
		RULE_expression = 101, RULE_booleanExpression = 102, RULE_predicate = 103, 
		RULE_valueExpression = 104, RULE_primaryExpression = 105, RULE_constant = 106, 
		RULE_comparisonOperator = 107, RULE_arithmeticOperator = 108, RULE_predicateOperator = 109, 
		RULE_booleanValue = 110, RULE_interval = 111, RULE_errorCapturingMultiUnitsInterval = 112, 
		RULE_multiUnitsInterval = 113, RULE_errorCapturingUnitToUnitInterval = 114, 
		RULE_unitToUnitInterval = 115, RULE_intervalValue = 116, RULE_colPosition = 117, 
		RULE_dataType = 118, RULE_qualifiedColTypeWithPositionList = 119, RULE_qualifiedColTypeWithPosition = 120, 
		RULE_colTypeList = 121, RULE_colType = 122, RULE_complexColTypeList = 123, 
		RULE_complexColType = 124, RULE_whenClause = 125, RULE_windowClause = 126, 
		RULE_namedWindow = 127, RULE_windowSpec = 128, RULE_windowFrame = 129, 
		RULE_frameBound = 130, RULE_qualifiedNameList = 131, RULE_functionName = 132, 
		RULE_qualifiedName = 133, RULE_errorCapturingIdentifier = 134, RULE_errorCapturingIdentifierExtra = 135, 
		RULE_identifier = 136, RULE_strictIdentifier = 137, RULE_quotedIdentifier = 138, 
		RULE_number = 139, RULE_alterColumnAction = 140, RULE_ansiNonReserved = 141, 
		RULE_strictNonReserved = 142, RULE_nonReserved = 143;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "defaultSpec", 
			"commentSpec", "lifecycleSpec", "query", "insertInto", "partitionSpecLocation", 
			"partitionSpec", "partitionVal", "namespace", "describeFuncName", "describeColName", 
			"ctes", "namedQuery", "tableProvider", "createTableClauses", "tablePropertyList", 
			"tableProperty", "tablePropertyKey", "tablePropertyValue", "constantList", 
			"nestedConstantList", "createFileFormat", "fileFormat", "storageHandler", 
			"resource", "dmlStatementNoWith", "queryOrganization", "multiInsertQueryBody", 
			"queryTerm", "queryPrimary", "sortItem", "fromStatement", "fromStatementBody", 
			"querySpecification", "transformClause", "selectClause", "setClause", 
			"matchedClause", "notMatchedClause", "matchedAction", "notMatchedAction", 
			"assignmentList", "assignment", "whereClause", "havingClause", "hint", 
			"hintStatement", "fromClause", "aggregationClause", "groupByClause", 
			"groupingAnalytics", "groupingElement", "groupingSet", "pivotClause", 
			"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
			"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
			"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
			"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
			"functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
			"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
			"namedExpressionSeq", "partitionFieldList", "partitionField", "transform", 
			"transformArgument", "expression", "booleanExpression", "predicate", 
			"valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
			"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
			"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
			"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
			"ansiNonReserved", "strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFAULT'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", 
			"'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", 
			"'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", 
			"'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", 
			"'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", 
			"'HAVING'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIFECYCLE'", "'LIKE'", "'LIMIT'", 
			"'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", 
			"'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MSCK'", "'NAMESPACE'", 
			"'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", 
			"'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", 
			"'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", 
			"'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", "'PIVOT'", 
			"'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", null, "'ROLE'", 
			"'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SELECT'", 
			"'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", 
			"'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SMALLFILES'", "'SOME'", 
			"'SORT'", "'SORTED'", "'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", 
			"'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", 
			"'TBLPROPERTIES'", null, "'TERMINATED'", "'THEN'", "'TIME'", "'TO'", 
			"'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", 
			"'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", 
			"'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", "'UNSET'", 
			"'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", "'VIEWS'", 
			"'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'ZONE'", null, "'<=>'", "'<>'", 
			"'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'~'", "'&'", "'|'", "'||'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFAULT", "DEFINED", 
			"DELETE", "DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", 
			"DISTINCT", "DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", 
			"EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", 
			"EXTRACT", "FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", 
			"FOLLOWING", "FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", 
			"FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", 
			"IF", "IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", 
			"INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", 
			"JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIFECYCLE", 
			"LIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", 
			"LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MSCK", "NAMESPACE", 
			"NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", 
			"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
			"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
			"PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", 
			"PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPLACE", "RESET", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", 
			"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SELECT", 
			"SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", 
			"SETMINUS", "SETS", "SHOW", "SKEWED", "SMALLFILES", "SOME", "SORT", "SORTED", 
			"START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", 
			"TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", 
			"THEN", "TIME", "TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", 
			"TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", 
			"UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", 
			"USE", "USER", "USING", "VALUES", "VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", 
			"WITH", "ZONE", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", 
			"PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			statement();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(289);
				match(T__0);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			namedExpression();
			setState(298);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			tableIdentifier();
			setState(301);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			multipartIdentifier();
			setState(304);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			functionIdentifier();
			setState(307);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			dataType();
			setState(310);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			colTypeList();
			setState(313);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeSmallFilesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode SMALLFILES() { return getToken(SqlBaseParser.SMALLFILES, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public MergeSmallFilesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMergeSmallFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMergeSmallFiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMergeSmallFiles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(316);
					ctes();
					}
				}

				setState(319);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(USE);
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(321);
					match(NAMESPACE);
					}
					break;
				}
				setState(324);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(CREATE);
				setState(326);
				namespace();
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(327);
					match(IF);
					setState(328);
					match(NOT);
					setState(329);
					match(EXISTS);
					}
					break;
				}
				setState(332);
				multipartIdentifier();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(338);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(333);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(334);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(335);
						match(WITH);
						setState(336);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(ALTER);
				setState(344);
				namespace();
				setState(345);
				multipartIdentifier();
				setState(346);
				match(SET);
				setState(347);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(348);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				match(ALTER);
				setState(351);
				namespace();
				setState(352);
				multipartIdentifier();
				setState(353);
				match(SET);
				setState(354);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
				match(DROP);
				setState(357);
				namespace();
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(358);
					match(IF);
					setState(359);
					match(EXISTS);
					}
					break;
				}
				setState(362);
				multipartIdentifier();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(363);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				match(SHOW);
				setState(367);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(368);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(369);
					multipartIdentifier();
					}
				}

				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(372);
						match(LIKE);
						}
					}

					setState(375);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(378);
				createTableHeader();
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(379);
					match(T__1);
					setState(380);
					colTypeList();
					setState(381);
					match(T__2);
					}
					break;
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(385);
					tableProvider();
					}
				}

				setState(388);
				createTableClauses();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (REDUCE - 186)) | (1L << (SELECT - 186)) | (1L << (TABLE - 186)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(389);
						match(AS);
						}
					}

					setState(392);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(395);
				match(CREATE);
				setState(396);
				match(TABLE);
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(397);
					match(IF);
					setState(398);
					match(NOT);
					setState(399);
					match(EXISTS);
					}
					break;
				}
				setState(402);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(403);
				match(LIKE);
				setState(404);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || _la==ROW || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (STORED - 221)) | (1L << (TBLPROPERTIES - 221)) | (1L << (USING - 221)))) != 0)) {
					{
					setState(411);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(405);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(406);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(407);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(408);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(409);
						match(TBLPROPERTIES);
						setState(410);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(416);
				replaceTableHeader();
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(417);
					match(T__1);
					setState(418);
					colTypeList();
					setState(419);
					match(T__2);
					}
					break;
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(423);
					tableProvider();
					}
				}

				setState(426);
				createTableClauses();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (REDUCE - 186)) | (1L << (SELECT - 186)) | (1L << (TABLE - 186)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(427);
						match(AS);
						}
					}

					setState(430);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(433);
				match(ANALYZE);
				setState(434);
				match(TABLE);
				setState(435);
				multipartIdentifier();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(436);
					partitionSpec();
					}
				}

				setState(439);
				match(COMPUTE);
				setState(440);
				match(STATISTICS);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(441);
					identifier();
					}
					break;
				case 2:
					{
					setState(442);
					match(FOR);
					setState(443);
					match(COLUMNS);
					setState(444);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(445);
					match(FOR);
					setState(446);
					match(ALL);
					setState(447);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(450);
				match(ALTER);
				setState(451);
				match(TABLE);
				setState(452);
				multipartIdentifier();
				setState(453);
				match(ADD);
				setState(454);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 14:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(457);
				match(ALTER);
				setState(458);
				match(TABLE);
				setState(459);
				multipartIdentifier();
				setState(460);
				match(ADD);
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(462);
				match(T__1);
				setState(463);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(464);
				match(T__2);
				}
				break;
			case 15:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(466);
				match(ALTER);
				setState(467);
				match(TABLE);
				setState(468);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(469);
				match(RENAME);
				setState(470);
				match(COLUMN);
				setState(471);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(472);
				match(TO);
				setState(473);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 16:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(475);
				match(ALTER);
				setState(476);
				match(TABLE);
				setState(477);
				multipartIdentifier();
				setState(478);
				match(DROP);
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
				match(T__1);
				setState(481);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(482);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(484);
				match(ALTER);
				setState(485);
				match(TABLE);
				setState(486);
				multipartIdentifier();
				setState(487);
				match(DROP);
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 18:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(491);
				match(ALTER);
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(494);
				match(RENAME);
				setState(495);
				match(TO);
				setState(496);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 19:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(498);
				match(ALTER);
				setState(499);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(500);
				multipartIdentifier();
				setState(501);
				match(SET);
				setState(502);
				match(TBLPROPERTIES);
				setState(503);
				tablePropertyList();
				}
				break;
			case 20:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(505);
				match(ALTER);
				setState(506);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(507);
				multipartIdentifier();
				setState(508);
				match(UNSET);
				setState(509);
				match(TBLPROPERTIES);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(510);
					match(IF);
					setState(511);
					match(EXISTS);
					}
				}

				setState(514);
				tablePropertyList();
				}
				break;
			case 21:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(516);
				match(ALTER);
				setState(517);
				match(TABLE);
				setState(518);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(520);
					match(COLUMN);
					}
					break;
				}
				setState(523);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(524);
					alterColumnAction();
					}
				}

				}
				break;
			case 22:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(527);
				match(ALTER);
				setState(528);
				match(TABLE);
				setState(529);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(530);
					partitionSpec();
					}
				}

				setState(533);
				match(CHANGE);
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(534);
					match(COLUMN);
					}
					break;
				}
				setState(537);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(538);
				colType();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(539);
					colPosition();
					}
				}

				}
				break;
			case 23:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(542);
				match(ALTER);
				setState(543);
				match(TABLE);
				setState(544);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(545);
					partitionSpec();
					}
				}

				setState(548);
				match(REPLACE);
				setState(549);
				match(COLUMNS);
				setState(550);
				match(T__1);
				setState(551);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(552);
				match(T__2);
				}
				break;
			case 24:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(554);
				match(ALTER);
				setState(555);
				match(TABLE);
				setState(556);
				multipartIdentifier();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(557);
					partitionSpec();
					}
				}

				setState(560);
				match(SET);
				setState(561);
				match(SERDE);
				setState(562);
				match(STRING);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(563);
					match(WITH);
					setState(564);
					match(SERDEPROPERTIES);
					setState(565);
					tablePropertyList();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(568);
				match(ALTER);
				setState(569);
				match(TABLE);
				setState(570);
				multipartIdentifier();
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(571);
					partitionSpec();
					}
				}

				setState(574);
				match(SET);
				setState(575);
				match(SERDEPROPERTIES);
				setState(576);
				tablePropertyList();
				}
				break;
			case 26:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(578);
				match(ALTER);
				setState(579);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(580);
				multipartIdentifier();
				setState(581);
				match(ADD);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(582);
					match(IF);
					setState(583);
					match(NOT);
					setState(584);
					match(EXISTS);
					}
				}

				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(587);
					partitionSpecLocation();
					}
					}
					setState(590); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 27:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(592);
				match(ALTER);
				setState(593);
				match(TABLE);
				setState(594);
				multipartIdentifier();
				setState(595);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(596);
				match(RENAME);
				setState(597);
				match(TO);
				setState(598);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 28:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(600);
				match(ALTER);
				setState(601);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(602);
				multipartIdentifier();
				setState(603);
				match(DROP);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(604);
					match(IF);
					setState(605);
					match(EXISTS);
					}
				}

				setState(608);
				partitionSpec();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(609);
					match(T__3);
					setState(610);
					partitionSpec();
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(616);
					match(PURGE);
					}
				}

				}
				break;
			case 29:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(619);
				match(ALTER);
				setState(620);
				match(TABLE);
				setState(621);
				multipartIdentifier();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(622);
					partitionSpec();
					}
				}

				setState(625);
				match(SET);
				setState(626);
				locationSpec();
				}
				break;
			case 30:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(628);
				match(ALTER);
				setState(629);
				match(TABLE);
				setState(630);
				multipartIdentifier();
				setState(631);
				match(RECOVER);
				setState(632);
				match(PARTITIONS);
				}
				break;
			case 31:
				_localctx = new MergeSmallFilesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(634);
				match(ALTER);
				setState(635);
				match(TABLE);
				setState(636);
				multipartIdentifier();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(637);
					partitionSpec();
					}
				}

				setState(640);
				match(MERGE);
				setState(641);
				match(SMALLFILES);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(643);
				match(DROP);
				setState(644);
				match(TABLE);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(645);
					match(IF);
					setState(646);
					match(EXISTS);
					}
					break;
				}
				setState(649);
				multipartIdentifier();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(650);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(653);
				match(DROP);
				setState(654);
				match(VIEW);
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(655);
					match(IF);
					setState(656);
					match(EXISTS);
					}
					break;
				}
				setState(659);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(660);
				match(CREATE);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(661);
					match(OR);
					setState(662);
					match(REPLACE);
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(665);
						match(GLOBAL);
						}
					}

					setState(668);
					match(TEMPORARY);
					}
				}

				setState(671);
				match(VIEW);
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(672);
					match(IF);
					setState(673);
					match(NOT);
					setState(674);
					match(EXISTS);
					}
					break;
				}
				setState(677);
				multipartIdentifier();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(678);
					identifierCommentList();
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(687);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(681);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(682);
						match(PARTITIONED);
						setState(683);
						match(ON);
						setState(684);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(685);
						match(TBLPROPERTIES);
						setState(686);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(AS);
				setState(693);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(695);
				match(CREATE);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(696);
					match(OR);
					setState(697);
					match(REPLACE);
					}
				}

				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(700);
					match(GLOBAL);
					}
				}

				setState(703);
				match(TEMPORARY);
				setState(704);
				match(VIEW);
				setState(705);
				tableIdentifier();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(706);
					match(T__1);
					setState(707);
					colTypeList();
					setState(708);
					match(T__2);
					}
				}

				setState(712);
				tableProvider();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(713);
					match(OPTIONS);
					setState(714);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(717);
				match(ALTER);
				setState(718);
				match(VIEW);
				setState(719);
				multipartIdentifier();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(720);
					match(AS);
					}
				}

				setState(723);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(725);
				match(CREATE);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(726);
					match(OR);
					setState(727);
					match(REPLACE);
					}
				}

				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(730);
					match(TEMPORARY);
					}
				}

				setState(733);
				match(FUNCTION);
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(734);
					match(IF);
					setState(735);
					match(NOT);
					setState(736);
					match(EXISTS);
					}
					break;
				}
				setState(739);
				multipartIdentifier();
				setState(740);
				match(AS);
				setState(741);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(742);
					match(USING);
					setState(743);
					resource();
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(744);
						match(T__3);
						setState(745);
						resource();
						}
						}
						setState(750);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 38:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(753);
				match(DROP);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(754);
					match(TEMPORARY);
					}
				}

				setState(757);
				match(FUNCTION);
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(758);
					match(IF);
					setState(759);
					match(EXISTS);
					}
					break;
				}
				setState(762);
				multipartIdentifier();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(763);
				match(EXPLAIN);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXTENDED - 87)) | (1L << (FORMATTED - 87)) | (1L << (LOGICAL - 87)))) != 0)) {
					{
					setState(764);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXTENDED - 87)) | (1L << (FORMATTED - 87)) | (1L << (LOGICAL - 87)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(767);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(768);
				match(SHOW);
				setState(769);
				match(TABLES);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(770);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(771);
					multipartIdentifier();
					}
				}

				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(774);
						match(LIKE);
						}
					}

					setState(777);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(780);
				match(SHOW);
				setState(781);
				match(TABLE);
				setState(782);
				match(EXTENDED);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(783);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(784);
					((ShowTableContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(787);
				match(LIKE);
				setState(788);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(789);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(792);
				match(SHOW);
				setState(793);
				match(TBLPROPERTIES);
				setState(794);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(795);
					match(T__1);
					setState(796);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(797);
					match(T__2);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(COLUMNS);
				setState(803);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(804);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(805);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(806);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(809);
				match(SHOW);
				setState(810);
				match(VIEWS);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(811);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(812);
					multipartIdentifier();
					}
				}

				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(815);
						match(LIKE);
						}
					}

					setState(818);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(821);
				match(SHOW);
				setState(822);
				match(PARTITIONS);
				setState(823);
				multipartIdentifier();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(824);
					partitionSpec();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(827);
				match(SHOW);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(828);
					identifier();
					}
					break;
				}
				setState(831);
				match(FUNCTIONS);
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(832);
						match(LIKE);
						}
						break;
					}
					setState(837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(835);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(836);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(841);
				match(SHOW);
				setState(842);
				match(CREATE);
				setState(843);
				match(TABLE);
				setState(844);
				multipartIdentifier();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(845);
					match(AS);
					setState(846);
					match(SERDE);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(849);
				match(SHOW);
				setState(850);
				match(CURRENT);
				setState(851);
				match(NAMESPACE);
				}
				break;
			case 49:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(852);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(853);
				match(FUNCTION);
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(854);
					match(EXTENDED);
					}
					break;
				}
				setState(857);
				describeFuncName();
				}
				break;
			case 50:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(858);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(859);
				namespace();
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(860);
					match(EXTENDED);
					}
					break;
				}
				setState(863);
				multipartIdentifier();
				}
				break;
			case 51:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(865);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(866);
					match(TABLE);
					}
					break;
				}
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(869);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(872);
				multipartIdentifier();
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(873);
					partitionSpec();
					}
					break;
				}
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(876);
					describeColName();
					}
					break;
				}
				}
				break;
			case 52:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(880);
					match(QUERY);
					}
				}

				setState(883);
				query();
				}
				break;
			case 53:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(884);
				match(COMMENT);
				setState(885);
				match(ON);
				setState(886);
				namespace();
				setState(887);
				multipartIdentifier();
				setState(888);
				match(IS);
				setState(889);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 54:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(891);
				match(COMMENT);
				setState(892);
				match(ON);
				setState(893);
				match(TABLE);
				setState(894);
				multipartIdentifier();
				setState(895);
				match(IS);
				setState(896);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 55:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(898);
				match(REFRESH);
				setState(899);
				match(TABLE);
				setState(900);
				multipartIdentifier();
				}
				break;
			case 56:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(901);
				match(REFRESH);
				setState(902);
				match(FUNCTION);
				setState(903);
				multipartIdentifier();
				}
				break;
			case 57:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(904);
				match(REFRESH);
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(905);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(909);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(906);
							matchWildcard();
							}
							} 
						}
						setState(911);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 58:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(914);
				match(CACHE);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(915);
					match(LAZY);
					}
				}

				setState(918);
				match(TABLE);
				setState(919);
				multipartIdentifier();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(920);
					match(OPTIONS);
					setState(921);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (REDUCE - 186)) | (1L << (SELECT - 186)) | (1L << (TABLE - 186)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(924);
						match(AS);
						}
					}

					setState(927);
					query();
					}
				}

				}
				break;
			case 59:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(930);
				match(UNCACHE);
				setState(931);
				match(TABLE);
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(932);
					match(IF);
					setState(933);
					match(EXISTS);
					}
					break;
				}
				setState(936);
				multipartIdentifier();
				}
				break;
			case 60:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(937);
				match(CLEAR);
				setState(938);
				match(CACHE);
				}
				break;
			case 61:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(939);
				match(LOAD);
				setState(940);
				match(DATA);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(941);
					match(LOCAL);
					}
				}

				setState(944);
				match(INPATH);
				setState(945);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(946);
					match(OVERWRITE);
					}
				}

				setState(949);
				match(INTO);
				setState(950);
				match(TABLE);
				setState(951);
				multipartIdentifier();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(952);
					partitionSpec();
					}
				}

				}
				break;
			case 62:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(955);
				match(TRUNCATE);
				setState(956);
				match(TABLE);
				setState(957);
				multipartIdentifier();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(958);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(961);
				match(MSCK);
				setState(962);
				match(REPAIR);
				setState(963);
				match(TABLE);
				setState(964);
				multipartIdentifier();
				}
				break;
			case 64:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(965);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(966);
				identifier();
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(967);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(968);
							matchWildcard();
							}
							} 
						}
						setState(973);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 65:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(976);
				match(SET);
				setState(977);
				match(ROLE);
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(978);
						matchWildcard();
						}
						} 
					}
					setState(983);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 66:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(984);
				match(SET);
				setState(985);
				match(TIME);
				setState(986);
				match(ZONE);
				setState(987);
				interval();
				}
				break;
			case 67:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(988);
				match(SET);
				setState(989);
				match(TIME);
				setState(990);
				match(ZONE);
				setState(991);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 68:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(992);
				match(SET);
				setState(993);
				match(TIME);
				setState(994);
				match(ZONE);
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(995);
						matchWildcard();
						}
						} 
					}
					setState(1000);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			case 69:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1001);
				match(SET);
				setState(1002);
				configKey();
				setState(1003);
				match(EQ);
				setState(1004);
				configValue();
				}
				break;
			case 70:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1006);
				match(SET);
				setState(1007);
				configKey();
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1008);
					match(EQ);
					setState(1012);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1009);
							matchWildcard();
							}
							} 
						}
						setState(1014);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
					}
					}
				}

				}
				break;
			case 71:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1017);
				match(SET);
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1018);
						matchWildcard();
						}
						} 
					}
					setState(1023);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(1024);
				match(EQ);
				setState(1025);
				configValue();
				}
				break;
			case 72:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1026);
				match(SET);
				setState(1030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1027);
						matchWildcard();
						}
						} 
					}
					setState(1032);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 73:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1033);
				match(RESET);
				setState(1034);
				configKey();
				}
				break;
			case 74:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1035);
				match(RESET);
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1036);
						matchWildcard();
						}
						} 
					}
					setState(1041);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 75:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1042);
				unsupportedHiveNativeCommands();
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1043);
						matchWildcard();
						}
						} 
					}
					setState(1048);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1056);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1060);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1064);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1068);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1069);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1071);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1075);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1076);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1099);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1118);
				tableIdentifier();
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1124);
				tableIdentifier();
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1130);
				tableIdentifier();
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1136);
				tableIdentifier();
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1142);
				tableIdentifier();
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1148);
				tableIdentifier();
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1156);
				tableIdentifier();
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1163);
				tableIdentifier();
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1169);
				tableIdentifier();
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1175);
				tableIdentifier();
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1181);
				tableIdentifier();
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1186);
				tableIdentifier();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1187);
					partitionSpec();
					}
				}

				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1194);
				tableIdentifier();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1195);
					partitionSpec();
					}
				}

				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1202);
				tableIdentifier();
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1203);
					partitionSpec();
					}
				}

				setState(1206);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1211);
				tableIdentifier();
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1212);
					partitionSpec();
					}
				}

				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(CREATE);
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1226);
				match(TEMPORARY);
				}
			}

			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1229);
				match(EXTERNAL);
				}
			}

			setState(1232);
			match(TABLE);
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1233);
				match(IF);
				setState(1234);
				match(NOT);
				setState(1235);
				match(EXISTS);
				}
				break;
			}
			setState(1238);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1240);
				match(CREATE);
				setState(1241);
				match(OR);
				}
			}

			setState(1244);
			match(REPLACE);
			setState(1245);
			match(TABLE);
			setState(1246);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(CLUSTERED);
			setState(1249);
			match(BY);
			setState(1250);
			identifierList();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1251);
				match(SORTED);
				setState(1252);
				match(BY);
				setState(1253);
				orderedIdentifierList();
				}
			}

			setState(1256);
			match(INTO);
			setState(1257);
			match(INTEGER_VALUE);
			setState(1258);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(SKEWED);
			setState(1261);
			match(BY);
			setState(1262);
			identifierList();
			setState(1263);
			match(ON);
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1264);
				constantList();
				}
				break;
			case 2:
				{
				setState(1265);
				nestedConstantList();
				}
				break;
			}
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1268);
				match(STORED);
				setState(1269);
				match(AS);
				setState(1270);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(LOCATION);
			setState(1274);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultSpecContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public DefaultSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDefaultSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDefaultSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDefaultSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultSpecContext defaultSpec() throws RecognitionException {
		DefaultSpecContext _localctx = new DefaultSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defaultSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(DEFAULT);
			setState(1277);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(COMMENT);
			setState(1280);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LifecycleSpecContext extends ParserRuleContext {
		public TerminalNode LIFECYCLE() { return getToken(SqlBaseParser.LIFECYCLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public LifecycleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifecycleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLifecycleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLifecycleSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLifecycleSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifecycleSpecContext lifecycleSpec() throws RecognitionException {
		LifecycleSpecContext _localctx = new LifecycleSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lifecycleSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(LIFECYCLE);
			setState(1283);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1285);
				ctes();
				}
			}

			setState(1288);
			queryTerm(0);
			setState(1289);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_insertInto);
		int _la;
		try {
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				match(INSERT);
				setState(1292);
				match(OVERWRITE);
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1293);
					match(TABLE);
					}
					break;
				}
				setState(1296);
				multipartIdentifier();
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1297);
					partitionSpec();
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1298);
						match(IF);
						setState(1299);
						match(NOT);
						setState(1300);
						match(EXISTS);
						}
					}

					}
				}

				setState(1306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1305);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				match(INSERT);
				setState(1309);
				match(INTO);
				setState(1311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1310);
					match(TABLE);
					}
					break;
				}
				setState(1313);
				multipartIdentifier();
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1314);
					partitionSpec();
					}
				}

				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1317);
					match(IF);
					setState(1318);
					match(NOT);
					setState(1319);
					match(EXISTS);
					}
				}

				setState(1323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1322);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1325);
				match(INSERT);
				setState(1326);
				match(OVERWRITE);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1327);
					match(LOCAL);
					}
				}

				setState(1330);
				match(DIRECTORY);
				setState(1331);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1332);
					rowFormat();
					}
				}

				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1335);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1338);
				match(INSERT);
				setState(1339);
				match(OVERWRITE);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1340);
					match(LOCAL);
					}
				}

				setState(1343);
				match(DIRECTORY);
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1344);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1347);
				tableProvider();
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1348);
					match(OPTIONS);
					setState(1349);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			partitionSpec();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1355);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(PARTITION);
			setState(1359);
			match(T__1);
			setState(1360);
			partitionVal();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1361);
				match(T__3);
				setState(1362);
				partitionVal();
				}
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1368);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			identifier();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1371);
				match(EQ);
				setState(1372);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_describeFuncName);
		try {
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1379);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1380);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1381);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1385);
				match(T__4);
				setState(1386);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(WITH);
			setState(1393);
			namedQuery();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1394);
				match(T__3);
				setState(1395);
				namedQuery();
				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1402);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1405);
				match(AS);
				}
			}

			setState(1408);
			match(T__1);
			setState(1409);
			query();
			setState(1410);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(USING);
			setState(1413);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LifecycleSpecContext> lifecycleSpec() {
			return getRuleContexts(LifecycleSpecContext.class);
		}
		public LifecycleSpecContext lifecycleSpec(int i) {
			return getRuleContext(LifecycleSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (LIFECYCLE - 132)) | (1L << (LOCATION - 132)) | (1L << (OPTIONS - 132)) | (1L << (PARTITIONED - 132)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (ROW - 201)) | (1L << (SKEWED - 201)) | (1L << (STORED - 201)) | (1L << (TBLPROPERTIES - 201)))) != 0)) {
				{
				setState(1429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1415);
					match(OPTIONS);
					setState(1416);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1417);
					match(PARTITIONED);
					setState(1418);
					match(BY);
					setState(1419);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1420);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1421);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1422);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1423);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1424);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1425);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1426);
					match(TBLPROPERTIES);
					setState(1427);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				case LIFECYCLE:
					{
					setState(1428);
					lifecycleSpec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			match(T__1);
			setState(1435);
			tableProperty();
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1436);
				match(T__3);
				setState(1437);
				tableProperty();
				}
				}
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1443);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (TRUE - 241)) | (1L << (EQ - 241)) | (1L << (STRING - 241)) | (1L << (INTEGER_VALUE - 241)) | (1L << (DECIMAL_VALUE - 241)))) != 0)) {
				{
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1446);
					match(EQ);
					}
				}

				setState(1449);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				identifier();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1453);
					match(T__4);
					setState(1454);
					identifier();
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tablePropertyValue);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1465);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1466);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(T__1);
			setState(1470);
			constant();
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1471);
				match(T__3);
				setState(1472);
				constant();
				}
				}
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1478);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(T__1);
			setState(1481);
			constantList();
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1482);
				match(T__3);
				setState(1483);
				constantList();
				}
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1489);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createFileFormat);
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				match(STORED);
				setState(1492);
				match(AS);
				setState(1493);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				match(STORED);
				setState(1495);
				match(BY);
				setState(1496);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fileFormat);
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1499);
				match(INPUTFORMAT);
				setState(1500);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1501);
				match(OUTPUTFORMAT);
				setState(1502);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(STRING);
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1507);
				match(WITH);
				setState(1508);
				match(SERDEPROPERTIES);
				setState(1509);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1512);
				identifier();
				}
				break;
			}
			setState(1515);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1517);
				insertInto();
				setState(1518);
				queryTerm(0);
				setState(1519);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				fromClause();
				setState(1523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1522);
					multiInsertQueryBody();
					}
					}
					setState(1525); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1527);
				match(DELETE);
				setState(1528);
				match(FROM);
				setState(1529);
				multipartIdentifier();
				setState(1530);
				tableAlias();
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1531);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1534);
				match(UPDATE);
				setState(1535);
				multipartIdentifier();
				setState(1536);
				tableAlias();
				setState(1537);
				setClause();
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1538);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1541);
				match(MERGE);
				setState(1542);
				match(INTO);
				setState(1543);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1544);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1545);
				match(USING);
				setState(1551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1546);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1547);
					match(T__1);
					setState(1548);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1549);
					match(T__2);
					}
					break;
				}
				setState(1553);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1554);
				match(ON);
				setState(1555);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1556);
						matchedClause();
						}
						} 
					}
					setState(1561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1562);
					notMatchedClause();
					}
					}
					setState(1567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1570);
				match(ORDER);
				setState(1571);
				match(BY);
				setState(1572);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1573);
						match(T__3);
						setState(1574);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			}
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1582);
				match(CLUSTER);
				setState(1583);
				match(BY);
				setState(1584);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1585);
						match(T__3);
						setState(1586);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1594);
				match(DISTRIBUTE);
				setState(1595);
				match(BY);
				setState(1596);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1597);
						match(T__3);
						setState(1598);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1606);
				match(SORT);
				setState(1607);
				match(BY);
				setState(1608);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1609);
						match(T__3);
						setState(1610);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1618);
				windowClause();
				}
				break;
			}
			setState(1626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1621);
				match(LIMIT);
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1622);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1623);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			insertInto();
			setState(1629);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1632);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1634);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1635);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1636);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1638);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1637);
							setQuantifier();
							}
						}

						setState(1640);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1641);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1642);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1643);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1645);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1644);
							setQuantifier();
							}
						}

						setState(1647);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1648);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1649);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1650);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1652);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1651);
							setQuantifier();
							}
						}

						setState(1654);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_queryPrimary);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1660);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1661);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1662);
				match(TABLE);
				setState(1663);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1664);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1665);
				match(T__1);
				setState(1666);
				query();
				setState(1667);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			expression();
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1672);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1675);
				match(NULLS);
				setState(1676);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			fromClause();
			setState(1681); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1680);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1683); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				transformClause();
				setState(1687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1686);
					whereClause();
					}
					break;
				}
				setState(1689);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				selectClause();
				setState(1695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1692);
						lateralView();
						}
						} 
					}
					setState(1697);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1698);
					whereClause();
					}
					break;
				}
				setState(1702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1701);
					aggregationClause();
					}
					break;
				}
				setState(1705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1704);
					havingClause();
					}
					break;
				}
				setState(1708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1707);
					windowClause();
					}
					break;
				}
				setState(1710);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_querySpecification);
		try {
			int _alt;
			setState(1743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				transformClause();
				setState(1716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1715);
					fromClause();
					}
					break;
				}
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1718);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				selectClause();
				setState(1723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1722);
					fromClause();
					}
					break;
				}
				setState(1728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1725);
						lateralView();
						}
						} 
					}
					setState(1730);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1731);
					whereClause();
					}
					break;
				}
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1734);
					aggregationClause();
					}
					break;
				}
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1737);
					havingClause();
					}
					break;
				}
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1740);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1745);
				match(SELECT);
				setState(1746);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1747);
				match(T__1);
				setState(1748);
				namedExpressionSeq();
				setState(1749);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1751);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1752);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1753);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1754);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1757);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1760);
				match(RECORDWRITER);
				setState(1761);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1764);
			match(USING);
			setState(1765);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1766);
				match(AS);
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1767);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1768);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1769);
					match(T__1);
					setState(1772);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1770);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1771);
						colTypeList();
						}
						break;
					}
					setState(1774);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1780);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1783);
				match(RECORDREADER);
				setState(1784);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(SELECT);
			setState(1791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1788);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1794);
				setQuantifier();
				}
				break;
			}
			setState(1797);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			match(SET);
			setState(1800);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(WHEN);
			setState(1803);
			match(MATCHED);
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1804);
				match(AND);
				setState(1805);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1808);
			match(THEN);
			setState(1809);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			match(WHEN);
			setState(1812);
			match(NOT);
			setState(1813);
			match(MATCHED);
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1814);
				match(AND);
				setState(1815);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1818);
			match(THEN);
			setState(1819);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_matchedAction);
		try {
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1821);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
				match(UPDATE);
				setState(1823);
				match(SET);
				setState(1824);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1825);
				match(UPDATE);
				setState(1826);
				match(SET);
				setState(1827);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_notMatchedAction);
		int _la;
		try {
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1830);
				match(INSERT);
				setState(1831);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				match(INSERT);
				setState(1833);
				match(T__1);
				setState(1834);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1835);
				match(T__2);
				setState(1836);
				match(VALUES);
				setState(1837);
				match(T__1);
				setState(1838);
				expression();
				setState(1843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1839);
					match(T__3);
					setState(1840);
					expression();
					}
					}
					setState(1845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1846);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			assignment();
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1851);
				match(T__3);
				setState(1852);
				assignment();
				}
				}
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1859);
			match(EQ);
			setState(1860);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(WHERE);
			setState(1863);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(HAVING);
			setState(1866);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			match(T__5);
			setState(1869);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1871);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(1870);
						match(T__3);
						}
						break;
					}
					setState(1873);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1879);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_hintStatement);
		int _la;
		try {
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1883);
				match(T__1);
				setState(1884);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1885);
					match(T__3);
					setState(1886);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1892);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(FROM);
			setState(1897);
			relation();
			setState(1902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1898);
					match(T__3);
					setState(1899);
					relation();
					}
					} 
				}
				setState(1904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			setState(1908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1905);
					lateralView();
					}
					} 
				}
				setState(1910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1911);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
				match(GROUP);
				setState(1915);
				match(BY);
				setState(1916);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(1921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1917);
						match(T__3);
						setState(1918);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(1923);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				match(GROUP);
				setState(1925);
				match(BY);
				setState(1926);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1927);
						match(T__3);
						setState(1928);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				}
				setState(1951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1934);
					match(WITH);
					setState(1935);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1936);
					match(WITH);
					setState(1937);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1938);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1939);
					match(SETS);
					setState(1940);
					match(T__1);
					setState(1941);
					groupingSet();
					setState(1946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1942);
						match(T__3);
						setState(1943);
						groupingSet();
						}
						}
						setState(1948);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1949);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_groupByClause);
		try {
			setState(1957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1955);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1956);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_groupingAnalytics);
		int _la;
		try {
			setState(1984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1960);
				match(T__1);
				setState(1961);
				groupingSet();
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1962);
					match(T__3);
					setState(1963);
					groupingSet();
					}
					}
					setState(1968);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1969);
				match(T__2);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				match(GROUPING);
				setState(1972);
				match(SETS);
				setState(1973);
				match(T__1);
				setState(1974);
				groupingElement();
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1975);
					match(T__3);
					setState(1976);
					groupingElement();
					}
					}
					setState(1981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1982);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_groupingElement);
		try {
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1986);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1987);
				groupingSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_groupingSet);
		int _la;
		try {
			setState(2003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1990);
				match(T__1);
				setState(1999);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1991);
					expression();
					setState(1996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1992);
						match(T__3);
						setState(1993);
						expression();
						}
						}
						setState(1998);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2001);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2002);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			match(PIVOT);
			setState(2006);
			match(T__1);
			setState(2007);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2008);
			match(FOR);
			setState(2009);
			pivotColumn();
			setState(2010);
			match(IN);
			setState(2011);
			match(T__1);
			setState(2012);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2013);
				match(T__3);
				setState(2014);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2020);
			match(T__2);
			setState(2021);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_pivotColumn);
		int _la;
		try {
			setState(2035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2024);
				match(T__1);
				setState(2025);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2026);
					match(T__3);
					setState(2027);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2033);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			expression();
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2038);
					match(AS);
					}
					break;
				}
				setState(2041);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			match(LATERAL);
			setState(2045);
			match(VIEW);
			setState(2047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2046);
				match(OUTER);
				}
				break;
			}
			setState(2049);
			qualifiedName();
			setState(2050);
			match(T__1);
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2051);
				expression();
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2052);
					match(T__3);
					setState(2053);
					expression();
					}
					}
					setState(2058);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2061);
			match(T__2);
			setState(2062);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2064);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2063);
					match(AS);
					}
					break;
				}
				setState(2066);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2067);
						match(T__3);
						setState(2068);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2073);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			relationPrimary();
			setState(2082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2079);
					joinRelation();
					}
					} 
				}
				setState(2084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_joinRelation);
		try {
			setState(2096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2085);
				joinType();
				}
				setState(2086);
				match(JOIN);
				setState(2087);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2088);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2091);
				match(NATURAL);
				setState(2092);
				joinType();
				setState(2093);
				match(JOIN);
				setState(2094);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_joinType);
		int _la;
		try {
			setState(2122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2098);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2102);
				match(LEFT);
				setState(2104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2103);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2106);
					match(LEFT);
					}
				}

				setState(2109);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2110);
				match(RIGHT);
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2111);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2114);
				match(FULL);
				setState(2116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2115);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2118);
					match(LEFT);
					}
				}

				setState(2121);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_joinCriteria);
		try {
			setState(2128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				match(ON);
				setState(2125);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
				match(USING);
				setState(2127);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2130);
			match(TABLESAMPLE);
			setState(2131);
			match(T__1);
			setState(2133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2132);
				sampleMethod();
				}
				break;
			}
			setState(2135);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_sampleMethod);
		int _la;
		try {
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2137);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2140);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2141);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				expression();
				setState(2143);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2145);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2146);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2147);
				match(OUT);
				setState(2148);
				match(OF);
				setState(2149);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2150);
					match(ON);
					setState(2156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						setState(2151);
						identifier();
						}
						break;
					case 2:
						{
						setState(2152);
						qualifiedName();
						setState(2153);
						match(T__1);
						setState(2154);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2160);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			match(T__1);
			setState(2164);
			identifierSeq();
			setState(2165);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2168);
					match(T__3);
					setState(2169);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			match(T__1);
			setState(2176);
			orderedIdentifier();
			setState(2181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2177);
				match(T__3);
				setState(2178);
				orderedIdentifier();
				}
				}
				setState(2183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2184);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2187);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(T__1);
			setState(2191);
			identifierComment();
			setState(2196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2192);
				match(T__3);
				setState(2193);
				identifierComment();
				}
				}
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2199);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			identifier();
			setState(2203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2202);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_relationPrimary);
		try {
			int _alt;
			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2205);
				multipartIdentifier();
				setState(2207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2206);
					sample();
					}
					break;
				}
				setState(2209);
				tableAlias();
				setState(2213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2210);
						lateralView();
						}
						} 
					}
					setState(2215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2216);
				match(T__1);
				setState(2217);
				query();
				setState(2218);
				match(T__2);
				setState(2220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2219);
					sample();
					}
					break;
				}
				setState(2222);
				tableAlias();
				setState(2226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2223);
						lateralView();
						}
						} 
					}
					setState(2228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2229);
				match(T__1);
				setState(2230);
				relation();
				setState(2231);
				match(T__2);
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2232);
					sample();
					}
					break;
				}
				setState(2235);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2237);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2238);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			match(VALUES);
			setState(2242);
			expression();
			setState(2247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2243);
					match(T__3);
					setState(2244);
					expression();
					}
					} 
				}
				setState(2249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			}
			setState(2250);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2253);
			match(T__1);
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2254);
				expression();
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2255);
					match(T__3);
					setState(2256);
					expression();
					}
					}
					setState(2261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2264);
			match(T__2);
			setState(2265);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2267);
					match(AS);
					}
					break;
				}
				setState(2270);
				strictIdentifier();
				setState(2272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2271);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_rowFormat);
		try {
			setState(2325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2276);
				match(ROW);
				setState(2277);
				match(FORMAT);
				setState(2278);
				match(SERDE);
				setState(2279);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2280);
					match(WITH);
					setState(2281);
					match(SERDEPROPERTIES);
					setState(2282);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2285);
				match(ROW);
				setState(2286);
				match(FORMAT);
				setState(2287);
				match(DELIMITED);
				setState(2297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2288);
					match(FIELDS);
					setState(2289);
					match(TERMINATED);
					setState(2290);
					match(BY);
					setState(2291);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						setState(2292);
						match(ESCAPED);
						setState(2293);
						match(BY);
						setState(2294);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2299);
					match(COLLECTION);
					setState(2300);
					match(ITEMS);
					setState(2301);
					match(TERMINATED);
					setState(2302);
					match(BY);
					setState(2303);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2306);
					match(MAP);
					setState(2307);
					match(KEYS);
					setState(2308);
					match(TERMINATED);
					setState(2309);
					match(BY);
					setState(2310);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2313);
					match(LINES);
					setState(2314);
					match(TERMINATED);
					setState(2315);
					match(BY);
					setState(2316);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2319);
					match(NULL);
					setState(2320);
					match(DEFINED);
					setState(2321);
					match(AS);
					setState(2322);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			multipartIdentifier();
			setState(2332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2328);
				match(T__3);
				setState(2329);
				multipartIdentifier();
				}
				}
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2336);
					match(T__4);
					setState(2337);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2343);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2344);
				match(T__4);
				}
				break;
			}
			setState(2348);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(2350);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2351);
				match(T__4);
				}
				break;
			}
			setState(2355);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			expression();
			setState(2365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2358);
					match(AS);
					}
					break;
				}
				setState(2363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2361);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2362);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			namedExpression();
			setState(2372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2368);
					match(T__3);
					setState(2369);
					namedExpression();
					}
					} 
				}
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			match(T__1);
			setState(2376);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2377);
				match(T__3);
				setState(2378);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2384);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_partitionField);
		try {
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2386);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2387);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_transform);
		int _la;
		try {
			setState(2403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2390);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2392);
				match(T__1);
				setState(2393);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2394);
					match(T__3);
					setState(2395);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2401);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_transformArgument);
		try {
			setState(2407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2405);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2412);
				match(NOT);
				setState(2413);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2414);
				match(EXISTS);
				setState(2415);
				match(T__1);
				setState(2416);
				query();
				setState(2417);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2419);
				valueExpression(0);
				setState(2421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2420);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2425);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2426);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2427);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2428);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2429);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2430);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_predicate);
		int _la;
		try {
			setState(2518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2436);
					match(NOT);
					}
				}

				setState(2439);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2440);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2441);
				match(AND);
				setState(2442);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2444);
					match(NOT);
					}
				}

				setState(2447);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2448);
				match(T__1);
				setState(2449);
				expression();
				setState(2454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2450);
					match(T__3);
					setState(2451);
					expression();
					}
					}
					setState(2456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2457);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2459);
					match(NOT);
					}
				}

				setState(2462);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2463);
				match(T__1);
				setState(2464);
				query();
				setState(2465);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2467);
					match(NOT);
					}
				}

				setState(2470);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2471);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2472);
					match(NOT);
					}
				}

				setState(2475);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2476);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2477);
					match(T__1);
					setState(2478);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(2479);
					match(T__1);
					setState(2480);
					expression();
					setState(2485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2481);
						match(T__3);
						setState(2482);
						expression();
						}
						}
						setState(2487);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2488);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2492);
					match(NOT);
					}
				}

				setState(2495);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2496);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2497);
					match(ESCAPE);
					setState(2498);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2501);
				match(IS);
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2502);
					match(NOT);
					}
				}

				setState(2505);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2506);
				match(IS);
				setState(2508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2507);
					match(NOT);
					}
				}

				setState(2510);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2511);
				match(IS);
				setState(2513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2512);
					match(NOT);
					}
				}

				setState(2515);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2516);
				match(FROM);
				setState(2517);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2521);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2522);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (PLUS - 272)) | (1L << (MINUS - 272)) | (1L << (TILDE - 272)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2523);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2545);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2526);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2527);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (ASTERISK - 274)) | (1L << (SLASH - 274)) | (1L << (PERCENT - 274)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2528);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2529);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2530);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (PLUS - 272)) | (1L << (MINUS - 272)) | (1L << (CONCAT_PIPE - 272)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2531);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2532);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2533);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2534);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2535);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2536);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2537);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2538);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2539);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2540);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2541);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2542);
						comparisonOperator();
						setState(2543);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2551);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2552);
				match(CASE);
				setState(2554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2553);
					whenClause();
					}
					}
					setState(2556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2558);
					match(ELSE);
					setState(2559);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2562);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2564);
				match(CASE);
				setState(2565);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2566);
					whenClause();
					}
					}
					setState(2569); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2571);
					match(ELSE);
					setState(2572);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2575);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2577);
				match(CAST);
				setState(2578);
				match(T__1);
				setState(2579);
				expression();
				setState(2580);
				match(AS);
				setState(2581);
				dataType();
				setState(2582);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2584);
				match(STRUCT);
				setState(2585);
				match(T__1);
				setState(2594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2586);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2587);
						match(T__3);
						setState(2588);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2596);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2597);
				match(FIRST);
				setState(2598);
				match(T__1);
				setState(2599);
				expression();
				setState(2602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2600);
					match(IGNORE);
					setState(2601);
					match(NULLS);
					}
				}

				setState(2604);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2606);
				match(LAST);
				setState(2607);
				match(T__1);
				setState(2608);
				expression();
				setState(2611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2609);
					match(IGNORE);
					setState(2610);
					match(NULLS);
					}
				}

				setState(2613);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2615);
				match(POSITION);
				setState(2616);
				match(T__1);
				setState(2617);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2618);
				match(IN);
				setState(2619);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2620);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2622);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2623);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2624);
				qualifiedName();
				setState(2625);
				match(T__4);
				setState(2626);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2628);
				match(T__1);
				setState(2629);
				namedExpression();
				setState(2632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2630);
					match(T__3);
					setState(2631);
					namedExpression();
					}
					}
					setState(2634); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2636);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2638);
				match(T__1);
				setState(2639);
				query();
				setState(2640);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2642);
				functionName();
				setState(2643);
				match(T__1);
				setState(2655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2645);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						setState(2644);
						setQuantifier();
						}
						break;
					}
					setState(2647);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2648);
						match(T__3);
						setState(2649);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2654);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2657);
				match(T__2);
				setState(2664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2658);
					match(FILTER);
					setState(2659);
					match(T__1);
					setState(2660);
					match(WHERE);
					setState(2661);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2662);
					match(T__2);
					}
					break;
				}
				setState(2668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2666);
					match(OVER);
					setState(2667);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2670);
				identifier();
				setState(2671);
				match(T__7);
				setState(2672);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2674);
				match(T__1);
				setState(2675);
				identifier();
				setState(2678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2676);
					match(T__3);
					setState(2677);
					identifier();
					}
					}
					setState(2680); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2682);
				match(T__2);
				setState(2683);
				match(T__7);
				setState(2684);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2686);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2687);
				match(T__1);
				setState(2688);
				expression();
				setState(2689);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2691);
				match(EXTRACT);
				setState(2692);
				match(T__1);
				setState(2693);
				((ExtractContext)_localctx).field = identifier();
				setState(2694);
				match(FROM);
				setState(2695);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2696);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2698);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2699);
				match(T__1);
				setState(2700);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2701);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2702);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2703);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2704);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2707);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2709);
				match(TRIM);
				setState(2710);
				match(T__1);
				setState(2712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2711);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2714);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2717);
				match(FROM);
				setState(2718);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2719);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2721);
				match(OVERLAY);
				setState(2722);
				match(T__1);
				setState(2723);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2724);
				match(PLACING);
				setState(2725);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2726);
				match(FROM);
				setState(2727);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2728);
					match(FOR);
					setState(2729);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2732);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2736);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2737);
						match(T__8);
						setState(2738);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2739);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2741);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2742);
						match(T__4);
						setState(2743);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constant);
		try {
			int _alt;
			setState(2761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2749);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2750);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2751);
				identifier();
				setState(2752);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2754);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2755);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2757); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2756);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2759); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			_la = _input.LA(1);
			if ( !(((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (EQ - 264)) | (1L << (NSEQ - 264)) | (1L << (NEQ - 264)) | (1L << (NEQJ - 264)) | (1L << (LT - 264)) | (1L << (LTE - 264)) | (1L << (GT - 264)) | (1L << (GTE - 264)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (PLUS - 272)) | (1L << (MINUS - 272)) | (1L << (ASTERISK - 272)) | (1L << (SLASH - 272)) | (1L << (PERCENT - 272)) | (1L << (TILDE - 272)) | (1L << (AMPERSAND - 272)) | (1L << (PIPE - 272)) | (1L << (CONCAT_PIPE - 272)) | (1L << (HAT - 272)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2767);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (IN - 113)) | (1L << (NOT - 113)) | (1L << (OR - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2769);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
			match(INTERVAL);
			setState(2774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				{
				setState(2772);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2773);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776);
			multiUnitsInterval();
			setState(2778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2777);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2783); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2780);
					intervalValue();
					setState(2781);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2785); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2788);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2789);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2793);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2794);
			match(TO);
			setState(2795);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_intervalValue);
		int _la;
		try {
			setState(2802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2797);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2800);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2801);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_colPosition);
		try {
			setState(2807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2804);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2805);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2806);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_dataType);
		int _la;
		try {
			setState(2843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2809);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2810);
				match(LT);
				setState(2811);
				dataType();
				setState(2812);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2814);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2815);
				match(LT);
				setState(2816);
				dataType();
				setState(2817);
				match(T__3);
				setState(2818);
				dataType();
				setState(2819);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2821);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2828);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2822);
					match(LT);
					setState(2824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
					case 1:
						{
						setState(2823);
						complexColTypeList();
						}
						break;
					}
					setState(2826);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2827);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2830);
				identifier();
				setState(2841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
				case 1:
					{
					setState(2831);
					match(T__1);
					setState(2832);
					match(INTEGER_VALUE);
					setState(2837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2833);
						match(T__3);
						setState(2834);
						match(INTEGER_VALUE);
						}
						}
						setState(2839);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2840);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2845);
			qualifiedColTypeWithPosition();
			setState(2850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2846);
				match(T__3);
				setState(2847);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2854);
			dataType();
			setState(2857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2855);
				match(NOT);
				setState(2856);
				match(NULL);
				}
			}

			setState(2860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2859);
				commentSpec();
				}
			}

			setState(2863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2862);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2865);
			colType();
			setState(2870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2866);
					match(T__3);
					setState(2867);
					colType();
					}
					} 
				}
				setState(2872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public DefaultSpecContext defaultSpec() {
			return getRuleContext(DefaultSpecContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2874);
			dataType();
			setState(2876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2875);
				defaultSpec();
				}
				break;
			}
			setState(2880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				{
				setState(2878);
				match(NOT);
				setState(2879);
				match(NULL);
				}
				break;
			}
			setState(2883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2882);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			complexColType();
			setState(2890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2886);
				match(T__3);
				setState(2887);
				complexColType();
				}
				}
				setState(2892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2893);
			identifier();
			setState(2894);
			match(T__10);
			setState(2895);
			dataType();
			setState(2898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2896);
				match(NOT);
				setState(2897);
				match(NULL);
				}
			}

			setState(2901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2900);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			match(WHEN);
			setState(2904);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2905);
			match(THEN);
			setState(2906);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2908);
			match(WINDOW);
			setState(2909);
			namedWindow();
			setState(2914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2910);
					match(T__3);
					setState(2911);
					namedWindow();
					}
					} 
				}
				setState(2916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2918);
			match(AS);
			setState(2919);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_windowSpec);
		int _la;
		try {
			setState(2967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2921);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2922);
				match(T__1);
				setState(2923);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2924);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2926);
				match(T__1);
				setState(2961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2927);
					match(CLUSTER);
					setState(2928);
					match(BY);
					setState(2929);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2930);
						match(T__3);
						setState(2931);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2936);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2937);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2938);
						match(BY);
						setState(2939);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2940);
							match(T__3);
							setState(2941);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2946);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2949);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2950);
						match(BY);
						setState(2951);
						sortItem();
						setState(2956);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2952);
							match(T__3);
							setState(2953);
							sortItem();
							}
							}
							setState(2958);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2963);
					windowFrame();
					}
				}

				setState(2966);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_windowFrame);
		try {
			setState(2985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2969);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2970);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2971);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2972);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2973);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2974);
				match(BETWEEN);
				setState(2975);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2976);
				match(AND);
				setState(2977);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2979);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2980);
				match(BETWEEN);
				setState(2981);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2982);
				match(AND);
				setState(2983);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_frameBound);
		int _la;
		try {
			setState(2994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2987);
				match(UNBOUNDED);
				setState(2988);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2989);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2990);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2991);
				expression();
				setState(2992);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			qualifiedName();
			setState(3001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2997);
				match(T__3);
				setState(2998);
				qualifiedName();
				}
				}
				setState(3003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_functionName);
		try {
			setState(3008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3004);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3005);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3006);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3007);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_qualifiedName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3010);
			identifier();
			setState(3015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3011);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3012);
					identifier();
					}
					} 
				}
				setState(3017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3018);
			identifier();
			setState(3019);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3023); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3021);
						match(MINUS);
						setState(3022);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3025); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_identifier);
		try {
			setState(3033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3030);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3031);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3032);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_strictIdentifier);
		try {
			setState(3041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3035);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3036);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3037);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3038);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3039);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3040);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3043);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_number);
		int _la;
		try {
			setState(3088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3045);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3046);
					match(MINUS);
					}
				}

				setState(3049);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3050);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3051);
					match(MINUS);
					}
				}

				setState(3054);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3055);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3056);
					match(MINUS);
					}
				}

				setState(3059);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3060);
					match(MINUS);
					}
				}

				setState(3063);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3064);
					match(MINUS);
					}
				}

				setState(3067);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3068);
					match(MINUS);
					}
				}

				setState(3071);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3072);
					match(MINUS);
					}
				}

				setState(3075);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3076);
					match(MINUS);
					}
				}

				setState(3079);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3080);
					match(MINUS);
					}
				}

				setState(3083);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3084);
					match(MINUS);
					}
				}

				setState(3087);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_alterColumnAction);
		int _la;
		try {
			setState(3097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3090);
				match(TYPE);
				setState(3091);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3092);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3093);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3094);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3095);
				match(NOT);
				setState(3096);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SMALLFILES() { return getToken(SqlBaseParser.SMALLFILES, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3099);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ADD - 12)) | (1L << (AFTER - 12)) | (1L << (ALTER - 12)) | (1L << (ANALYZE - 12)) | (1L << (ANTI - 12)) | (1L << (ARCHIVE - 12)) | (1L << (ARRAY - 12)) | (1L << (ASC - 12)) | (1L << (AT - 12)) | (1L << (BETWEEN - 12)) | (1L << (BUCKET - 12)) | (1L << (BUCKETS - 12)) | (1L << (BY - 12)) | (1L << (CACHE - 12)) | (1L << (CASCADE - 12)) | (1L << (CHANGE - 12)) | (1L << (CLEAR - 12)) | (1L << (CLUSTER - 12)) | (1L << (CLUSTERED - 12)) | (1L << (CODEGEN - 12)) | (1L << (COLLECTION - 12)) | (1L << (COLUMNS - 12)) | (1L << (COMMENT - 12)) | (1L << (COMMIT - 12)) | (1L << (COMPACT - 12)) | (1L << (COMPACTIONS - 12)) | (1L << (COMPUTE - 12)) | (1L << (CONCATENATE - 12)) | (1L << (COST - 12)) | (1L << (CUBE - 12)) | (1L << (CURRENT - 12)) | (1L << (DATA - 12)) | (1L << (DATABASE - 12)) | (1L << (DATABASES - 12)) | (1L << (DBPROPERTIES - 12)) | (1L << (DEFINED - 12)) | (1L << (DELETE - 12)) | (1L << (DELIMITED - 12)) | (1L << (DESC - 12)) | (1L << (DESCRIBE - 12)) | (1L << (DFS - 12)) | (1L << (DIRECTORIES - 12)) | (1L << (DIRECTORY - 12)) | (1L << (DISTRIBUTE - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DIV - 76)) | (1L << (DROP - 76)) | (1L << (ESCAPED - 76)) | (1L << (EXCHANGE - 76)) | (1L << (EXISTS - 76)) | (1L << (EXPLAIN - 76)) | (1L << (EXPORT - 76)) | (1L << (EXTENDED - 76)) | (1L << (EXTERNAL - 76)) | (1L << (EXTRACT - 76)) | (1L << (FIELDS - 76)) | (1L << (FILEFORMAT - 76)) | (1L << (FIRST - 76)) | (1L << (FOLLOWING - 76)) | (1L << (FORMAT - 76)) | (1L << (FORMATTED - 76)) | (1L << (FUNCTION - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (GLOBAL - 76)) | (1L << (GROUPING - 76)) | (1L << (IF - 76)) | (1L << (IGNORE - 76)) | (1L << (IMPORT - 76)) | (1L << (INDEX - 76)) | (1L << (INDEXES - 76)) | (1L << (INPATH - 76)) | (1L << (INPUTFORMAT - 76)) | (1L << (INSERT - 76)) | (1L << (INTERVAL - 76)) | (1L << (ITEMS - 76)) | (1L << (KEYS - 76)) | (1L << (LAST - 76)) | (1L << (LATERAL - 76)) | (1L << (LAZY - 76)) | (1L << (LIKE - 76)) | (1L << (LIMIT - 76)) | (1L << (LINES - 76)) | (1L << (LIST - 76)) | (1L << (LOAD - 76)) | (1L << (LOCAL - 76)) | (1L << (LOCATION - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOCK - 140)) | (1L << (LOCKS - 140)) | (1L << (LOGICAL - 140)) | (1L << (MACRO - 140)) | (1L << (MAP - 140)) | (1L << (MATCHED - 140)) | (1L << (MERGE - 140)) | (1L << (MSCK - 140)) | (1L << (NAMESPACE - 140)) | (1L << (NAMESPACES - 140)) | (1L << (NO - 140)) | (1L << (NULLS - 140)) | (1L << (OF - 140)) | (1L << (OPTION - 140)) | (1L << (OPTIONS - 140)) | (1L << (OUT - 140)) | (1L << (OUTPUTFORMAT - 140)) | (1L << (OVER - 140)) | (1L << (OVERLAY - 140)) | (1L << (OVERWRITE - 140)) | (1L << (PARTITION - 140)) | (1L << (PARTITIONED - 140)) | (1L << (PARTITIONS - 140)) | (1L << (PERCENTLIT - 140)) | (1L << (PIVOT - 140)) | (1L << (PLACING - 140)) | (1L << (POSITION - 140)) | (1L << (PRECEDING - 140)) | (1L << (PRINCIPALS - 140)) | (1L << (PROPERTIES - 140)) | (1L << (PURGE - 140)) | (1L << (QUERY - 140)) | (1L << (RANGE - 140)) | (1L << (RECORDREADER - 140)) | (1L << (RECORDWRITER - 140)) | (1L << (RECOVER - 140)) | (1L << (REDUCE - 140)) | (1L << (REFRESH - 140)) | (1L << (RENAME - 140)) | (1L << (REPAIR - 140)) | (1L << (REPLACE - 140)) | (1L << (RESET - 140)) | (1L << (RESTRICT - 140)) | (1L << (REVOKE - 140)) | (1L << (RLIKE - 140)) | (1L << (ROLE - 140)) | (1L << (ROLES - 140)) | (1L << (ROLLBACK - 140)) | (1L << (ROLLUP - 140)) | (1L << (ROW - 140)) | (1L << (ROWS - 140)) | (1L << (SCHEMA - 140)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (SEMI - 205)) | (1L << (SEPARATED - 205)) | (1L << (SERDE - 205)) | (1L << (SERDEPROPERTIES - 205)) | (1L << (SET - 205)) | (1L << (SETMINUS - 205)) | (1L << (SETS - 205)) | (1L << (SHOW - 205)) | (1L << (SKEWED - 205)) | (1L << (SMALLFILES - 205)) | (1L << (SORT - 205)) | (1L << (SORTED - 205)) | (1L << (START - 205)) | (1L << (STATISTICS - 205)) | (1L << (STORED - 205)) | (1L << (STRATIFY - 205)) | (1L << (STRUCT - 205)) | (1L << (SUBSTR - 205)) | (1L << (SUBSTRING - 205)) | (1L << (TABLES - 205)) | (1L << (TABLESAMPLE - 205)) | (1L << (TBLPROPERTIES - 205)) | (1L << (TEMPORARY - 205)) | (1L << (TERMINATED - 205)) | (1L << (TOUCH - 205)) | (1L << (TRANSACTION - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (TRANSFORM - 205)) | (1L << (TRIM - 205)) | (1L << (TRUE - 205)) | (1L << (TRUNCATE - 205)) | (1L << (TYPE - 205)) | (1L << (UNARCHIVE - 205)) | (1L << (UNBOUNDED - 205)) | (1L << (UNCACHE - 205)) | (1L << (UNLOCK - 205)) | (1L << (UNSET - 205)) | (1L << (UPDATE - 205)) | (1L << (USE - 205)) | (1L << (VALUES - 205)) | (1L << (VIEW - 205)) | (1L << (VIEWS - 205)) | (1L << (WINDOW - 205)) | (1L << (ZONE - 205)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3101);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXCEPT - 82)) | (1L << (FULL - 82)) | (1L << (INNER - 82)) | (1L << (INTERSECT - 82)) | (1L << (JOIN - 82)) | (1L << (LEFT - 82)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (NATURAL - 150)) | (1L << (ON - 150)) | (1L << (RIGHT - 150)) | (1L << (SEMI - 150)) | (1L << (SETMINUS - 150)))) != 0) || _la==UNION || _la==USING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SMALLFILES() { return getToken(SqlBaseParser.SMALLFILES, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3103);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (ADD - 12)) | (1L << (AFTER - 12)) | (1L << (ALL - 12)) | (1L << (ALTER - 12)) | (1L << (ANALYZE - 12)) | (1L << (AND - 12)) | (1L << (ANY - 12)) | (1L << (ARCHIVE - 12)) | (1L << (ARRAY - 12)) | (1L << (AS - 12)) | (1L << (ASC - 12)) | (1L << (AT - 12)) | (1L << (AUTHORIZATION - 12)) | (1L << (BETWEEN - 12)) | (1L << (BOTH - 12)) | (1L << (BUCKET - 12)) | (1L << (BUCKETS - 12)) | (1L << (BY - 12)) | (1L << (CACHE - 12)) | (1L << (CASCADE - 12)) | (1L << (CASE - 12)) | (1L << (CAST - 12)) | (1L << (CHANGE - 12)) | (1L << (CHECK - 12)) | (1L << (CLEAR - 12)) | (1L << (CLUSTER - 12)) | (1L << (CLUSTERED - 12)) | (1L << (CODEGEN - 12)) | (1L << (COLLATE - 12)) | (1L << (COLLECTION - 12)) | (1L << (COLUMN - 12)) | (1L << (COLUMNS - 12)) | (1L << (COMMENT - 12)) | (1L << (COMMIT - 12)) | (1L << (COMPACT - 12)) | (1L << (COMPACTIONS - 12)) | (1L << (COMPUTE - 12)) | (1L << (CONCATENATE - 12)) | (1L << (CONSTRAINT - 12)) | (1L << (COST - 12)) | (1L << (CREATE - 12)) | (1L << (CUBE - 12)) | (1L << (CURRENT - 12)) | (1L << (CURRENT_DATE - 12)) | (1L << (CURRENT_TIME - 12)) | (1L << (CURRENT_TIMESTAMP - 12)) | (1L << (CURRENT_USER - 12)) | (1L << (DATA - 12)) | (1L << (DATABASE - 12)) | (1L << (DATABASES - 12)) | (1L << (DBPROPERTIES - 12)) | (1L << (DEFINED - 12)) | (1L << (DELETE - 12)) | (1L << (DELIMITED - 12)) | (1L << (DESC - 12)) | (1L << (DESCRIBE - 12)) | (1L << (DFS - 12)) | (1L << (DIRECTORIES - 12)) | (1L << (DIRECTORY - 12)) | (1L << (DISTINCT - 12)) | (1L << (DISTRIBUTE - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DIV - 76)) | (1L << (DROP - 76)) | (1L << (ELSE - 76)) | (1L << (END - 76)) | (1L << (ESCAPE - 76)) | (1L << (ESCAPED - 76)) | (1L << (EXCHANGE - 76)) | (1L << (EXISTS - 76)) | (1L << (EXPLAIN - 76)) | (1L << (EXPORT - 76)) | (1L << (EXTENDED - 76)) | (1L << (EXTERNAL - 76)) | (1L << (EXTRACT - 76)) | (1L << (FALSE - 76)) | (1L << (FETCH - 76)) | (1L << (FIELDS - 76)) | (1L << (FILTER - 76)) | (1L << (FILEFORMAT - 76)) | (1L << (FIRST - 76)) | (1L << (FOLLOWING - 76)) | (1L << (FOR - 76)) | (1L << (FOREIGN - 76)) | (1L << (FORMAT - 76)) | (1L << (FORMATTED - 76)) | (1L << (FROM - 76)) | (1L << (FUNCTION - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (GLOBAL - 76)) | (1L << (GRANT - 76)) | (1L << (GROUP - 76)) | (1L << (GROUPING - 76)) | (1L << (HAVING - 76)) | (1L << (IF - 76)) | (1L << (IGNORE - 76)) | (1L << (IMPORT - 76)) | (1L << (IN - 76)) | (1L << (INDEX - 76)) | (1L << (INDEXES - 76)) | (1L << (INPATH - 76)) | (1L << (INPUTFORMAT - 76)) | (1L << (INSERT - 76)) | (1L << (INTERVAL - 76)) | (1L << (INTO - 76)) | (1L << (IS - 76)) | (1L << (ITEMS - 76)) | (1L << (KEYS - 76)) | (1L << (LAST - 76)) | (1L << (LATERAL - 76)) | (1L << (LAZY - 76)) | (1L << (LEADING - 76)) | (1L << (LIKE - 76)) | (1L << (LIMIT - 76)) | (1L << (LINES - 76)) | (1L << (LIST - 76)) | (1L << (LOAD - 76)) | (1L << (LOCAL - 76)) | (1L << (LOCATION - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOCK - 140)) | (1L << (LOCKS - 140)) | (1L << (LOGICAL - 140)) | (1L << (MACRO - 140)) | (1L << (MAP - 140)) | (1L << (MATCHED - 140)) | (1L << (MERGE - 140)) | (1L << (MSCK - 140)) | (1L << (NAMESPACE - 140)) | (1L << (NAMESPACES - 140)) | (1L << (NO - 140)) | (1L << (NOT - 140)) | (1L << (NULL - 140)) | (1L << (NULLS - 140)) | (1L << (OF - 140)) | (1L << (ONLY - 140)) | (1L << (OPTION - 140)) | (1L << (OPTIONS - 140)) | (1L << (OR - 140)) | (1L << (ORDER - 140)) | (1L << (OUT - 140)) | (1L << (OUTER - 140)) | (1L << (OUTPUTFORMAT - 140)) | (1L << (OVER - 140)) | (1L << (OVERLAPS - 140)) | (1L << (OVERLAY - 140)) | (1L << (OVERWRITE - 140)) | (1L << (PARTITION - 140)) | (1L << (PARTITIONED - 140)) | (1L << (PARTITIONS - 140)) | (1L << (PERCENTLIT - 140)) | (1L << (PIVOT - 140)) | (1L << (PLACING - 140)) | (1L << (POSITION - 140)) | (1L << (PRECEDING - 140)) | (1L << (PRIMARY - 140)) | (1L << (PRINCIPALS - 140)) | (1L << (PROPERTIES - 140)) | (1L << (PURGE - 140)) | (1L << (QUERY - 140)) | (1L << (RANGE - 140)) | (1L << (RECORDREADER - 140)) | (1L << (RECORDWRITER - 140)) | (1L << (RECOVER - 140)) | (1L << (REDUCE - 140)) | (1L << (REFERENCES - 140)) | (1L << (REFRESH - 140)) | (1L << (RENAME - 140)) | (1L << (REPAIR - 140)) | (1L << (REPLACE - 140)) | (1L << (RESET - 140)) | (1L << (RESTRICT - 140)) | (1L << (REVOKE - 140)) | (1L << (RLIKE - 140)) | (1L << (ROLE - 140)) | (1L << (ROLES - 140)) | (1L << (ROLLBACK - 140)) | (1L << (ROLLUP - 140)) | (1L << (ROW - 140)) | (1L << (ROWS - 140)) | (1L << (SCHEMA - 140)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (SELECT - 204)) | (1L << (SEPARATED - 204)) | (1L << (SERDE - 204)) | (1L << (SERDEPROPERTIES - 204)) | (1L << (SESSION_USER - 204)) | (1L << (SET - 204)) | (1L << (SETS - 204)) | (1L << (SHOW - 204)) | (1L << (SKEWED - 204)) | (1L << (SMALLFILES - 204)) | (1L << (SOME - 204)) | (1L << (SORT - 204)) | (1L << (SORTED - 204)) | (1L << (START - 204)) | (1L << (STATISTICS - 204)) | (1L << (STORED - 204)) | (1L << (STRATIFY - 204)) | (1L << (STRUCT - 204)) | (1L << (SUBSTR - 204)) | (1L << (SUBSTRING - 204)) | (1L << (TABLE - 204)) | (1L << (TABLES - 204)) | (1L << (TABLESAMPLE - 204)) | (1L << (TBLPROPERTIES - 204)) | (1L << (TEMPORARY - 204)) | (1L << (TERMINATED - 204)) | (1L << (THEN - 204)) | (1L << (TIME - 204)) | (1L << (TO - 204)) | (1L << (TOUCH - 204)) | (1L << (TRAILING - 204)) | (1L << (TRANSACTION - 204)) | (1L << (TRANSACTIONS - 204)) | (1L << (TRANSFORM - 204)) | (1L << (TRIM - 204)) | (1L << (TRUE - 204)) | (1L << (TRUNCATE - 204)) | (1L << (TYPE - 204)) | (1L << (UNARCHIVE - 204)) | (1L << (UNBOUNDED - 204)) | (1L << (UNCACHE - 204)) | (1L << (UNIQUE - 204)) | (1L << (UNKNOWN - 204)) | (1L << (UNLOCK - 204)) | (1L << (UNSET - 204)) | (1L << (UPDATE - 204)) | (1L << (USE - 204)) | (1L << (USER - 204)) | (1L << (VALUES - 204)) | (1L << (VIEW - 204)) | (1L << (VIEWS - 204)) | (1L << (WHEN - 204)) | (1L << (WHERE - 204)) | (1L << (WINDOW - 204)) | (1L << (WITH - 204)) | (1L << (ZONE - 204)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 102:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 104:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 105:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 136:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 137:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 139:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u012b\u0c24\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\3\2\3\2\7\2\u0125"+
		"\n\2\f\2\16\2\u0128\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u0140\n\t\3\t\3\t\3\t\5"+
		"\t\u0145\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u014d\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0155\n\t\f\t\16\t\u0158\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u016b\n\t\3\t\3\t\5\t\u016f\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0175\n\t\3\t\5\t\u0178\n\t\3\t\5\t\u017b\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0182\n\t\3\t\5\t\u0185\n\t\3\t\3\t\5\t\u0189\n"+
		"\t\3\t\5\t\u018c\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0193\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u019e\n\t\f\t\16\t\u01a1\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01a8\n\t\3\t\5\t\u01ab\n\t\3\t\3\t\5\t\u01af\n\t\3\t\5\t\u01b2"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u01b8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u01c3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0203\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u020c\n\t\3\t\3\t\5\t\u0210\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0216\n\t\3\t\3\t\5\t\u021a\n\t\3\t\3\t\3\t\5\t\u021f\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0225\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0231\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0239\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u023f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u024c\n\t\3"+
		"\t\6\t\u024f\n\t\r\t\16\t\u0250\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0261\n\t\3\t\3\t\3\t\7\t\u0266\n\t\f\t\16\t\u0269"+
		"\13\t\3\t\5\t\u026c\n\t\3\t\3\t\3\t\3\t\5\t\u0272\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0281\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u028a\n\t\3\t\3\t\5\t\u028e\n\t\3\t\3\t\3\t\3\t\5\t\u0294"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u029a\n\t\3\t\5\t\u029d\n\t\3\t\5\t\u02a0\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u02a6\n\t\3\t\3\t\5\t\u02aa\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u02b2\n\t\f\t\16\t\u02b5\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02bd"+
		"\n\t\3\t\5\t\u02c0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02c9\n\t\3\t\3"+
		"\t\3\t\5\t\u02ce\n\t\3\t\3\t\3\t\3\t\5\t\u02d4\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u02db\n\t\3\t\5\t\u02de\n\t\3\t\3\t\3\t\3\t\5\t\u02e4\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u02ed\n\t\f\t\16\t\u02f0\13\t\5\t\u02f2\n\t\3"+
		"\t\3\t\5\t\u02f6\n\t\3\t\3\t\3\t\5\t\u02fb\n\t\3\t\3\t\3\t\5\t\u0300\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0307\n\t\3\t\5\t\u030a\n\t\3\t\5\t\u030d\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0314\n\t\3\t\3\t\3\t\5\t\u0319\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0322\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u032a\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0330\n\t\3\t\5\t\u0333\n\t\3\t\5\t\u0336\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u033c\n\t\3\t\3\t\5\t\u0340\n\t\3\t\3\t\5\t\u0344\n"+
		"\t\3\t\3\t\5\t\u0348\n\t\5\t\u034a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0352"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u035a\n\t\3\t\3\t\3\t\3\t\5\t\u0360\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0366\n\t\3\t\5\t\u0369\n\t\3\t\3\t\5\t\u036d\n"+
		"\t\3\t\5\t\u0370\n\t\3\t\3\t\5\t\u0374\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u038e\n\t\f\t\16\t\u0391\13\t\5\t\u0393\n\t\3\t\3\t\5\t\u0397\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u039d\n\t\3\t\5\t\u03a0\n\t\3\t\5\t\u03a3\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u03a9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03b1\n\t\3\t\3\t"+
		"\3\t\5\t\u03b6\n\t\3\t\3\t\3\t\3\t\5\t\u03bc\n\t\3\t\3\t\3\t\3\t\5\t\u03c2"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03cc\n\t\f\t\16\t\u03cf\13\t"+
		"\5\t\u03d1\n\t\3\t\3\t\3\t\7\t\u03d6\n\t\f\t\16\t\u03d9\13\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03e7\n\t\f\t\16\t\u03ea\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03f5\n\t\f\t\16\t\u03f8\13"+
		"\t\5\t\u03fa\n\t\3\t\3\t\7\t\u03fe\n\t\f\t\16\t\u0401\13\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0407\n\t\f\t\16\t\u040a\13\t\3\t\3\t\3\t\3\t\7\t\u0410\n\t\f"+
		"\t\16\t\u0413\13\t\3\t\3\t\7\t\u0417\n\t\f\t\16\t\u041a\13\t\5\t\u041c"+
		"\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0428\n\f\3\f\3\f\5"+
		"\f\u042c\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0433\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u04a7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04af\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u04b7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04c0"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04ca\n\f\3\r\3\r\5\r\u04ce\n"+
		"\r\3\r\5\r\u04d1\n\r\3\r\3\r\3\r\3\r\5\r\u04d7\n\r\3\r\3\r\3\16\3\16\5"+
		"\16\u04dd\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u04e9\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u04f5"+
		"\n\20\3\20\3\20\3\20\5\20\u04fa\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\5\25\u0509\n\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u0511\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0518\n\26\5\26\u051a"+
		"\n\26\3\26\5\26\u051d\n\26\3\26\3\26\3\26\5\26\u0522\n\26\3\26\3\26\5"+
		"\26\u0526\n\26\3\26\3\26\3\26\5\26\u052b\n\26\3\26\5\26\u052e\n\26\3\26"+
		"\3\26\3\26\5\26\u0533\n\26\3\26\3\26\3\26\5\26\u0538\n\26\3\26\5\26\u053b"+
		"\n\26\3\26\3\26\3\26\5\26\u0540\n\26\3\26\3\26\5\26\u0544\n\26\3\26\3"+
		"\26\3\26\5\26\u0549\n\26\5\26\u054b\n\26\3\27\3\27\5\27\u054f\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0556\n\30\f\30\16\30\u0559\13\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u0560\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0569\n\33\3\34\3\34\3\34\7\34\u056e\n\34\f\34\16\34\u0571\13\34\3\35"+
		"\3\35\3\35\3\35\7\35\u0577\n\35\f\35\16\35\u057a\13\35\3\36\3\36\5\36"+
		"\u057e\n\36\3\36\5\36\u0581\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0598\n \f \16 \u059b\13 "+
		"\3!\3!\3!\3!\7!\u05a1\n!\f!\16!\u05a4\13!\3!\3!\3\"\3\"\5\"\u05aa\n\""+
		"\3\"\5\"\u05ad\n\"\3#\3#\3#\7#\u05b2\n#\f#\16#\u05b5\13#\3#\5#\u05b8\n"+
		"#\3$\3$\3$\3$\5$\u05be\n$\3%\3%\3%\3%\7%\u05c4\n%\f%\16%\u05c7\13%\3%"+
		"\3%\3&\3&\3&\3&\7&\u05cf\n&\f&\16&\u05d2\13&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u05dc\n\'\3(\3(\3(\3(\3(\5(\u05e3\n(\3)\3)\3)\3)\5)\u05e9\n)"+
		"\3*\5*\u05ec\n*\3*\3*\3+\3+\3+\3+\3+\3+\6+\u05f6\n+\r+\16+\u05f7\3+\3"+
		"+\3+\3+\3+\5+\u05ff\n+\3+\3+\3+\3+\3+\5+\u0606\n+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u0612\n+\3+\3+\3+\3+\7+\u0618\n+\f+\16+\u061b\13+\3+\7+"+
		"\u061e\n+\f+\16+\u0621\13+\5+\u0623\n+\3,\3,\3,\3,\3,\7,\u062a\n,\f,\16"+
		",\u062d\13,\5,\u062f\n,\3,\3,\3,\3,\3,\7,\u0636\n,\f,\16,\u0639\13,\5"+
		",\u063b\n,\3,\3,\3,\3,\3,\7,\u0642\n,\f,\16,\u0645\13,\5,\u0647\n,\3,"+
		"\3,\3,\3,\3,\7,\u064e\n,\f,\16,\u0651\13,\5,\u0653\n,\3,\5,\u0656\n,\3"+
		",\3,\3,\5,\u065b\n,\5,\u065d\n,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u0669"+
		"\n.\3.\3.\3.\3.\3.\5.\u0670\n.\3.\3.\3.\3.\3.\5.\u0677\n.\3.\7.\u067a"+
		"\n.\f.\16.\u067d\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0688\n/\3\60\3\60"+
		"\5\60\u068c\n\60\3\60\3\60\5\60\u0690\n\60\3\61\3\61\6\61\u0694\n\61\r"+
		"\61\16\61\u0695\3\62\3\62\5\62\u069a\n\62\3\62\3\62\3\62\3\62\7\62\u06a0"+
		"\n\62\f\62\16\62\u06a3\13\62\3\62\5\62\u06a6\n\62\3\62\5\62\u06a9\n\62"+
		"\3\62\5\62\u06ac\n\62\3\62\5\62\u06af\n\62\3\62\3\62\5\62\u06b3\n\62\3"+
		"\63\3\63\5\63\u06b7\n\63\3\63\5\63\u06ba\n\63\3\63\3\63\5\63\u06be\n\63"+
		"\3\63\7\63\u06c1\n\63\f\63\16\63\u06c4\13\63\3\63\5\63\u06c7\n\63\3\63"+
		"\5\63\u06ca\n\63\3\63\5\63\u06cd\n\63\3\63\5\63\u06d0\n\63\5\63\u06d2"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u06de\n\64"+
		"\3\64\5\64\u06e1\n\64\3\64\3\64\5\64\u06e5\n\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u06ef\n\64\3\64\3\64\5\64\u06f3\n\64\5\64\u06f5"+
		"\n\64\3\64\5\64\u06f8\n\64\3\64\3\64\5\64\u06fc\n\64\3\65\3\65\7\65\u0700"+
		"\n\65\f\65\16\65\u0703\13\65\3\65\5\65\u0706\n\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\5\67\u0711\n\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\58\u071b\n8\38\38\38\39\39\39\39\39\39\39\59\u0727\n9\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\7:\u0734\n:\f:\16:\u0737\13:\3:\3:\5:\u073b\n:\3;"+
		"\3;\3;\7;\u0740\n;\f;\16;\u0743\13;\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3"+
		"?\3?\5?\u0752\n?\3?\7?\u0755\n?\f?\16?\u0758\13?\3?\3?\3@\3@\3@\3@\3@"+
		"\3@\7@\u0762\n@\f@\16@\u0765\13@\3@\3@\5@\u0769\n@\3A\3A\3A\3A\7A\u076f"+
		"\nA\fA\16A\u0772\13A\3A\7A\u0775\nA\fA\16A\u0778\13A\3A\5A\u077b\nA\3"+
		"B\3B\3B\3B\3B\7B\u0782\nB\fB\16B\u0785\13B\3B\3B\3B\3B\3B\7B\u078c\nB"+
		"\fB\16B\u078f\13B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u079b\nB\fB\16B\u079e"+
		"\13B\3B\3B\5B\u07a2\nB\5B\u07a4\nB\3C\3C\5C\u07a8\nC\3D\3D\3D\3D\3D\7"+
		"D\u07af\nD\fD\16D\u07b2\13D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u07bc\nD\fD\16"+
		"D\u07bf\13D\3D\3D\5D\u07c3\nD\3E\3E\5E\u07c7\nE\3F\3F\3F\3F\7F\u07cd\n"+
		"F\fF\16F\u07d0\13F\5F\u07d2\nF\3F\3F\5F\u07d6\nF\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\7G\u07e2\nG\fG\16G\u07e5\13G\3G\3G\3G\3H\3H\3H\3H\3H\7H\u07ef"+
		"\nH\fH\16H\u07f2\13H\3H\3H\5H\u07f6\nH\3I\3I\5I\u07fa\nI\3I\5I\u07fd\n"+
		"I\3J\3J\3J\5J\u0802\nJ\3J\3J\3J\3J\3J\7J\u0809\nJ\fJ\16J\u080c\13J\5J"+
		"\u080e\nJ\3J\3J\3J\5J\u0813\nJ\3J\3J\3J\7J\u0818\nJ\fJ\16J\u081b\13J\5"+
		"J\u081d\nJ\3K\3K\3L\3L\7L\u0823\nL\fL\16L\u0826\13L\3M\3M\3M\3M\5M\u082c"+
		"\nM\3M\3M\3M\3M\3M\5M\u0833\nM\3N\5N\u0836\nN\3N\3N\3N\5N\u083b\nN\3N"+
		"\5N\u083e\nN\3N\3N\3N\5N\u0843\nN\3N\3N\5N\u0847\nN\3N\5N\u084a\nN\3N"+
		"\5N\u084d\nN\3O\3O\3O\3O\5O\u0853\nO\3P\3P\3P\5P\u0858\nP\3P\3P\3Q\5Q"+
		"\u085d\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u086f\nQ"+
		"\5Q\u0871\nQ\3Q\5Q\u0874\nQ\3R\3R\3R\3R\3S\3S\3S\7S\u087d\nS\fS\16S\u0880"+
		"\13S\3T\3T\3T\3T\7T\u0886\nT\fT\16T\u0889\13T\3T\3T\3U\3U\5U\u088f\nU"+
		"\3V\3V\3V\3V\7V\u0895\nV\fV\16V\u0898\13V\3V\3V\3W\3W\5W\u089e\nW\3X\3"+
		"X\5X\u08a2\nX\3X\3X\7X\u08a6\nX\fX\16X\u08a9\13X\3X\3X\3X\3X\5X\u08af"+
		"\nX\3X\3X\7X\u08b3\nX\fX\16X\u08b6\13X\3X\3X\3X\3X\5X\u08bc\nX\3X\3X\3"+
		"X\3X\5X\u08c2\nX\3Y\3Y\3Y\3Y\7Y\u08c8\nY\fY\16Y\u08cb\13Y\3Y\3Y\3Z\3Z"+
		"\3Z\3Z\3Z\7Z\u08d4\nZ\fZ\16Z\u08d7\13Z\5Z\u08d9\nZ\3Z\3Z\3Z\3[\5[\u08df"+
		"\n[\3[\3[\5[\u08e3\n[\5[\u08e5\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u08ee"+
		"\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u08fa\n\\\5\\\u08fc\n"+
		"\\\3\\\3\\\3\\\3\\\3\\\5\\\u0903\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u090a\n\\"+
		"\3\\\3\\\3\\\3\\\5\\\u0910\n\\\3\\\3\\\3\\\3\\\5\\\u0916\n\\\5\\\u0918"+
		"\n\\\3]\3]\3]\7]\u091d\n]\f]\16]\u0920\13]\3^\3^\3^\7^\u0925\n^\f^\16"+
		"^\u0928\13^\3_\3_\3_\5_\u092d\n_\3_\3_\3`\3`\3`\5`\u0934\n`\3`\3`\3a\3"+
		"a\5a\u093a\na\3a\3a\5a\u093e\na\5a\u0940\na\3b\3b\3b\7b\u0945\nb\fb\16"+
		"b\u0948\13b\3c\3c\3c\3c\7c\u094e\nc\fc\16c\u0951\13c\3c\3c\3d\3d\5d\u0957"+
		"\nd\3e\3e\3e\3e\3e\3e\7e\u095f\ne\fe\16e\u0962\13e\3e\3e\5e\u0966\ne\3"+
		"f\3f\5f\u096a\nf\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0978\nh\5h\u097a"+
		"\nh\3h\3h\3h\3h\3h\3h\7h\u0982\nh\fh\16h\u0985\13h\3i\5i\u0988\ni\3i\3"+
		"i\3i\3i\3i\3i\5i\u0990\ni\3i\3i\3i\3i\3i\7i\u0997\ni\fi\16i\u099a\13i"+
		"\3i\3i\3i\5i\u099f\ni\3i\3i\3i\3i\3i\3i\5i\u09a7\ni\3i\3i\3i\5i\u09ac"+
		"\ni\3i\3i\3i\3i\3i\3i\3i\3i\7i\u09b6\ni\fi\16i\u09b9\13i\3i\3i\5i\u09bd"+
		"\ni\3i\5i\u09c0\ni\3i\3i\3i\3i\5i\u09c6\ni\3i\3i\5i\u09ca\ni\3i\3i\3i"+
		"\5i\u09cf\ni\3i\3i\3i\5i\u09d4\ni\3i\3i\3i\5i\u09d9\ni\3j\3j\3j\3j\5j"+
		"\u09df\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\7j"+
		"\u09f4\nj\fj\16j\u09f7\13j\3k\3k\3k\3k\6k\u09fd\nk\rk\16k\u09fe\3k\3k"+
		"\5k\u0a03\nk\3k\3k\3k\3k\3k\6k\u0a0a\nk\rk\16k\u0a0b\3k\3k\5k\u0a10\n"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\7k\u0a20\nk\fk\16k\u0a23\13"+
		"k\5k\u0a25\nk\3k\3k\3k\3k\3k\3k\5k\u0a2d\nk\3k\3k\3k\3k\3k\3k\3k\5k\u0a36"+
		"\nk\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\6k\u0a4b"+
		"\nk\rk\16k\u0a4c\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0a58\nk\3k\3k\3k\7k\u0a5d"+
		"\nk\fk\16k\u0a60\13k\5k\u0a62\nk\3k\3k\3k\3k\3k\3k\3k\5k\u0a6b\nk\3k\3"+
		"k\5k\u0a6f\nk\3k\3k\3k\3k\3k\3k\3k\3k\6k\u0a79\nk\rk\16k\u0a7a\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0a94"+
		"\nk\3k\3k\3k\3k\3k\5k\u0a9b\nk\3k\5k\u0a9e\nk\3k\3k\3k\3k\3k\3k\3k\3k"+
		"\3k\3k\3k\3k\3k\5k\u0aad\nk\3k\3k\5k\u0ab1\nk\3k\3k\3k\3k\3k\3k\3k\3k"+
		"\7k\u0abb\nk\fk\16k\u0abe\13k\3l\3l\3l\3l\3l\3l\3l\3l\6l\u0ac8\nl\rl\16"+
		"l\u0ac9\5l\u0acc\nl\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3q\5q\u0ad9\nq\3r\3"+
		"r\5r\u0add\nr\3s\3s\3s\6s\u0ae2\ns\rs\16s\u0ae3\3t\3t\3t\5t\u0ae9\nt\3"+
		"u\3u\3u\3u\3u\3v\5v\u0af1\nv\3v\3v\5v\u0af5\nv\3w\3w\3w\5w\u0afa\nw\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u0b0b\nx\3x\3x\5x\u0b0f"+
		"\nx\3x\3x\3x\3x\3x\7x\u0b16\nx\fx\16x\u0b19\13x\3x\5x\u0b1c\nx\5x\u0b1e"+
		"\nx\3y\3y\3y\7y\u0b23\ny\fy\16y\u0b26\13y\3z\3z\3z\3z\5z\u0b2c\nz\3z\5"+
		"z\u0b2f\nz\3z\5z\u0b32\nz\3{\3{\3{\7{\u0b37\n{\f{\16{\u0b3a\13{\3|\3|"+
		"\3|\5|\u0b3f\n|\3|\3|\5|\u0b43\n|\3|\5|\u0b46\n|\3}\3}\3}\7}\u0b4b\n}"+
		"\f}\16}\u0b4e\13}\3~\3~\3~\3~\3~\5~\u0b55\n~\3~\5~\u0b58\n~\3\177\3\177"+
		"\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0b63\n\u0080"+
		"\f\u0080\16\u0080\u0b66\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\7\u0082\u0b77\n\u0082\f\u0082\16\u0082\u0b7a\13\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0b81\n\u0082\f\u0082\16\u0082"+
		"\u0b84\13\u0082\5\u0082\u0b86\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\7\u0082\u0b8d\n\u0082\f\u0082\16\u0082\u0b90\13\u0082\5\u0082"+
		"\u0b92\n\u0082\5\u0082\u0b94\n\u0082\3\u0082\5\u0082\u0b97\n\u0082\3\u0082"+
		"\5\u0082\u0b9a\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0bac\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u0bb5\n\u0084\3\u0085\3\u0085\3\u0085\7\u0085"+
		"\u0bba\n\u0085\f\u0085\16\u0085\u0bbd\13\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0bc3\n\u0086\3\u0087\3\u0087\3\u0087\7\u0087\u0bc8\n"+
		"\u0087\f\u0087\16\u0087\u0bcb\13\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\6\u0089\u0bd2\n\u0089\r\u0089\16\u0089\u0bd3\3\u0089\5\u0089"+
		"\u0bd7\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u0bdc\n\u008a\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0be4\n\u008b\3\u008c\3"+
		"\u008c\3\u008d\3\u008d\5\u008d\u0bea\n\u008d\3\u008d\3\u008d\3\u008d\5"+
		"\u008d\u0bef\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0bf4\n\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0bf8\n\u008d\3\u008d\3\u008d\5\u008d\u0bfc\n\u008d\3"+
		"\u008d\3\u008d\5\u008d\u0c00\n\u008d\3\u008d\3\u008d\5\u008d\u0c04\n\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0c08\n\u008d\3\u008d\3\u008d\5\u008d\u0c0c\n"+
		"\u008d\3\u008d\3\u008d\5\u008d\u0c10\n\u008d\3\u008d\5\u008d\u0c13\n\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0c1c"+
		"\n\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\13\u038f"+
		"\u03cd\u03d7\u03e8\u03f6\u03ff\u0408\u0411\u0418\6Z\u00ce\u00d2\u00d4"+
		"\u0092\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\2/\4\2BB\u00b5\u00b5\4\2\"\"\u00c3\u00c3\4\2AA\u0097"+
		"\u0097\4\2ggss\3\2-.\4\2\u00e4\u00e4\u0103\u0103\4\2\21\21%%\7\2**\66"+
		"\66YYff\u0090\u0090\3\2GH\4\2YYff\4\2\u009b\u009b\u011c\u011c\4\2\16\16"+
		"\u008a\u008a\4\2\u008c\u008c\u011c\u011c\5\2@@\u0096\u0096\u00cd\u00cd"+
		"\6\2TTzz\u00d5\u00d5\u00f9\u00f9\5\2TT\u00d5\u00d5\u00f9\u00f9\4\2\31"+
		"\31GG\4\2aa\u0081\u0081\4\299\u00ca\u00ca\4\2\20\20LL\4\2\u0120\u0120"+
		"\u0122\u0122\5\2\20\20\25\25\u00da\u00da\5\2\\\\\u00f3\u00f3\u00fb\u00fb"+
		"\4\2\u0112\u0113\u0117\u0117\4\2NN\u0114\u0116\4\2\u0112\u0113\u011a\u011a"+
		"\4\2;;==\3\2\u00e2\u00e3\4\2\6\6gg\4\2\6\6cc\5\2\35\35\u0084\u0084\u00ee"+
		"\u00ee\3\2\u010a\u0111\4\2NN\u0112\u011b\6\2\23\23ss\u009a\u009a\u00a2"+
		"\u00a2\4\2\\\\\u00f3\u00f3\3\2\u0112\u0113\4\2MM\u00ab\u00ab\4\2\u00a3"+
		"\u00a3\u00db\u00db\4\2bb\u00b2\u00b2\4\2\7\7\r\r\3\2\u0121\u0122\4\2O"+
		"O\u00d4\u00d4\63\2\16\17\21\22\24\24\26\27\31\32\34\34\36\"%%\'*,,.\64"+
		"\66\669:?BDKMOSSU[^^`befiknnprtuwy{{~~\u0080\u0083\u0087\u0097\u0099\u0099"+
		"\u009c\u009d\u00a0\u00a1\u00a4\u00a4\u00a6\u00a7\u00a9\u00b2\u00b4\u00bc"+
		"\u00be\u00c4\u00c6\u00cd\u00cf\u00d2\u00d4\u00d9\u00db\u00e3\u00e5\u00e9"+
		"\u00ed\u00ed\u00ef\u00f8\u00fc\u00ff\u0102\u0104\u0107\u0107\u0109\u0109"+
		"\21\2\24\2488TThhvvzz\177\177\u0085\u0085\u0098\u0098\u009e\u009e\u00c5"+
		"\u00c5\u00cf\u00cf\u00d5\u00d5\u00f9\u00f9\u0101\u0101\23\2\16\23\25\67"+
		"9BDSUgiuwy{~\u0080\u0084\u0087\u0097\u0099\u009d\u009f\u00c4\u00c6\u00ce"+
		"\u00d0\u00d4\u00d6\u00f8\u00fa\u0100\u0102\u0109\2\u0e00\2\u0122\3\2\2"+
		"\2\4\u012b\3\2\2\2\6\u012e\3\2\2\2\b\u0131\3\2\2\2\n\u0134\3\2\2\2\f\u0137"+
		"\3\2\2\2\16\u013a\3\2\2\2\20\u041b\3\2\2\2\22\u041d\3\2\2\2\24\u041f\3"+
		"\2\2\2\26\u04c9\3\2\2\2\30\u04cb\3\2\2\2\32\u04dc\3\2\2\2\34\u04e2\3\2"+
		"\2\2\36\u04ee\3\2\2\2 \u04fb\3\2\2\2\"\u04fe\3\2\2\2$\u0501\3\2\2\2&\u0504"+
		"\3\2\2\2(\u0508\3\2\2\2*\u054a\3\2\2\2,\u054c\3\2\2\2.\u0550\3\2\2\2\60"+
		"\u055c\3\2\2\2\62\u0561\3\2\2\2\64\u0568\3\2\2\2\66\u056a\3\2\2\28\u0572"+
		"\3\2\2\2:\u057b\3\2\2\2<\u0586\3\2\2\2>\u0599\3\2\2\2@\u059c\3\2\2\2B"+
		"\u05a7\3\2\2\2D\u05b7\3\2\2\2F\u05bd\3\2\2\2H\u05bf\3\2\2\2J\u05ca\3\2"+
		"\2\2L\u05db\3\2\2\2N\u05e2\3\2\2\2P\u05e4\3\2\2\2R\u05eb\3\2\2\2T\u0622"+
		"\3\2\2\2V\u062e\3\2\2\2X\u065e\3\2\2\2Z\u0661\3\2\2\2\\\u0687\3\2\2\2"+
		"^\u0689\3\2\2\2`\u0691\3\2\2\2b\u06b2\3\2\2\2d\u06d1\3\2\2\2f\u06dd\3"+
		"\2\2\2h\u06fd\3\2\2\2j\u0709\3\2\2\2l\u070c\3\2\2\2n\u0715\3\2\2\2p\u0726"+
		"\3\2\2\2r\u073a\3\2\2\2t\u073c\3\2\2\2v\u0744\3\2\2\2x\u0748\3\2\2\2z"+
		"\u074b\3\2\2\2|\u074e\3\2\2\2~\u0768\3\2\2\2\u0080\u076a\3\2\2\2\u0082"+
		"\u07a3\3\2\2\2\u0084\u07a7\3\2\2\2\u0086\u07c2\3\2\2\2\u0088\u07c6\3\2"+
		"\2\2\u008a\u07d5\3\2\2\2\u008c\u07d7\3\2\2\2\u008e\u07f5\3\2\2\2\u0090"+
		"\u07f7\3\2\2\2\u0092\u07fe\3\2\2\2\u0094\u081e\3\2\2\2\u0096\u0820\3\2"+
		"\2\2\u0098\u0832\3\2\2\2\u009a\u084c\3\2\2\2\u009c\u0852\3\2\2\2\u009e"+
		"\u0854\3\2\2\2\u00a0\u0873\3\2\2\2\u00a2\u0875\3\2\2\2\u00a4\u0879\3\2"+
		"\2\2\u00a6\u0881\3\2\2\2\u00a8\u088c\3\2\2\2\u00aa\u0890\3\2\2\2\u00ac"+
		"\u089b\3\2\2\2\u00ae\u08c1\3\2\2\2\u00b0\u08c3\3\2\2\2\u00b2\u08ce\3\2"+
		"\2\2\u00b4\u08e4\3\2\2\2\u00b6\u0917\3\2\2\2\u00b8\u0919\3\2\2\2\u00ba"+
		"\u0921\3\2\2\2\u00bc\u092c\3\2\2\2\u00be\u0933\3\2\2\2\u00c0\u0937\3\2"+
		"\2\2\u00c2\u0941\3\2\2\2\u00c4\u0949\3\2\2\2\u00c6\u0956\3\2\2\2\u00c8"+
		"\u0965\3\2\2\2\u00ca\u0969\3\2\2\2\u00cc\u096b\3\2\2\2\u00ce\u0979\3\2"+
		"\2\2\u00d0\u09d8\3\2\2\2\u00d2\u09de\3\2\2\2\u00d4\u0ab0\3\2\2\2\u00d6"+
		"\u0acb\3\2\2\2\u00d8\u0acd\3\2\2\2\u00da\u0acf\3\2\2\2\u00dc\u0ad1\3\2"+
		"\2\2\u00de\u0ad3\3\2\2\2\u00e0\u0ad5\3\2\2\2\u00e2\u0ada\3\2\2\2\u00e4"+
		"\u0ae1\3\2\2\2\u00e6\u0ae5\3\2\2\2\u00e8\u0aea\3\2\2\2\u00ea\u0af4\3\2"+
		"\2\2\u00ec\u0af9\3\2\2\2\u00ee\u0b1d\3\2\2\2\u00f0\u0b1f\3\2\2\2\u00f2"+
		"\u0b27\3\2\2\2\u00f4\u0b33\3\2\2\2\u00f6\u0b3b\3\2\2\2\u00f8\u0b47\3\2"+
		"\2\2\u00fa\u0b4f\3\2\2\2\u00fc\u0b59\3\2\2\2\u00fe\u0b5e\3\2\2\2\u0100"+
		"\u0b67\3\2\2\2\u0102\u0b99\3\2\2\2\u0104\u0bab\3\2\2\2\u0106\u0bb4\3\2"+
		"\2\2\u0108\u0bb6\3\2\2\2\u010a\u0bc2\3\2\2\2\u010c\u0bc4\3\2\2\2\u010e"+
		"\u0bcc\3\2\2\2\u0110\u0bd6\3\2\2\2\u0112\u0bdb\3\2\2\2\u0114\u0be3\3\2"+
		"\2\2\u0116\u0be5\3\2\2\2\u0118\u0c12\3\2\2\2\u011a\u0c1b\3\2\2\2\u011c"+
		"\u0c1d\3\2\2\2\u011e\u0c1f\3\2\2\2\u0120\u0c21\3\2\2\2\u0122\u0126\5\20"+
		"\t\2\u0123\u0125\7\3\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012a\7\2\2\3\u012a\3\3\2\2\2\u012b\u012c\5\u00c0a\2\u012c"+
		"\u012d\7\2\2\3\u012d\5\3\2\2\2\u012e\u012f\5\u00bc_\2\u012f\u0130\7\2"+
		"\2\3\u0130\7\3\2\2\2\u0131\u0132\5\u00ba^\2\u0132\u0133\7\2\2\3\u0133"+
		"\t\3\2\2\2\u0134\u0135\5\u00be`\2\u0135\u0136\7\2\2\3\u0136\13\3\2\2\2"+
		"\u0137\u0138\5\u00eex\2\u0138\u0139\7\2\2\3\u0139\r\3\2\2\2\u013a\u013b"+
		"\5\u00f4{\2\u013b\u013c\7\2\2\3\u013c\17\3\2\2\2\u013d\u041c\5(\25\2\u013e"+
		"\u0140\58\35\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u041c\5T+\2\u0142\u0144\7\u00ff\2\2\u0143\u0145\7\u0096\2\2"+
		"\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u041c"+
		"\5\u00ba^\2\u0147\u0148\7\67\2\2\u0148\u014c\5\62\32\2\u0149\u014a\7p"+
		"\2\2\u014a\u014b\7\u009a\2\2\u014b\u014d\7V\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0156\5\u00ba^\2\u014f\u0155"+
		"\5$\23\2\u0150\u0155\5 \21\2\u0151\u0152\7\u0108\2\2\u0152\u0153\t\2\2"+
		"\2\u0153\u0155\5@!\2\u0154\u014f\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0151"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u041c\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\21\2\2\u015a\u015b\5"+
		"\62\32\2\u015b\u015c\5\u00ba^\2\u015c\u015d\7\u00d4\2\2\u015d\u015e\t"+
		"\2\2\2\u015e\u015f\5@!\2\u015f\u041c\3\2\2\2\u0160\u0161\7\21\2\2\u0161"+
		"\u0162\5\62\32\2\u0162\u0163\5\u00ba^\2\u0163\u0164\7\u00d4\2\2\u0164"+
		"\u0165\5 \21\2\u0165\u041c\3\2\2\2\u0166\u0167\7O\2\2\u0167\u016a\5\62"+
		"\32\2\u0168\u0169\7p\2\2\u0169\u016b\7V\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\5\u00ba^\2\u016d\u016f"+
		"\t\3\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u041c\3\2\2\2\u0170"+
		"\u0171\7\u00d7\2\2\u0171\u0174\t\4\2\2\u0172\u0173\t\5\2\2\u0173\u0175"+
		"\5\u00ba^\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017a\3\2\2"+
		"\2\u0176\u0178\7\u0087\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\7\u011c\2\2\u017a\u0177\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u041c\3\2\2\2\u017c\u0181\5\30\r\2\u017d\u017e\7\4\2\2"+
		"\u017e\u017f\5\u00f4{\2\u017f\u0180\7\5\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0185\5<"+
		"\37\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u018b\5> \2\u0187\u0189\7\30\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018c\5(\25\2\u018b\u0188\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u041c\3\2\2\2\u018d\u018e\7\67\2\2\u018e\u0192\7"+
		"\u00e4\2\2\u018f\u0190\7p\2\2\u0190\u0191\7\u009a\2\2\u0191\u0193\7V\2"+
		"\2\u0192\u018f\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195"+
		"\5\u00bc_\2\u0195\u0196\7\u0087\2\2\u0196\u019f\5\u00bc_\2\u0197\u019e"+
		"\5<\37\2\u0198\u019e\5\u00b6\\\2\u0199\u019e\5L\'\2\u019a\u019e\5 \21"+
		"\2\u019b\u019c\7\u00e7\2\2\u019c\u019e\5@!\2\u019d\u0197\3\2\2\2\u019d"+
		"\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u041c\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a7\5\32\16\2\u01a3\u01a4\7"+
		"\4\2\2\u01a4\u01a5\5\u00f4{\2\u01a5\u01a6\7\5\2\2\u01a6\u01a8\3\2\2\2"+
		"\u01a7\u01a3\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01ab"+
		"\5<\37\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01b1\5> \2\u01ad\u01af\7\30\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\5(\25\2\u01b1\u01ae\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u041c\3\2\2\2\u01b3\u01b4\7\22\2\2\u01b4\u01b5\7"+
		"\u00e4\2\2\u01b5\u01b7\5\u00ba^\2\u01b6\u01b8\5.\30\2\u01b7\u01b6\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\63\2\2\u01ba"+
		"\u01c2\7\u00de\2\2\u01bb\u01c3\5\u0112\u008a\2\u01bc\u01bd\7c\2\2\u01bd"+
		"\u01be\7.\2\2\u01be\u01c3\5\u00a4S\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7"+
		"\20\2\2\u01c1\u01c3\7.\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01bc\3\2\2\2\u01c2"+
		"\u01bf\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u041c\3\2\2\2\u01c4\u01c5\7\21"+
		"\2\2\u01c5\u01c6\7\u00e4\2\2\u01c6\u01c7\5\u00ba^\2\u01c7\u01c8\7\16\2"+
		"\2\u01c8\u01c9\t\6\2\2\u01c9\u01ca\5\u00f0y\2\u01ca\u041c\3\2\2\2\u01cb"+
		"\u01cc\7\21\2\2\u01cc\u01cd\7\u00e4\2\2\u01cd\u01ce\5\u00ba^\2\u01ce\u01cf"+
		"\7\16\2\2\u01cf\u01d0\t\6\2\2\u01d0\u01d1\7\4\2\2\u01d1\u01d2\5\u00f0"+
		"y\2\u01d2\u01d3\7\5\2\2\u01d3\u041c\3\2\2\2\u01d4\u01d5\7\21\2\2\u01d5"+
		"\u01d6\7\u00e4\2\2\u01d6\u01d7\5\u00ba^\2\u01d7\u01d8\7\u00bf\2\2\u01d8"+
		"\u01d9\7-\2\2\u01d9\u01da\5\u00ba^\2\u01da\u01db\7\u00ec\2\2\u01db\u01dc"+
		"\5\u010e\u0088\2\u01dc\u041c\3\2\2\2\u01dd\u01de\7\21\2\2\u01de\u01df"+
		"\7\u00e4\2\2\u01df\u01e0\5\u00ba^\2\u01e0\u01e1\7O\2\2\u01e1\u01e2\t\6"+
		"\2\2\u01e2\u01e3\7\4\2\2\u01e3\u01e4\5\u00b8]\2\u01e4\u01e5\7\5\2\2\u01e5"+
		"\u041c\3\2\2\2\u01e6\u01e7\7\21\2\2\u01e7\u01e8\7\u00e4\2\2\u01e8\u01e9"+
		"\5\u00ba^\2\u01e9\u01ea\7O\2\2\u01ea\u01eb\t\6\2\2\u01eb\u01ec\5\u00b8"+
		"]\2\u01ec\u041c\3\2\2\2\u01ed\u01ee\7\21\2\2\u01ee\u01ef\t\7\2\2\u01ef"+
		"\u01f0\5\u00ba^\2\u01f0\u01f1\7\u00bf\2\2\u01f1\u01f2\7\u00ec\2\2\u01f2"+
		"\u01f3\5\u00ba^\2\u01f3\u041c\3\2\2\2\u01f4\u01f5\7\21\2\2\u01f5\u01f6"+
		"\t\7\2\2\u01f6\u01f7\5\u00ba^\2\u01f7\u01f8\7\u00d4\2\2\u01f8\u01f9\7"+
		"\u00e7\2\2\u01f9\u01fa\5@!\2\u01fa\u041c\3\2\2\2\u01fb\u01fc\7\21\2\2"+
		"\u01fc\u01fd\t\7\2\2\u01fd\u01fe\5\u00ba^\2\u01fe\u01ff\7\u00fd\2\2\u01ff"+
		"\u0202\7\u00e7\2\2\u0200\u0201\7p\2\2\u0201\u0203\7V\2\2\u0202\u0200\3"+
		"\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5@!\2\u0205"+
		"\u041c\3\2\2\2\u0206\u0207\7\21\2\2\u0207\u0208\7\u00e4\2\2\u0208\u0209"+
		"\5\u00ba^\2\u0209\u020b\t\b\2\2\u020a\u020c\7-\2\2\u020b\u020a\3\2\2\2"+
		"\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\5\u00ba^\2\u020e"+
		"\u0210\5\u011a\u008e\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u041c"+
		"\3\2\2\2\u0211\u0212\7\21\2\2\u0212\u0213\7\u00e4\2\2\u0213\u0215\5\u00ba"+
		"^\2\u0214\u0216\5.\30\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0219\7%\2\2\u0218\u021a\7-\2\2\u0219\u0218\3\2\2"+
		"\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\5\u00ba^\2\u021c"+
		"\u021e\5\u00f6|\2\u021d\u021f\5\u00ecw\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u041c\3\2\2\2\u0220\u0221\7\21\2\2\u0221\u0222\7\u00e4"+
		"\2\2\u0222\u0224\5\u00ba^\2\u0223\u0225\5.\30\2\u0224\u0223\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\7\u00c1\2\2\u0227\u0228"+
		"\7.\2\2\u0228\u0229\7\4\2\2\u0229\u022a\5\u00f0y\2\u022a\u022b\7\5\2\2"+
		"\u022b\u041c\3\2\2\2\u022c\u022d\7\21\2\2\u022d\u022e\7\u00e4\2\2\u022e"+
		"\u0230\5\u00ba^\2\u022f\u0231\5.\30\2\u0230\u022f\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7\u00d4\2\2\u0233\u0234\7\u00d1"+
		"\2\2\u0234\u0238\7\u011c\2\2\u0235\u0236\7\u0108\2\2\u0236\u0237\7\u00d2"+
		"\2\2\u0237\u0239\5@!\2\u0238\u0235\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u041c"+
		"\3\2\2\2\u023a\u023b\7\21\2\2\u023b\u023c\7\u00e4\2\2\u023c\u023e\5\u00ba"+
		"^\2\u023d\u023f\5.\30\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0241\7\u00d4\2\2\u0241\u0242\7\u00d2\2\2\u0242\u0243"+
		"\5@!\2\u0243\u041c\3\2\2\2\u0244\u0245\7\21\2\2\u0245\u0246\t\7\2\2\u0246"+
		"\u0247\5\u00ba^\2\u0247\u024b\7\16\2\2\u0248\u0249\7p\2\2\u0249\u024a"+
		"\7\u009a\2\2\u024a\u024c\7V\2\2\u024b\u0248\3\2\2\2\u024b\u024c\3\2\2"+
		"\2\u024c\u024e\3\2\2\2\u024d\u024f\5,\27\2\u024e\u024d\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u041c\3\2\2\2\u0252"+
		"\u0253\7\21\2\2\u0253\u0254\7\u00e4\2\2\u0254\u0255\5\u00ba^\2\u0255\u0256"+
		"\5.\30\2\u0256\u0257\7\u00bf\2\2\u0257\u0258\7\u00ec\2\2\u0258\u0259\5"+
		".\30\2\u0259\u041c\3\2\2\2\u025a\u025b\7\21\2\2\u025b\u025c\t\7\2\2\u025c"+
		"\u025d\5\u00ba^\2\u025d\u0260\7O\2\2\u025e\u025f\7p\2\2\u025f\u0261\7"+
		"V\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0267\5.\30\2\u0263\u0264\7\6\2\2\u0264\u0266\5.\30\2\u0265\u0263\3\2"+
		"\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026c\7\u00b6\2\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u041c\3\2\2\2\u026d\u026e\7\21\2\2"+
		"\u026e\u026f\7\u00e4\2\2\u026f\u0271\5\u00ba^\2\u0270\u0272\5.\30\2\u0271"+
		"\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7\u00d4"+
		"\2\2\u0274\u0275\5 \21\2\u0275\u041c\3\2\2\2\u0276\u0277\7\21\2\2\u0277"+
		"\u0278\7\u00e4\2\2\u0278\u0279\5\u00ba^\2\u0279\u027a\7\u00bb\2\2\u027a"+
		"\u027b\7\u00ad\2\2\u027b\u041c\3\2\2\2\u027c\u027d\7\21\2\2\u027d\u027e"+
		"\7\u00e4\2\2\u027e\u0280\5\u00ba^\2\u027f\u0281\5.\30\2\u0280\u027f\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\7\u0094\2\2"+
		"\u0283\u0284\7\u00d9\2\2\u0284\u041c\3\2\2\2\u0285\u0286\7O\2\2\u0286"+
		"\u0289\7\u00e4\2\2\u0287\u0288\7p\2\2\u0288\u028a\7V\2\2\u0289\u0287\3"+
		"\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\5\u00ba^\2"+
		"\u028c\u028e\7\u00b6\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u041c\3\2\2\2\u028f\u0290\7O\2\2\u0290\u0293\7\u0103\2\2\u0291\u0292"+
		"\7p\2\2\u0292\u0294\7V\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u041c\5\u00ba^\2\u0296\u0299\7\67\2\2\u0297\u0298"+
		"\7\u00a2\2\2\u0298\u029a\7\u00c1\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3"+
		"\2\2\2\u029a\u029f\3\2\2\2\u029b\u029d\7k\2\2\u029c\u029b\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\u00e8\2\2\u029f\u029c"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a5\7\u0103\2"+
		"\2\u02a2\u02a3\7p\2\2\u02a3\u02a4\7\u009a\2\2\u02a4\u02a6\7V\2\2\u02a5"+
		"\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\5\u00ba"+
		"^\2\u02a8\u02aa\5\u00aaV\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02b3\3\2\2\2\u02ab\u02b2\5$\23\2\u02ac\u02ad\7\u00ac\2\2\u02ad\u02ae"+
		"\7\u009e\2\2\u02ae\u02b2\5\u00a2R\2\u02af\u02b0\7\u00e7\2\2\u02b0\u02b2"+
		"\5@!\2\u02b1\u02ab\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7\30\2\2\u02b7\u02b8\5(\25\2\u02b8"+
		"\u041c\3\2\2\2\u02b9\u02bc\7\67\2\2\u02ba\u02bb\7\u00a2\2\2\u02bb\u02bd"+
		"\7\u00c1\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2"+
		"\2\u02be\u02c0\7k\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c2\7\u00e8\2\2\u02c2\u02c3\7\u0103\2\2\u02c3\u02c8\5"+
		"\u00bc_\2\u02c4\u02c5\7\4\2\2\u02c5\u02c6\5\u00f4{\2\u02c6\u02c7\7\5\2"+
		"\2\u02c7\u02c9\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cd\5<\37\2\u02cb\u02cc\7\u00a1\2\2\u02cc\u02ce\5@!\2"+
		"\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u041c\3\2\2\2\u02cf\u02d0"+
		"\7\21\2\2\u02d0\u02d1\7\u0103\2\2\u02d1\u02d3\5\u00ba^\2\u02d2\u02d4\7"+
		"\30\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\5(\25\2\u02d6\u041c\3\2\2\2\u02d7\u02da\7\67\2\2\u02d8\u02d9\7"+
		"\u00a2\2\2\u02d9\u02db\7\u00c1\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2"+
		"\2\2\u02db\u02dd\3\2\2\2\u02dc\u02de\7\u00e8\2\2\u02dd\u02dc\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e3\7i\2\2\u02e0\u02e1\7p\2"+
		"\2\u02e1\u02e2\7\u009a\2\2\u02e2\u02e4\7V\2\2\u02e3\u02e0\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\5\u00ba^\2\u02e6\u02e7"+
		"\7\30\2\2\u02e7\u02f1\7\u011c\2\2\u02e8\u02e9\7\u0101\2\2\u02e9\u02ee"+
		"\5R*\2\u02ea\u02eb\7\6\2\2\u02eb\u02ed\5R*\2\u02ec\u02ea\3\2\2\2\u02ed"+
		"\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f2\3\2"+
		"\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02e8\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u041c\3\2\2\2\u02f3\u02f5\7O\2\2\u02f4\u02f6\7\u00e8\2\2\u02f5\u02f4"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fa\7i\2\2\u02f8"+
		"\u02f9\7p\2\2\u02f9\u02fb\7V\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2"+
		"\2\u02fb\u02fc\3\2\2\2\u02fc\u041c\5\u00ba^\2\u02fd\u02ff\7W\2\2\u02fe"+
		"\u0300\t\t\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u041c\5\20\t\2\u0302\u0303\7\u00d7\2\2\u0303\u0306\7\u00e5"+
		"\2\2\u0304\u0305\t\5\2\2\u0305\u0307\5\u00ba^\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u030c\3\2\2\2\u0308\u030a\7\u0087\2\2\u0309\u0308"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\7\u011c\2"+
		"\2\u030c\u0309\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u041c\3\2\2\2\u030e\u030f"+
		"\7\u00d7\2\2\u030f\u0310\7\u00e4\2\2\u0310\u0313\7Y\2\2\u0311\u0312\t"+
		"\5\2\2\u0312\u0314\5\u00ba^\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2"+
		"\u0314\u0315\3\2\2\2\u0315\u0316\7\u0087\2\2\u0316\u0318\7\u011c\2\2\u0317"+
		"\u0319\5.\30\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u041c\3\2"+
		"\2\2\u031a\u031b\7\u00d7\2\2\u031b\u031c\7\u00e7\2\2\u031c\u0321\5\u00ba"+
		"^\2\u031d\u031e\7\4\2\2\u031e\u031f\5D#\2\u031f\u0320\7\5\2\2\u0320\u0322"+
		"\3\2\2\2\u0321\u031d\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u041c\3\2\2\2\u0323"+
		"\u0324\7\u00d7\2\2\u0324\u0325\7.\2\2\u0325\u0326\t\5\2\2\u0326\u0329"+
		"\5\u00ba^\2\u0327\u0328\t\5\2\2\u0328\u032a\5\u00ba^\2\u0329\u0327\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u041c\3\2\2\2\u032b\u032c\7\u00d7\2\2\u032c"+
		"\u032f\7\u0104\2\2\u032d\u032e\t\5\2\2\u032e\u0330\5\u00ba^\2\u032f\u032d"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0335\3\2\2\2\u0331\u0333\7\u0087\2"+
		"\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336"+
		"\7\u011c\2\2\u0335\u0332\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u041c\3\2\2"+
		"\2\u0337\u0338\7\u00d7\2\2\u0338\u0339\7\u00ad\2\2\u0339\u033b\5\u00ba"+
		"^\2\u033a\u033c\5.\30\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u041c\3\2\2\2\u033d\u033f\7\u00d7\2\2\u033e\u0340\5\u0112\u008a\2\u033f"+
		"\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0349\7j"+
		"\2\2\u0342\u0344\7\u0087\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0347\3\2\2\2\u0345\u0348\5\u00ba^\2\u0346\u0348\7\u011c\2\2\u0347\u0345"+
		"\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0343\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u041c\3\2\2\2\u034b\u034c\7\u00d7\2\2\u034c\u034d"+
		"\7\67\2\2\u034d\u034e\7\u00e4\2\2\u034e\u0351\5\u00ba^\2\u034f\u0350\7"+
		"\30\2\2\u0350\u0352\7\u00d1\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2"+
		"\2\u0352\u041c\3\2\2\2\u0353\u0354\7\u00d7\2\2\u0354\u0355\7:\2\2\u0355"+
		"\u041c\7\u0096\2\2\u0356\u0357\t\n\2\2\u0357\u0359\7i\2\2\u0358\u035a"+
		"\7Y\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u041c\5\64\33\2\u035c\u035d\t\n\2\2\u035d\u035f\5\62\32\2\u035e\u0360"+
		"\7Y\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0362\5\u00ba^\2\u0362\u041c\3\2\2\2\u0363\u0365\t\n\2\2\u0364\u0366"+
		"\7\u00e4\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2"+
		"\2\u0367\u0369\t\13\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036c\5\u00ba^\2\u036b\u036d\5.\30\2\u036c\u036b"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\5\66\34\2"+
		"\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u041c\3\2\2\2\u0371\u0373"+
		"\t\n\2\2\u0372\u0374\7\u00b7\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u041c\5(\25\2\u0376\u0377\7/\2\2\u0377\u0378"+
		"\7\u009e\2\2\u0378\u0379\5\62\32\2\u0379\u037a\5\u00ba^\2\u037a\u037b"+
		"\7}\2\2\u037b\u037c\t\f\2\2\u037c\u041c\3\2\2\2\u037d\u037e\7/\2\2\u037e"+
		"\u037f\7\u009e\2\2\u037f\u0380\7\u00e4\2\2\u0380\u0381\5\u00ba^\2\u0381"+
		"\u0382\7}\2\2\u0382\u0383\t\f\2\2\u0383\u041c\3\2\2\2\u0384\u0385\7\u00be"+
		"\2\2\u0385\u0386\7\u00e4\2\2\u0386\u041c\5\u00ba^\2\u0387\u0388\7\u00be"+
		"\2\2\u0388\u0389\7i\2\2\u0389\u041c\5\u00ba^\2\u038a\u0392\7\u00be\2\2"+
		"\u038b\u0393\7\u011c\2\2\u038c\u038e\13\2\2\2\u038d\u038c\3\2\2\2\u038e"+
		"\u0391\3\2\2\2\u038f\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0392\u038b\3\2\2\2\u0392\u038f\3\2\2\2\u0393"+
		"\u041c\3\2\2\2\u0394\u0396\7!\2\2\u0395\u0397\7\u0083\2\2\u0396\u0395"+
		"\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\7\u00e4\2"+
		"\2\u0399\u039c\5\u00ba^\2\u039a\u039b\7\u00a1\2\2\u039b\u039d\5@!\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a2\3\2\2\2\u039e\u03a0\7\30"+
		"\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a3\5(\25\2\u03a2\u039f\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u041c\3\2"+
		"\2\2\u03a4\u03a5\7\u00f8\2\2\u03a5\u03a8\7\u00e4\2\2\u03a6\u03a7\7p\2"+
		"\2\u03a7\u03a9\7V\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa"+
		"\3\2\2\2\u03aa\u041c\5\u00ba^\2\u03ab\u03ac\7\'\2\2\u03ac\u041c\7!\2\2"+
		"\u03ad\u03ae\7\u008b\2\2\u03ae\u03b0\7?\2\2\u03af\u03b1\7\u008c\2\2\u03b0"+
		"\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\7w"+
		"\2\2\u03b3\u03b5\7\u011c\2\2\u03b4\u03b6\7\u00aa\2\2\u03b5\u03b4\3\2\2"+
		"\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7|\2\2\u03b8\u03b9"+
		"\7\u00e4\2\2\u03b9\u03bb\5\u00ba^\2\u03ba\u03bc\5.\30\2\u03bb\u03ba\3"+
		"\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u041c\3\2\2\2\u03bd\u03be\7\u00f4\2\2"+
		"\u03be\u03bf\7\u00e4\2\2\u03bf\u03c1\5\u00ba^\2\u03c0\u03c2\5.\30\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u041c\3\2\2\2\u03c3\u03c4\7\u0095"+
		"\2\2\u03c4\u03c5\7\u00c0\2\2\u03c5\u03c6\7\u00e4\2\2\u03c6\u041c\5\u00ba"+
		"^\2\u03c7\u03c8\t\r\2\2\u03c8\u03d0\5\u0112\u008a\2\u03c9\u03d1\7\u011c"+
		"\2\2\u03ca\u03cc\13\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2"+
		"\2\2\u03d0\u03c9\3\2\2\2\u03d0\u03cd\3\2\2\2\u03d1\u041c\3\2\2\2\u03d2"+
		"\u03d3\7\u00d4\2\2\u03d3\u03d7\7\u00c7\2\2\u03d4\u03d6\13\2\2\2\u03d5"+
		"\u03d4\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d8\u041c\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db\7\u00d4\2\2\u03db"+
		"\u03dc\7\u00eb\2\2\u03dc\u03dd\7\u0109\2\2\u03dd\u041c\5\u00e0q\2\u03de"+
		"\u03df\7\u00d4\2\2\u03df\u03e0\7\u00eb\2\2\u03e0\u03e1\7\u0109\2\2\u03e1"+
		"\u041c\t\16\2\2\u03e2\u03e3\7\u00d4\2\2\u03e3\u03e4\7\u00eb\2\2\u03e4"+
		"\u03e8\7\u0109\2\2\u03e5\u03e7\13\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u041c\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03eb\u03ec\7\u00d4\2\2\u03ec\u03ed\5\22\n\2\u03ed\u03ee"+
		"\7\u010a\2\2\u03ee\u03ef\5\24\13\2\u03ef\u041c\3\2\2\2\u03f0\u03f1\7\u00d4"+
		"\2\2\u03f1\u03f9\5\22\n\2\u03f2\u03f6\7\u010a\2\2\u03f3\u03f5\13\2\2\2"+
		"\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f6\u03f4"+
		"\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03f2\3\2\2\2\u03f9"+
		"\u03fa\3\2\2\2\u03fa\u041c\3\2\2\2\u03fb\u03ff\7\u00d4\2\2\u03fc\u03fe"+
		"\13\2\2\2\u03fd\u03fc\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u0400\3\2\2\2"+
		"\u03ff\u03fd\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0403"+
		"\7\u010a\2\2\u0403\u041c\5\24\13\2\u0404\u0408\7\u00d4\2\2\u0405\u0407"+
		"\13\2\2\2\u0406\u0405\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0409\3\2\2\2"+
		"\u0408\u0406\3\2\2\2\u0409\u041c\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u040c"+
		"\7\u00c2\2\2\u040c\u041c\5\22\n\2\u040d\u0411\7\u00c2\2\2\u040e\u0410"+
		"\13\2\2\2\u040f\u040e\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u0412\3\2\2\2"+
		"\u0411\u040f\3\2\2\2\u0412\u041c\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0418"+
		"\5\26\f\2\u0415\u0417\13\2\2\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2\2\2"+
		"\u0418\u0419\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418"+
		"\3\2\2\2\u041b\u013d\3\2\2\2\u041b\u013f\3\2\2\2\u041b\u0142\3\2\2\2\u041b"+
		"\u0147\3\2\2\2\u041b\u0159\3\2\2\2\u041b\u0160\3\2\2\2\u041b\u0166\3\2"+
		"\2\2\u041b\u0170\3\2\2\2\u041b\u017c\3\2\2\2\u041b\u018d\3\2\2\2\u041b"+
		"\u01a2\3\2\2\2\u041b\u01b3\3\2\2\2\u041b\u01c4\3\2\2\2\u041b\u01cb\3\2"+
		"\2\2\u041b\u01d4\3\2\2\2\u041b\u01dd\3\2\2\2\u041b\u01e6\3\2\2\2\u041b"+
		"\u01ed\3\2\2\2\u041b\u01f4\3\2\2\2\u041b\u01fb\3\2\2\2\u041b\u0206\3\2"+
		"\2\2\u041b\u0211\3\2\2\2\u041b\u0220\3\2\2\2\u041b\u022c\3\2\2\2\u041b"+
		"\u023a\3\2\2\2\u041b\u0244\3\2\2\2\u041b\u0252\3\2\2\2\u041b\u025a\3\2"+
		"\2\2\u041b\u026d\3\2\2\2\u041b\u0276\3\2\2\2\u041b\u027c\3\2\2\2\u041b"+
		"\u0285\3\2\2\2\u041b\u028f\3\2\2\2\u041b\u0296\3\2\2\2\u041b\u02b9\3\2"+
		"\2\2\u041b\u02cf\3\2\2\2\u041b\u02d7\3\2\2\2\u041b\u02f3\3\2\2\2\u041b"+
		"\u02fd\3\2\2\2\u041b\u0302\3\2\2\2\u041b\u030e\3\2\2\2\u041b\u031a\3\2"+
		"\2\2\u041b\u0323\3\2\2\2\u041b\u032b\3\2\2\2\u041b\u0337\3\2\2\2\u041b"+
		"\u033d\3\2\2\2\u041b\u034b\3\2\2\2\u041b\u0353\3\2\2\2\u041b\u0356\3\2"+
		"\2\2\u041b\u035c\3\2\2\2\u041b\u0363\3\2\2\2\u041b\u0371\3\2\2\2\u041b"+
		"\u0376\3\2\2\2\u041b\u037d\3\2\2\2\u041b\u0384\3\2\2\2\u041b\u0387\3\2"+
		"\2\2\u041b\u038a\3\2\2\2\u041b\u0394\3\2\2\2\u041b\u03a4\3\2\2\2\u041b"+
		"\u03ab\3\2\2\2\u041b\u03ad\3\2\2\2\u041b\u03bd\3\2\2\2\u041b\u03c3\3\2"+
		"\2\2\u041b\u03c7\3\2\2\2\u041b\u03d2\3\2\2\2\u041b\u03da\3\2\2\2\u041b"+
		"\u03de\3\2\2\2\u041b\u03e2\3\2\2\2\u041b\u03eb\3\2\2\2\u041b\u03f0\3\2"+
		"\2\2\u041b\u03fb\3\2\2\2\u041b\u0404\3\2\2\2\u041b\u040b\3\2\2\2\u041b"+
		"\u040d\3\2\2\2\u041b\u0414\3\2\2\2\u041c\21\3\2\2\2\u041d\u041e\5\u0116"+
		"\u008c\2\u041e\23\3\2\2\2\u041f\u0420\5\u0116\u008c\2\u0420\25\3\2\2\2"+
		"\u0421\u0422\7\67\2\2\u0422\u04ca\7\u00c7\2\2\u0423\u0424\7O\2\2\u0424"+
		"\u04ca\7\u00c7\2\2\u0425\u0427\7l\2\2\u0426\u0428\7\u00c7\2\2\u0427\u0426"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u04ca\3\2\2\2\u0429\u042b\7\u00c4\2"+
		"\2\u042a\u042c\7\u00c7\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u04ca\3\2\2\2\u042d\u042e\7\u00d7\2\2\u042e\u04ca\7l\2\2\u042f\u0430"+
		"\7\u00d7\2\2\u0430\u0432\7\u00c7\2\2\u0431\u0433\7l\2\2\u0432\u0431\3"+
		"\2\2\2\u0432\u0433\3\2\2\2\u0433\u04ca\3\2\2\2\u0434\u0435\7\u00d7\2\2"+
		"\u0435\u04ca\7\u00b4\2\2\u0436\u0437\7\u00d7\2\2\u0437\u04ca\7\u00c8\2"+
		"\2\u0438\u0439\7\u00d7\2\2\u0439\u043a\7:\2\2\u043a\u04ca\7\u00c8\2\2"+
		"\u043b\u043c\7X\2\2\u043c\u04ca\7\u00e4\2\2\u043d\u043e\7r\2\2\u043e\u04ca"+
		"\7\u00e4\2\2\u043f\u0440\7\u00d7\2\2\u0440\u04ca\7\62\2\2\u0441\u0442"+
		"\7\u00d7\2\2\u0442\u0443\7\67\2\2\u0443\u04ca\7\u00e4\2\2\u0444\u0445"+
		"\7\u00d7\2\2\u0445\u04ca\7\u00f0\2\2\u0446\u0447\7\u00d7\2\2\u0447\u04ca"+
		"\7u\2\2\u0448\u0449\7\u00d7\2\2\u0449\u04ca\7\u008f\2\2\u044a\u044b\7"+
		"\67\2\2\u044b\u04ca\7t\2\2\u044c\u044d\7O\2\2\u044d\u04ca\7t\2\2\u044e"+
		"\u044f\7\21\2\2\u044f\u04ca\7t\2\2\u0450\u0451\7\u008e\2\2\u0451\u04ca"+
		"\7\u00e4\2\2\u0452\u0453\7\u008e\2\2\u0453\u04ca\7@\2\2\u0454\u0455\7"+
		"\u00fc\2\2\u0455\u04ca\7\u00e4\2\2\u0456\u0457\7\u00fc\2\2\u0457\u04ca"+
		"\7@\2\2\u0458\u0459\7\67\2\2\u0459\u045a\7\u00e8\2\2\u045a\u04ca\7\u0091"+
		"\2\2\u045b\u045c\7O\2\2\u045c\u045d\7\u00e8\2\2\u045d\u04ca\7\u0091\2"+
		"\2\u045e\u045f\7\21\2\2\u045f\u0460\7\u00e4\2\2\u0460\u0461\5\u00bc_\2"+
		"\u0461\u0462\7\u009a\2\2\u0462\u0463\7)\2\2\u0463\u04ca\3\2\2\2\u0464"+
		"\u0465\7\21\2\2\u0465\u0466\7\u00e4\2\2\u0466\u0467\5\u00bc_\2\u0467\u0468"+
		"\7)\2\2\u0468\u0469\7 \2\2\u0469\u04ca\3\2\2\2\u046a\u046b\7\21\2\2\u046b"+
		"\u046c\7\u00e4\2\2\u046c\u046d\5\u00bc_\2\u046d\u046e\7\u009a\2\2\u046e"+
		"\u046f\7\u00dc\2\2\u046f\u04ca\3\2\2\2\u0470\u0471\7\21\2\2\u0471\u0472"+
		"\7\u00e4\2\2\u0472\u0473\5\u00bc_\2\u0473\u0474\7\u00d8\2\2\u0474\u0475"+
		"\7 \2\2\u0475\u04ca\3\2\2\2\u0476\u0477\7\21\2\2\u0477\u0478\7\u00e4\2"+
		"\2\u0478\u0479\5\u00bc_\2\u0479\u047a\7\u009a\2\2\u047a\u047b\7\u00d8"+
		"\2\2\u047b\u04ca\3\2\2\2\u047c\u047d\7\21\2\2\u047d\u047e\7\u00e4\2\2"+
		"\u047e\u047f\5\u00bc_\2\u047f\u0480\7\u009a\2\2\u0480\u0481\7\u00df\2"+
		"\2\u0481\u0482\7\30\2\2\u0482\u0483\7J\2\2\u0483\u04ca\3\2\2\2\u0484\u0485"+
		"\7\21\2\2\u0485\u0486\7\u00e4\2\2\u0486\u0487\5\u00bc_\2\u0487\u0488\7"+
		"\u00d4\2\2\u0488\u0489\7\u00d8\2\2\u0489\u048a\7\u008d\2\2\u048a\u04ca"+
		"\3\2\2\2\u048b\u048c\7\21\2\2\u048c\u048d\7\u00e4\2\2\u048d\u048e\5\u00bc"+
		"_\2\u048e\u048f\7U\2\2\u048f\u0490\7\u00ab\2\2\u0490\u04ca\3\2\2\2\u0491"+
		"\u0492\7\21\2\2\u0492\u0493\7\u00e4\2\2\u0493\u0494\5\u00bc_\2\u0494\u0495"+
		"\7\26\2\2\u0495\u0496\7\u00ab\2\2\u0496\u04ca\3\2\2\2\u0497\u0498\7\21"+
		"\2\2\u0498\u0499\7\u00e4\2\2\u0499\u049a\5\u00bc_\2\u049a\u049b\7\u00f6"+
		"\2\2\u049b\u049c\7\u00ab\2\2\u049c\u04ca\3\2\2\2\u049d\u049e\7\21\2\2"+
		"\u049e\u049f\7\u00e4\2\2\u049f\u04a0\5\u00bc_\2\u04a0\u04a1\7\u00ed\2"+
		"\2\u04a1\u04ca\3\2\2\2\u04a2\u04a3\7\21\2\2\u04a3\u04a4\7\u00e4\2\2\u04a4"+
		"\u04a6\5\u00bc_\2\u04a5\u04a7\5.\30\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\7\61\2\2\u04a9\u04ca\3\2\2\2"+
		"\u04aa\u04ab\7\21\2\2\u04ab\u04ac\7\u00e4\2\2\u04ac\u04ae\5\u00bc_\2\u04ad"+
		"\u04af\5.\30\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2"+
		"\2\2\u04b0\u04b1\7\64\2\2\u04b1\u04ca\3\2\2\2\u04b2\u04b3\7\21\2\2\u04b3"+
		"\u04b4\7\u00e4\2\2\u04b4\u04b6\5\u00bc_\2\u04b5\u04b7\5.\30\2\u04b6\u04b5"+
		"\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7\u00d4\2"+
		"\2\u04b9\u04ba\7`\2\2\u04ba\u04ca\3\2\2\2\u04bb\u04bc\7\21\2\2\u04bc\u04bd"+
		"\7\u00e4\2\2\u04bd\u04bf\5\u00bc_\2\u04be\u04c0\5.\30\2\u04bf\u04be\3"+
		"\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7\u00c1\2\2"+
		"\u04c2\u04c3\7.\2\2\u04c3\u04ca\3\2\2\2\u04c4\u04c5\7\u00dd\2\2\u04c5"+
		"\u04ca\7\u00ef\2\2\u04c6\u04ca\7\60\2\2\u04c7\u04ca\7\u00c9\2\2\u04c8"+
		"\u04ca\7I\2\2\u04c9\u0421\3\2\2\2\u04c9\u0423\3\2\2\2\u04c9\u0425\3\2"+
		"\2\2\u04c9\u0429\3\2\2\2\u04c9\u042d\3\2\2\2\u04c9\u042f\3\2\2\2\u04c9"+
		"\u0434\3\2\2\2\u04c9\u0436\3\2\2\2\u04c9\u0438\3\2\2\2\u04c9\u043b\3\2"+
		"\2\2\u04c9\u043d\3\2\2\2\u04c9\u043f\3\2\2\2\u04c9\u0441\3\2\2\2\u04c9"+
		"\u0444\3\2\2\2\u04c9\u0446\3\2\2\2\u04c9\u0448\3\2\2\2\u04c9\u044a\3\2"+
		"\2\2\u04c9\u044c\3\2\2\2\u04c9\u044e\3\2\2\2\u04c9\u0450\3\2\2\2\u04c9"+
		"\u0452\3\2\2\2\u04c9\u0454\3\2\2\2\u04c9\u0456\3\2\2\2\u04c9\u0458\3\2"+
		"\2\2\u04c9\u045b\3\2\2\2\u04c9\u045e\3\2\2\2\u04c9\u0464\3\2\2\2\u04c9"+
		"\u046a\3\2\2\2\u04c9\u0470\3\2\2\2\u04c9\u0476\3\2\2\2\u04c9\u047c\3\2"+
		"\2\2\u04c9\u0484\3\2\2\2\u04c9\u048b\3\2\2\2\u04c9\u0491\3\2\2\2\u04c9"+
		"\u0497\3\2\2\2\u04c9\u049d\3\2\2\2\u04c9\u04a2\3\2\2\2\u04c9\u04aa\3\2"+
		"\2\2\u04c9\u04b2\3\2\2\2\u04c9\u04bb\3\2\2\2\u04c9\u04c4\3\2\2\2\u04c9"+
		"\u04c6\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04ca\27\3\2\2"+
		"\2\u04cb\u04cd\7\67\2\2\u04cc\u04ce\7\u00e8\2\2\u04cd\u04cc\3\2\2\2\u04cd"+
		"\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04d1\7Z\2\2\u04d0\u04cf\3\2"+
		"\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d6\7\u00e4\2\2\u04d3"+
		"\u04d4\7p\2\2\u04d4\u04d5\7\u009a\2\2\u04d5\u04d7\7V\2\2\u04d6\u04d3\3"+
		"\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\5\u00ba^\2"+
		"\u04d9\31\3\2\2\2\u04da\u04db\7\67\2\2\u04db\u04dd\7\u00a2\2\2\u04dc\u04da"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\7\u00c1\2"+
		"\2\u04df\u04e0\7\u00e4\2\2\u04e0\u04e1\5\u00ba^\2\u04e1\33\3\2\2\2\u04e2"+
		"\u04e3\7)\2\2\u04e3\u04e4\7 \2\2\u04e4\u04e8\5\u00a2R\2\u04e5\u04e6\7"+
		"\u00dc\2\2\u04e6\u04e7\7 \2\2\u04e7\u04e9\5\u00a6T\2\u04e8\u04e5\3\2\2"+
		"\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\7|\2\2\u04eb\u04ec"+
		"\7\u0120\2\2\u04ec\u04ed\7\37\2\2\u04ed\35\3\2\2\2\u04ee\u04ef\7\u00d8"+
		"\2\2\u04ef\u04f0\7 \2\2\u04f0\u04f1\5\u00a2R\2\u04f1\u04f4\7\u009e\2\2"+
		"\u04f2\u04f5\5H%\2\u04f3\u04f5\5J&\2\u04f4\u04f2\3\2\2\2\u04f4\u04f3\3"+
		"\2\2\2\u04f5\u04f9\3\2\2\2\u04f6\u04f7\7\u00df\2\2\u04f7\u04f8\7\30\2"+
		"\2\u04f8\u04fa\7J\2\2\u04f9\u04f6\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\37"+
		"\3\2\2\2\u04fb\u04fc\7\u008d\2\2\u04fc\u04fd\7\u011c\2\2\u04fd!\3\2\2"+
		"\2\u04fe\u04ff\7C\2\2\u04ff\u0500\7\u011c\2\2\u0500#\3\2\2\2\u0501\u0502"+
		"\7/\2\2\u0502\u0503\7\u011c\2\2\u0503%\3\2\2\2\u0504\u0505\7\u0086\2\2"+
		"\u0505\u0506\7\u0120\2\2\u0506\'\3\2\2\2\u0507\u0509\58\35\2\u0508\u0507"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\5Z.\2\u050b"+
		"\u050c\5V,\2\u050c)\3\2\2\2\u050d\u050e\7y\2\2\u050e\u0510\7\u00aa\2\2"+
		"\u050f\u0511\7\u00e4\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511"+
		"\u0512\3\2\2\2\u0512\u0519\5\u00ba^\2\u0513\u0517\5.\30\2\u0514\u0515"+
		"\7p\2\2\u0515\u0516\7\u009a\2\2\u0516\u0518\7V\2\2\u0517\u0514\3\2\2\2"+
		"\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0513\3\2\2\2\u0519\u051a"+
		"\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u051d\5\u00a2R\2\u051c\u051b\3\2\2"+
		"\2\u051c\u051d\3\2\2\2\u051d\u054b\3\2\2\2\u051e\u051f\7y\2\2\u051f\u0521"+
		"\7|\2\2\u0520\u0522\7\u00e4\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2"+
		"\2\u0522\u0523\3\2\2\2\u0523\u0525\5\u00ba^\2\u0524\u0526\5.\30\2\u0525"+
		"\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u052a\3\2\2\2\u0527\u0528\7p"+
		"\2\2\u0528\u0529\7\u009a\2\2\u0529\u052b\7V\2\2\u052a\u0527\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052e\5\u00a2R\2\u052d\u052c"+
		"\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u054b\3\2\2\2\u052f\u0530\7y\2\2\u0530"+
		"\u0532\7\u00aa\2\2\u0531\u0533\7\u008c\2\2\u0532\u0531\3\2\2\2\u0532\u0533"+
		"\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\7K\2\2\u0535\u0537\7\u011c\2"+
		"\2\u0536\u0538\5\u00b6\\\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u053a\3\2\2\2\u0539\u053b\5L\'\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2"+
		"\2\2\u053b\u054b\3\2\2\2\u053c\u053d\7y\2\2\u053d\u053f\7\u00aa\2\2\u053e"+
		"\u0540\7\u008c\2\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0543\7K\2\2\u0542\u0544\7\u011c\2\2\u0543\u0542\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0548\5<\37\2\u0546\u0547"+
		"\7\u00a1\2\2\u0547\u0549\5@!\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2"+
		"\u0549\u054b\3\2\2\2\u054a\u050d\3\2\2\2\u054a\u051e\3\2\2\2\u054a\u052f"+
		"\3\2\2\2\u054a\u053c\3\2\2\2\u054b+\3\2\2\2\u054c\u054e\5.\30\2\u054d"+
		"\u054f\5 \21\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f-\3\2\2\2"+
		"\u0550\u0551\7\u00ab\2\2\u0551\u0552\7\4\2\2\u0552\u0557\5\60\31\2\u0553"+
		"\u0554\7\6\2\2\u0554\u0556\5\60\31\2\u0555\u0553\3\2\2\2\u0556\u0559\3"+
		"\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559"+
		"\u0557\3\2\2\2\u055a\u055b\7\5\2\2\u055b/\3\2\2\2\u055c\u055f\5\u0112"+
		"\u008a\2\u055d\u055e\7\u010a\2\2\u055e\u0560\5\u00d6l\2\u055f\u055d\3"+
		"\2\2\2\u055f\u0560\3\2\2\2\u0560\61\3\2\2\2\u0561\u0562\t\17\2\2\u0562"+
		"\63\3\2\2\2\u0563\u0569\5\u010c\u0087\2\u0564\u0569\7\u011c\2\2\u0565"+
		"\u0569\5\u00d8m\2\u0566\u0569\5\u00dan\2\u0567\u0569\5\u00dco\2\u0568"+
		"\u0563\3\2\2\2\u0568\u0564\3\2\2\2\u0568\u0565\3\2\2\2\u0568\u0566\3\2"+
		"\2\2\u0568\u0567\3\2\2\2\u0569\65\3\2\2\2\u056a\u056f\5\u0112\u008a\2"+
		"\u056b\u056c\7\7\2\2\u056c\u056e\5\u0112\u008a\2\u056d\u056b\3\2\2\2\u056e"+
		"\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\67\3\2\2"+
		"\2\u0571\u056f\3\2\2\2\u0572\u0573\7\u0108\2\2\u0573\u0578\5:\36\2\u0574"+
		"\u0575\7\6\2\2\u0575\u0577\5:\36\2\u0576\u0574\3\2\2\2\u0577\u057a\3\2"+
		"\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u05799\3\2\2\2\u057a\u0578"+
		"\3\2\2\2\u057b\u057d\5\u010e\u0088\2\u057c\u057e\5\u00a2R\2\u057d\u057c"+
		"\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u0581\7\30\2\2"+
		"\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583"+
		"\7\4\2\2\u0583\u0584\5(\25\2\u0584\u0585\7\5\2\2\u0585;\3\2\2\2\u0586"+
		"\u0587\7\u0101\2\2\u0587\u0588\5\u00ba^\2\u0588=\3\2\2\2\u0589\u058a\7"+
		"\u00a1\2\2\u058a\u0598\5@!\2\u058b\u058c\7\u00ac\2\2\u058c\u058d\7 \2"+
		"\2\u058d\u0598\5\u00c4c\2\u058e\u0598\5\36\20\2\u058f\u0598\5\34\17\2"+
		"\u0590\u0598\5\u00b6\\\2\u0591\u0598\5L\'\2\u0592\u0598\5 \21\2\u0593"+
		"\u0598\5$\23\2\u0594\u0595\7\u00e7\2\2\u0595\u0598\5@!\2\u0596\u0598\5"+
		"&\24\2\u0597\u0589\3\2\2\2\u0597\u058b\3\2\2\2\u0597\u058e\3\2\2\2\u0597"+
		"\u058f\3\2\2\2\u0597\u0590\3\2\2\2\u0597\u0591\3\2\2\2\u0597\u0592\3\2"+
		"\2\2\u0597\u0593\3\2\2\2\u0597\u0594\3\2\2\2\u0597\u0596\3\2\2\2\u0598"+
		"\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a?\3\2\2\2"+
		"\u059b\u0599\3\2\2\2\u059c\u059d\7\4\2\2\u059d\u05a2\5B\"\2\u059e\u059f"+
		"\7\6\2\2\u059f\u05a1\5B\"\2\u05a0\u059e\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2"+
		"\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a2\3\2"+
		"\2\2\u05a5\u05a6\7\5\2\2\u05a6A\3\2\2\2\u05a7\u05ac\5D#\2\u05a8\u05aa"+
		"\7\u010a\2\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2"+
		"\2\u05ab\u05ad\5F$\2\u05ac\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05adC\3"+
		"\2\2\2\u05ae\u05b3\5\u0112\u008a\2\u05af\u05b0\7\7\2\2\u05b0\u05b2\5\u0112"+
		"\u008a\2\u05b1\u05af\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b3"+
		"\u05b4\3\2\2\2\u05b4\u05b8\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b6\u05b8\7\u011c"+
		"\2\2\u05b7\u05ae\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8E\3\2\2\2\u05b9\u05be"+
		"\7\u0120\2\2\u05ba\u05be\7\u0122\2\2\u05bb\u05be\5\u00dep\2\u05bc\u05be"+
		"\7\u011c\2\2\u05bd\u05b9\3\2\2\2\u05bd\u05ba\3\2\2\2\u05bd\u05bb\3\2\2"+
		"\2\u05bd\u05bc\3\2\2\2\u05beG\3\2\2\2\u05bf\u05c0\7\4\2\2\u05c0\u05c5"+
		"\5\u00d6l\2\u05c1\u05c2\7\6\2\2\u05c2\u05c4\5\u00d6l\2\u05c3\u05c1\3\2"+
		"\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05c8\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05c9\7\5\2\2\u05c9I\3\2\2\2"+
		"\u05ca\u05cb\7\4\2\2\u05cb\u05d0\5H%\2\u05cc\u05cd\7\6\2\2\u05cd\u05cf"+
		"\5H%\2\u05ce\u05cc\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d4\7\5"+
		"\2\2\u05d4K\3\2\2\2\u05d5\u05d6\7\u00df\2\2\u05d6\u05d7\7\30\2\2\u05d7"+
		"\u05dc\5N(\2\u05d8\u05d9\7\u00df\2\2\u05d9\u05da\7 \2\2\u05da\u05dc\5"+
		"P)\2\u05db\u05d5\3\2\2\2\u05db\u05d8\3\2\2\2\u05dcM\3\2\2\2\u05dd\u05de"+
		"\7x\2\2\u05de\u05df\7\u011c\2\2\u05df\u05e0\7\u00a6\2\2\u05e0\u05e3\7"+
		"\u011c\2\2\u05e1\u05e3\5\u0112\u008a\2\u05e2\u05dd\3\2\2\2\u05e2\u05e1"+
		"\3\2\2\2\u05e3O\3\2\2\2\u05e4\u05e8\7\u011c\2\2\u05e5\u05e6\7\u0108\2"+
		"\2\u05e6\u05e7\7\u00d2\2\2\u05e7\u05e9\5@!\2\u05e8\u05e5\3\2\2\2\u05e8"+
		"\u05e9\3\2\2\2\u05e9Q\3\2\2\2\u05ea\u05ec\5\u0112\u008a\2\u05eb\u05ea"+
		"\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\7\u011c\2"+
		"\2\u05eeS\3\2\2\2\u05ef\u05f0\5*\26\2\u05f0\u05f1\5Z.\2\u05f1\u05f2\5"+
		"V,\2\u05f2\u0623\3\2\2\2\u05f3\u05f5\5\u0080A\2\u05f4\u05f6\5X-\2\u05f5"+
		"\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2"+
		"\2\2\u05f8\u0623\3\2\2\2\u05f9\u05fa\7E\2\2\u05fa\u05fb\7g\2\2\u05fb\u05fc"+
		"\5\u00ba^\2\u05fc\u05fe\5\u00b4[\2\u05fd\u05ff\5x=\2\u05fe\u05fd\3\2\2"+
		"\2\u05fe\u05ff\3\2\2\2\u05ff\u0623\3\2\2\2\u0600\u0601\7\u00fe\2\2\u0601"+
		"\u0602\5\u00ba^\2\u0602\u0603\5\u00b4[\2\u0603\u0605\5j\66\2\u0604\u0606"+
		"\5x=\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0623\3\2\2\2\u0607"+
		"\u0608\7\u0094\2\2\u0608\u0609\7|\2\2\u0609\u060a\5\u00ba^\2\u060a\u060b"+
		"\5\u00b4[\2\u060b\u0611\7\u0101\2\2\u060c\u0612\5\u00ba^\2\u060d\u060e"+
		"\7\4\2\2\u060e\u060f\5(\25\2\u060f\u0610\7\5\2\2\u0610\u0612\3\2\2\2\u0611"+
		"\u060c\3\2\2\2\u0611\u060d\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\5\u00b4"+
		"[\2\u0614\u0615\7\u009e\2\2\u0615\u0619\5\u00ceh\2\u0616\u0618\5l\67\2"+
		"\u0617\u0616\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a"+
		"\3\2\2\2\u061a\u061f\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u061e\5n8\2\u061d"+
		"\u061c\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2"+
		"\2\2\u0620\u0623\3\2\2\2\u0621\u061f\3\2\2\2\u0622\u05ef\3\2\2\2\u0622"+
		"\u05f3\3\2\2\2\u0622\u05f9\3\2\2\2\u0622\u0600\3\2\2\2\u0622\u0607\3\2"+
		"\2\2\u0623U\3\2\2\2\u0624\u0625\7\u00a3\2\2\u0625\u0626\7 \2\2\u0626\u062b"+
		"\5^\60\2\u0627\u0628\7\6\2\2\u0628\u062a\5^\60\2\u0629\u0627\3\2\2\2\u062a"+
		"\u062d\3\2\2\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062f\3\2"+
		"\2\2\u062d\u062b\3\2\2\2\u062e\u0624\3\2\2\2\u062e\u062f\3\2\2\2\u062f"+
		"\u063a\3\2\2\2\u0630\u0631\7(\2\2\u0631\u0632\7 \2\2\u0632\u0637\5\u00cc"+
		"g\2\u0633\u0634\7\6\2\2\u0634\u0636\5\u00ccg\2\u0635\u0633\3\2\2\2\u0636"+
		"\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063b\3\2"+
		"\2\2\u0639\u0637\3\2\2\2\u063a\u0630\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u0646\3\2\2\2\u063c\u063d\7M\2\2\u063d\u063e\7 \2\2\u063e\u0643\5\u00cc"+
		"g\2\u063f\u0640\7\6\2\2\u0640\u0642\5\u00ccg\2\u0641\u063f\3\2\2\2\u0642"+
		"\u0645\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0647\3\2"+
		"\2\2\u0645\u0643\3\2\2\2\u0646\u063c\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u0652\3\2\2\2\u0648\u0649\7\u00db\2\2\u0649\u064a\7 \2\2\u064a\u064f"+
		"\5^\60\2\u064b\u064c\7\6\2\2\u064c\u064e\5^\60\2\u064d\u064b\3\2\2\2\u064e"+
		"\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0653\3\2"+
		"\2\2\u0651\u064f\3\2\2\2\u0652\u0648\3\2\2\2\u0652\u0653\3\2\2\2\u0653"+
		"\u0655\3\2\2\2\u0654\u0656\5\u00fe\u0080\2\u0655\u0654\3\2\2\2\u0655\u0656"+
		"\3\2\2\2\u0656\u065c\3\2\2\2\u0657\u065a\7\u0088\2\2\u0658\u065b\7\20"+
		"\2\2\u0659\u065b\5\u00ccg\2\u065a\u0658\3\2\2\2\u065a\u0659\3\2\2\2\u065b"+
		"\u065d\3\2\2\2\u065c\u0657\3\2\2\2\u065c\u065d\3\2\2\2\u065dW\3\2\2\2"+
		"\u065e\u065f\5*\26\2\u065f\u0660\5b\62\2\u0660Y\3\2\2\2\u0661\u0662\b"+
		".\1\2\u0662\u0663\5\\/\2\u0663\u067b\3\2\2\2\u0664\u0665\f\5\2\2\u0665"+
		"\u0666\6.\3\2\u0666\u0668\t\20\2\2\u0667\u0669\5\u0094K\2\u0668\u0667"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u067a\5Z.\6\u066b"+
		"\u066c\f\4\2\2\u066c\u066d\6.\5\2\u066d\u066f\7z\2\2\u066e\u0670\5\u0094"+
		"K\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u067a\5Z.\5\u0672\u0673\f\3\2\2\u0673\u0674\6.\7\2\u0674\u0676\t\21\2"+
		"\2\u0675\u0677\5\u0094K\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u067a\5Z.\4\u0679\u0664\3\2\2\2\u0679\u066b\3\2\2"+
		"\2\u0679\u0672\3\2\2\2\u067a\u067d\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067c"+
		"\3\2\2\2\u067c[\3\2\2\2\u067d\u067b\3\2\2\2\u067e\u0688\5d\63\2\u067f"+
		"\u0688\5`\61\2\u0680\u0681\7\u00e4\2\2\u0681\u0688\5\u00ba^\2\u0682\u0688"+
		"\5\u00b0Y\2\u0683\u0684\7\4\2\2\u0684\u0685\5(\25\2\u0685\u0686\7\5\2"+
		"\2\u0686\u0688\3\2\2\2\u0687\u067e\3\2\2\2\u0687\u067f\3\2\2\2\u0687\u0680"+
		"\3\2\2\2\u0687\u0682\3\2\2\2\u0687\u0683\3\2\2\2\u0688]\3\2\2\2\u0689"+
		"\u068b\5\u00ccg\2\u068a\u068c\t\22\2\2\u068b\u068a\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u068f\3\2\2\2\u068d\u068e\7\u009c\2\2\u068e\u0690\t\23"+
		"\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690_\3\2\2\2\u0691\u0693"+
		"\5\u0080A\2\u0692\u0694\5b\62\2\u0693\u0692\3\2\2\2\u0694\u0695\3\2\2"+
		"\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696a\3\2\2\2\u0697\u0699"+
		"\5f\64\2\u0698\u069a\5x=\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u069b\3\2\2\2\u069b\u069c\5V,\2\u069c\u06b3\3\2\2\2\u069d\u06a1\5h\65"+
		"\2\u069e\u06a0\5\u0092J\2\u069f\u069e\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1"+
		"\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2"+
		"\2\2\u06a4\u06a6\5x=\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8"+
		"\3\2\2\2\u06a7\u06a9\5\u0082B\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2"+
		"\2\u06a9\u06ab\3\2\2\2\u06aa\u06ac\5z>\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac"+
		"\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06af\5\u00fe\u0080\2\u06ae\u06ad\3"+
		"\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\5V,\2\u06b1"+
		"\u06b3\3\2\2\2\u06b2\u0697\3\2\2\2\u06b2\u069d\3\2\2\2\u06b3c\3\2\2\2"+
		"\u06b4\u06b6\5f\64\2\u06b5\u06b7\5\u0080A\2\u06b6\u06b5\3\2\2\2\u06b6"+
		"\u06b7\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06ba\5x=\2\u06b9\u06b8\3\2\2"+
		"\2\u06b9\u06ba\3\2\2\2\u06ba\u06d2\3\2\2\2\u06bb\u06bd\5h\65\2\u06bc\u06be"+
		"\5\u0080A\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c2\3\2\2"+
		"\2\u06bf\u06c1\5\u0092J\2\u06c0\u06bf\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2"+
		"\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c6\3\2\2\2\u06c4\u06c2\3\2"+
		"\2\2\u06c5\u06c7\5x=\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9"+
		"\3\2\2\2\u06c8\u06ca\5\u0082B\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2\2"+
		"\2\u06ca\u06cc\3\2\2\2\u06cb\u06cd\5z>\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd"+
		"\3\2\2\2\u06cd\u06cf\3\2\2\2\u06ce\u06d0\5\u00fe\u0080\2\u06cf\u06ce\3"+
		"\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2\3\2\2\2\u06d1\u06b4\3\2\2\2\u06d1"+
		"\u06bb\3\2\2\2\u06d2e\3\2\2\2\u06d3\u06d4\7\u00ce\2\2\u06d4\u06d5\7\u00f1"+
		"\2\2\u06d5\u06d6\7\4\2\2\u06d6\u06d7\5\u00c2b\2\u06d7\u06d8\7\5\2\2\u06d8"+
		"\u06de\3\2\2\2\u06d9\u06da\7\u0092\2\2\u06da\u06de\5\u00c2b\2\u06db\u06dc"+
		"\7\u00bc\2\2\u06dc\u06de\5\u00c2b\2\u06dd\u06d3\3\2\2\2\u06dd\u06d9\3"+
		"\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06e1\5\u00b6\\\2"+
		"\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e3"+
		"\7\u00ba\2\2\u06e3\u06e5\7\u011c\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e5\3"+
		"\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\7\u0101\2\2\u06e7\u06f4\7\u011c"+
		"\2\2\u06e8\u06f2\7\30\2\2\u06e9\u06f3\5\u00a4S\2\u06ea\u06f3\5\u00f4{"+
		"\2\u06eb\u06ee\7\4\2\2\u06ec\u06ef\5\u00a4S\2\u06ed\u06ef\5\u00f4{\2\u06ee"+
		"\u06ec\3\2\2\2\u06ee\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\7\5"+
		"\2\2\u06f1\u06f3\3\2\2\2\u06f2\u06e9\3\2\2\2\u06f2\u06ea\3\2\2\2\u06f2"+
		"\u06eb\3\2\2\2\u06f3\u06f5\3\2\2\2\u06f4\u06e8\3\2\2\2\u06f4\u06f5\3\2"+
		"\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\5\u00b6\\\2\u06f7\u06f6\3\2\2\2\u06f7"+
		"\u06f8\3\2\2\2\u06f8\u06fb\3\2\2\2\u06f9\u06fa\7\u00b9\2\2\u06fa\u06fc"+
		"\7\u011c\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fcg\3\2\2\2\u06fd"+
		"\u0701\7\u00ce\2\2\u06fe\u0700\5|?\2\u06ff\u06fe\3\2\2\2\u0700\u0703\3"+
		"\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0705\3\2\2\2\u0703"+
		"\u0701\3\2\2\2\u0704\u0706\5\u0094K\2\u0705\u0704\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\5\u00c2b\2\u0708i\3\2\2\2\u0709"+
		"\u070a\7\u00d4\2\2\u070a\u070b\5t;\2\u070bk\3\2\2\2\u070c\u070d\7\u0105"+
		"\2\2\u070d\u0710\7\u0093\2\2\u070e\u070f\7\23\2\2\u070f\u0711\5\u00ce"+
		"h\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0713\7\u00ea\2\2\u0713\u0714\5p9\2\u0714m\3\2\2\2\u0715\u0716\7\u0105"+
		"\2\2\u0716\u0717\7\u009a\2\2\u0717\u071a\7\u0093\2\2\u0718\u0719\7\23"+
		"\2\2\u0719\u071b\5\u00ceh\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b"+
		"\u071c\3\2\2\2\u071c\u071d\7\u00ea\2\2\u071d\u071e\5r:\2\u071eo\3\2\2"+
		"\2\u071f\u0727\7E\2\2\u0720\u0721\7\u00fe\2\2\u0721\u0722\7\u00d4\2\2"+
		"\u0722\u0727\7\u0114\2\2\u0723\u0724\7\u00fe\2\2\u0724\u0725\7\u00d4\2"+
		"\2\u0725\u0727\5t;\2\u0726\u071f\3\2\2\2\u0726\u0720\3\2\2\2\u0726\u0723"+
		"\3\2\2\2\u0727q\3\2\2\2\u0728\u0729\7y\2\2\u0729\u073b\7\u0114\2\2\u072a"+
		"\u072b\7y\2\2\u072b\u072c\7\4\2\2\u072c\u072d\5\u00b8]\2\u072d\u072e\7"+
		"\5\2\2\u072e\u072f\7\u0102\2\2\u072f\u0730\7\4\2\2\u0730\u0735\5\u00cc"+
		"g\2\u0731\u0732\7\6\2\2\u0732\u0734\5\u00ccg\2\u0733\u0731\3\2\2\2\u0734"+
		"\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2"+
		"\2\2\u0737\u0735\3\2\2\2\u0738\u0739\7\5\2\2\u0739\u073b\3\2\2\2\u073a"+
		"\u0728\3\2\2\2\u073a\u072a\3\2\2\2\u073bs\3\2\2\2\u073c\u0741\5v<\2\u073d"+
		"\u073e\7\6\2\2\u073e\u0740\5v<\2\u073f\u073d\3\2\2\2\u0740\u0743\3\2\2"+
		"\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742u\3\2\2\2\u0743\u0741"+
		"\3\2\2\2\u0744\u0745\5\u00ba^\2\u0745\u0746\7\u010a\2\2\u0746\u0747\5"+
		"\u00ccg\2\u0747w\3\2\2\2\u0748\u0749\7\u0106\2\2\u0749\u074a\5\u00ceh"+
		"\2\u074ay\3\2\2\2\u074b\u074c\7o\2\2\u074c\u074d\5\u00ceh\2\u074d{\3\2"+
		"\2\2\u074e\u074f\7\b\2\2\u074f\u0756\5~@\2\u0750\u0752\7\6\2\2\u0751\u0750"+
		"\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0755\5~@\2\u0754"+
		"\u0751\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2"+
		"\2\2\u0757\u0759\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075a\7\t\2\2\u075a"+
		"}\3\2\2\2\u075b\u0769\5\u0112\u008a\2\u075c\u075d\5\u0112\u008a\2\u075d"+
		"\u075e\7\4\2\2\u075e\u0763\5\u00d4k\2\u075f\u0760\7\6\2\2\u0760\u0762"+
		"\5\u00d4k\2\u0761\u075f\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2\2"+
		"\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0763\3\2\2\2\u0766\u0767"+
		"\7\5\2\2\u0767\u0769\3\2\2\2\u0768\u075b\3\2\2\2\u0768\u075c\3\2\2\2\u0769"+
		"\177\3\2\2\2\u076a\u076b\7g\2\2\u076b\u0770\5\u0096L\2\u076c\u076d\7\6"+
		"\2\2\u076d\u076f\5\u0096L\2\u076e\u076c\3\2\2\2\u076f\u0772\3\2\2\2\u0770"+
		"\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0776\3\2\2\2\u0772\u0770\3\2"+
		"\2\2\u0773\u0775\5\u0092J\2\u0774\u0773\3\2\2\2\u0775\u0778\3\2\2\2\u0776"+
		"\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u077a\3\2\2\2\u0778\u0776\3\2"+
		"\2\2\u0779\u077b\5\u008cG\2\u077a\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b"+
		"\u0081\3\2\2\2\u077c\u077d\7m\2\2\u077d\u077e\7 \2\2\u077e\u0783\5\u0084"+
		"C\2\u077f\u0780\7\6\2\2\u0780\u0782\5\u0084C\2\u0781\u077f\3\2\2\2\u0782"+
		"\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u07a4\3\2"+
		"\2\2\u0785\u0783\3\2\2\2\u0786\u0787\7m\2\2\u0787\u0788\7 \2\2\u0788\u078d"+
		"\5\u00ccg\2\u0789\u078a\7\6\2\2\u078a\u078c\5\u00ccg\2\u078b\u0789\3\2"+
		"\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e"+
		"\u07a1\3\2\2\2\u078f\u078d\3\2\2\2\u0790\u0791\7\u0108\2\2\u0791\u07a2"+
		"\7\u00ca\2\2\u0792\u0793\7\u0108\2\2\u0793\u07a2\79\2\2\u0794\u0795\7"+
		"n\2\2\u0795\u0796\7\u00d6\2\2\u0796\u0797\7\4\2\2\u0797\u079c\5\u008a"+
		"F\2\u0798\u0799\7\6\2\2\u0799\u079b\5\u008aF\2\u079a\u0798\3\2\2\2\u079b"+
		"\u079e\3\2\2\2\u079c\u079a\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079f\3\2"+
		"\2\2\u079e\u079c\3\2\2\2\u079f\u07a0\7\5\2\2\u07a0\u07a2\3\2\2\2\u07a1"+
		"\u0790\3\2\2\2\u07a1\u0792\3\2\2\2\u07a1\u0794\3\2\2\2\u07a1\u07a2\3\2"+
		"\2\2\u07a2\u07a4\3\2\2\2\u07a3\u077c\3\2\2\2\u07a3\u0786\3\2\2\2\u07a4"+
		"\u0083\3\2\2\2\u07a5\u07a8\5\u0086D\2\u07a6\u07a8\5\u00ccg\2\u07a7\u07a5"+
		"\3\2\2\2\u07a7\u07a6\3\2\2\2\u07a8\u0085\3\2\2\2\u07a9\u07aa\t\24\2\2"+
		"\u07aa\u07ab\7\4\2\2\u07ab\u07b0\5\u008aF\2\u07ac\u07ad\7\6\2\2\u07ad"+
		"\u07af\5\u008aF\2\u07ae\u07ac\3\2\2\2\u07af\u07b2\3\2\2\2\u07b0\u07ae"+
		"\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b3"+
		"\u07b4\7\5\2\2\u07b4\u07c3\3\2\2\2\u07b5\u07b6\7n\2\2\u07b6\u07b7\7\u00d6"+
		"\2\2\u07b7\u07b8\7\4\2\2\u07b8\u07bd\5\u0088E\2\u07b9\u07ba\7\6\2\2\u07ba"+
		"\u07bc\5\u0088E\2\u07bb\u07b9\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb"+
		"\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c0\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0"+
		"\u07c1\7\5\2\2\u07c1\u07c3\3\2\2\2\u07c2\u07a9\3\2\2\2\u07c2\u07b5\3\2"+
		"\2\2\u07c3\u0087\3\2\2\2\u07c4\u07c7\5\u0086D\2\u07c5\u07c7\5\u008aF\2"+
		"\u07c6\u07c4\3\2\2\2\u07c6\u07c5\3\2\2\2\u07c7\u0089\3\2\2\2\u07c8\u07d1"+
		"\7\4\2\2\u07c9\u07ce\5\u00ccg\2\u07ca\u07cb\7\6\2\2\u07cb\u07cd\5\u00cc"+
		"g\2\u07cc\u07ca\3\2\2\2\u07cd\u07d0\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce"+
		"\u07cf\3\2\2\2\u07cf\u07d2\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d1\u07c9\3\2"+
		"\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d6\7\5\2\2\u07d4"+
		"\u07d6\5\u00ccg\2\u07d5\u07c8\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u008b"+
		"\3\2\2\2\u07d7\u07d8\7\u00af\2\2\u07d8\u07d9\7\4\2\2\u07d9\u07da\5\u00c2"+
		"b\2\u07da\u07db\7c\2\2\u07db\u07dc\5\u008eH\2\u07dc\u07dd\7s\2\2\u07dd"+
		"\u07de\7\4\2\2\u07de\u07e3\5\u0090I\2\u07df\u07e0\7\6\2\2\u07e0\u07e2"+
		"\5\u0090I\2\u07e1\u07df\3\2\2\2\u07e2\u07e5\3\2\2\2\u07e3\u07e1\3\2\2"+
		"\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e6\u07e7"+
		"\7\5\2\2\u07e7\u07e8\7\5\2\2\u07e8\u008d\3\2\2\2\u07e9\u07f6\5\u0112\u008a"+
		"\2\u07ea\u07eb\7\4\2\2\u07eb\u07f0\5\u0112\u008a\2\u07ec\u07ed\7\6\2\2"+
		"\u07ed\u07ef\5\u0112\u008a\2\u07ee\u07ec\3\2\2\2\u07ef\u07f2\3\2\2\2\u07f0"+
		"\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f3\3\2\2\2\u07f2\u07f0\3\2"+
		"\2\2\u07f3\u07f4\7\5\2\2\u07f4\u07f6\3\2\2\2\u07f5\u07e9\3\2\2\2\u07f5"+
		"\u07ea\3\2\2\2\u07f6\u008f\3\2\2\2\u07f7\u07fc\5\u00ccg\2\u07f8\u07fa"+
		"\7\30\2\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\3\2\2\2"+
		"\u07fb\u07fd\5\u0112\u008a\2\u07fc\u07f9\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd"+
		"\u0091\3\2\2\2\u07fe\u07ff\7\u0082\2\2\u07ff\u0801\7\u0103\2\2\u0800\u0802"+
		"\7\u00a5\2\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\3\2\2"+
		"\2\u0803\u0804\5\u010c\u0087\2\u0804\u080d\7\4\2\2\u0805\u080a\5\u00cc"+
		"g\2\u0806\u0807\7\6\2\2\u0807\u0809\5\u00ccg\2\u0808\u0806\3\2\2\2\u0809"+
		"\u080c\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080e\3\2"+
		"\2\2\u080c\u080a\3\2\2\2\u080d\u0805\3\2\2\2\u080d\u080e\3\2\2\2\u080e"+
		"\u080f\3\2\2\2\u080f\u0810\7\5\2\2\u0810\u081c\5\u0112\u008a\2\u0811\u0813"+
		"\7\30\2\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\3\2\2\2"+
		"\u0814\u0819\5\u0112\u008a\2\u0815\u0816\7\6\2\2\u0816\u0818\5\u0112\u008a"+
		"\2\u0817\u0815\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a"+
		"\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081c\u0812\3\2\2\2\u081c"+
		"\u081d\3\2\2\2\u081d\u0093\3\2\2\2\u081e\u081f\t\25\2\2\u081f\u0095\3"+
		"\2\2\2\u0820\u0824\5\u00aeX\2\u0821\u0823\5\u0098M\2\u0822\u0821\3\2\2"+
		"\2\u0823\u0826\3\2\2\2\u0824\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0097"+
		"\3\2\2\2\u0826\u0824\3\2\2\2\u0827\u0828\5\u009aN\2\u0828\u0829\7\177"+
		"\2\2\u0829\u082b\5\u00aeX\2\u082a\u082c\5\u009cO\2\u082b\u082a\3\2\2\2"+
		"\u082b\u082c\3\2\2\2\u082c\u0833\3\2\2\2\u082d\u082e\7\u0098\2\2\u082e"+
		"\u082f\5\u009aN\2\u082f\u0830\7\177\2\2\u0830\u0831\5\u00aeX\2\u0831\u0833"+
		"\3\2\2\2\u0832\u0827\3\2\2\2\u0832\u082d\3\2\2\2\u0833\u0099\3\2\2\2\u0834"+
		"\u0836\7v\2\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u084d\3\2"+
		"\2\2\u0837\u084d\78\2\2\u0838\u083a\7\u0085\2\2\u0839\u083b\7\u00a5\2"+
		"\2\u083a\u0839\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u084d\3\2\2\2\u083c\u083e"+
		"\7\u0085\2\2\u083d\u083c\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u083f\3\2\2"+
		"\2\u083f\u084d\7\u00cf\2\2\u0840\u0842\7\u00c5\2\2\u0841\u0843\7\u00a5"+
		"\2\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u084d\3\2\2\2\u0844"+
		"\u0846\7h\2\2\u0845\u0847\7\u00a5\2\2\u0846\u0845\3\2\2\2\u0846\u0847"+
		"\3\2\2\2\u0847\u084d\3\2\2\2\u0848\u084a\7\u0085\2\2\u0849\u0848\3\2\2"+
		"\2\u0849\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084d\7\24\2\2\u084c"+
		"\u0835\3\2\2\2\u084c\u0837\3\2\2\2\u084c\u0838\3\2\2\2\u084c\u083d\3\2"+
		"\2\2\u084c\u0840\3\2\2\2\u084c\u0844\3\2\2\2\u084c\u0849\3\2\2\2\u084d"+
		"\u009b\3\2\2\2\u084e\u084f\7\u009e\2\2\u084f\u0853\5\u00ceh\2\u0850\u0851"+
		"\7\u0101\2\2\u0851\u0853\5\u00a2R\2\u0852\u084e\3\2\2\2\u0852\u0850\3"+
		"\2\2\2\u0853\u009d\3\2\2\2\u0854\u0855\7\u00e6\2\2\u0855\u0857\7\4\2\2"+
		"\u0856\u0858\5\u00a0Q\2\u0857\u0856\3\2\2\2\u0857\u0858\3\2\2\2\u0858"+
		"\u0859\3\2\2\2\u0859\u085a\7\5\2\2\u085a\u009f\3\2\2\2\u085b\u085d\7\u0113"+
		"\2\2\u085c\u085b\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2\2\u085e"+
		"\u085f\t\26\2\2\u085f\u0874\7\u00ae\2\2\u0860\u0861\5\u00ccg\2\u0861\u0862"+
		"\7\u00cc\2\2\u0862\u0874\3\2\2\2\u0863\u0864\7\36\2\2\u0864\u0865\7\u0120"+
		"\2\2\u0865\u0866\7\u00a4\2\2\u0866\u0867";
	private static final String _serializedATNSegment1 =
		"\7\u009d\2\2\u0867\u0870\7\u0120\2\2\u0868\u086e\7\u009e\2\2\u0869\u086f"+
		"\5\u0112\u008a\2\u086a\u086b\5\u010c\u0087\2\u086b\u086c\7\4\2\2\u086c"+
		"\u086d\7\5\2\2\u086d\u086f\3\2\2\2\u086e\u0869\3\2\2\2\u086e\u086a\3\2"+
		"\2\2\u086f\u0871\3\2\2\2\u0870\u0868\3\2\2\2\u0870\u0871\3\2\2\2\u0871"+
		"\u0874\3\2\2\2\u0872\u0874\5\u00ccg\2\u0873\u085c\3\2\2\2\u0873\u0860"+
		"\3\2\2\2\u0873\u0863\3\2\2\2\u0873\u0872\3\2\2\2\u0874\u00a1\3\2\2\2\u0875"+
		"\u0876\7\4\2\2\u0876\u0877\5\u00a4S\2\u0877\u0878\7\5\2\2\u0878\u00a3"+
		"\3\2\2\2\u0879\u087e\5\u010e\u0088\2\u087a\u087b\7\6\2\2\u087b\u087d\5"+
		"\u010e\u0088\2\u087c\u087a\3\2\2\2\u087d\u0880\3\2\2\2\u087e\u087c\3\2"+
		"\2\2\u087e\u087f\3\2\2\2\u087f\u00a5\3\2\2\2\u0880\u087e\3\2\2\2\u0881"+
		"\u0882\7\4\2\2\u0882\u0887\5\u00a8U\2\u0883\u0884\7\6\2\2\u0884\u0886"+
		"\5\u00a8U\2\u0885\u0883\3\2\2\2\u0886\u0889\3\2\2\2\u0887\u0885\3\2\2"+
		"\2\u0887\u0888\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u0887\3\2\2\2\u088a\u088b"+
		"\7\5\2\2\u088b\u00a7\3\2\2\2\u088c\u088e\5\u010e\u0088\2\u088d\u088f\t"+
		"\22\2\2\u088e\u088d\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u00a9\3\2\2\2\u0890"+
		"\u0891\7\4\2\2\u0891\u0896\5\u00acW\2\u0892\u0893\7\6\2\2\u0893\u0895"+
		"\5\u00acW\2\u0894\u0892\3\2\2\2\u0895\u0898\3\2\2\2\u0896\u0894\3\2\2"+
		"\2\u0896\u0897\3\2\2\2\u0897\u0899\3\2\2\2\u0898\u0896\3\2\2\2\u0899\u089a"+
		"\7\5\2\2\u089a\u00ab\3\2\2\2\u089b\u089d\5\u0112\u008a\2\u089c\u089e\5"+
		"$\23\2\u089d\u089c\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u00ad\3\2\2\2\u089f"+
		"\u08a1\5\u00ba^\2\u08a0\u08a2\5\u009eP\2\u08a1\u08a0\3\2\2\2\u08a1\u08a2"+
		"\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a7\5\u00b4[\2\u08a4\u08a6\5\u0092"+
		"J\2\u08a5\u08a4\3\2\2\2\u08a6\u08a9\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a7"+
		"\u08a8\3\2\2\2\u08a8\u08c2\3\2\2\2\u08a9\u08a7\3\2\2\2\u08aa\u08ab\7\4"+
		"\2\2\u08ab\u08ac\5(\25\2\u08ac\u08ae\7\5\2\2\u08ad\u08af\5\u009eP\2\u08ae"+
		"\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b4\5\u00b4"+
		"[\2\u08b1\u08b3\5\u0092J\2\u08b2\u08b1\3\2\2\2\u08b3\u08b6\3\2\2\2\u08b4"+
		"\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08c2\3\2\2\2\u08b6\u08b4\3\2"+
		"\2\2\u08b7\u08b8\7\4\2\2\u08b8\u08b9\5\u0096L\2\u08b9\u08bb\7\5\2\2\u08ba"+
		"\u08bc\5\u009eP\2\u08bb\u08ba\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd"+
		"\3\2\2\2\u08bd\u08be\5\u00b4[\2\u08be\u08c2\3\2\2\2\u08bf\u08c2\5\u00b0"+
		"Y\2\u08c0\u08c2\5\u00b2Z\2\u08c1\u089f\3\2\2\2\u08c1\u08aa\3\2\2\2\u08c1"+
		"\u08b7\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c1\u08c0\3\2\2\2\u08c2\u00af\3\2"+
		"\2\2\u08c3\u08c4\7\u0102\2\2\u08c4\u08c9\5\u00ccg\2\u08c5\u08c6\7\6\2"+
		"\2\u08c6\u08c8\5\u00ccg\2\u08c7\u08c5\3\2\2\2\u08c8\u08cb\3\2\2\2\u08c9"+
		"\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cc\3\2\2\2\u08cb\u08c9\3\2"+
		"\2\2\u08cc\u08cd\5\u00b4[\2\u08cd\u00b1\3\2\2\2\u08ce\u08cf\5\u010e\u0088"+
		"\2\u08cf\u08d8\7\4\2\2\u08d0\u08d5\5\u00ccg\2\u08d1\u08d2\7\6\2\2\u08d2"+
		"\u08d4\5\u00ccg\2\u08d3\u08d1\3\2\2\2\u08d4\u08d7\3\2\2\2\u08d5\u08d3"+
		"\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d8"+
		"\u08d0\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08db\7\5"+
		"\2\2\u08db\u08dc\5\u00b4[\2\u08dc\u00b3\3\2\2\2\u08dd\u08df\7\30\2\2\u08de"+
		"\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e2\5\u0114"+
		"\u008b\2\u08e1\u08e3\5\u00a2R\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2"+
		"\2\u08e3\u08e5\3\2\2\2\u08e4\u08de\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u00b5"+
		"\3\2\2\2\u08e6\u08e7\7\u00cb\2\2\u08e7\u08e8\7e\2\2\u08e8\u08e9\7\u00d1"+
		"\2\2\u08e9\u08ed\7\u011c\2\2\u08ea\u08eb\7\u0108\2\2\u08eb\u08ec\7\u00d2"+
		"\2\2\u08ec\u08ee\5@!\2\u08ed\u08ea\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u0918"+
		"\3\2\2\2\u08ef\u08f0\7\u00cb\2\2\u08f0\u08f1\7e\2\2\u08f1\u08fb\7F\2\2"+
		"\u08f2\u08f3\7^\2\2\u08f3\u08f4\7\u00e9\2\2\u08f4\u08f5\7 \2\2\u08f5\u08f9"+
		"\7\u011c\2\2\u08f6\u08f7\7S\2\2\u08f7\u08f8\7 \2\2\u08f8\u08fa\7\u011c"+
		"\2\2\u08f9\u08f6\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fc\3\2\2\2\u08fb"+
		"\u08f2\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u0902\3\2\2\2\u08fd\u08fe\7,"+
		"\2\2\u08fe\u08ff\7~\2\2\u08ff\u0900\7\u00e9\2\2\u0900\u0901\7 \2\2\u0901"+
		"\u0903\7\u011c\2\2\u0902\u08fd\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0909"+
		"\3\2\2\2\u0904\u0905\7\u0092\2\2\u0905\u0906\7\u0080\2\2\u0906\u0907\7"+
		"\u00e9\2\2\u0907\u0908\7 \2\2\u0908\u090a\7\u011c\2\2\u0909\u0904\3\2"+
		"\2\2\u0909\u090a\3\2\2\2\u090a\u090f\3\2\2\2\u090b\u090c\7\u0089\2\2\u090c"+
		"\u090d\7\u00e9\2\2\u090d\u090e\7 \2\2\u090e\u0910\7\u011c\2\2\u090f\u090b"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0915\3\2\2\2\u0911\u0912\7\u009b\2"+
		"\2\u0912\u0913\7D\2\2\u0913\u0914\7\30\2\2\u0914\u0916\7\u011c\2\2\u0915"+
		"\u0911\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0918\3\2\2\2\u0917\u08e6\3\2"+
		"\2\2\u0917\u08ef\3\2\2\2\u0918\u00b7\3\2\2\2\u0919\u091e\5\u00ba^\2\u091a"+
		"\u091b\7\6\2\2\u091b\u091d\5\u00ba^\2\u091c\u091a\3\2\2\2\u091d\u0920"+
		"\3\2\2\2\u091e\u091c\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u00b9\3\2\2\2\u0920"+
		"\u091e\3\2\2\2\u0921\u0926\5\u010e\u0088\2\u0922\u0923\7\7\2\2\u0923\u0925"+
		"\5\u010e\u0088\2\u0924\u0922\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0924\3"+
		"\2\2\2\u0926\u0927\3\2\2\2\u0927\u00bb\3\2\2\2\u0928\u0926\3\2\2\2\u0929"+
		"\u092a\5\u010e\u0088\2\u092a\u092b\7\7\2\2\u092b\u092d\3\2\2\2\u092c\u0929"+
		"\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\5\u010e\u0088"+
		"\2\u092f\u00bd\3\2\2\2\u0930\u0931\5\u010e\u0088\2\u0931\u0932\7\7\2\2"+
		"\u0932\u0934\3\2\2\2\u0933\u0930\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935"+
		"\3\2\2\2\u0935\u0936\5\u010e\u0088\2\u0936\u00bf\3\2\2\2\u0937\u093f\5"+
		"\u00ccg\2\u0938\u093a\7\30\2\2\u0939\u0938\3\2\2\2\u0939\u093a\3\2\2\2"+
		"\u093a\u093d\3\2\2\2\u093b\u093e\5\u010e\u0088\2\u093c\u093e\5\u00a2R"+
		"\2\u093d\u093b\3\2\2\2\u093d\u093c\3\2\2\2\u093e\u0940\3\2\2\2\u093f\u0939"+
		"\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u00c1\3\2\2\2\u0941\u0946\5\u00c0a"+
		"\2\u0942\u0943\7\6\2\2\u0943\u0945\5\u00c0a\2\u0944\u0942\3\2\2\2\u0945"+
		"\u0948\3\2\2\2\u0946\u0944\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u00c3\3\2"+
		"\2\2\u0948\u0946\3\2\2\2\u0949\u094a\7\4\2\2\u094a\u094f\5\u00c6d\2\u094b"+
		"\u094c\7\6\2\2\u094c\u094e\5\u00c6d\2\u094d\u094b\3\2\2\2\u094e\u0951"+
		"\3\2\2\2\u094f\u094d\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0952\3\2\2\2\u0951"+
		"\u094f\3\2\2\2\u0952\u0953\7\5\2\2\u0953\u00c5\3\2\2\2\u0954\u0957\5\u00c8"+
		"e\2\u0955\u0957\5\u00f6|\2\u0956\u0954\3\2\2\2\u0956\u0955\3\2\2\2\u0957"+
		"\u00c7\3\2\2\2\u0958\u0966\5\u010c\u0087\2\u0959\u095a\5\u0112\u008a\2"+
		"\u095a\u095b\7\4\2\2\u095b\u0960\5\u00caf\2\u095c\u095d\7\6\2\2\u095d"+
		"\u095f\5\u00caf\2\u095e\u095c\3\2\2\2\u095f\u0962\3\2\2\2\u0960\u095e"+
		"\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0963\3\2\2\2\u0962\u0960\3\2\2\2\u0963"+
		"\u0964\7\5\2\2\u0964\u0966\3\2\2\2\u0965\u0958\3\2\2\2\u0965\u0959\3\2"+
		"\2\2\u0966\u00c9\3\2\2\2\u0967\u096a\5\u010c\u0087\2\u0968\u096a\5\u00d6"+
		"l\2\u0969\u0967\3\2\2\2\u0969\u0968\3\2\2\2\u096a\u00cb\3\2\2\2\u096b"+
		"\u096c\5\u00ceh\2\u096c\u00cd\3\2\2\2\u096d\u096e\bh\1\2\u096e\u096f\7"+
		"\u009a\2\2\u096f\u097a\5\u00ceh\7\u0970\u0971\7V\2\2\u0971\u0972\7\4\2"+
		"\2\u0972\u0973\5(\25\2\u0973\u0974\7\5\2\2\u0974\u097a\3\2\2\2\u0975\u0977"+
		"\5\u00d2j\2\u0976\u0978\5\u00d0i\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2"+
		"\2\2\u0978\u097a\3\2\2\2\u0979\u096d\3\2\2\2\u0979\u0970\3\2\2\2\u0979"+
		"\u0975\3\2\2\2\u097a\u0983\3\2\2\2\u097b\u097c\f\4\2\2\u097c\u097d\7\23"+
		"\2\2\u097d\u0982\5\u00ceh\5\u097e\u097f\f\3\2\2\u097f\u0980\7\u00a2\2"+
		"\2\u0980\u0982\5\u00ceh\4\u0981\u097b\3\2\2\2\u0981\u097e\3\2\2\2\u0982"+
		"\u0985\3\2\2\2\u0983\u0981\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u00cf\3\2"+
		"\2\2\u0985\u0983\3\2\2\2\u0986\u0988\7\u009a\2\2\u0987\u0986\3\2\2\2\u0987"+
		"\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\7\34\2\2\u098a\u098b\5"+
		"\u00d2j\2\u098b\u098c\7\23\2\2\u098c\u098d\5\u00d2j\2\u098d\u09d9\3\2"+
		"\2\2\u098e\u0990\7\u009a\2\2\u098f\u098e\3\2\2\2\u098f\u0990\3\2\2\2\u0990"+
		"\u0991\3\2\2\2\u0991\u0992\7s\2\2\u0992\u0993\7\4\2\2\u0993\u0998\5\u00cc"+
		"g\2\u0994\u0995\7\6\2\2\u0995\u0997\5\u00ccg\2\u0996\u0994\3\2\2\2\u0997"+
		"\u099a\3\2\2\2\u0998\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099b\3\2"+
		"\2\2\u099a\u0998\3\2\2\2\u099b\u099c\7\5\2\2\u099c\u09d9\3\2\2\2\u099d"+
		"\u099f\7\u009a\2\2\u099e\u099d\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0"+
		"\3\2\2\2\u09a0\u09a1\7s\2\2\u09a1\u09a2\7\4\2\2\u09a2\u09a3\5(\25\2\u09a3"+
		"\u09a4\7\5\2\2\u09a4\u09d9\3\2\2\2\u09a5\u09a7\7\u009a\2\2\u09a6\u09a5"+
		"\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\7\u00c6\2"+
		"\2\u09a9\u09d9\5\u00d2j\2\u09aa\u09ac\7\u009a\2\2\u09ab\u09aa\3\2\2\2"+
		"\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\7\u0087\2\2\u09ae"+
		"\u09bc\t\27\2\2\u09af\u09b0\7\4\2\2\u09b0\u09bd\7\5\2\2\u09b1\u09b2\7"+
		"\4\2\2\u09b2\u09b7\5\u00ccg\2\u09b3\u09b4\7\6\2\2\u09b4\u09b6\5\u00cc"+
		"g\2\u09b5\u09b3\3\2\2\2\u09b6\u09b9\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b7"+
		"\u09b8\3\2\2\2\u09b8\u09ba\3\2\2\2\u09b9\u09b7\3\2\2\2\u09ba\u09bb\7\5"+
		"\2\2\u09bb\u09bd\3\2\2\2\u09bc\u09af\3\2\2\2\u09bc\u09b1\3\2\2\2\u09bd"+
		"\u09d9\3\2\2\2\u09be\u09c0\7\u009a\2\2\u09bf\u09be\3\2\2\2\u09bf\u09c0"+
		"\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2\7\u0087\2\2\u09c2\u09c5\5\u00d2"+
		"j\2\u09c3\u09c4\7R\2\2\u09c4\u09c6\7\u011c\2\2\u09c5\u09c3\3\2\2\2\u09c5"+
		"\u09c6\3\2\2\2\u09c6\u09d9\3\2\2\2\u09c7\u09c9\7}\2\2\u09c8\u09ca\7\u009a"+
		"\2\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb"+
		"\u09d9\7\u009b\2\2\u09cc\u09ce\7}\2\2\u09cd\u09cf\7\u009a\2\2\u09ce\u09cd"+
		"\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d9\t\30\2\2"+
		"\u09d1\u09d3\7}\2\2\u09d2\u09d4\7\u009a\2\2\u09d3\u09d2\3\2\2\2\u09d3"+
		"\u09d4\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\7L\2\2\u09d6\u09d7\7g\2"+
		"\2\u09d7\u09d9\5\u00d2j\2\u09d8\u0987\3\2\2\2\u09d8\u098f\3\2\2\2\u09d8"+
		"\u099e\3\2\2\2\u09d8\u09a6\3\2\2\2\u09d8\u09ab\3\2\2\2\u09d8\u09bf\3\2"+
		"\2\2\u09d8\u09c7\3\2\2\2\u09d8\u09cc\3\2\2\2\u09d8\u09d1\3\2\2\2\u09d9"+
		"\u00d1\3\2\2\2\u09da\u09db\bj\1\2\u09db\u09df\5\u00d4k\2\u09dc\u09dd\t"+
		"\31\2\2\u09dd\u09df\5\u00d2j\t\u09de\u09da\3\2\2\2\u09de\u09dc\3\2\2\2"+
		"\u09df\u09f5\3\2\2\2\u09e0\u09e1\f\b\2\2\u09e1\u09e2\t\32\2\2\u09e2\u09f4"+
		"\5\u00d2j\t\u09e3\u09e4\f\7\2\2\u09e4\u09e5\t\33\2\2\u09e5\u09f4\5\u00d2"+
		"j\b\u09e6\u09e7\f\6\2\2\u09e7\u09e8\7\u0118\2\2\u09e8\u09f4\5\u00d2j\7"+
		"\u09e9\u09ea\f\5\2\2\u09ea\u09eb\7\u011b\2\2\u09eb\u09f4\5\u00d2j\6\u09ec"+
		"\u09ed\f\4\2\2\u09ed\u09ee\7\u0119\2\2\u09ee\u09f4\5\u00d2j\5\u09ef\u09f0"+
		"\f\3\2\2\u09f0\u09f1\5\u00d8m\2\u09f1\u09f2\5\u00d2j\4\u09f2\u09f4\3\2"+
		"\2\2\u09f3\u09e0\3\2\2\2\u09f3\u09e3\3\2\2\2\u09f3\u09e6\3\2\2\2\u09f3"+
		"\u09e9\3\2\2\2\u09f3\u09ec\3\2\2\2\u09f3\u09ef\3\2\2\2\u09f4\u09f7\3\2"+
		"\2\2\u09f5\u09f3\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u00d3\3\2\2\2\u09f7"+
		"\u09f5\3\2\2\2\u09f8\u09f9\bk\1\2\u09f9\u0ab1\t\34\2\2\u09fa\u09fc\7#"+
		"\2\2\u09fb\u09fd\5\u00fc\177\2\u09fc\u09fb\3\2\2\2\u09fd\u09fe\3\2\2\2"+
		"\u09fe\u09fc\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a02\3\2\2\2\u0a00\u0a01"+
		"\7P\2\2\u0a01\u0a03\5\u00ccg\2\u0a02\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2"+
		"\u0a03\u0a04\3\2\2\2\u0a04\u0a05\7Q\2\2\u0a05\u0ab1\3\2\2\2\u0a06\u0a07"+
		"\7#\2\2\u0a07\u0a09\5\u00ccg\2\u0a08\u0a0a\5\u00fc\177\2\u0a09\u0a08\3"+
		"\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c"+
		"\u0a0f\3\2\2\2\u0a0d\u0a0e\7P\2\2\u0a0e\u0a10\5\u00ccg\2\u0a0f\u0a0d\3"+
		"\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a12\7Q\2\2\u0a12"+
		"\u0ab1\3\2\2\2\u0a13\u0a14\7$\2\2\u0a14\u0a15\7\4\2\2\u0a15\u0a16\5\u00cc"+
		"g\2\u0a16\u0a17\7\30\2\2\u0a17\u0a18\5\u00eex\2\u0a18\u0a19\7\5\2\2\u0a19"+
		"\u0ab1\3\2\2\2\u0a1a\u0a1b\7\u00e1\2\2\u0a1b\u0a24\7\4\2\2\u0a1c\u0a21"+
		"\5\u00c0a\2\u0a1d\u0a1e\7\6\2\2\u0a1e\u0a20\5\u00c0a\2\u0a1f\u0a1d\3\2"+
		"\2\2\u0a20\u0a23\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22"+
		"\u0a25\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a24\u0a1c\3\2\2\2\u0a24\u0a25\3\2"+
		"\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0ab1\7\5\2\2\u0a27\u0a28\7a\2\2\u0a28"+
		"\u0a29\7\4\2\2\u0a29\u0a2c\5\u00ccg\2\u0a2a\u0a2b\7q\2\2\u0a2b\u0a2d\7"+
		"\u009c\2\2\u0a2c\u0a2a\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a2e\3\2\2\2"+
		"\u0a2e\u0a2f\7\5\2\2\u0a2f\u0ab1\3\2\2\2\u0a30\u0a31\7\u0081\2\2\u0a31"+
		"\u0a32\7\4\2\2\u0a32\u0a35\5\u00ccg\2\u0a33\u0a34\7q\2\2\u0a34\u0a36\7"+
		"\u009c\2\2\u0a35\u0a33\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\3\2\2\2"+
		"\u0a37\u0a38\7\5\2\2\u0a38\u0ab1\3\2\2\2\u0a39\u0a3a\7\u00b1\2\2\u0a3a"+
		"\u0a3b\7\4\2\2\u0a3b\u0a3c\5\u00d2j\2\u0a3c\u0a3d\7s\2\2\u0a3d\u0a3e\5"+
		"\u00d2j\2\u0a3e\u0a3f\7\5\2\2\u0a3f\u0ab1\3\2\2\2\u0a40\u0ab1\5\u00d6"+
		"l\2\u0a41\u0ab1\7\u0114\2\2\u0a42\u0a43\5\u010c\u0087\2\u0a43\u0a44\7"+
		"\7\2\2\u0a44\u0a45\7\u0114\2\2\u0a45\u0ab1\3\2\2\2\u0a46\u0a47\7\4\2\2"+
		"\u0a47\u0a4a\5\u00c0a\2\u0a48\u0a49\7\6\2\2\u0a49\u0a4b\5\u00c0a\2\u0a4a"+
		"\u0a48\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4c\u0a4d\3\2"+
		"\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\7\5\2\2\u0a4f\u0ab1\3\2\2\2\u0a50"+
		"\u0a51\7\4\2\2\u0a51\u0a52\5(\25\2\u0a52\u0a53\7\5\2\2\u0a53\u0ab1\3\2"+
		"\2\2\u0a54\u0a55\5\u010a\u0086\2\u0a55\u0a61\7\4\2\2\u0a56\u0a58\5\u0094"+
		"K\2\u0a57\u0a56\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59"+
		"\u0a5e\5\u00ccg\2\u0a5a\u0a5b\7\6\2\2\u0a5b\u0a5d\5\u00ccg\2\u0a5c\u0a5a"+
		"\3\2\2\2\u0a5d\u0a60\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f"+
		"\u0a62\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a61\u0a57\3\2\2\2\u0a61\u0a62\3\2"+
		"\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a6a\7\5\2\2\u0a64\u0a65\7_\2\2\u0a65"+
		"\u0a66\7\4\2\2\u0a66\u0a67\7\u0106\2\2\u0a67\u0a68\5\u00ceh\2\u0a68\u0a69"+
		"\7\5\2\2\u0a69\u0a6b\3\2\2\2\u0a6a\u0a64\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u0a6e\3\2\2\2\u0a6c\u0a6d\7\u00a7\2\2\u0a6d\u0a6f\5\u0102\u0082\2\u0a6e"+
		"\u0a6c\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0ab1\3\2\2\2\u0a70\u0a71\5\u0112"+
		"\u008a\2\u0a71\u0a72\7\n\2\2\u0a72\u0a73\5\u00ccg\2\u0a73\u0ab1\3\2\2"+
		"\2\u0a74\u0a75\7\4\2\2\u0a75\u0a78\5\u0112\u008a\2\u0a76\u0a77\7\6\2\2"+
		"\u0a77\u0a79\5\u0112\u008a\2\u0a78\u0a76\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a"+
		"\u0a78\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a7d\7\5"+
		"\2\2\u0a7d\u0a7e\7\n\2\2\u0a7e\u0a7f\5\u00ccg\2\u0a7f\u0ab1\3\2\2\2\u0a80"+
		"\u0ab1\5\u0112\u008a\2\u0a81\u0a82\7\4\2\2\u0a82\u0a83\5\u00ccg\2\u0a83"+
		"\u0a84\7\5\2\2\u0a84\u0ab1\3\2\2\2\u0a85\u0a86\7[\2\2\u0a86\u0a87\7\4"+
		"\2\2\u0a87\u0a88\5\u0112\u008a\2\u0a88\u0a89\7g\2\2\u0a89\u0a8a\5\u00d2"+
		"j\2\u0a8a\u0a8b\7\5\2\2\u0a8b\u0ab1\3\2\2\2\u0a8c\u0a8d\t\35\2\2\u0a8d"+
		"\u0a8e\7\4\2\2\u0a8e\u0a8f\5\u00d2j\2\u0a8f\u0a90\t\36\2\2\u0a90\u0a93"+
		"\5\u00d2j\2\u0a91\u0a92\t\37\2\2\u0a92\u0a94\5\u00d2j\2\u0a93\u0a91\3"+
		"\2\2\2\u0a93\u0a94\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95\u0a96\7\5\2\2\u0a96"+
		"\u0ab1\3\2\2\2\u0a97\u0a98\7\u00f2\2\2\u0a98\u0a9a\7\4\2\2\u0a99\u0a9b"+
		"\t \2\2\u0a9a\u0a99\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9d\3\2\2\2\u0a9c"+
		"\u0a9e\5\u00d2j\2\u0a9d\u0a9c\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f"+
		"\3\2\2\2\u0a9f\u0aa0\7g\2\2\u0aa0\u0aa1\5\u00d2j\2\u0aa1\u0aa2\7\5\2\2"+
		"\u0aa2\u0ab1\3\2\2\2\u0aa3\u0aa4\7\u00a9\2\2\u0aa4\u0aa5\7\4\2\2\u0aa5"+
		"\u0aa6\5\u00d2j\2\u0aa6\u0aa7\7\u00b0\2\2\u0aa7\u0aa8\5\u00d2j\2\u0aa8"+
		"\u0aa9\7g\2\2\u0aa9\u0aac\5\u00d2j\2\u0aaa\u0aab\7c\2\2\u0aab\u0aad\5"+
		"\u00d2j\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0aae\3\2\2\2"+
		"\u0aae\u0aaf\7\5\2\2\u0aaf\u0ab1\3\2\2\2\u0ab0\u09f8\3\2\2\2\u0ab0\u09fa"+
		"\3\2\2\2\u0ab0\u0a06\3\2\2\2\u0ab0\u0a13\3\2\2\2\u0ab0\u0a1a\3\2\2\2\u0ab0"+
		"\u0a27\3\2\2\2\u0ab0\u0a30\3\2\2\2\u0ab0\u0a39\3\2\2\2\u0ab0\u0a40\3\2"+
		"\2\2\u0ab0\u0a41\3\2\2\2\u0ab0\u0a42\3\2\2\2\u0ab0\u0a46\3\2\2\2\u0ab0"+
		"\u0a50\3\2\2\2\u0ab0\u0a54\3\2\2\2\u0ab0\u0a70\3\2\2\2\u0ab0\u0a74\3\2"+
		"\2\2\u0ab0\u0a80\3\2\2\2\u0ab0\u0a81\3\2\2\2\u0ab0\u0a85\3\2\2\2\u0ab0"+
		"\u0a8c\3\2\2\2\u0ab0\u0a97\3\2\2\2\u0ab0\u0aa3\3\2\2\2\u0ab1\u0abc\3\2"+
		"\2\2\u0ab2\u0ab3\f\n\2\2\u0ab3\u0ab4\7\13\2\2\u0ab4\u0ab5\5\u00d2j\2\u0ab5"+
		"\u0ab6\7\f\2\2\u0ab6\u0abb\3\2\2\2\u0ab7\u0ab8\f\b\2\2\u0ab8\u0ab9\7\7"+
		"\2\2\u0ab9\u0abb\5\u0112\u008a\2\u0aba\u0ab2\3\2\2\2\u0aba\u0ab7\3\2\2"+
		"\2\u0abb\u0abe\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd\u00d5"+
		"\3\2\2\2\u0abe\u0abc\3\2\2\2\u0abf\u0acc\7\u009b\2\2\u0ac0\u0acc\5\u00e0"+
		"q\2\u0ac1\u0ac2\5\u0112\u008a\2\u0ac2\u0ac3\7\u011c\2\2\u0ac3\u0acc\3"+
		"\2\2\2\u0ac4\u0acc\5\u0118\u008d\2\u0ac5\u0acc\5\u00dep\2\u0ac6\u0ac8"+
		"\7\u011c\2\2\u0ac7\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0ac7\3\2\2"+
		"\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acc\3\2\2\2\u0acb\u0abf\3\2\2\2\u0acb\u0ac0"+
		"\3\2\2\2\u0acb\u0ac1\3\2\2\2\u0acb\u0ac4\3\2\2\2\u0acb\u0ac5\3\2\2\2\u0acb"+
		"\u0ac7\3\2\2\2\u0acc\u00d7\3\2\2\2\u0acd\u0ace\t!\2\2\u0ace\u00d9\3\2"+
		"\2\2\u0acf\u0ad0\t\"\2\2\u0ad0\u00db\3\2\2\2\u0ad1\u0ad2\t#\2\2\u0ad2"+
		"\u00dd\3\2\2\2\u0ad3\u0ad4\t$\2\2\u0ad4\u00df\3\2\2\2\u0ad5\u0ad8\7{\2"+
		"\2\u0ad6\u0ad9\5\u00e2r\2\u0ad7\u0ad9\5\u00e6t\2\u0ad8\u0ad6\3\2\2\2\u0ad8"+
		"\u0ad7\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u00e1\3\2\2\2\u0ada\u0adc\5\u00e4"+
		"s\2\u0adb\u0add\5\u00e8u\2\u0adc\u0adb\3\2\2\2\u0adc\u0add\3\2\2\2\u0add"+
		"\u00e3\3\2\2\2\u0ade\u0adf\5\u00eav\2\u0adf\u0ae0\5\u0112\u008a\2\u0ae0"+
		"\u0ae2\3\2\2\2\u0ae1\u0ade\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae1\3\2"+
		"\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u00e5\3\2\2\2\u0ae5\u0ae8\5\u00e8u\2\u0ae6"+
		"\u0ae9\5\u00e4s\2\u0ae7\u0ae9\5\u00e8u\2\u0ae8\u0ae6\3\2\2\2\u0ae8\u0ae7"+
		"\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u00e7\3\2\2\2\u0aea\u0aeb\5\u00eav"+
		"\2\u0aeb\u0aec\5\u0112\u008a\2\u0aec\u0aed\7\u00ec\2\2\u0aed\u0aee\5\u0112"+
		"\u008a\2\u0aee\u00e9\3\2\2\2\u0aef\u0af1\t%\2\2\u0af0\u0aef\3\2\2\2\u0af0"+
		"\u0af1\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af5\t\26\2\2\u0af3\u0af5\7"+
		"\u011c\2\2\u0af4\u0af0\3\2\2\2\u0af4\u0af3\3\2\2\2\u0af5\u00eb\3\2\2\2"+
		"\u0af6\u0afa\7a\2\2\u0af7\u0af8\7\17\2\2\u0af8\u0afa\5\u010e\u0088\2\u0af9"+
		"\u0af6\3\2\2\2\u0af9\u0af7\3\2\2\2\u0afa\u00ed\3\2\2\2\u0afb\u0afc\7\27"+
		"\2\2\u0afc\u0afd\7\u010e\2\2\u0afd\u0afe\5\u00eex\2\u0afe\u0aff\7\u0110"+
		"\2\2\u0aff\u0b1e\3\2\2\2\u0b00\u0b01\7\u0092\2\2\u0b01\u0b02\7\u010e\2"+
		"\2\u0b02\u0b03\5\u00eex\2\u0b03\u0b04\7\6\2\2\u0b04\u0b05\5\u00eex\2\u0b05"+
		"\u0b06\7\u0110\2\2\u0b06\u0b1e\3\2\2\2\u0b07\u0b0e\7\u00e1\2\2\u0b08\u0b0a"+
		"\7\u010e\2\2\u0b09\u0b0b\5\u00f8}\2\u0b0a\u0b09\3\2\2\2\u0b0a\u0b0b\3"+
		"\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b0f\7\u0110\2\2\u0b0d\u0b0f\7\u010c"+
		"\2\2\u0b0e\u0b08\3\2\2\2\u0b0e\u0b0d\3\2\2\2\u0b0f\u0b1e\3\2\2\2\u0b10"+
		"\u0b1b\5\u0112\u008a\2\u0b11\u0b12\7\4\2\2\u0b12\u0b17\7\u0120\2\2\u0b13"+
		"\u0b14\7\6\2\2\u0b14\u0b16\7\u0120\2\2\u0b15\u0b13\3\2\2\2\u0b16\u0b19"+
		"\3\2\2\2\u0b17\u0b15\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b1a\3\2\2\2\u0b19"+
		"\u0b17\3\2\2\2\u0b1a\u0b1c\7\5\2\2\u0b1b\u0b11\3\2\2\2\u0b1b\u0b1c\3\2"+
		"\2\2\u0b1c\u0b1e\3\2\2\2\u0b1d\u0afb\3\2\2\2\u0b1d\u0b00\3\2\2\2\u0b1d"+
		"\u0b07\3\2\2\2\u0b1d\u0b10\3\2\2\2\u0b1e\u00ef\3\2\2\2\u0b1f\u0b24\5\u00f2"+
		"z\2\u0b20\u0b21\7\6\2\2\u0b21\u0b23\5\u00f2z\2\u0b22\u0b20\3\2\2\2\u0b23"+
		"\u0b26\3\2\2\2\u0b24\u0b22\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u00f1\3\2"+
		"\2\2\u0b26\u0b24\3\2\2\2\u0b27\u0b28\5\u00ba^\2\u0b28\u0b2b\5\u00eex\2"+
		"\u0b29\u0b2a\7\u009a\2\2\u0b2a\u0b2c\7\u009b\2\2\u0b2b\u0b29\3\2\2\2\u0b2b"+
		"\u0b2c\3\2\2\2\u0b2c\u0b2e\3\2\2\2\u0b2d\u0b2f\5$\23\2\u0b2e\u0b2d\3\2"+
		"\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b31\3\2\2\2\u0b30\u0b32\5\u00ecw\2\u0b31"+
		"\u0b30\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u00f3\3\2\2\2\u0b33\u0b38\5\u00f6"+
		"|\2\u0b34\u0b35\7\6\2\2\u0b35\u0b37\5\u00f6|\2\u0b36\u0b34\3\2\2\2\u0b37"+
		"\u0b3a\3\2\2\2\u0b38\u0b36\3\2\2\2\u0b38\u0b39\3\2\2\2\u0b39\u00f5\3\2"+
		"\2\2\u0b3a\u0b38\3\2\2\2\u0b3b\u0b3c\5\u010e\u0088\2\u0b3c\u0b3e\5\u00ee"+
		"x\2\u0b3d\u0b3f\5\"\22\2\u0b3e\u0b3d\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f"+
		"\u0b42\3\2\2\2\u0b40\u0b41\7\u009a\2\2\u0b41\u0b43\7\u009b\2\2\u0b42\u0b40"+
		"\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b45\3\2\2\2\u0b44\u0b46\5$\23\2\u0b45"+
		"\u0b44\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46\u00f7\3\2\2\2\u0b47\u0b4c\5\u00fa"+
		"~\2\u0b48\u0b49\7\6\2\2\u0b49\u0b4b\5\u00fa~\2\u0b4a\u0b48\3\2\2\2\u0b4b"+
		"\u0b4e\3\2\2\2\u0b4c\u0b4a\3\2\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u00f9\3\2"+
		"\2\2\u0b4e\u0b4c\3\2\2\2\u0b4f\u0b50\5\u0112\u008a\2\u0b50\u0b51\7\r\2"+
		"\2\u0b51\u0b54\5\u00eex\2\u0b52\u0b53\7\u009a\2\2\u0b53\u0b55\7\u009b"+
		"\2\2\u0b54\u0b52\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55\u0b57\3\2\2\2\u0b56"+
		"\u0b58\5$\23\2\u0b57\u0b56\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u00fb\3\2"+
		"\2\2\u0b59\u0b5a\7\u0105\2\2\u0b5a\u0b5b\5\u00ccg\2\u0b5b\u0b5c\7\u00ea"+
		"\2\2\u0b5c\u0b5d\5\u00ccg\2\u0b5d\u00fd\3\2\2\2\u0b5e\u0b5f\7\u0107\2"+
		"\2\u0b5f\u0b64\5\u0100\u0081\2\u0b60\u0b61\7\6\2\2\u0b61\u0b63\5\u0100"+
		"\u0081\2\u0b62\u0b60\3\2\2\2\u0b63\u0b66\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b64"+
		"\u0b65\3\2\2\2\u0b65\u00ff\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b67\u0b68\5\u010e"+
		"\u0088\2\u0b68\u0b69\7\30\2\2\u0b69\u0b6a\5\u0102\u0082\2\u0b6a\u0101"+
		"\3\2\2\2\u0b6b\u0b9a\5\u010e\u0088\2\u0b6c\u0b6d\7\4\2\2\u0b6d\u0b6e\5"+
		"\u010e\u0088\2\u0b6e\u0b6f\7\5\2\2\u0b6f\u0b9a\3\2\2\2\u0b70\u0b93\7\4"+
		"\2\2\u0b71\u0b72\7(\2\2\u0b72\u0b73\7 \2\2\u0b73\u0b78\5\u00ccg\2\u0b74"+
		"\u0b75\7\6\2\2\u0b75\u0b77\5\u00ccg\2\u0b76\u0b74\3\2\2\2\u0b77\u0b7a"+
		"\3\2\2\2\u0b78\u0b76\3\2\2\2\u0b78\u0b79\3\2\2\2\u0b79\u0b94\3\2\2\2\u0b7a"+
		"\u0b78\3\2\2\2\u0b7b\u0b7c\t&\2\2\u0b7c\u0b7d\7 \2\2\u0b7d\u0b82\5\u00cc"+
		"g\2\u0b7e\u0b7f\7\6\2\2\u0b7f\u0b81\5\u00ccg\2\u0b80\u0b7e\3\2\2\2\u0b81"+
		"\u0b84\3\2\2\2\u0b82\u0b80\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b86\3\2"+
		"\2\2\u0b84\u0b82\3\2\2\2\u0b85\u0b7b\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86"+
		"\u0b91\3\2\2\2\u0b87\u0b88\t\'\2\2\u0b88\u0b89\7 \2\2\u0b89\u0b8e\5^\60"+
		"\2\u0b8a\u0b8b\7\6\2\2\u0b8b\u0b8d\5^\60\2\u0b8c\u0b8a\3\2\2\2\u0b8d\u0b90"+
		"\3\2\2\2\u0b8e\u0b8c\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b92\3\2\2\2\u0b90"+
		"\u0b8e\3\2\2\2\u0b91\u0b87\3\2\2\2\u0b91\u0b92\3\2\2\2\u0b92\u0b94\3\2"+
		"\2\2\u0b93\u0b71\3\2\2\2\u0b93\u0b85\3\2\2\2\u0b94\u0b96\3\2\2\2\u0b95"+
		"\u0b97\5\u0104\u0083\2\u0b96\u0b95\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97\u0b98"+
		"\3\2\2\2\u0b98\u0b9a\7\5\2\2\u0b99\u0b6b\3\2\2\2\u0b99\u0b6c\3\2\2\2\u0b99"+
		"\u0b70\3\2\2\2\u0b9a\u0103\3\2\2\2\u0b9b\u0b9c\7\u00b8\2\2\u0b9c\u0bac"+
		"\5\u0106\u0084\2\u0b9d\u0b9e\7\u00cc\2\2\u0b9e\u0bac\5\u0106\u0084\2\u0b9f"+
		"\u0ba0\7\u00b8\2\2\u0ba0\u0ba1\7\34\2\2\u0ba1\u0ba2\5\u0106\u0084\2\u0ba2"+
		"\u0ba3\7\23\2\2\u0ba3\u0ba4\5\u0106\u0084\2\u0ba4\u0bac\3\2\2\2\u0ba5"+
		"\u0ba6\7\u00cc\2\2\u0ba6\u0ba7\7\34\2\2\u0ba7\u0ba8\5\u0106\u0084\2\u0ba8"+
		"\u0ba9\7\23\2\2\u0ba9\u0baa\5\u0106\u0084\2\u0baa\u0bac\3\2\2\2\u0bab"+
		"\u0b9b\3\2\2\2\u0bab\u0b9d\3\2\2\2\u0bab\u0b9f\3\2\2\2\u0bab\u0ba5\3\2"+
		"\2\2\u0bac\u0105\3\2\2\2\u0bad\u0bae\7\u00f7\2\2\u0bae\u0bb5\t(\2\2\u0baf"+
		"\u0bb0\7:\2\2\u0bb0\u0bb5\7\u00cb\2\2\u0bb1\u0bb2\5\u00ccg\2\u0bb2\u0bb3"+
		"\t(\2\2\u0bb3\u0bb5\3\2\2\2\u0bb4\u0bad\3\2\2\2\u0bb4\u0baf\3\2\2\2\u0bb4"+
		"\u0bb1\3\2\2\2\u0bb5\u0107\3\2\2\2\u0bb6\u0bbb\5\u010c\u0087\2\u0bb7\u0bb8"+
		"\7\6\2\2\u0bb8\u0bba\5\u010c\u0087\2\u0bb9\u0bb7\3\2\2\2\u0bba\u0bbd\3"+
		"\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0109\3\2\2\2\u0bbd"+
		"\u0bbb\3\2\2\2\u0bbe\u0bc3\5\u010c\u0087\2\u0bbf\u0bc3\7_\2\2\u0bc0\u0bc3"+
		"\7\u0085\2\2\u0bc1\u0bc3\7\u00c5\2\2\u0bc2\u0bbe\3\2\2\2\u0bc2\u0bbf\3"+
		"\2\2\2\u0bc2\u0bc0\3\2\2\2\u0bc2\u0bc1\3\2\2\2\u0bc3\u010b\3\2\2\2\u0bc4"+
		"\u0bc9\5\u0112\u008a\2\u0bc5\u0bc6\t)\2\2\u0bc6\u0bc8\5\u0112\u008a\2"+
		"\u0bc7\u0bc5\3\2\2\2\u0bc8\u0bcb\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bc9\u0bca"+
		"\3\2\2\2\u0bca\u010d\3\2\2\2\u0bcb\u0bc9\3\2\2\2\u0bcc\u0bcd\5\u0112\u008a"+
		"\2\u0bcd\u0bce\5\u0110\u0089\2\u0bce\u010f\3\2\2\2\u0bcf\u0bd0\7\u0113"+
		"\2\2\u0bd0\u0bd2\5\u0112\u008a\2\u0bd1\u0bcf\3\2\2\2\u0bd2\u0bd3\3\2\2"+
		"\2\u0bd3\u0bd1\3\2\2\2\u0bd3\u0bd4\3\2\2\2\u0bd4\u0bd7\3\2\2\2\u0bd5\u0bd7"+
		"\3\2\2\2\u0bd6\u0bd1\3\2\2\2\u0bd6\u0bd5\3\2\2\2\u0bd7\u0111\3\2\2\2\u0bd8"+
		"\u0bdc\5\u0114\u008b\2\u0bd9\u0bda\6\u008a\22\2\u0bda\u0bdc\5\u011e\u0090"+
		"\2\u0bdb\u0bd8\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdc\u0113\3\2\2\2\u0bdd\u0be4"+
		"\7\u0126\2\2\u0bde\u0be4\5\u0116\u008c\2\u0bdf\u0be0\6\u008b\23\2\u0be0"+
		"\u0be4\5\u011c\u008f\2\u0be1\u0be2\6\u008b\24\2\u0be2\u0be4\5\u0120\u0091"+
		"\2\u0be3\u0bdd\3\2\2\2\u0be3\u0bde\3\2\2\2\u0be3\u0bdf\3\2\2\2\u0be3\u0be1"+
		"\3\2\2\2\u0be4\u0115\3\2\2\2\u0be5\u0be6\7\u0127\2\2\u0be6\u0117\3\2\2"+
		"\2\u0be7\u0be9\6\u008d\25\2\u0be8\u0bea\7\u0113\2\2\u0be9\u0be8\3\2\2"+
		"\2\u0be9\u0bea\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0c13\7\u0121\2\2\u0bec"+
		"\u0bee\6\u008d\26\2\u0bed\u0bef\7\u0113\2\2\u0bee\u0bed\3\2\2\2\u0bee"+
		"\u0bef\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u0c13\7\u0122\2\2\u0bf1\u0bf3"+
		"\6\u008d\27\2\u0bf2\u0bf4\7\u0113\2\2\u0bf3\u0bf2\3\2\2\2\u0bf3\u0bf4"+
		"\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0c13\t*\2\2\u0bf6\u0bf8\7\u0113\2"+
		"\2\u0bf7\u0bf6\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u0bf9\3\2\2\2\u0bf9\u0c13"+
		"\7\u0120\2\2\u0bfa\u0bfc\7\u0113\2\2\u0bfb\u0bfa\3\2\2\2\u0bfb\u0bfc\3"+
		"\2\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u0c13\7\u011d\2\2\u0bfe\u0c00\7\u0113"+
		"\2\2\u0bff\u0bfe\3\2\2\2\u0bff\u0c00\3\2\2\2\u0c00\u0c01\3\2\2\2\u0c01"+
		"\u0c13\7\u011e\2\2\u0c02\u0c04\7\u0113\2\2\u0c03\u0c02\3\2\2\2\u0c03\u0c04"+
		"\3\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c13\7\u011f\2\2\u0c06\u0c08\7\u0113"+
		"\2\2\u0c07\u0c06\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09"+
		"\u0c13\7\u0124\2\2\u0c0a\u0c0c\7\u0113\2\2\u0c0b\u0c0a\3\2\2\2\u0c0b\u0c0c"+
		"\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c13\7\u0123\2\2\u0c0e\u0c10\7\u0113"+
		"\2\2\u0c0f\u0c0e\3\2\2\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11"+
		"\u0c13\7\u0125\2\2\u0c12\u0be7\3\2\2\2\u0c12\u0bec\3\2\2\2\u0c12\u0bf1"+
		"\3\2\2\2\u0c12\u0bf7\3\2\2\2\u0c12\u0bfb\3\2\2\2\u0c12\u0bff\3\2\2\2\u0c12"+
		"\u0c03\3\2\2\2\u0c12\u0c07\3\2\2\2\u0c12\u0c0b\3\2\2\2\u0c12\u0c0f\3\2"+
		"\2\2\u0c13\u0119\3\2\2\2\u0c14\u0c15\7\u00f5\2\2\u0c15\u0c1c\5\u00eex"+
		"\2\u0c16\u0c1c\5$\23\2\u0c17\u0c1c\5\u00ecw\2\u0c18\u0c19\t+\2\2\u0c19"+
		"\u0c1a\7\u009a\2\2\u0c1a\u0c1c\7\u009b\2\2\u0c1b\u0c14\3\2\2\2\u0c1b\u0c16"+
		"\3\2\2\2\u0c1b\u0c17\3\2\2\2\u0c1b\u0c18\3\2\2\2\u0c1c\u011b\3\2\2\2\u0c1d"+
		"\u0c1e\t,\2\2\u0c1e\u011d\3\2\2\2\u0c1f\u0c20\t-\2\2\u0c20\u011f\3\2\2"+
		"\2\u0c21\u0c22\t.\2\2\u0c22\u0121\3\2\2\2\u0196\u0126\u013f\u0144\u014c"+
		"\u0154\u0156\u016a\u016e\u0174\u0177\u017a\u0181\u0184\u0188\u018b\u0192"+
		"\u019d\u019f\u01a7\u01aa\u01ae\u01b1\u01b7\u01c2\u0202\u020b\u020f\u0215"+
		"\u0219\u021e\u0224\u0230\u0238\u023e\u024b\u0250\u0260\u0267\u026b\u0271"+
		"\u0280\u0289\u028d\u0293\u0299\u029c\u029f\u02a5\u02a9\u02b1\u02b3\u02bc"+
		"\u02bf\u02c8\u02cd\u02d3\u02da\u02dd\u02e3\u02ee\u02f1\u02f5\u02fa\u02ff"+
		"\u0306\u0309\u030c\u0313\u0318\u0321\u0329\u032f\u0332\u0335\u033b\u033f"+
		"\u0343\u0347\u0349\u0351\u0359\u035f\u0365\u0368\u036c\u036f\u0373\u038f"+
		"\u0392\u0396\u039c\u039f\u03a2\u03a8\u03b0\u03b5\u03bb\u03c1\u03cd\u03d0"+
		"\u03d7\u03e8\u03f6\u03f9\u03ff\u0408\u0411\u0418\u041b\u0427\u042b\u0432"+
		"\u04a6\u04ae\u04b6\u04bf\u04c9\u04cd\u04d0\u04d6\u04dc\u04e8\u04f4\u04f9"+
		"\u0508\u0510\u0517\u0519\u051c\u0521\u0525\u052a\u052d\u0532\u0537\u053a"+
		"\u053f\u0543\u0548\u054a\u054e\u0557\u055f\u0568\u056f\u0578\u057d\u0580"+
		"\u0597\u0599\u05a2\u05a9\u05ac\u05b3\u05b7\u05bd\u05c5\u05d0\u05db\u05e2"+
		"\u05e8\u05eb\u05f7\u05fe\u0605\u0611\u0619\u061f\u0622\u062b\u062e\u0637"+
		"\u063a\u0643\u0646\u064f\u0652\u0655\u065a\u065c\u0668\u066f\u0676\u0679"+
		"\u067b\u0687\u068b\u068f\u0695\u0699\u06a1\u06a5\u06a8\u06ab\u06ae\u06b2"+
		"\u06b6\u06b9\u06bd\u06c2\u06c6\u06c9\u06cc\u06cf\u06d1\u06dd\u06e0\u06e4"+
		"\u06ee\u06f2\u06f4\u06f7\u06fb\u0701\u0705\u0710\u071a\u0726\u0735\u073a"+
		"\u0741\u0751\u0756\u0763\u0768\u0770\u0776\u077a\u0783\u078d\u079c\u07a1"+
		"\u07a3\u07a7\u07b0\u07bd\u07c2\u07c6\u07ce\u07d1\u07d5\u07e3\u07f0\u07f5"+
		"\u07f9\u07fc\u0801\u080a\u080d\u0812\u0819\u081c\u0824\u082b\u0832\u0835"+
		"\u083a\u083d\u0842\u0846\u0849\u084c\u0852\u0857\u085c\u086e\u0870\u0873"+
		"\u087e\u0887\u088e\u0896\u089d\u08a1\u08a7\u08ae\u08b4\u08bb\u08c1\u08c9"+
		"\u08d5\u08d8\u08de\u08e2\u08e4\u08ed\u08f9\u08fb\u0902\u0909\u090f\u0915"+
		"\u0917\u091e\u0926\u092c\u0933\u0939\u093d\u093f\u0946\u094f\u0956\u0960"+
		"\u0965\u0969\u0977\u0979\u0981\u0983\u0987\u098f\u0998\u099e\u09a6\u09ab"+
		"\u09b7\u09bc\u09bf\u09c5\u09c9\u09ce\u09d3\u09d8\u09de\u09f3\u09f5\u09fe"+
		"\u0a02\u0a0b\u0a0f\u0a21\u0a24\u0a2c\u0a35\u0a4c\u0a57\u0a5e\u0a61\u0a6a"+
		"\u0a6e\u0a7a\u0a93\u0a9a\u0a9d\u0aac\u0ab0\u0aba\u0abc\u0ac9\u0acb\u0ad8"+
		"\u0adc\u0ae3\u0ae8\u0af0\u0af4\u0af9\u0b0a\u0b0e\u0b17\u0b1b\u0b1d\u0b24"+
		"\u0b2b\u0b2e\u0b31\u0b38\u0b3e\u0b42\u0b45\u0b4c\u0b54\u0b57\u0b64\u0b78"+
		"\u0b82\u0b85\u0b8e\u0b91\u0b93\u0b96\u0b99\u0bab\u0bb4\u0bbb\u0bc2\u0bc9"+
		"\u0bd3\u0bd6\u0bdb\u0be3\u0be9\u0bee\u0bf3\u0bf7\u0bfb\u0bff\u0c03\u0c07"+
		"\u0c0b\u0c0f\u0c12\u0c1b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}