package corejava.collections.arraylist.customobject;

/**
 * Topic: Collections Framework
 * Program: ArrayList with Custom Objects
 * Description: Demonstrates how to store and traverse custom objects in an ArrayList.
 * Author: Siddhesh
 */

import java.util.ArrayList;

public class ArrayListCustomObject {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store Student objects
		
		ArrayList<Student> students = new ArrayList<>();
		
		//Initialize objects using parameterized constructor
		
		Student student1 = new Student("Siddhesh", 22);
		Student student2 = new Student("Rahul", 21);
		Student student3 = new Student("Amit", 23);
		
		// Add Student objects to the ArrayList
		
		students.add(student1);
		students.add(student2);
		students.add(student3);

		// Display the results
		
		System.out.println("=================================");
		System.out.println("  ARRAYLIST WITH CUSTOM OBJECTS  ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the ArrayList and display student details
		
		for (Student currentStudent : students) {
			
			currentStudent.displayStudent();
			
		}
		
		System.out.println("=================================");
		
	}

}
