package com.tongwei.bigdata.spark;

import antlr4.org.apache.spark.sql.catalyst.parser.SqlBaseBaseVisitor;
import antlr4.org.apache.spark.sql.catalyst.parser.SqlBaseParser;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 2021/8/11.
 *
 * @author 黑皮大野猪
 */
public class SparkSqlVisitor extends SqlBaseBaseVisitor<String> {

    SortedMap<Integer, Substitute> sortedMap = new TreeMap<>();

    @Override
    public String visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        return super.visitSingleStatement(ctx);
    }

    @Override
    public String visitSingleExpression(SqlBaseParser.SingleExpressionContext ctx) {
        return super.visitSingleExpression(ctx);
    }

    @Override
    public String visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx) {
        return super.visitSingleTableIdentifier(ctx);
    }

    @Override
    public String visitSingleMultipartIdentifier(SqlBaseParser.SingleMultipartIdentifierContext ctx) {
        return super.visitSingleMultipartIdentifier(ctx);
    }

    @Override
    public String visitSingleFunctionIdentifier(SqlBaseParser.SingleFunctionIdentifierContext ctx) {
        return super.visitSingleFunctionIdentifier(ctx);
    }

    @Override
    public String visitSingleDataType(SqlBaseParser.SingleDataTypeContext ctx) {
        return super.visitSingleDataType(ctx);
    }

    @Override
    public String visitSingleTableSchema(SqlBaseParser.SingleTableSchemaContext ctx) {
        return super.visitSingleTableSchema(ctx);
    }

    @Override
    public String visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        return super.visitStatementDefault(ctx);
    }

    @Override
    public String visitDmlStatement(SqlBaseParser.DmlStatementContext ctx) {
        return super.visitDmlStatement(ctx);
    }

    @Override
    public String visitUse(SqlBaseParser.UseContext ctx) {
        return super.visitUse(ctx);
    }

    @Override
    public String visitCreateNamespace(SqlBaseParser.CreateNamespaceContext ctx) {
        return super.visitCreateNamespace(ctx);
    }

    @Override
    public String visitSetNamespaceProperties(SqlBaseParser.SetNamespacePropertiesContext ctx) {
        return super.visitSetNamespaceProperties(ctx);
    }

    @Override
    public String visitSetNamespaceLocation(SqlBaseParser.SetNamespaceLocationContext ctx) {
        return super.visitSetNamespaceLocation(ctx);
    }

    @Override
    public String visitDropNamespace(SqlBaseParser.DropNamespaceContext ctx) {
        return super.visitDropNamespace(ctx);
    }

    @Override
    public String visitShowNamespaces(SqlBaseParser.ShowNamespacesContext ctx) {
        return super.visitShowNamespaces(ctx);
    }

    @Override
    public String visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        return super.visitCreateTable(ctx);
    }

    @Override
    public String visitCreateTableLike(SqlBaseParser.CreateTableLikeContext ctx) {
        return super.visitCreateTableLike(ctx);
    }

    @Override
    public String visitReplaceTable(SqlBaseParser.ReplaceTableContext ctx) {
        return super.visitReplaceTable(ctx);
    }

    @Override
    public String visitAnalyze(SqlBaseParser.AnalyzeContext ctx) {
        return super.visitAnalyze(ctx);
    }

    @Override
    public String visitAddTableColumns(SqlBaseParser.AddTableColumnsContext ctx) {
        return super.visitAddTableColumns(ctx);
    }

    @Override
    public String visitRenameTableColumn(SqlBaseParser.RenameTableColumnContext ctx) {
        return super.visitRenameTableColumn(ctx);
    }

    @Override
    public String visitDropTableColumns(SqlBaseParser.DropTableColumnsContext ctx) {
        return super.visitDropTableColumns(ctx);
    }

    @Override
    public String visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        return super.visitRenameTable(ctx);
    }

    @Override
    public String visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx) {
        return super.visitSetTableProperties(ctx);
    }

    @Override
    public String visitUnsetTableProperties(SqlBaseParser.UnsetTablePropertiesContext ctx) {
        return super.visitUnsetTableProperties(ctx);
    }

    @Override
    public String visitAlterTableAlterColumn(SqlBaseParser.AlterTableAlterColumnContext ctx) {
        return super.visitAlterTableAlterColumn(ctx);
    }

    @Override
    public String visitHiveChangeColumn(SqlBaseParser.HiveChangeColumnContext ctx) {
        return super.visitHiveChangeColumn(ctx);
    }

    @Override
    public String visitHiveReplaceColumns(SqlBaseParser.HiveReplaceColumnsContext ctx) {
        return super.visitHiveReplaceColumns(ctx);
    }

    @Override
    public String visitSetTableSerDe(SqlBaseParser.SetTableSerDeContext ctx) {
        return super.visitSetTableSerDe(ctx);
    }

    @Override
    public String visitAddTablePartition(SqlBaseParser.AddTablePartitionContext ctx) {
        return super.visitAddTablePartition(ctx);
    }

    @Override
    public String visitRenameTablePartition(SqlBaseParser.RenameTablePartitionContext ctx) {
        return super.visitRenameTablePartition(ctx);
    }

    @Override
    public String visitDropTablePartitions(SqlBaseParser.DropTablePartitionsContext ctx) {
        return super.visitDropTablePartitions(ctx);
    }

    @Override
    public String visitSetTableLocation(SqlBaseParser.SetTableLocationContext ctx) {
        return super.visitSetTableLocation(ctx);
    }

    @Override
    public String visitRecoverPartitions(SqlBaseParser.RecoverPartitionsContext ctx) {
        return super.visitRecoverPartitions(ctx);
    }

    @Override
    public String visitMergeSmallFiles(SqlBaseParser.MergeSmallFilesContext ctx) {
        return super.visitMergeSmallFiles(ctx);
    }

    @Override
    public String visitDropTable(SqlBaseParser.DropTableContext ctx) {
        return super.visitDropTable(ctx);
    }

    @Override
    public String visitDropView(SqlBaseParser.DropViewContext ctx) {
        return super.visitDropView(ctx);
    }

    @Override
    public String visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        return super.visitCreateView(ctx);
    }

    @Override
    public String visitCreateTempViewUsing(SqlBaseParser.CreateTempViewUsingContext ctx) {
        return super.visitCreateTempViewUsing(ctx);
    }

    @Override
    public String visitAlterViewQuery(SqlBaseParser.AlterViewQueryContext ctx) {
        return super.visitAlterViewQuery(ctx);
    }

    @Override
    public String visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx) {
        return super.visitCreateFunction(ctx);
    }

    @Override
    public String visitDropFunction(SqlBaseParser.DropFunctionContext ctx) {
        return super.visitDropFunction(ctx);
    }

    @Override
    public String visitExplain(SqlBaseParser.ExplainContext ctx) {
        return super.visitExplain(ctx);
    }

    @Override
    public String visitShowTables(SqlBaseParser.ShowTablesContext ctx) {
        return super.visitShowTables(ctx);
    }

    @Override
    public String visitShowTable(SqlBaseParser.ShowTableContext ctx) {
        return super.visitShowTable(ctx);
    }

    @Override
    public String visitShowTblProperties(SqlBaseParser.ShowTblPropertiesContext ctx) {
        return super.visitShowTblProperties(ctx);
    }

    @Override
    public String visitShowColumns(SqlBaseParser.ShowColumnsContext ctx) {
        return super.visitShowColumns(ctx);
    }

    @Override
    public String visitShowViews(SqlBaseParser.ShowViewsContext ctx) {
        return super.visitShowViews(ctx);
    }

    @Override
    public String visitShowPartitions(SqlBaseParser.ShowPartitionsContext ctx) {
        return super.visitShowPartitions(ctx);
    }

    @Override
    public String visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx) {
        return super.visitShowFunctions(ctx);
    }

    @Override
    public String visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx) {
        return super.visitShowCreateTable(ctx);
    }

    @Override
    public String visitShowCurrentNamespace(SqlBaseParser.ShowCurrentNamespaceContext ctx) {
        return super.visitShowCurrentNamespace(ctx);
    }

    @Override
    public String visitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx) {
        return super.visitDescribeFunction(ctx);
    }

    @Override
    public String visitDescribeNamespace(SqlBaseParser.DescribeNamespaceContext ctx) {
        return super.visitDescribeNamespace(ctx);
    }

    @Override
    public String visitDescribeRelation(SqlBaseParser.DescribeRelationContext ctx) {
        return super.visitDescribeRelation(ctx);
    }

    @Override
    public String visitDescribeQuery(SqlBaseParser.DescribeQueryContext ctx) {
        return super.visitDescribeQuery(ctx);
    }

    @Override
    public String visitCommentNamespace(SqlBaseParser.CommentNamespaceContext ctx) {
        return super.visitCommentNamespace(ctx);
    }

    @Override
    public String visitCommentTable(SqlBaseParser.CommentTableContext ctx) {
        return super.visitCommentTable(ctx);
    }

    @Override
    public String visitRefreshTable(SqlBaseParser.RefreshTableContext ctx) {
        return super.visitRefreshTable(ctx);
    }

    @Override
    public String visitRefreshFunction(SqlBaseParser.RefreshFunctionContext ctx) {
        return super.visitRefreshFunction(ctx);
    }

    @Override
    public String visitRefreshResource(SqlBaseParser.RefreshResourceContext ctx) {
        return super.visitRefreshResource(ctx);
    }

    @Override
    public String visitCacheTable(SqlBaseParser.CacheTableContext ctx) {
        return super.visitCacheTable(ctx);
    }

    @Override
    public String visitUncacheTable(SqlBaseParser.UncacheTableContext ctx) {
        return super.visitUncacheTable(ctx);
    }

    @Override
    public String visitClearCache(SqlBaseParser.ClearCacheContext ctx) {
        return super.visitClearCache(ctx);
    }

    @Override
    public String visitLoadData(SqlBaseParser.LoadDataContext ctx) {
        return super.visitLoadData(ctx);
    }

    @Override
    public String visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        return super.visitTruncateTable(ctx);
    }

    @Override
    public String visitRepairTable(SqlBaseParser.RepairTableContext ctx) {
        return super.visitRepairTable(ctx);
    }

    @Override
    public String visitManageResource(SqlBaseParser.ManageResourceContext ctx) {
        return super.visitManageResource(ctx);
    }

    @Override
    public String visitFailNativeCommand(SqlBaseParser.FailNativeCommandContext ctx) {
        return super.visitFailNativeCommand(ctx);
    }

    @Override
    public String visitSetTimeZone(SqlBaseParser.SetTimeZoneContext ctx) {
        return super.visitSetTimeZone(ctx);
    }

    @Override
    public String visitSetQuotedConfiguration(SqlBaseParser.SetQuotedConfigurationContext ctx) {
        return super.visitSetQuotedConfiguration(ctx);
    }

    @Override
    public String visitSetConfiguration(SqlBaseParser.SetConfigurationContext ctx) {
        return super.visitSetConfiguration(ctx);
    }

    @Override
    public String visitResetQuotedConfiguration(SqlBaseParser.ResetQuotedConfigurationContext ctx) {
        return super.visitResetQuotedConfiguration(ctx);
    }

    @Override
    public String visitResetConfiguration(SqlBaseParser.ResetConfigurationContext ctx) {
        return super.visitResetConfiguration(ctx);
    }

    @Override
    public String visitConfigKey(SqlBaseParser.ConfigKeyContext ctx) {
        return super.visitConfigKey(ctx);
    }

    @Override
    public String visitConfigValue(SqlBaseParser.ConfigValueContext ctx) {
        return super.visitConfigValue(ctx);
    }

    @Override
    public String visitUnsupportedHiveNativeCommands(SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx) {
        return super.visitUnsupportedHiveNativeCommands(ctx);
    }

    @Override
    public String visitCreateTableHeader(SqlBaseParser.CreateTableHeaderContext ctx) {
        return super.visitCreateTableHeader(ctx);
    }

    @Override
    public String visitReplaceTableHeader(SqlBaseParser.ReplaceTableHeaderContext ctx) {
        return super.visitReplaceTableHeader(ctx);
    }

    @Override
    public String visitBucketSpec(SqlBaseParser.BucketSpecContext ctx) {
        return super.visitBucketSpec(ctx);
    }

    @Override
    public String visitSkewSpec(SqlBaseParser.SkewSpecContext ctx) {
        return super.visitSkewSpec(ctx);
    }

    @Override
    public String visitLocationSpec(SqlBaseParser.LocationSpecContext ctx) {
        return super.visitLocationSpec(ctx);
    }

    @Override
    public String visitDefaultSpec(SqlBaseParser.DefaultSpecContext ctx) {
        return super.visitDefaultSpec(ctx);
    }

    @Override
    public String visitCommentSpec(SqlBaseParser.CommentSpecContext ctx) {
        return super.visitCommentSpec(ctx);
    }

    @Override
    public String visitLifecycleSpec(SqlBaseParser.LifecycleSpecContext ctx) {
        return super.visitLifecycleSpec(ctx);
    }

    @Override
    public String visitQuery(SqlBaseParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }

    @Override
    public String visitInsertOverwriteTable(SqlBaseParser.InsertOverwriteTableContext ctx) {
        return super.visitInsertOverwriteTable(ctx);
    }

    @Override
    public String visitInsertIntoTable(SqlBaseParser.InsertIntoTableContext ctx) {
        return super.visitInsertIntoTable(ctx);
    }

    @Override
    public String visitInsertOverwriteHiveDir(SqlBaseParser.InsertOverwriteHiveDirContext ctx) {
        return super.visitInsertOverwriteHiveDir(ctx);
    }

    @Override
    public String visitInsertOverwriteDir(SqlBaseParser.InsertOverwriteDirContext ctx) {
        return super.visitInsertOverwriteDir(ctx);
    }

    @Override
    public String visitPartitionSpecLocation(SqlBaseParser.PartitionSpecLocationContext ctx) {
        return super.visitPartitionSpecLocation(ctx);
    }

    @Override
    public String visitPartitionSpec(SqlBaseParser.PartitionSpecContext ctx) {
        return super.visitPartitionSpec(ctx);
    }

    @Override
    public String visitPartitionVal(SqlBaseParser.PartitionValContext ctx) {
        return super.visitPartitionVal(ctx);
    }

    @Override
    public String visitNamespace(SqlBaseParser.NamespaceContext ctx) {
        return super.visitNamespace(ctx);
    }

    @Override
    public String visitDescribeFuncName(SqlBaseParser.DescribeFuncNameContext ctx) {
        return super.visitDescribeFuncName(ctx);
    }

    @Override
    public String visitDescribeColName(SqlBaseParser.DescribeColNameContext ctx) {
        return super.visitDescribeColName(ctx);
    }

    @Override
    public String visitCtes(SqlBaseParser.CtesContext ctx) {
        return super.visitCtes(ctx);
    }

    @Override
    public String visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        return super.visitNamedQuery(ctx);
    }

    @Override
    public String visitTableProvider(SqlBaseParser.TableProviderContext ctx) {
        return super.visitTableProvider(ctx);
    }

    @Override
    public String visitCreateTableClauses(SqlBaseParser.CreateTableClausesContext ctx) {
        return super.visitCreateTableClauses(ctx);
    }

    @Override
    public String visitTablePropertyList(SqlBaseParser.TablePropertyListContext ctx) {
        return super.visitTablePropertyList(ctx);
    }

    @Override
    public String visitTableProperty(SqlBaseParser.TablePropertyContext ctx) {
        return super.visitTableProperty(ctx);
    }

    @Override
    public String visitTablePropertyKey(SqlBaseParser.TablePropertyKeyContext ctx) {
        return super.visitTablePropertyKey(ctx);
    }

    @Override
    public String visitTablePropertyValue(SqlBaseParser.TablePropertyValueContext ctx) {
        return super.visitTablePropertyValue(ctx);
    }

    @Override
    public String visitConstantList(SqlBaseParser.ConstantListContext ctx) {
        return super.visitConstantList(ctx);
    }

    @Override
    public String visitNestedConstantList(SqlBaseParser.NestedConstantListContext ctx) {
        return super.visitNestedConstantList(ctx);
    }

    @Override
    public String visitCreateFileFormat(SqlBaseParser.CreateFileFormatContext ctx) {
        return super.visitCreateFileFormat(ctx);
    }

    @Override
    public String visitTableFileFormat(SqlBaseParser.TableFileFormatContext ctx) {
        return super.visitTableFileFormat(ctx);
    }

    @Override
    public String visitGenericFileFormat(SqlBaseParser.GenericFileFormatContext ctx) {
        return super.visitGenericFileFormat(ctx);
    }

    @Override
    public String visitStorageHandler(SqlBaseParser.StorageHandlerContext ctx) {
        return super.visitStorageHandler(ctx);
    }

    @Override
    public String visitResource(SqlBaseParser.ResourceContext ctx) {
        return super.visitResource(ctx);
    }

    @Override
    public String visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx) {
        return super.visitSingleInsertQuery(ctx);
    }

    @Override
    public String visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx) {
        return super.visitMultiInsertQuery(ctx);
    }

    @Override
    public String visitDeleteFromTable(SqlBaseParser.DeleteFromTableContext ctx) {
        return super.visitDeleteFromTable(ctx);
    }

    @Override
    public String visitUpdateTable(SqlBaseParser.UpdateTableContext ctx) {
        return super.visitUpdateTable(ctx);
    }

    @Override
    public String visitMergeIntoTable(SqlBaseParser.MergeIntoTableContext ctx) {
        return super.visitMergeIntoTable(ctx);
    }

    @Override
    public String visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        return super.visitQueryOrganization(ctx);
    }

    @Override
    public String visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx) {
        return super.visitMultiInsertQueryBody(ctx);
    }

    @Override
    public String visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        return super.visitQueryTermDefault(ctx);
    }

    @Override
    public String visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        return super.visitSetOperation(ctx);
    }

    @Override
    public String visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        return super.visitQueryPrimaryDefault(ctx);
    }

    @Override
    public String visitFromStmt(SqlBaseParser.FromStmtContext ctx) {
        return super.visitFromStmt(ctx);
    }

    @Override
    public String visitTable(SqlBaseParser.TableContext ctx) {
        return super.visitTable(ctx);
    }

    @Override
    public String visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx) {
        return super.visitInlineTableDefault1(ctx);
    }

    @Override
    public String visitSubquery(SqlBaseParser.SubqueryContext ctx) {
        return super.visitSubquery(ctx);
    }

    @Override
    public String visitSortItem(SqlBaseParser.SortItemContext ctx) {
        return super.visitSortItem(ctx);
    }

    @Override
    public String visitFromStatement(SqlBaseParser.FromStatementContext ctx) {
        return super.visitFromStatement(ctx);
    }

    @Override
    public String visitFromStatementBody(SqlBaseParser.FromStatementBodyContext ctx) {
        return super.visitFromStatementBody(ctx);
    }

    @Override
    public String visitTransformQuerySpecification(SqlBaseParser.TransformQuerySpecificationContext ctx) {
        return super.visitTransformQuerySpecification(ctx);
    }

    @Override
    public String visitRegularQuerySpecification(SqlBaseParser.RegularQuerySpecificationContext ctx) {
        return super.visitRegularQuerySpecification(ctx);
    }

    @Override
    public String visitTransformClause(SqlBaseParser.TransformClauseContext ctx) {
        return super.visitTransformClause(ctx);
    }

    @Override
    public String visitSelectClause(SqlBaseParser.SelectClauseContext ctx) {
        return super.visitSelectClause(ctx);
    }

    @Override
    public String visitSetClause(SqlBaseParser.SetClauseContext ctx) {
        return super.visitSetClause(ctx);
    }

    @Override
    public String visitMatchedClause(SqlBaseParser.MatchedClauseContext ctx) {
        return super.visitMatchedClause(ctx);
    }

    @Override
    public String visitNotMatchedClause(SqlBaseParser.NotMatchedClauseContext ctx) {
        return super.visitNotMatchedClause(ctx);
    }

    @Override
    public String visitMatchedAction(SqlBaseParser.MatchedActionContext ctx) {
        return super.visitMatchedAction(ctx);
    }

    @Override
    public String visitNotMatchedAction(SqlBaseParser.NotMatchedActionContext ctx) {
        return super.visitNotMatchedAction(ctx);
    }

    @Override
    public String visitAssignmentList(SqlBaseParser.AssignmentListContext ctx) {
        return super.visitAssignmentList(ctx);
    }

    @Override
    public String visitAssignment(SqlBaseParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public String visitWhereClause(SqlBaseParser.WhereClauseContext ctx) {
        return super.visitWhereClause(ctx);
    }

    @Override
    public String visitHavingClause(SqlBaseParser.HavingClauseContext ctx) {
        return super.visitHavingClause(ctx);
    }

    @Override
    public String visitHint(SqlBaseParser.HintContext ctx) {
        return super.visitHint(ctx);
    }

    @Override
    public String visitHintStatement(SqlBaseParser.HintStatementContext ctx) {
        return super.visitHintStatement(ctx);
    }

    @Override
    public String visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        return super.visitFromClause(ctx);
    }

    @Override
    public String visitAggregationClause(SqlBaseParser.AggregationClauseContext ctx) {
        return super.visitAggregationClause(ctx);
    }

    @Override
    public String visitGroupByClause(SqlBaseParser.GroupByClauseContext ctx) {
        return super.visitGroupByClause(ctx);
    }

    @Override
    public String visitGroupingAnalytics(SqlBaseParser.GroupingAnalyticsContext ctx) {
        return super.visitGroupingAnalytics(ctx);
    }

    @Override
    public String visitGroupingElement(SqlBaseParser.GroupingElementContext ctx) {
        return super.visitGroupingElement(ctx);
    }

    @Override
    public String visitGroupingSet(SqlBaseParser.GroupingSetContext ctx) {
        return super.visitGroupingSet(ctx);
    }

    @Override
    public String visitPivotClause(SqlBaseParser.PivotClauseContext ctx) {

        return super.visitPivotClause(ctx);
    }

    @Override
    public String visitPivotColumn(SqlBaseParser.PivotColumnContext ctx) {
        return super.visitPivotColumn(ctx);
    }

    @Override
    public String visitPivotValue(SqlBaseParser.PivotValueContext ctx) {
        return super.visitPivotValue(ctx);
    }

    @Override
    public String visitLateralView(SqlBaseParser.LateralViewContext ctx) {
        return super.visitLateralView(ctx);
    }

    @Override
    public String visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx) {
        return super.visitSetQuantifier(ctx);
    }

    @Override
    public String visitRelation(SqlBaseParser.RelationContext ctx) {
        return super.visitRelation(ctx);
    }

    @Override
    public String visitJoinRelation(SqlBaseParser.JoinRelationContext ctx) {
        return super.visitJoinRelation(ctx);
    }

    @Override
    public String visitJoinType(SqlBaseParser.JoinTypeContext ctx) {
        return super.visitJoinType(ctx);
    }

    @Override
    public String visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx) {
        return super.visitJoinCriteria(ctx);
    }

    @Override
    public String visitSample(SqlBaseParser.SampleContext ctx) {
        return super.visitSample(ctx);
    }

    @Override
    public String visitSampleByPercentile(SqlBaseParser.SampleByPercentileContext ctx) {
        return super.visitSampleByPercentile(ctx);
    }

    @Override
    public String visitSampleByRows(SqlBaseParser.SampleByRowsContext ctx) {
        return super.visitSampleByRows(ctx);
    }

    @Override
    public String visitSampleByBucket(SqlBaseParser.SampleByBucketContext ctx) {
        return super.visitSampleByBucket(ctx);
    }

    @Override
    public String visitSampleByBytes(SqlBaseParser.SampleByBytesContext ctx) {
        return super.visitSampleByBytes(ctx);
    }

    @Override
    public String visitIdentifierList(SqlBaseParser.IdentifierListContext ctx) {
        return super.visitIdentifierList(ctx);
    }

    @Override
    public String visitIdentifierSeq(SqlBaseParser.IdentifierSeqContext ctx) {
        return super.visitIdentifierSeq(ctx);
    }

    @Override
    public String visitOrderedIdentifierList(SqlBaseParser.OrderedIdentifierListContext ctx) {
        return super.visitOrderedIdentifierList(ctx);
    }

    @Override
    public String visitOrderedIdentifier(SqlBaseParser.OrderedIdentifierContext ctx) {
        return super.visitOrderedIdentifier(ctx);
    }

    @Override
    public String visitIdentifierCommentList(SqlBaseParser.IdentifierCommentListContext ctx) {
        return super.visitIdentifierCommentList(ctx);
    }

    @Override
    public String visitIdentifierComment(SqlBaseParser.IdentifierCommentContext ctx) {
        return super.visitIdentifierComment(ctx);
    }

    @Override
    public String visitTableName(SqlBaseParser.TableNameContext ctx) {
        return super.visitTableName(ctx);
    }

    @Override
    public String visitAliasedQuery(SqlBaseParser.AliasedQueryContext ctx) {
        return super.visitAliasedQuery(ctx);
    }

    @Override
    public String visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx) {
        return super.visitAliasedRelation(ctx);
    }

    @Override
    public String visitInlineTableDefault2(SqlBaseParser.InlineTableDefault2Context ctx) {
        return super.visitInlineTableDefault2(ctx);
    }

    @Override
    public String visitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx) {
        return super.visitTableValuedFunction(ctx);
    }

    @Override
    public String visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        return super.visitInlineTable(ctx);
    }

    @Override
    public String visitFunctionTable(SqlBaseParser.FunctionTableContext ctx) {
        return super.visitFunctionTable(ctx);
    }

    @Override
    public String visitTableAlias(SqlBaseParser.TableAliasContext ctx) {
        return super.visitTableAlias(ctx);
    }

    @Override
    public String visitRowFormatSerde(SqlBaseParser.RowFormatSerdeContext ctx) {
        return super.visitRowFormatSerde(ctx);
    }

    @Override
    public String visitRowFormatDelimited(SqlBaseParser.RowFormatDelimitedContext ctx) {
        return super.visitRowFormatDelimited(ctx);
    }

    @Override
    public String visitMultipartIdentifierList(SqlBaseParser.MultipartIdentifierListContext ctx) {
        return super.visitMultipartIdentifierList(ctx);
    }

    @Override
    public String visitMultipartIdentifier(SqlBaseParser.MultipartIdentifierContext ctx) {
        return super.visitMultipartIdentifier(ctx);
    }

    @Override
    public String visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
        return super.visitTableIdentifier(ctx);
    }

    @Override
    public String visitFunctionIdentifier(SqlBaseParser.FunctionIdentifierContext ctx) {
        return super.visitFunctionIdentifier(ctx);
    }

    @Override
    public String visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        return super.visitNamedExpression(ctx);
    }

    @Override
    public String visitNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx) {
        return super.visitNamedExpressionSeq(ctx);
    }

    @Override
    public String visitPartitionFieldList(SqlBaseParser.PartitionFieldListContext ctx) {
        return super.visitPartitionFieldList(ctx);
    }

    @Override
    public String visitPartitionTransform(SqlBaseParser.PartitionTransformContext ctx) {
        return super.visitPartitionTransform(ctx);
    }

    @Override
    public String visitPartitionColumn(SqlBaseParser.PartitionColumnContext ctx) {
        return super.visitPartitionColumn(ctx);
    }

    @Override
    public String visitIdentityTransform(SqlBaseParser.IdentityTransformContext ctx) {
        return super.visitIdentityTransform(ctx);
    }

    @Override
    public String visitApplyTransform(SqlBaseParser.ApplyTransformContext ctx) {
        return super.visitApplyTransform(ctx);
    }

    @Override
    public String visitTransformArgument(SqlBaseParser.TransformArgumentContext ctx) {
        return super.visitTransformArgument(ctx);
    }

    @Override
    public String visitExpression(SqlBaseParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public String visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        return super.visitLogicalNot(ctx);
    }

    @Override
    public String visitPredicated(SqlBaseParser.PredicatedContext ctx) {
        return super.visitPredicated(ctx);
    }

    @Override
    public String visitExists(SqlBaseParser.ExistsContext ctx) {
        return super.visitExists(ctx);
    }

    @Override
    public String visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        return super.visitLogicalBinary(ctx);
    }

    @Override
    public String visitPredicate(SqlBaseParser.PredicateContext ctx) {
        return super.visitPredicate(ctx);
    }

    @Override
    public String visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx) {
        return super.visitValueExpressionDefault(ctx);
    }

    @Override
    public String visitComparison(SqlBaseParser.ComparisonContext ctx) {
        return super.visitComparison(ctx);
    }

    @Override
    public String visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        return super.visitArithmeticBinary(ctx);
    }

    @Override
    public String visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx) {
        return super.visitArithmeticUnary(ctx);
    }

    @Override
    public String visitStruct(SqlBaseParser.StructContext ctx) {
        return super.visitStruct(ctx);
    }

    @Override
    public String visitDereference(SqlBaseParser.DereferenceContext ctx) {
        return super.visitDereference(ctx);
    }

    @Override
    public String visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx) {
        return super.visitSimpleCase(ctx);
    }

    @Override
    public String visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        return super.visitColumnReference(ctx);
    }

    @Override
    public String visitRowConstructor(SqlBaseParser.RowConstructorContext ctx) {
        return super.visitRowConstructor(ctx);
    }

    @Override
    public String visitLast(SqlBaseParser.LastContext ctx) {
        return super.visitLast(ctx);
    }

    @Override
    public String visitStar(SqlBaseParser.StarContext ctx) {
        return super.visitStar(ctx);
    }

    @Override
    public String visitOverlay(SqlBaseParser.OverlayContext ctx) {
        return super.visitOverlay(ctx);
    }

    @Override
    public String visitSubscript(SqlBaseParser.SubscriptContext ctx) {
        return super.visitSubscript(ctx);
    }

    @Override
    public String visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx) {
        return super.visitSubqueryExpression(ctx);
    }

    @Override
    public String visitSubstring(SqlBaseParser.SubstringContext ctx) {
        return super.visitSubstring(ctx);
    }

    @Override
    public String visitCurrentDatetime(SqlBaseParser.CurrentDatetimeContext ctx) {
        return super.visitCurrentDatetime(ctx);
    }

    @Override
    public String visitCast(SqlBaseParser.CastContext ctx) {
        return super.visitCast(ctx);
    }

    @Override
    public String visitConstantDefault(SqlBaseParser.ConstantDefaultContext ctx) {
        return super.visitConstantDefault(ctx);
    }

    @Override
    public String visitLambda(SqlBaseParser.LambdaContext ctx) {
        return super.visitLambda(ctx);
    }

    @Override
    public String visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        return super.visitParenthesizedExpression(ctx);
    }

    @Override
    public String visitExtract(SqlBaseParser.ExtractContext ctx) {
        return super.visitExtract(ctx);
    }

    @Override
    public String visitTrim(SqlBaseParser.TrimContext ctx) {
        return super.visitTrim(ctx);
    }

    @Override
    public String visitFunctionCall(SqlBaseParser.FunctionCallContext ctx) {
        String functionName = ctx.functionName().getText();
        int start = ctx.getStart().getStartIndex();
        int end = ctx.getStart().getStopIndex();
        if (functionName.equalsIgnoreCase("rand")){
            sortedMap.put(start,
                    new Substitute(functionName, "rand_new", start, end));
        }
        return super.visitFunctionCall(ctx);

    }

    @Override
    public String visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx) {
        return super.visitSearchedCase(ctx);
    }

    @Override
    public String visitPosition(SqlBaseParser.PositionContext ctx) {
        return super.visitPosition(ctx);
    }

    @Override
    public String visitFirst(SqlBaseParser.FirstContext ctx) {
        return super.visitFirst(ctx);
    }

    @Override
    public String visitNullLiteral(SqlBaseParser.NullLiteralContext ctx) {
        return super.visitNullLiteral(ctx);
    }

    @Override
    public String visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx) {
        return super.visitIntervalLiteral(ctx);
    }

    @Override
    public String visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx) {
        return super.visitTypeConstructor(ctx);
    }

    @Override
    public String visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx) {
        return super.visitNumericLiteral(ctx);
    }

    @Override
    public String visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
        return super.visitBooleanLiteral(ctx);
    }

    @Override
    public String visitStringLiteral(SqlBaseParser.StringLiteralContext ctx) {
        return super.visitStringLiteral(ctx);
    }

    @Override
    public String visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        return super.visitComparisonOperator(ctx);
    }

    @Override
    public String visitArithmeticOperator(SqlBaseParser.ArithmeticOperatorContext ctx) {
        return super.visitArithmeticOperator(ctx);
    }

    @Override
    public String visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx) {
        return super.visitPredicateOperator(ctx);
    }

    @Override
    public String visitBooleanValue(SqlBaseParser.BooleanValueContext ctx) {
        return super.visitBooleanValue(ctx);
    }

    @Override
    public String visitInterval(SqlBaseParser.IntervalContext ctx) {
        return super.visitInterval(ctx);
    }

    @Override
    public String visitErrorCapturingMultiUnitsInterval(SqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx) {
        return super.visitErrorCapturingMultiUnitsInterval(ctx);
    }

    @Override
    public String visitMultiUnitsInterval(SqlBaseParser.MultiUnitsIntervalContext ctx) {
        return super.visitMultiUnitsInterval(ctx);
    }

    @Override
    public String visitErrorCapturingUnitToUnitInterval(SqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx) {
        return super.visitErrorCapturingUnitToUnitInterval(ctx);
    }

    @Override
    public String visitUnitToUnitInterval(SqlBaseParser.UnitToUnitIntervalContext ctx) {
        return super.visitUnitToUnitInterval(ctx);
    }

    @Override
    public String visitIntervalValue(SqlBaseParser.IntervalValueContext ctx) {
        return super.visitIntervalValue(ctx);
    }

    @Override
    public String visitColPosition(SqlBaseParser.ColPositionContext ctx) {
        return super.visitColPosition(ctx);
    }

    @Override
    public String visitComplexDataType(SqlBaseParser.ComplexDataTypeContext ctx) {
        return super.visitComplexDataType(ctx);
    }

    @Override
    public String visitPrimitiveDataType(SqlBaseParser.PrimitiveDataTypeContext ctx) {
        return super.visitPrimitiveDataType(ctx);
    }

    @Override
    public String visitQualifiedColTypeWithPositionList(SqlBaseParser.QualifiedColTypeWithPositionListContext ctx) {
        return super.visitQualifiedColTypeWithPositionList(ctx);
    }

    @Override
    public String visitQualifiedColTypeWithPosition(SqlBaseParser.QualifiedColTypeWithPositionContext ctx) {
        return super.visitQualifiedColTypeWithPosition(ctx);
    }

    @Override
    public String visitColTypeList(SqlBaseParser.ColTypeListContext ctx) {
        return super.visitColTypeList(ctx);
    }

    @Override
    public String visitColType(SqlBaseParser.ColTypeContext ctx) {
        return super.visitColType(ctx);
    }

    @Override
    public String visitComplexColTypeList(SqlBaseParser.ComplexColTypeListContext ctx) {
        return super.visitComplexColTypeList(ctx);
    }

    @Override
    public String visitComplexColType(SqlBaseParser.ComplexColTypeContext ctx) {
        return super.visitComplexColType(ctx);
    }

    @Override
    public String visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        return super.visitWhenClause(ctx);
    }

    @Override
    public String visitWindowClause(SqlBaseParser.WindowClauseContext ctx) {
        return super.visitWindowClause(ctx);
    }

    @Override
    public String visitNamedWindow(SqlBaseParser.NamedWindowContext ctx) {
        return super.visitNamedWindow(ctx);
    }

    @Override
    public String visitWindowRef(SqlBaseParser.WindowRefContext ctx) {
        return super.visitWindowRef(ctx);
    }

    @Override
    public String visitWindowDef(SqlBaseParser.WindowDefContext ctx) {
        return super.visitWindowDef(ctx);
    }

    @Override
    public String visitWindowFrame(SqlBaseParser.WindowFrameContext ctx) {
        return super.visitWindowFrame(ctx);
    }
    @Override
    public String visitFrameBound(SqlBaseParser.FrameBoundContext ctx) {
        return super.visitFrameBound(ctx);
    }

    @Override
    public String visitQualifiedNameList(SqlBaseParser.QualifiedNameListContext ctx) {
        return super.visitQualifiedNameList(ctx);
    }

    @Override
    public String visitFunctionName(SqlBaseParser.FunctionNameContext ctx) {
        return super.visitFunctionName(ctx);
    }

    @Override
    public String visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx) {
        return super.visitQualifiedName(ctx);
    }

    @Override
    public String visitErrorCapturingIdentifier(SqlBaseParser.ErrorCapturingIdentifierContext ctx) {
        return super.visitErrorCapturingIdentifier(ctx);
    }

    @Override
    public String visitErrorIdent(SqlBaseParser.ErrorIdentContext ctx) {
        return super.visitErrorIdent(ctx);
    }

    @Override
    public String visitRealIdent(SqlBaseParser.RealIdentContext ctx) {
        return super.visitRealIdent(ctx);
    }

    @Override
    public String visitIdentifier(SqlBaseParser.IdentifierContext ctx) {
        return super.visitIdentifier(ctx);
    }

    @Override
    public String visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        return super.visitUnquotedIdentifier(ctx);
    }

    @Override
    public String visitQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx) {
        return super.visitQuotedIdentifierAlternative(ctx);
    }

    @Override
    public String visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        return super.visitQuotedIdentifier(ctx);
    }

    @Override
    public String visitExponentLiteral(SqlBaseParser.ExponentLiteralContext ctx) {
        return super.visitExponentLiteral(ctx);
    }

    @Override
    public String visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx) {
        return super.visitDecimalLiteral(ctx);
    }

    @Override
    public String visitLegacyDecimalLiteral(SqlBaseParser.LegacyDecimalLiteralContext ctx) {
        return super.visitLegacyDecimalLiteral(ctx);
    }

    @Override
    public String visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public String visitBigIntLiteral(SqlBaseParser.BigIntLiteralContext ctx) {
        return super.visitBigIntLiteral(ctx);
    }

    @Override
    public String visitSmallIntLiteral(SqlBaseParser.SmallIntLiteralContext ctx) {
        return super.visitSmallIntLiteral(ctx);
    }

    @Override
    public String visitTinyIntLiteral(SqlBaseParser.TinyIntLiteralContext ctx) {
        return super.visitTinyIntLiteral(ctx);
    }

    @Override
    public String visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx) {
        return super.visitDoubleLiteral(ctx);
    }

    @Override
    public String visitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx) {
        return super.visitFloatLiteral(ctx);
    }

    @Override
    public String visitBigDecimalLiteral(SqlBaseParser.BigDecimalLiteralContext ctx) {
        return super.visitBigDecimalLiteral(ctx);
    }

    @Override
    public String visitAlterColumnAction(SqlBaseParser.AlterColumnActionContext ctx) {
        return super.visitAlterColumnAction(ctx);
    }

    @Override
    public String visitAnsiNonReserved(SqlBaseParser.AnsiNonReservedContext ctx) {
        return super.visitAnsiNonReserved(ctx);
    }

    @Override
    public String visitStrictNonReserved(SqlBaseParser.StrictNonReservedContext ctx) {
        return super.visitStrictNonReserved(ctx);
    }

    @Override
    public String visitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        return super.visitNonReserved(ctx);
    }

    private static boolean isStartWithDigit (String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isDigit = pattern.matcher(str.charAt(0)+"");
        if (!isDigit.matches()) {
            return false;
        }
        return true;
    }

}
