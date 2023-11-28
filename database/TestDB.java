package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDB {
	public static void main(String[] args) {
		try {
			String sql = "jdbc:mysql://localhost:3306/test_database";
			String username = "root";
			String password = "";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//conection to db
			Connection con = DriverManager.getConnection(sql, username, password);
			
			//prepare the sql query to
			PreparedStatement prep,prep1,prep2;
			
			prep = con.prepareStatement("insert into sample(id, name) values(?,?)" );
			prep.setString(1, "100");
			prep.setString(2, "abcd");
			
//			prep1 = con.prepareStatement("alter table sample add age INT");
			
			
			prep2= con.prepareStatement("SELECT * from sample");
			ResultSet rs = prep2.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + " " + name+ " " + age);
			}
			prep.executeUpdate();
//			prep1.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
