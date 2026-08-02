package corejava.collections.arraylist.studentmanagement;

/**
 * Topic: Collections Framework
 * Program: ArrayList Student Management
 * Description: Demonstrates a simple real-world example of managing student records using an ArrayList.
 * Author: Siddhesh
 */

import java.util.ArrayList;

public class ArrayListStudentManagement {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store StudentManagement objects
		
		ArrayList<StudentManagement> studentDetails = new ArrayList<>();

		// Create StudentManagement objects
		
		StudentManagement student1 = new StudentManagement(101, "Siddhesh", 22);
		StudentManagement student2 = new StudentManagement(102, "Rahul", 21);
		StudentManagement student3 = new StudentManagement(103, "Amit", 23);

		// Add student records to the ArrayList
		
		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);

		// Display the results
		
		System.out.println("==================================");
		System.out.println("   ARRAYLIST STUDENT MANAGEMENT   ");
		System.out.println("==================================");
		System.out.println();

		// Traverse the ArrayList and display student records
		
		for (StudentManagement currentStudent : studentDetails) {
			
			currentStudent.displayStudentDetails();
			
		}
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
