package org.springframework.kdb.domain.jdbc;

import org.springframework.kdb.domain.c;

import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

import static org.springframework.kdb.domain.jdbc.jdbc.find;
import static org.springframework.kdb.domain.jdbc.jdbc.q;

public class rs implements ResultSet {
    private st st;
    private String[] f;
    private Object o, d[];
    private int r, n;
    
    public rs(st s, Object x) throws SQLException {
        st = s;
        c.Flip a;
        try {
            a = c.td(x);
            f = a.x;
            d = a.y;
            n = c.n(d[0]);
            r = -1;
        } catch (UnsupportedEncodingException ex) {
            throw new SQLException(ex);
        }
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        return new rm(f, d);
    }
    
    public int findColumn(String s) throws SQLException {
        return 1 + find(f, s);
    }
    
    public boolean next() throws SQLException {
        return ++r < n;
    }
    
    public boolean wasNull() throws SQLException {
        return o == null;
    }
    
    public Object getObject(int i) throws SQLException {
        o = c.at(d[i - 1], r);
        return o instanceof char[] ? new String((char[]) o) : o;
    }
    
    public boolean getBoolean(int i) throws SQLException {
        return ((Boolean) getObject(i)).booleanValue();
    }
    
    public byte getByte(int i) throws SQLException {
        return ((Byte) getObject(i)).byteValue();
    }
    
    public short getShort(int i) throws SQLException {
        Object x = getObject(i);
        return x == null ? 0 : ((Short) x).shortValue();
    }
    
    public int getInt(int i) throws SQLException {
        Object x = getObject(i);
        return x == null ? 0 : ((Integer) x).intValue();
    }
    
    public long getLong(int i) throws SQLException {
        Object x = getObject(i);
        return x == null ? 0 : ((Long) x).longValue();
    }
    
    public float getFloat(int i) throws SQLException {
        Object x = getObject(i);
        return x == null ? 0 : ((Float) x).floatValue();
    }
    
    public double getDouble(int i) throws SQLException {
        Object x = getObject(i);
        return x == null ? 0 : ((Double) x).doubleValue();
    }
    
    public String getString(int i) throws SQLException {
        Object x = getObject(i);
        return x == null ? null : x.toString();
    }
    
    public Date getDate(int i) throws SQLException {
        return (Date) getObject(i);
    }
    
    public Time getTime(int i) throws SQLException {
        return (Time) getObject(i);
    }
    
    public Timestamp getTimestamp(int i) throws SQLException {
        return (Timestamp) getObject(i);
    }
    
    public byte[] getBytes(int i) throws SQLException {
        q();
        return null;
    }
    
    public BigDecimal getBigDecimal(int i, int scale) throws SQLException {
        q();
        return null;
    }
    
    public InputStream getAsciiStream(int i) throws SQLException {
        q();
        return null;
    }
    
    public InputStream getUnicodeStream(int i) throws SQLException {
        q();
        return null;
    }
    
    public InputStream getBinaryStream(int i) throws SQLException {
        q();
        return null;
    }
    
    public Object getObject(String s) throws SQLException {
        return getObject(findColumn(s));
    }
    
    public boolean getBoolean(String s) throws SQLException {
        return getBoolean(findColumn(s));
    }
    
    public byte getByte(String s) throws SQLException {
        return getByte(findColumn(s));
    }
    
    public short getShort(String s) throws SQLException {
        return getShort(findColumn(s));
    }
    
    public int getInt(String s) throws SQLException {
        return getInt(findColumn(s));
    }
    
    public long getLong(String s) throws SQLException {
        return getLong(findColumn(s));
    }
    
    public float getFloat(String s) throws SQLException {
        return getFloat(findColumn(s));
    }
    
    public double getDouble(String s) throws SQLException {
        return getDouble(findColumn(s));
    }
    
    public String getString(String s) throws SQLException {
        return getString(findColumn(s));
    }
    
    public Date getDate(String s) throws SQLException {
        return getDate(findColumn(s));
    }
    
    public Time getTime(String s) throws SQLException {
        return getTime(findColumn(s));
    }
    
    public Timestamp getTimestamp(String s) throws SQLException {
        return getTimestamp(findColumn(s));
    }
    
    public byte[] getBytes(String s) throws SQLException {
        return getBytes(findColumn(s));
    }
    
    public BigDecimal getBigDecimal(String s, int scale) throws SQLException {
        return getBigDecimal(findColumn(s), scale);
    }
    
    public InputStream getAsciiStream(String s) throws SQLException {
        return getAsciiStream(findColumn(s));
    }
    
    public InputStream getUnicodeStream(String s) throws SQLException {
        return getUnicodeStream(findColumn(s));
    }
    
    public InputStream getBinaryStream(String s) throws SQLException {
        return getBinaryStream(findColumn(s));
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public String getCursorName() throws SQLException {
        q("cur");
        return "";
    }
    
    public void close() throws SQLException {
        d = null;
    }
    
    public Reader getCharacterStream(int columnIndex) throws SQLException {
        q();
        return null;
    }
    
    public Reader getCharacterStream(String columnName) throws SQLException {
        q();
        return null;
    }
    
    public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
        q();
        return null;
    }
    
    public BigDecimal getBigDecimal(String columnName) throws SQLException {
        q();
        return null;
    }
    
    public boolean isBeforeFirst() throws SQLException {
        return r < 0;
    }
    
    public boolean isAfterLast() throws SQLException {
        return r >= n;
    }
    
    public boolean isFirst() throws SQLException {
        return r == 0;
    }
    
    public boolean isLast() throws SQLException {
        return r == n - 1;
    }
    
    public void beforeFirst() throws SQLException {
        r = -1;
    }
    
    public void afterLast() throws SQLException {
        r = n;
    }
    
    public boolean first() throws SQLException {
        r = 0;
        return n > 0;
    }
    
    public boolean last() throws SQLException {
        r = n - 1;
        return n > 0;
    }
    
    public int getRow() throws SQLException {
        return r + 1;
    }
    
    public boolean absolute(int row) throws SQLException {
        r = row - 1;
        return r < n;
    }
    
    public boolean relative(int rows) throws SQLException {
        r += rows;
        return r >= 0 && r < n;
    }
    
    public boolean previous() throws SQLException {
        --r;
        return r >= 0;
    }
    
    public int getFetchDirection() throws SQLException {
        return FETCH_FORWARD;
    }
    
    public void setFetchDirection(int direction) throws SQLException {
        q("fd");
    }
    
    public int getFetchSize() throws SQLException {
        return 0;
    }
    
    public void setFetchSize(int rows) throws SQLException {
    }
    
    public int getType() throws SQLException {
        return TYPE_SCROLL_SENSITIVE;
    }
    
    public int getConcurrency() throws SQLException {
        return CONCUR_READ_ONLY;
    }
    
    public boolean rowUpdated() throws SQLException {
        q();
        return false;
    }
    
    public boolean rowInserted() throws SQLException {
        q();
        return false;
    }
    
    public boolean rowDeleted() throws SQLException {
        q();
        return false;
    }
    
    public void updateNull(int columnIndex) throws SQLException {
        q();
    }
    
    public void updateBoolean(int columnIndex, boolean x) throws SQLException {
        q();
    }
    
    public void updateByte(int columnIndex, byte x) throws SQLException {
        q();
    }
    
    public void updateShort(int columnIndex, short x) throws SQLException {
        q();
    }
    
    public void updateInt(int columnIndex, int x) throws SQLException {
        q();
    }
    
    public void updateLong(int columnIndex, long x) throws SQLException {
        q();
    }
    
    public void updateFloat(int columnIndex, float x) throws SQLException {
        q();
    }
    
    public void updateDouble(int columnIndex, double x) throws SQLException {
        q();
    }
    
    public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
        q();
    }
    
    public void updateString(int columnIndex, String x) throws SQLException {
        q();
    }
    
    public void updateBytes(int columnIndex, byte[] x) throws SQLException {
        q();
    }
    
    public void updateDate(int columnIndex, Date x) throws SQLException {
        q();
    }
    
    public void updateTime(int columnIndex, Time x) throws SQLException {
        q();
    }
    
    public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
        q();
    }
    
    public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
        q();
    }
    
    public void updateObject(int columnIndex, Object x, int scale) throws SQLException {
        q();
    }
    
    public void updateObject(int columnIndex, Object x) throws SQLException {
        q();
    }
    
    public void updateNull(String columnName) throws SQLException {
        q();
    }
    
    public void updateBoolean(String columnName, boolean x) throws SQLException {
        q();
    }
    
    public void updateByte(String columnName, byte x) throws SQLException {
        q();
    }
    
    public void updateShort(String columnName, short x) throws SQLException {
        q();
    }
    
    public void updateInt(String columnName, int x) throws SQLException {
        q();
    }
    
    public void updateLong(String columnName, long x) throws SQLException {
        q();
    }
    
    public void updateFloat(String columnName, float x) throws SQLException {
        q();
    }
    
    public void updateDouble(String columnName, double x) throws SQLException {
        q();
    }
    
    public void updateBigDecimal(String columnName, BigDecimal x) throws SQLException {
        q();
    }
    
    public void updateString(String columnName, String x) throws SQLException {
        q();
    }
    
    public void updateBytes(String columnName, byte[] x) throws SQLException {
        q();
    }
    
    public void updateDate(String columnName, Date x) throws SQLException {
        q();
    }
    
    public void updateTime(String columnName, Time x) throws SQLException {
        q();
    }
    
    public void updateTimestamp(String columnName, Timestamp x) throws SQLException {
        q();
    }
    
    public void updateAsciiStream(String columnName, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void updateBinaryStream(String columnName, InputStream x, int length) throws SQLException {
        q();
    }
    
    public void updateCharacterStream(String columnName, Reader reader, int length) throws SQLException {
        q();
    }
    
    public void updateObject(String columnName, Object x, int scale) throws SQLException {
        q();
    }
    
    public void updateObject(String columnName, Object x) throws SQLException {
        q();
    }
    
    public void insertRow() throws SQLException {
        q();
    }
    
    public void updateRow() throws SQLException {
        q();
    }
    
    public void deleteRow() throws SQLException {
        q();
    }
    
    public void refreshRow() throws SQLException {
        q();
    }
    
    public void cancelRowUpdates() throws SQLException {
        q();
    }
    
    public void moveToInsertRow() throws SQLException {
        q();
    }
    
    public void moveToCurrentRow() throws SQLException {
        q();
    }
    
    public Statement getStatement() throws SQLException {
        return st;
    }
    
    public Object getObject(int i, Map map) throws SQLException {
        q();
        return null;
    }
    
    public Ref getRef(int i) throws SQLException {
        q();
        return null;
    }
    
    public Blob getBlob(int i) throws SQLException {
        q();
        return null;
    }
    
    public Clob getClob(int i) throws SQLException {
        q();
        return null;
    }
    
    public Array getArray(int i) throws SQLException {
        q();
        return null;
    }
    
    public Object getObject(String colName, Map map) throws SQLException {
        q();
        return null;
    }
    
    public Ref getRef(String colName) throws SQLException {
        q();
        return null;
    }
    
    public Blob getBlob(String colName) throws SQLException {
        q();
        return null;
    }
    
    public Clob getClob(String colName) throws SQLException {
        q();
        return null;
    }
    
    public Array getArray(String colName) throws SQLException {
        q();
        return null;
    }
    
    public Date getDate(int columnIndex, Calendar cal) throws SQLException {
        q();
        return null;
    }
    
    public Date getDate(String columnName, Calendar cal) throws SQLException {
        q();
        return null;
    }
    
    public Time getTime(int columnIndex, Calendar cal) throws SQLException {
        q();
        return null;
    }
    
    public Time getTime(String columnName, Calendar cal) throws SQLException {
        q();
        return null;
    }
    
    public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
        q();
        return null;
    }
    
    public Timestamp getTimestamp(String columnName, Calendar cal) throws SQLException {
        q();
        return null;
    }
    
    //3
    public URL getURL(int columnIndex) throws SQLException {
        q();
        return null;
    }
    
    public URL getURL(String columnName) throws SQLException {
        q();
        return null;
    }
    
    public void updateRef(int columnIndex, Ref x) throws SQLException {
        q();
    }
    
    public void updateRef(String columnName, Ref x) throws SQLException {
        q();
    }
    
    public void updateBlob(int columnIndex, Blob x) throws SQLException {
        q();
    }
    
    public void updateBlob(String columnName, Blob x) throws SQLException {
        q();
    }
    
    public void updateClob(int columnIndex, Clob x) throws SQLException {
        q();
    }
    
    public void updateClob(String columnName, Clob x) throws SQLException {
        q();
    }
    
    public void updateArray(int columnIndex, Array x) throws SQLException {
        q();
    }
    
    public void updateArray(String columnName, Array x) throws SQLException {
        q();
    }
    
    //4
    public RowId getRowId(int i) throws SQLException {
        q();
        return null;
    }
    
    public RowId getRowId(String string) throws SQLException {
        q();
        return null;
    }
    
    public void updateRowId(int i, RowId rowid) throws SQLException {
        q();
    }
    
    public void updateRowId(String string, RowId rowid) throws SQLException {
        q();
    }
    
    public int getHoldability() throws SQLException {
        q();
        return 0;
    }
    
    public boolean isClosed() throws SQLException {
        return d == null;
    }
    
    public void updateNString(int i, String string) throws SQLException {
        q();
    }
    
    public void updateNString(String string, String string1) throws SQLException {
        q();
    }
    
    public void updateNClob(int i, NClob nclob) throws SQLException {
        q();
    }
    
    public void updateNClob(String string, NClob nclob) throws SQLException {
        q();
    }
    
    public NClob getNClob(int i) throws SQLException {
        q();
        return null;
    }
    
    public NClob getNClob(String string) throws SQLException {
        q();
        return null;
    }
    
    public SQLXML getSQLXML(int i) throws SQLException {
        q();
        return null;
    }
    
    public SQLXML getSQLXML(String string) throws SQLException {
        q();
        return null;
    }
    
    public void updateSQLXML(int i, SQLXML sqlxml) throws SQLException {
        q();
    }
    
    public void updateSQLXML(String string, SQLXML sqlxml) throws SQLException {
        q();
    }
    
    public String getNString(int i) throws SQLException {
        q();
        return null;
    }
    
    public String getNString(String string) throws SQLException {
        q();
        return null;
    }
    
    public Reader getNCharacterStream(int i) throws SQLException {
        q();
        return null;
    }
    
    public Reader getNCharacterStream(String string) throws SQLException {
        q();
        return null;
    }
    
    public void updateNCharacterStream(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateNCharacterStream(String string, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateAsciiStream(int i, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void updateBinaryStream(int i, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void updateCharacterStream(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateAsciiStream(String string, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void updateBinaryStream(String string, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void updateCharacterStream(String string, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateBlob(int i, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void updateBlob(String string, InputStream in, long l) throws SQLException {
        q();
    }
    
    public void updateClob(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateClob(String string, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateNClob(int i, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateNClob(String string, Reader reader, long l) throws SQLException {
        q();
    }
    
    public void updateNCharacterStream(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void updateNCharacterStream(String string, Reader reader) throws SQLException {
        q();
    }
    
    public void updateAsciiStream(int i, InputStream in) throws SQLException {
        q();
    }
    
    public void updateBinaryStream(int i, InputStream in) throws SQLException {
        q();
    }
    
    public void updateCharacterStream(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void updateAsciiStream(String string, InputStream in) throws SQLException {
        q();
    }
    
    public void updateBinaryStream(String string, InputStream in) throws SQLException {
        q();
    }
    
    public void updateCharacterStream(String string, Reader reader) throws SQLException {
        q();
    }
    
    public void updateBlob(int i, InputStream in) throws SQLException {
        q();
    }
    
    public void updateBlob(String string, InputStream in) throws SQLException {
        q();
    }
    
    public void updateClob(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void updateClob(String string, Reader reader) throws SQLException {
        q();
    }
    
    public void updateNClob(int i, Reader reader) throws SQLException {
        q();
    }
    
    public void updateNClob(String string, Reader reader) throws SQLException {
        q();
    }
    
    public <T> T unwrap(Class<T> type) throws SQLException {
        q();
        return null;
    }
    
    public boolean isWrapperFor(Class<?> type) throws SQLException {
        q();
        return false;
    }
    
    //1.7
    public <T> T getObject(String parameterName, Class<T> t) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
    
    public <T> T getObject(int columnIndex, Class<T> t) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
}

