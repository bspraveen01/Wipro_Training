package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCDemo2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String pwd="Srirampraveen01@";
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e) {
			System.err.println("mysql driver not found");
			e.printStackTrace();
			return;
			
		}
		try {
			Connection con =DriverManager.getConnection(url,username,pwd);
			Statement st =con.createStatement();
			String student2 = "create table student2(id int Auto_increment primary key, name varchar(100), number int)";
            st.executeUpdate(student2);
            System.out.println("Table student2 is created at mysql");

            // Insert data
            String val = "insert into student2(name, number) values(?, ?)";
            PreparedStatement ps = con.prepareStatement(val);
            ps.setString(1, "Praveen");
            ps.setInt(2, 9876);
            ps.addBatch();

            int[] arr = ps.executeBatch();
            System.out.printf("inserted rows: %d", 
                (int) java.util.stream.IntStream.of(arr).filter(c -> c > 0).count());

            // Select data
            String query = "select * from student2";
            try (ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    int ids = rs.getInt(1);
                    String name = rs.getString(2);
                    int number = rs.getInt(3);

                    System.out.println("Name is = " + name + " number is = " + number);
                }
            }

        } catch (SQLException e) {
            System.out.println("Data operation failed");
            e.printStackTrace();
        }
    }
}