package service;

import java.io.IOException;
import java.util.Comparator;

import datamodel.Students;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PayService temp = new PayService();
		var studentList = temp.read();

        // Sort the list based on the 'name' property using Comparator
		studentList.sort(Comparator.comparing(Students::getAge));
		System.out.println("ID"+"	Name	" + "	Age		" + "Year	");
        // Print the sorted list
        for (Students student : studentList) {
            System.out.println(student.getStudId()+"	"+student.getName()+"		"+ student.getAge()+" 		" + student.getYear());
        }
	}

}
