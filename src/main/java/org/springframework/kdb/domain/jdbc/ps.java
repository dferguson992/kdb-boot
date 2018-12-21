package org.springframework.kdb.domain.jdbc;

import org.springframework.kdb.domain.c;

import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

import static org.springframework.kdb.domain.jdbc.jdbc.*;

public class ps extends st implements PreparedStatement {
    private String s;
    
    public ps(co co, String x) {
        super(co);
        s = x;
    }
    
    public ResultSet executeQuery() throws SQLException {
        return executeQuery(s);
    }
    
    public int executeUpdate() throws SQLException {
        return executeUpdate(s);
    }
    
    public boolean execute() throws SQLException {
        return execute(s);
    }
    
    public void clearParameters() throws SQLException {
        try {
            for (int i = 0; i < c.n(p); ) p[i++] = null;
        } catch (UnsupportedEncodingException ex) {
            throw new SQLException(ex);
        }
    }
    
    public void setObject(int i, Object x) throws SQLException {
        int n;
        try {
            n = c.n(p);
        } catch (UnsupportedEncodingException ex) {
            throw new SQLException(ex);
        }
        if (i > n) {
            Object[] r = new Object[i];
            System.arraycopy(p, 0, r, 0, n);
            p = r;
            for (; n < i; ) p[n++] = null;
        }
        p[i - 1] = x;
    }
    
    public void setObject(int i, Object x, int targetSqlType) throws SQLException {
        setObject(i, x);
    }
    
    public void setObject(int i, Object x, int targetSqlType, int scale) throws SQLException {
        setObject(i, x);
    }
    
    public void setNull(int i, int t) throws SQLException {
        setObject(i, c.NULL[find(SQLTYPE, t)]);
    }
    
    public void setBoolean(int i, boolean x) throws SQLException {
        setObject(i, new Boolean(x));
    }
    
    public void setByte(int i, byte x) throws SQLException {
        setObject(i, new Byte(x));
    }
    
    public void setShort(int i, short x) throws SQLException {
        setObject(i, new Short(x));
    }
    
    public void setInt(int i, int x) throws SQLException {
        setObject(i, new Integer(x));
    }
    
    public void setLong(int i, long x) throws SQLException {
        setObject(i, new Long(x));
    }
    
    public void setFloat(int i, float x) throws SQLException {
        setObject(i, new Float(x));
    }
    
    public void setDouble(int i, double x) throws SQLException {
        setObject(i, new Double(x));
    }
    
    public void setString(int i, String x) throws SQLException {
        setObject(i, x);
    }
    
    public void setDate(int i, Date x) throws SQLException {
        setObject(i, x);
    }
    
    public void setTime(int i, Time x) throws SQLException {
        setObject(i, x);
    }
    
    public void setTimestamp(int i, Timestamp x) throws SQLException {
        setObject(i, x);
    }
    
    public void setBytes(int i, byte x[]) throws SQLException {
        q();
    }
    
    public void setBigDecimal(int i, BigDecimal x) throws SQLException {
        q();
    }
    
    public void setAsciiStream(int i, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void setUnicodeStream(int i, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void setBinaryStream(int i, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void addBatch() throws SQLException {
    }
    
    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        q();
    }
    
    public void setRef(int i, Ref x) throws SQLException {
        q();
    }
    
    public void setBlob(int i, Blob x) throws SQLException {
        q();
    }
    
    public void setClob(int i, Clob x) throws SQLException {
        q();
    }
    
    public void setArray(int i, Array x) throws SQLException {
        q();
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        q("m");
        return null;
    }
    
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        q();
    }
    
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        q();
    }
    
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        q();
    }
    
    public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException {
        q();
    }
    
    //3
    public void setURL(int parameterIndex, URL x) throws SQLException {
        q();
    }
    
    public ParameterMetaData getParameterMetaData() throws SQLException {
        q("m");
        return null;
    }
    
    //4
    public void setRowId(int i, RowId rowid) throws SQLException {
        q();
    }
    
    public void setNString(int i, String string) throws SQLException {
        q();
    }
    
    public void setNCharacterStream(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void setNClob(int i, NClob nclob) throws SQLException {
        q();
    }
    
    public void setClob(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void setBlob(int i, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void setNClob(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void setSQLXML(int i, SQLXML sqlxml) throws SQLException {
        q();
    }
    
    public void setAsciiStream(int i, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void setBinaryStream(int i, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void setCharacterStream(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void setAsciiStream(int i, InputStream in) throws SQLException {
        q();
    }
    
    public void setBinaryStream(int i, InputStream in) throws SQLException {
        q();
    }
    
    public void setCharacterStream(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void setNCharacterStream(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void setClob(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void setBlob(int i, InputStream in) throws SQLException {
        q();
    }
    
    public void setNClob(int i, Reader reader) throws SQLException {
        q();
    }
}

