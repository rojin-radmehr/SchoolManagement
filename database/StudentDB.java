package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import datamodel.Students;
import service.PayService;

public class StudentDB {
	public void dbConnectivity() {
		try {
			String sql = "jdbc:mysql://localhost:3306/schoolmanagment";
			String username = "root";
			String password = "";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//conection to db
			Connection con = DriverManager.getConnection(sql, username, password);
			
			//prepare the sql query to
			PreparedStatement prep,prep1,prep2;
			
			PayService service = new PayService();
			List<Students> studentsList = service.read();
			
//            prep = con.prepareStatement("create table students (studId varchar(50), name varchar(50), age varchar(50), "
//                    + "course varchar(100), department varchar(50), year varchar(50), fee double, paid TEXT");
//            
//            prep.execute();
			
			for (Students student : studentsList) {
				prep1=con.prepareStatement("insert into students(studId, name, age, course, department, year, fee, paid)"
						+ "values (?,?,?,?,?,?,?,?)");
				prep1.setString(1, student.getStudId());
				prep1.setString(2, student.getName());
				prep1.setString(3, student.getAge());
				prep1.setString(4, student.getCourse().toString());
				prep1.setString(5, student.getDepartment());
				prep1.setString(6, student.getYear());
				prep1.setDouble(7, student.getFee());
				prep1.setString(8, student.getPaid());
				prep1.executeUpdate();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
