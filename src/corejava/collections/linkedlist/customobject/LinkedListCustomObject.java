package corejava.collections.linkedlist.customobject;

/**
 * Topic: Collections Framework
 * Program: LinkedList with Custom Objects
 * Description: Demonstrates how to store and traverse custom objects in a LinkedList.
 * Author: Siddhesh
 */

import java.util.LinkedList;

public class LinkedListCustomObject {
	
	public static void main(String[] args) {
		
		// Create a LinkedList to store Student objects
		
		LinkedList<Student> students = new LinkedList<>();

		// Initialize Student objects using the parameterized constructor
		
		Student student1 = new Student("Siddhesh", 22);
		Student student2 = new Student("Rahul", 21);
		Student student3 = new Student("Amit", 23);

		// Add Student objects to the LinkedList
		
		students.add(student1);
		students.add(student2);
		students.add(student3);

		// Display the results
		
		System.out.println("==================================");
		System.out.println("  LINKEDLIST WITH CUSTOM OBJECTS  ");
		System.out.println("==================================");
		System.out.println();

		// Traverse the LinkedList and display student details
		
		for (Student student : students) {
			
			student.displayStudent();
			
		}
		
		System.out.println("==================================");
		
	}

}
