package corejava.collections.stack.customobject;

/**
 * Topic: Collections Framework
 * Program: Stack with Custom Objects
 * Description: Demonstrates how to store and traverse custom objects in a Stack.
 * Author: Siddhesh
 */

import java.util.Stack;

public class StackCustomObject {
	
	public static void main(String[] args) {
		
		// Create a Stack to store Student objects
		
		Stack<Student> studentDetails = new Stack<>();

		// Create Student objects using the parameterized constructor
		
		Student student1 = new Student(101, "Siddhesh", 22);
		Student student2 = new Student(102, "Rahul", 21);
		Student student3 = new Student(103, "Amit", 23);

		// Add Student objects to the Stack
		
		studentDetails.push(student1);
		studentDetails.push(student2);
		studentDetails.push(student3);

		// Display the results
		
		System.out.println("=================================");
		System.out.println("    STACK WITH CUSTOM OBJECTS    ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the Stack and display student details
		
		for (Student currentStudent : studentDetails) {
			
			currentStudent.displayStudent();
			
		}
		
		System.out.println("=================================");
		
	}

}
