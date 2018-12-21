package org.springframework.kdb.domain.jdbc;

import org.springframework.kdb.domain.c;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import static org.springframework.kdb.domain.jdbc.jdbc.*;

public class rm implements ResultSetMetaData {
    private String[] f;
    private Object[] d;
    
    public rm(String[] x, Object[] y) {
        f = x;
        d = y;
    }
    
    public int getColumnCount() throws SQLException {
        return f.length;
    }
    
    public String getColumnName(int i) throws SQLException {
        return f[i - 1];
    }
    
    public String getColumnTypeName(int i) throws SQLException {
        return TYPE[c.t(d[i - 1])];
    }
    
    public int getColumnDisplaySize(int i) throws SQLException {
        return 11;
    }
    
    public int getScale(int i) throws SQLException {
        return 2;
    }
    
    public int isNullable(int i) throws SQLException {
        return 1;
    }
    
    public String getColumnLabel(int i) throws SQLException {
        return getColumnName(i);
    }
    
    public int getColumnType(int i) throws SQLException {
        return SQLTYPE[c.t(d[i - 1])];
    }
    
    public int getPrecision(int i) throws SQLException {
        return 11;
    } //SQLPREC[c.t(d[i-1])];}
    
    public boolean isSigned(int i) throws SQLException {
        return true;
    }
    
    public String getTableName(int i) throws SQLException {
        return "";
    }
    
    public String getSchemaName(int i) throws SQLException {
        return "";
    }
    
    public String getCatalogName(int i) throws SQLException {
        return "";
    }
    
    public boolean isReadOnly(int i) throws SQLException {
        return false;
    }
    
    public boolean isWritable(int i) throws SQLException {
        return false;
    }
    
    public boolean isDefinitelyWritable(int i) throws SQLException {
        return false;
    }
    
    public boolean isAutoIncrement(int i) throws SQLException {
        return false;
    }
    
    public boolean isCaseSensitive(int i) throws SQLException {
        return true;
    }
    
    public boolean isSearchable(int i) throws SQLException {
        return true;
    }
    
    public boolean isCurrency(int i) throws SQLException {
        return false;
    }
    
    public String getColumnClassName(int column) throws SQLException {
        q("col");
        return null;
    }
    
    //4
    public <T> T unwrap(Class<T> type) throws SQLException {
        q();
        return null;
    }
    
    public boolean isWrapperFor(Class<?> type) throws SQLException {
        q();
        return false;
    }
}

