package corejava.collections.stack;

/**
 * Topic: Collections Framework
 * Program: Stack Traversal
 * Description: Demonstrates different ways to traverse a Stack using a for loop and enhanced for loop.
 * Author: Siddhesh
 */

import java.util.Stack;

public class StackTraversal {
	
	public static void main(String[] args) {
		
		// Create a Stack to store student names
		
		Stack<String> studentNames = new Stack<>();

		// Add elements to the Stack
		
		studentNames.push("Siddhesh");
		studentNames.push("Rahul");
		studentNames.push("Amit");
		studentNames.push("Priya");

		// Display the results
		
		System.out.println("=================================");
		System.out.println("         STACK TRAVERSAL         ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the Stack using a for loop
		
		System.out.println("Using for Loop");
		System.out.println();
		
		for (int i = 0; i < studentNames.size(); i++) {
			
			System.out.println(studentNames.get(i));
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the Stack using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("=================================");
		
	}

}
