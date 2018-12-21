package org.springframework.kdb.domain.jdbc;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class jdbc implements Driver {
    static int V = 2, v = 0;
    static int[] SQLTYPE = { 0, 16, 0, 0, -2, 5, 4, -5, 7, 8, 0, 12, 0, 0, 91, 93, 0, 0, 0, 92 };
    static String[] TYPE = { "", "boolean", "", "", "byte", "short", "int", "long", "real", "float", "char", "symbol", "", "month", "date", "timestamp", "", "minute", "second", "time" };
    
    static {
        try {
            DriverManager.registerDriver(new jdbc());
        } catch (Exception e) {
            O(e.getMessage());
        }
    }
    
    static void O(String s) {
        System.out.println(s);
    }
    
    static int find(String[] x, String s) {
        int i = 0;
        for (; i < x.length && !s.equals(x[i]); ) ++i;
        return i;
    }
    
    static int find(int[] x, int j) {
        int i = 0;
        for (; i < x.length && x[i] != j; ) ++i;
        return i;
    }
    
    static void q(String s) throws SQLException {
        throw new SQLException(s);
    }
    
    static void q() throws SQLException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
    
    static void q(Exception e) throws SQLException {
        throw new SQLException(e.getMessage());
    }
    
    public int getMajorVersion() {
        return V;
    }
    
    public int getMinorVersion() {
        return v;
    }
    
    public boolean jdbcCompliant() {
        return false;
    }
    
    public boolean acceptsURL(String s) {
        return s.startsWith("jdbc:q:");
    }
    
    public Connection connect(String s, Properties p) throws SQLException {
        return !acceptsURL(s) ? null : new co(s.substring(7), p != null ? p.get("user") : p, p != null ? p.get("password") : p);
    }
    
    public DriverPropertyInfo[] getPropertyInfo(String s, Properties p) throws SQLException {
        return new DriverPropertyInfo[0];
    }
    
    //1.7
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("nyi");
    }
}