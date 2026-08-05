package corejava.collections.linkedlist.studentmanagement;

/**
 * Topic: Collections Framework
 * Program: LinkedList Student Management
 * Description: Demonstrates a simple real-world example of managing student records using a LinkedList.
 * Author: Siddhesh
 */

import java.util.LinkedList;

public class LinkedListStudentManagement {
	
	public static void main(String[] args) {
		
		// Create a LinkedList to store StudentManagement objects
		
		LinkedList<StudentManagement> studentDetails = new LinkedList<>();

		// Create StudentManagement objects
		
		StudentManagement student1 = new StudentManagement(101, "Siddhesh", 22);
		StudentManagement student2 = new StudentManagement(102, "Rahul", 21);
		StudentManagement student3 = new StudentManagement(103, "Amit", 23);

		// Add student records to the LinkedList
		
		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);

		// Display the results
		
		System.out.println("=================================");
		System.out.println("  LINKEDLIST STUDENT MANAGEMENT  ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the LinkedList and display student records
		
		for (StudentManagement currentStudent : studentDetails) {
			
			currentStudent.displayStudentDetails();
			
		}
		
		System.out.println("=================================");
		
	}

}
