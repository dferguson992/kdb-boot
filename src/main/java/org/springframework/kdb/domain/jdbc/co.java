package org.springframework.kdb.domain.jdbc;

import org.springframework.kdb.domain.c;

import java.io.IOException;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import static org.springframework.kdb.domain.jdbc.jdbc.q;

public class co implements Connection {
    private org.springframework.kdb.domain.c c;
    private boolean a = true;
    private boolean b;
    private int i = TRANSACTION_SERIALIZABLE, h = rs.HOLD_CURSORS_OVER_COMMIT;
    private Properties clientInfo = new Properties();
    
    public co(String s, Object u, Object p) throws SQLException {
        int i = s.indexOf(":");
        try {
            c = new c(s.substring(0, i), Integer.parseInt(s.substring(i + 1)), u == null ? "" : (String) u + ":" + (String) p);
        } catch (Exception e) {
            jdbc.q(e);
        }
    }
    
    public Object ex(String s, Object[] p) throws SQLException {
        try {
            return 0 < c.n(p) ? c.k(s, p) : c.k(".o.ex", s.toCharArray());
        } catch (Exception e) {
            jdbc.q(e);
            return null;
        }
    }
    
    public rs qx(String s) throws SQLException {
        try {
            return new rs(null, c.k(s));
        } catch (Exception e) {
            jdbc.q(e);
            return null;
        }
    }
    
    public rs qx(String s, Object x) throws SQLException {
        try {
            return new rs(null, c.k(s, x));
        } catch (Exception e) {
            jdbc.q(e);
            return null;
        }
    }
    
    public boolean getAutoCommit() throws SQLException {
        return a;
    }
    
    public void setAutoCommit(boolean b) throws SQLException {
        a = b;
    }
    
    public void rollback() throws SQLException {
    }
    
    public void commit() throws SQLException {
    }
    
    public boolean isClosed() throws SQLException {
        return c == null;
    }
    
    public Statement createStatement() throws SQLException {
        return new st(this);
    }
    
    public DatabaseMetaData getMetaData() throws SQLException {
        return new dm(this);
    }
    
    public PreparedStatement prepareStatement(String s) throws SQLException {
        return new ps(this, s);
    }
    
    public CallableStatement prepareCall(String s) throws SQLException {
        return new cs(this, s);
    }
    
    public String nativeSQL(String s) throws SQLException {
        return s;
    }
    
    public boolean isReadOnly() throws SQLException {
        return b;
    }
    
    public void setReadOnly(boolean x) throws SQLException {
        b = x;
    }
    
    public String getCatalog() throws SQLException {
        jdbc.q("cat");
        return null;
    }
    
    public void setCatalog(String s) throws SQLException {
        jdbc.q("cat");
    }
    
    public int getTransactionIsolation() throws SQLException {
        return i;
    }
    
    public void setTransactionIsolation(int x) throws SQLException {
        i = x;
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public void close() throws SQLException {
        if (isClosed()) return;
        try {
            c.close();
        } catch (IOException e) {
            jdbc.q(e);
        } finally {
            c = null;
        }
    }
    
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new st(this);
    }
    
    public PreparedStatement prepareStatement(String s, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new ps(this, s);
    }
    
    public CallableStatement prepareCall(String s, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new cs(this, s);
    }
    
    public Map getTypeMap() throws SQLException {
        return null;
    }
    
    public void setTypeMap(Map map) throws SQLException {
    }
    
    public int getHoldability() throws SQLException {
        return h;
    }
    
    //3
    public void setHoldability(int holdability) throws SQLException {
        h = holdability;
    }
    
    public Savepoint setSavepoint() throws SQLException {
        jdbc.q("sav");
        return null;
    }
    
    public Savepoint setSavepoint(String name) throws SQLException {
        jdbc.q("sav");
        return null;
    }
    
    public void rollback(Savepoint savepoint) throws SQLException {
    }
    
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
    }
    
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new st(this);
    }
    
    public PreparedStatement prepareStatement(String s, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new ps(this, s);
    }
    
    public CallableStatement prepareCall(String s, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new cs(this, s);
    }
    
    public PreparedStatement prepareStatement(String s, int autoGeneratedKeys) throws SQLException {
        return new ps(this, s);
    }
    
    public PreparedStatement prepareStatement(String s, int[] columnIndexes) throws SQLException {
        return new ps(this, s);
    }
    
    public PreparedStatement prepareStatement(String s, String[] columnNames) throws SQLException {
        return new ps(this, s);
    }
    
    public Clob createClob() throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Blob createBlob() throws SQLException {
        jdbc.q();
        return null;
    }
    
    public NClob createNClob() throws SQLException {
        jdbc.q();
        return null;
    }
    
    public SQLXML createSQLXML() throws SQLException {
        jdbc.q();
        return null;
    }
    
    public boolean isValid(int i) throws SQLException {
        if (i < 0) jdbc.q();
        return c != null;
    }
    
    public void setClientInfo(String k, String v) throws SQLClientInfoException {
        clientInfo.setProperty(k, v);
    }
    
    public String getClientInfo(String k) throws SQLException {
        return (String) clientInfo.get(k);
    }
    
    public Properties getClientInfo() throws SQLException {
        return clientInfo;
    }
    
    public void setClientInfo(Properties p) throws SQLClientInfoException {
        clientInfo = p;
    }
    
    public Array createArrayOf(String string, Object[] os) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Struct createStruct(String string, Object[] os) throws SQLException {
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
    public int getNetworkTimeout() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
    
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
    
    public void abort(Executor executor) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
    
    public String getSchema() {
        return null;
    }
    
    public void setSchema(String s) {
    }
}

