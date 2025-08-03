package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JDBCTest {
    public static void main(String[] args) {
        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Connect to MySQL Database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",  // URL
                    "root",                                   // username
                    "Srirampraveen01@");                         // password
            
            System.out.println("Connected to Database!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM sample");

            // 5. Process Result
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + 
                                   rs.getString("name") + " | " + 
                                   rs.getInt("age"));
            }

            // 6. Close Connection
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
