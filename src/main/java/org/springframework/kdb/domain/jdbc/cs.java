package org.springframework.kdb.domain.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

import static org.springframework.kdb.domain.jdbc.jdbc.q;

public class cs extends ps implements CallableStatement {
    public cs(co c, String s) {
        super(c, s);
    }
    
    public void registerOutParameter(int i, int sqlType) throws SQLException {
    }
    
    public void registerOutParameter(int i, int sqlType, int scale) throws SQLException {
    }
    
    public boolean wasNull() throws SQLException {
        return false;
    }
    
    public String getString(int i) throws SQLException {
        return null;
    }
    
    public boolean getBoolean(int i) throws SQLException {
        return false;
    }
    
    public byte getByte(int i) throws SQLException {
        return 0;
    }
    
    public short getShort(int i) throws SQLException {
        return 0;
    }
    
    public int getInt(int i) throws SQLException {
        return 0;
    }
    
    public long getLong(int i) throws SQLException {
        return 0;
    }
    
    public float getFloat(int i) throws SQLException {
        return (float) 0.0;
    }
    
    public double getDouble(int i) throws SQLException {
        return 0.0;
    }
    
    public BigDecimal getBigDecimal(int i, int scale) throws SQLException {
        return null;
    }
    
    public Date getDate(int i) throws SQLException {
        return null;
    }
    
    public Time getTime(int i) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(int i) throws SQLException {
        return null;
    }
    
    public byte[] getBytes(int i) throws SQLException {
        return null;
    }
    
    public Object getObject(int i) throws SQLException {
        return null;
    }
    
    public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Object getObject(int i, Map map) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Ref getRef(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Blob getBlob(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Clob getClob(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Array getArray(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public void registerOutParameter(int paramIndex, int sqlType, String typeName) throws SQLException {
        jdbc.q();
    }
    
    //3
    public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
        jdbc.q();
    }
    
    public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
        jdbc.q();
    }
    
    public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
        jdbc.q();
    }
    
    public URL getURL(int parameterIndex) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public void setURL(String parameterName, URL val) throws SQLException {
        jdbc.q();
    }
    
    public void setNull(String parameterName, int sqlType) throws SQLException {
        jdbc.q();
    }
    
    public void setBoolean(String parameterName, boolean x) throws SQLException {
        jdbc.q();
    }
    
    public void setByte(String parameterName, byte x) throws SQLException {
        jdbc.q();
    }
    
    public void setShort(String parameterName, short x) throws SQLException {
        jdbc.q();
    }
    
    public void setInt(String parameterName, int x) throws SQLException {
        jdbc.q();
    }
    
    public void setLong(String parameterName, long x) throws SQLException {
        jdbc.q();
    }
    
    public void setFloat(String parameterName, float x) throws SQLException {
        jdbc.q();
    }
    
    public void setDouble(String parameterName, double x) throws SQLException {
        jdbc.q();
    }
    
    public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
        jdbc.q();
    }
    
    public void setString(String parameterName, String x) throws SQLException {
        jdbc.q();
    }
    
    public void setBytes(String parameterName, byte[] x) throws SQLException {
        jdbc.q();
    }
    
    public void setDate(String parameterName, Date x) throws SQLException {
        jdbc.q();
    }
    
    public void setTime(String parameterName, Time x) throws SQLException {
        jdbc.q();
    }
    
    public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
        jdbc.q();
    }
    
    public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
        jdbc.q();
    }
    
    public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
        jdbc.q();
    }
    
    public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
        jdbc.q();
    }
    
    public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
        jdbc.q();
    }
    
    public void setObject(String parameterName, Object x) throws SQLException {
        jdbc.q();
    }
    
    public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
        jdbc.q();
    }
    
    public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
        jdbc.q();
    }
    
    public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
        jdbc.q();
    }
    
    public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
        jdbc.q();
    }
    
    public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
        jdbc.q();
    }
    
    public String getString(String parameterName) throws SQLException {
        return null;
    }
    
    public boolean getBoolean(String parameterName) throws SQLException {
        return false;
    }
    
    public byte getByte(String parameterName) throws SQLException {
        return 0;
    }
    
    public short getShort(String parameterName) throws SQLException {
        return 0;
    }
    
    public int getInt(String parameterName) throws SQLException {
        return 0;
    }
    
    public long getLong(String parameterName) throws SQLException {
        return 0;
    }
    
    public float getFloat(String parameterName) throws SQLException {
        return 0;
    }
    
    public double getDouble(String parameterName) throws SQLException {
        return 0;
    }
    
    public byte[] getBytes(String parameterName) throws SQLException {
        return null;
    }
    
    public Date getDate(String parameterName) throws SQLException {
        return null;
    }
    
    public Time getTime(String parameterName) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(String parameterName) throws SQLException {
        return null;
    }
    
    public Object getObject(String parameterName) throws SQLException {
        return null;
    }
    
    public BigDecimal getBigDecimal(String parameterName) throws SQLException {
        return null;
    }
    
    public Object getObject(String parameterName, Map map) throws SQLException {
        return null;
    }
    
    public Ref getRef(String parameterName) throws SQLException {
        return null;
    }
    
    public Blob getBlob(String parameterName) throws SQLException {
        return null;
    }
    
    public Clob getClob(String parameterName) throws SQLException {
        return null;
    }
    
    public Array getArray(String parameterName) throws SQLException {
        return null;
    }
    
    public Date getDate(String parameterName, Calendar cal) throws SQLException {
        return null;
    }
    
    public Time getTime(String parameterName, Calendar cal) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
        return null;
    }
    
    public URL getURL(String parameterName) throws SQLException {
        return null;
    }
    
    //4
    public RowId getRowId(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public RowId getRowId(String string) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public void setRowId(String string, RowId rowid) throws SQLException {
        jdbc.q();
    }
    
    public void setNString(String string, String string1) throws SQLException {
        jdbc.q();
    }
    
    public void setNCharacterStream(String string, Reader reader, long l) throws SQLException {
        jdbc.q();
    }
    
    public void setNClob(String string, NClob nclob) throws SQLException {
        jdbc.q();
    }
    
    public void setClob(String string, Reader reader, long l) throws SQLException {
        jdbc.q();
    }
    
    public void setBlob(String string, InputStream in, long l) throws SQLException {
        jdbc.q();
    }
    
    public void setNClob(String string, Reader reader, long l) throws SQLException {
        jdbc.q();
    }
    
    public NClob getNClob(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public NClob getNClob(String string) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public void setSQLXML(String string, SQLXML sqlxml) throws SQLException {
        jdbc.q();
    }
    
    public SQLXML getSQLXML(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public SQLXML getSQLXML(String string) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public String getNString(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public String getNString(String string) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Reader getNCharacterStream(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Reader getNCharacterStream(String string) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Reader getCharacterStream(int i) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public Reader getCharacterStream(String string) throws SQLException {
        jdbc.q();
        return null;
    }
    
    public void setBlob(String string, Blob blob) throws SQLException {
        jdbc.q();
    }
    
    public void setClob(String string, Clob clob) throws SQLException {
        jdbc.q();
    }
    
    public void setAsciiStream(String string, InputStream in, long l) throws SQLException {
        jdbc.q();
    }
    
    public void setBinaryStream(String string, InputStream in, long l) throws SQLException {
        jdbc.q();
    }
    
    public void setCharacterStream(String string, Reader reader, long l) throws SQLException {
        jdbc.q();
    }
    
    public void setAsciiStream(String string, InputStream in) throws SQLException {
        jdbc.q();
    }
    
    public void setBinaryStream(String string, InputStream in) throws SQLException {
        jdbc.q();
    }
    
    public void setCharacterStream(String string, Reader reader) throws SQLException {
        jdbc.q();
    }
    
    public void setNCharacterStream(String string, Reader reader) throws SQLException {
        jdbc.q();
    }
    
    public void setClob(String string, Reader reader) throws SQLException {
        jdbc.q();
    }
    
    public void setBlob(String string, InputStream in) throws SQLException {
        jdbc.q();
    }
    
    public void setNClob(String string, Reader reader) throws SQLException {
        jdbc.q();
    }
    
    //1.7
    public <T> T getObject(String s, Class<T> t) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
    
    public <T> T getObject(int parameterIndex, Class<T> t) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
}

