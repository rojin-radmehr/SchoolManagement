package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import datamodel.Instructors;

public class InstructorService {
	public List<Instructors> readCSV() throws IOException{
		String line = null;
		String splitBy=",";
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l6\\instructors.csv"));
		List<Instructors> instructorList = new ArrayList<>();
		
		while((line = br.readLine()) != null) {
			if(count != 0) {
				Instructors instructor = new Instructors();
				String[] instructors = line.split(splitBy);
				
				instructor.setId(instructors[0].trim());
				instructor.setName(instructors[1].trim());
				instructor.setSubject(instructors[2].trim());
				instructor.setNumber(new BigInteger(instructors[3].trim()));
				instructor.setEmail(instructors[4].trim());
				instructor.setTarget_year(instructors[5].trim());
				
				instructorList.add(instructor);
			}
			count++;
		}
		br.close();
		return instructorList;
	}
}
