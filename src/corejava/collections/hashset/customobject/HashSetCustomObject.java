package corejava.collections.hashset.customobject;

/**
 * Topic: Collections Framework
 * Program: HashSet with Custom Objects
 * Description: Demonstrates how to store and traverse custom objects in a HashSet.
 * Author: Siddhesh
 */

import java.util.HashSet;

public class HashSetCustomObject {
	
	public static void main(String[] args) {
		
		// Create a HashSet to store Student objects
		
		HashSet<Student> students = new HashSet<>();

		// Initialize Student objects using the parameterized constructor
		
		Student student1 = new Student("Siddhesh", 22);
		Student student2 = new Student("Rahul", 21);
		Student student3 = new Student("Amit", 23);

		// Add Student objects to the HashSet
		
		students.add(student1);
		students.add(student2);
		students.add(student3);

		// Display the results
		
		System.out.println("=================================");
		System.out.println("   HASHSET WITH CUSTOM OBJECTS   ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the HashSet and display student details
		
		for (Student student : students) {
			
			student.displayStudent();
			
		}
		
		System.out.println("=================================");
		
	}

}
