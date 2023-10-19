package launcher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import datamodel.Admin;
import datamodel.Course;
import datamodel.Enrollment;
import datamodel.Students;

public class Launcher {
	public static void main(String[] a) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        Admin admin = new Admin();
        admin.setAdminId(202301);
        admin.setUsername("username");
        admin.setPassword("password");
        
        Course course = new Course();
        course.setId("J2023");
        course.setDuration(30);
        course.setName("Java Application Dev");
        
        Enrollment enroll = new Enrollment();
        enroll.setId(202301);
        enroll.setDate(sdf.parse("01/01/2023"));
        enroll.setDetails("Fall 2023 enrollment");
        
        
        Students student = new Students();
        student.setStudId("20");
        student.setName("Whatever");
        student.setDepartment("BCS");
        
        List<String> courses = new ArrayList<String>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        
        student.setCourse(courses);
        courses.forEach(c->System.out.println(c));
        
        
        
    }
	
}
