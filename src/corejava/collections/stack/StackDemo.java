package corejava.collections.stack;

/**
 * Topic: Collections Framework
 * Program: Stack Demo
 * Description: Demonstrates how to create a Stack, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		// Create a Stack to store student names
		
		Stack<String> studentNames = new Stack<>();

		// Add elements to the Stack
		
		studentNames.push("Siddhesh");
		studentNames.push("Rahul");
		studentNames.push("Amit");

		// Display the results
		
		System.out.println("========================================");
		System.out.println("               STACK DEMO               ");
		System.out.println("========================================");
		System.out.println();

		// Display all elements of the Stack
		
		System.out.println("Student Stack : " + studentNames);
		System.out.println();
		
		System.out.println("========================================");
		
	}

}
