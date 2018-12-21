package org.springframework.kdb;

import java.sql.*;

//in kdb+3.x and above
//init table with
//Employees:([]id:0 1 2;firstName:`Charlie`Arthur`Simon;lastName:`Skelton`Whitney`Garland;age:10 20 30;timestamp:.z.p+til 3)

public class JDBCTest {
    static final String JDBC_DRIVER = "org.springframework.kdb.domain.jdbc.jdbc";
    static final String DB_URL = "jdbc:q:localhost:5001";
    static final String USER = "";
    static final String PASS = "";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL);
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, firstName, lastName, age,timestamp FROM Employees");
            
            while (rs.next()) {
                long id = rs.getLong("id");
                long age = rs.getLong("age");
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                Timestamp timestamp = rs.getTimestamp("timestamp");
                
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", FirstName: " + first);
                System.out.println(", LastName: " + last);
                System.out.println(", Timestamp: " + timestamp);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}