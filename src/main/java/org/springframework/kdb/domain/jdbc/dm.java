package org.springframework.kdb.domain.jdbc;

import java.sql.*;

public class dm implements DatabaseMetaData {
    private co co;
    
    public dm(co x) {
        co = x;
    }
    
    public ResultSet getCatalogs() throws SQLException {
        return co.qx("([]TABLE_CAT:`symbol$())");
    }
    
    public ResultSet getSchemas() throws SQLException {
        return co.qx("([]TABLE_SCHEM:`symbol$())");
    }
    
    public ResultSet getTableTypes() throws SQLException {
        return co.qx("([]TABLE_TYPE:`TABLE`VIEW)");
    }
    
    public ResultSet getTables(String a, String b, String t, String x[]) throws SQLException {
        return co.qx(
                "raze{([]TABLE_CAT:`;TABLE_SCHEM:`;TABLE_NAME:system string`a`b x=`VIEW;TABLE_TYPE:x)}each", x);
    }
    
    public ResultSet getTypeInfo() throws SQLException {
        return co.qx(
                "`DATA_TYPE xasc([]TYPE_NAME:`boolean`byte`short`int`long`real`float`symbol`date`time`timestamp;DATA_TYPE:16 -2 5 4 -5 7 8 12 91 92 93;PRECISION:11;LITERAL_PREFIX:`;LITERAL_SUFFIX:`;CREATE_PARAMS:`;NULLABLE:1h;CASE_SENSITIVE:1b;SEARCHABLE:1h;UNSIGNED_ATTRIBUTE:0b;FIXED_PREC_SCALE:0b;AUTO_INCREMENT:0b;LOCAL_TYPE_NAME:`;MINIMUM_SCALE:0h;MAXIMUM_SCALE:0h;SQL_DATA_TYPE:0;SQL_DATETIME_SUB:0;NUM_PREC_RADIX:10)");
    }
    
    public ResultSet getColumns(String a, String b, String t, String c) throws SQLException {
        if (t.startsWith("%")) t = "";
        return co.qx(
                "select TABLE_CAT:`,TABLE_SCHEM:`,TABLE_NAME:n,COLUMN_NAME:c,DATA_TYPE:0,TYPE_NAME:t,COLUMN_SIZE:2000000000,BUFFER_LENGTH:0,DECIMAL_DIGITS:16,NUM_PREC_RADIX:10,NULLABLE:1,REMARKS:`,COLUMN_DEF:`,SQL_DATA_TYPE:0,SQL_DATETIME_SUB:0,CHAR_OCTET_LENGTH:2000000000,ORDINAL_POSITION:1+til count n,NULLABLE:`YES from .Q.nct`" + t);
    }
    
    public ResultSet getPrimaryKeys(String a, String b, String t) throws SQLException {
        jdbc.q("pk");
        return co.qx(
                "");
    } //"q)([]TABLE_CAT:'',TABLE_SCHEM:'',TABLE_NAME:'"+t+"',COLUMN_NAME:key "+t+",KEY_SEQ:1+asc count key "+t+",PK_NAME:'')");}
    
    public ResultSet getImportedKeys(String a, String b, String t) throws SQLException {
        jdbc.q("imp");
        return co.qx(
                "");
    } //"q)select PKTABLE_CAT:'',PKTABLE_SCHEM:'',PKTABLE_NAME:x,PKCOLUMN_NAME:first each key each x,FKTABLE_CAT:'',FKTABLE_SCHEM:'',FKTABLE_NAME:'"+t+"',FKCOLUMN_NAME:y,KEY_SEQ:1,UPDATE_RULE:1,DELETE_RULE:0,FK_NAME:'',PK_NAME:'',DEFERRABILITY:0 from('x','y')vars fkey "+t);}
    
    public ResultSet getProcedures(String a, String b, String p) throws SQLException {
        jdbc.q("pr");
        return co.qx(
                "");
    } // "q)([]PROCEDURE_CAT:'',PROCEDURE_SCHEM:'',PROCEDURE_NAME:varchar(),r0:0,r1:0,r2:0,REMARKS:'',PROCEDURE_TYPE:0)");}
    
    public ResultSet getExportedKeys(String a, String b, String t) throws SQLException {
        jdbc.q("exp");
        return null;
    }
    
    public ResultSet getCrossReference(String pa, String pb, String pt, String fa, String fb, String ft) throws SQLException {
        jdbc.q("cr");
        return null;
    }
    
    public ResultSet getIndexInfo(String a, String b, String t, boolean unique, boolean approximate) throws SQLException {
        jdbc.q("ii");
        return null;
    }
    
    public ResultSet getProcedureColumns(String a, String b, String p, String c) throws SQLException {
        jdbc.q("pc");
        return null;
    }
    
    // PROCEDURE_CAT PROCEDURE_SCHEM PROCEDURE_NAME ...
    public ResultSet getColumnPrivileges(String a, String b, String table, String columnNamePattern) throws SQLException {
        jdbc.q("cp");
        return null;
    }
    
    //select TABLE_CAT TABLE_SCHEM TABLE_NAME COLUMN_NAME GRANTOR GRANTEE PRIVILEGE IS_GRANTABLE ordered by COLUMN_NAME and PRIVILEGE.
    public ResultSet getTablePrivileges(String a, String b, String t) throws SQLException {
        jdbc.q("tp");
        return null;
    }
    
    //select TABLE_CAT TABLE_SCHEM TABLE_NAME GRANTOR GRANTEE PRIVILEGE IS_GRANTABLE ordered by TABLE_SCHEM,TABLE_NAME,and PRIVILEGE.
    public ResultSet getBestRowIdentifier(String a, String b, String t, int scope, boolean nullable) throws SQLException {
        jdbc.q("br");
        return null;
    }
    
    //select SCOPE COLUMN_NAME DATA_TYPE TYPE_NAME COLUMN_SIZE DECIMAL_DIGITS PSEUDO_COLUMN ordered by SCOPE
    public ResultSet getVersionColumns(String a, String b, String t) throws SQLException {
        jdbc.q("vc");
        return null;
    }
    
    //select SCOPE COLUMN_NAME DATA_TYPE TYPE_NAME COLUMN_SIZE DECIMAL_DIGITS PSEUDO_COLUMN ordered by SCOPE
    public boolean allProceduresAreCallable() throws SQLException {
        return true;
    }
    
    public boolean allTablesAreSelectable() throws SQLException {
        return true;
    }
    
    public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
        return false;
    }
    
    public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
        return false;
    }
    
    public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
        return true;
    }
    
    public String getSchemaTerm() throws SQLException {
        return "schema";
    }
    
    public String getProcedureTerm() throws SQLException {
        return "procedure";
    }
    
    public String getCatalogTerm() throws SQLException {
        return "catalog";
    }
    
    public String getCatalogSeparator() throws SQLException {
        return ".";
    }
    
    public int getMaxBinaryLiteralLength() throws SQLException {
        return 0;
    }
    
    public int getMaxCharLiteralLength() throws SQLException {
        return 0;
    }
    
    public int getMaxColumnNameLength() throws SQLException {
        return 0;
    }
    
    public int getMaxColumnsInGroupBy() throws SQLException {
        return 0;
    }
    
    public int getMaxColumnsInIndex() throws SQLException {
        return 0;
    }
    
    public int getMaxColumnsInOrderBy() throws SQLException {
        return 0;
    }
    
    public int getMaxColumnsInSelect() throws SQLException {
        return 0;
    }
    
    public int getMaxColumnsInTable() throws SQLException {
        return 0;
    }
    
    public int getMaxConnections() throws SQLException {
        return 0;
    }
    
    public int getMaxCursorNameLength() throws SQLException {
        return 0;
    }
    
    public int getMaxIndexLength() throws SQLException {
        return 0;
    }
    
    public int getMaxSchemaNameLength() throws SQLException {
        return 0;
    }
    
    public int getMaxProcedureNameLength() throws SQLException {
        return 0;
    }
    
    public int getMaxCatalogNameLength() throws SQLException {
        return 0;
    }
    
    public int getMaxRowSize() throws SQLException {
        return 0;
    }
    
    public int getMaxStatementLength() throws SQLException {
        return 0;
    }
    
    public int getMaxStatements() throws SQLException {
        return 0;
    }
    
    public int getMaxTableNameLength() throws SQLException {
        return 0;
    }
    
    public int getMaxTablesInSelect() throws SQLException {
        return 0;
    }
    
    public int getMaxUserNameLength() throws SQLException {
        return 0;
    }
    
    public int getDefaultTransactionIsolation() throws SQLException {
        return co.TRANSACTION_SERIALIZABLE;
    }
    
    public String getSQLKeywords() throws SQLException {
        return "show,meta,load,save";
    }
    
    public String getNumericFunctions() throws SQLException {
        return "";
    }
    
    public String getStringFunctions() throws SQLException {
        return "";
    }
    
    public String getSystemFunctions() throws SQLException {
        return "";
    }
    
    public String getTimeDateFunctions() throws SQLException {
        return "";
    }
    
    public String getSearchStringEscape() throws SQLException {
        return "";
    }
    
    public String getExtraNameCharacters() throws SQLException {
        return "";
    }
    
    public String getIdentifierQuoteString() throws SQLException {
        return "";
    }
    
    public String getURL() throws SQLException {
        return null;
    }
    
    public String getUserName() throws SQLException {
        return "";
    }
    
    public String getDatabaseProductName() throws SQLException {
        return "kdb";
    }
    
    public String getDatabaseProductVersion() throws SQLException {
        return "2.0";
    }
    
    public String getDriverName() throws SQLException {
        return "jdbc";
    }
    
    public String getDriverVersion() throws SQLException {
        return jdbc.V + "." + jdbc.v;
    }
    
    public int getDriverMajorVersion() {
        return jdbc.V;
    }
    
    public int getDriverMinorVersion() {
        return jdbc.v;
    }
    
    public boolean isCatalogAtStart() throws SQLException {
        return true;
    }
    
    public boolean isReadOnly() throws SQLException {
        return false;
    }
    
    public boolean nullsAreSortedHigh() throws SQLException {
        return false;
    }
    
    public boolean nullsAreSortedLow() throws SQLException {
        return true;
    }
    
    public boolean nullsAreSortedAtStart() throws SQLException {
        return false;
    }
    
    public boolean nullsAreSortedAtEnd() throws SQLException {
        return false;
    }
    
    public boolean supportsMixedCaseIdentifiers() throws SQLException {
        return false;
    }
    
    public boolean storesUpperCaseIdentifiers() throws SQLException {
        return false;
    }
    
    public boolean storesLowerCaseIdentifiers() throws SQLException {
        return false;
    }
    
    public boolean storesMixedCaseIdentifiers() throws SQLException {
        return true;
    }
    
    public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
        return true;
    }
    
    public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
        return false;
    }
    
    public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
        return false;
    }
    
    public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
        return true;
    }
    
    public boolean supportsAlterTableWithAddColumn() throws SQLException {
        return true;
    }
    
    public boolean supportsAlterTableWithDropColumn() throws SQLException {
        return true;
    }
    
    public boolean supportsTableCorrelationNames() throws SQLException {
        return true;
    }
    
    public boolean supportsDifferentTableCorrelationNames() throws SQLException {
        return true;
    }
    
    public boolean supportsColumnAliasing() throws SQLException {
        return true;
    }
    
    public boolean nullPlusNonNullIsNull() throws SQLException {
        return true;
    }
    
    public boolean supportsExpressionsInOrderBy() throws SQLException {
        return true;
    }
    
    public boolean supportsOrderByUnrelated() throws SQLException {
        return false;
    }
    
    public boolean supportsGroupBy() throws SQLException {
        return true;
    }
    
    public boolean supportsGroupByUnrelated() throws SQLException {
        return false;
    }
    
    public boolean supportsGroupByBeyondSelect() throws SQLException {
        return false;
    }
    
    public boolean supportsLikeEscapeClause() throws SQLException {
        return false;
    }
    
    public boolean supportsMultipleResultSets() throws SQLException {
        return false;
    }
    
    public boolean supportsMultipleTransactions() throws SQLException {
        return false;
    }
    
    public boolean supportsNonNullableColumns() throws SQLException {
        return true;
    }
    
    public boolean supportsMinimumSQLGrammar() throws SQLException {
        return true;
    }
    
    public boolean supportsCoreSQLGrammar() throws SQLException {
        return true;
    }
    
    public boolean supportsExtendedSQLGrammar() throws SQLException {
        return false;
    }
    
    public boolean supportsANSI92EntryLevelSQL() throws SQLException {
        return true;
    }
    
    public boolean supportsANSI92IntermediateSQL() throws SQLException {
        return false;
    }
    
    public boolean supportsANSI92FullSQL() throws SQLException {
        return false;
    }
    
    public boolean supportsIntegrityEnhancementFacility() throws SQLException {
        return false;
    }
    
    public boolean supportsOuterJoins() throws SQLException {
        return false;
    }
    
    public boolean supportsFullOuterJoins() throws SQLException {
        return false;
    }
    
    public boolean supportsLimitedOuterJoins() throws SQLException {
        return false;
    }
    
    public boolean supportsConvert() throws SQLException {
        return false;
    }
    
    public boolean supportsConvert(int fromType, int toType) throws SQLException {
        return false;
    }
    
    public boolean supportsSchemasInDataManipulation() throws SQLException {
        return false;
    }
    
    public boolean supportsSchemasInProcedureCalls() throws SQLException {
        return false;
    }
    
    public boolean supportsSchemasInTableDefinitions() throws SQLException {
        return false;
    }
    
    public boolean supportsSchemasInIndexDefinitions() throws SQLException {
        return false;
    }
    
    public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
        return false;
    }
    
    public boolean supportsCatalogsInDataManipulation() throws SQLException {
        return false;
    }
    
    public boolean supportsCatalogsInProcedureCalls() throws SQLException {
        return false;
    }
    
    public boolean supportsCatalogsInTableDefinitions() throws SQLException {
        return false;
    }
    
    public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
        return false;
    }
    
    public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
        return false;
    }
    
    public boolean supportsSelectForUpdate() throws SQLException {
        return false;
    }
    
    public boolean supportsPositionedDelete() throws SQLException {
        return false;
    }
    
    public boolean supportsPositionedUpdate() throws SQLException {
        return false;
    }
    
    public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
        return true;
    }
    
    public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
        return true;
    }
    
    public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
        return true;
    }
    
    public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
        return true;
    }
    
    public boolean supportsStoredProcedures() throws SQLException {
        return false;
    }
    
    public boolean supportsSubqueriesInComparisons() throws SQLException {
        return true;
    }
    
    public boolean supportsSubqueriesInExists() throws SQLException {
        return true;
    }
    
    public boolean supportsSubqueriesInIns() throws SQLException {
        return true;
    }
    
    public boolean supportsSubqueriesInQuantifieds() throws SQLException {
        return true;
    }
    
    public boolean supportsCorrelatedSubqueries() throws SQLException {
        return true;
    }
    
    public boolean supportsUnion() throws SQLException {
        return true;
    }
    
    public boolean supportsUnionAll() throws SQLException {
        return true;
    }
    
    public boolean supportsTransactions() throws SQLException {
        return true;
    }
    
    public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
        return true;
    }
    
    public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
        return true;
    }
    
    public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
        return false;
    }
    
    public boolean usesLocalFiles() throws SQLException {
        return false;
    }
    
    public boolean usesLocalFilePerTable() throws SQLException {
        return false;
    }
    
    public boolean supportsResultSetType(int type) throws SQLException {
        return type != rs.TYPE_SCROLL_SENSITIVE;
    }
    
    public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
        return type == rs.CONCUR_READ_ONLY;
    }
    
    public boolean ownUpdatesAreVisible(int type) throws SQLException {
        return false;
    }
    
    public boolean ownDeletesAreVisible(int type) throws SQLException {
        return false;
    }
    
    public boolean ownInsertsAreVisible(int type) throws SQLException {
        return false;
    }
    
    public boolean othersUpdatesAreVisible(int type) throws SQLException {
        return false;
    }
    
    public boolean othersDeletesAreVisible(int type) throws SQLException {
        return false;
    }
    
    public boolean othersInsertsAreVisible(int type) throws SQLException {
        return false;
    }
    
    public boolean updatesAreDetected(int type) throws SQLException {
        return false;
    }
    
    public boolean deletesAreDetected(int type) throws SQLException {
        return false;
    }
    
    public boolean insertsAreDetected(int type) throws SQLException {
        return false;
    }
    
    public boolean supportsBatchUpdates() throws SQLException {
        return false;
    }
    
    public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types) throws SQLException {
        return null;
    }
    
    public Connection getConnection() throws SQLException {
        return co;
    }
    
    //3
    public boolean supportsSavepoints() throws SQLException {
        return false;
    }
    
    public boolean supportsNamedParameters() throws SQLException {
        return false;
    }
    
    public boolean supportsMultipleOpenResults() throws SQLException {
        return false;
    }
    
    public boolean supportsGetGeneratedKeys() throws SQLException {
        return false;
    }
    
    public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) throws SQLException {
        return null;
    }
    
    public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
        return null;
    }
    
    public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) throws SQLException {
        return null;
    }
    
    public boolean supportsResultSetHoldability(int holdability) throws SQLException {
        return false;
    }
    
    public int getResultSetHoldability() throws SQLException {
        return 0;
    }
    
    public int getDatabaseMajorVersion() throws SQLException {
        return 0;
    }
    
    public int getDatabaseMinorVersion() throws SQLException {
        return 0;
    }
    
    public int getJDBCMajorVersion() throws SQLException {
        return 0;
    }
    
    public int getJDBCMinorVersion() throws SQLException {
        return 0;
    }
    
    public int getSQLStateType() throws SQLException {
        return 0;
    }
    
    public boolean locatorsUpdateCopy() throws SQLException {
        return false;
    }
    
    public boolean supportsStatementPooling() throws SQLException {
        return false;
    }
    
    //4
    public RowIdLifetime getRowIdLifetime() throws SQLException {
        jdbc.q();
        return null;
    }
    
    public ResultSet getSchemas(String string, String string1) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
        jdbc.q();
        return false;
    }
    
    public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
        jdbc.q();
        return false;
    }
    
    public ResultSet getClientInfoProperties() throws SQLException {
        jdbc.q();
        return null;
    }
    
    public ResultSet getFunctions(String string, String string1, String string2) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public ResultSet getFunctionColumns(String string, String string1, String string2, String string3) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public <T> T unwrap(Class<T> type) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public boolean isWrapperFor(Class<?> type) throws SQLException {
        jdbc.q();
        return false;
    }
    
    //1.7
    public boolean generatedKeyAlwaysReturned() {
        return false;
    }
    
    public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
}

