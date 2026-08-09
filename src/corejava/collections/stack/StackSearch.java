package corejava.collections.stack;

/**
 * Topic: Collections Framework
 * Program: Stack Searching
 * Description: Demonstrates how to search elements in a Stack using the search() method.
 * Author: Siddhesh
 */

import java.util.Stack;

public class StackSearch {
	
	public static void main(String[] args) {
		
		// Create a Stack to store student names
		
		Stack<String> studentNames = new Stack<>();

		// Add elements to the Stack
		
		studentNames.push("Siddhesh");
		studentNames.push("Rahul");
		studentNames.push("Amit");
		studentNames.push("Priya");

		// Display the results
		
		System.out.println("===============================================");
		System.out.println("                STACK SEARCHING                ");
		System.out.println("===============================================");
		System.out.println();

		// Display the original Stack
		
		System.out.println("Student Stack : " + studentNames);
		System.out.println();

		// Search for an element using search()
		
		System.out.println("Search Priya  : " + studentNames.search("Priya"));
		System.out.println();

		// Search for another element using search()
		
		System.out.println("Search Rahul  : " + studentNames.search("Rahul"));
		System.out.println();

		// Check for an element that does not exist
		
		System.out.println("Search Rohan  : " + studentNames.search("Rohan"));
		System.out.println();
		
		System.out.println("===============================================");
		
	}

}
