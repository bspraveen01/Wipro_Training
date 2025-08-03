package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class JDBC1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";  // No colon at the end
        String username = "root";
        String pwd = "Srirampraveen01@";

        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to DB by using DriverManager.
        Connection con = DriverManager.getConnection(url, username, pwd);
        System.out.println("connection established successfully");
        
    }
}


/* 1) we need to import a package.
 * 2) load and register the driver - com.mysql.jdbc.driver
 * 3) establish the connection
 * 4) create the statements
 * 5) execute the query.
 * 6) process the result.
 * 7) close the connections
 * 
 * */
