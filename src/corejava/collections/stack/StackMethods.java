package corejava.collections.stack;

/**
 * Topic: Collections Framework
 * Program: Stack Methods
 * Description: Demonstrates commonly used Stack methods such as push(), pop(), peek(), search(), size(), and isEmpty().
 * Author: Siddhesh
 */

import java.util.Stack;

public class StackMethods {
	
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
		System.out.println("                 STACK METHODS                 ");
		System.out.println("===============================================");
		System.out.println();

		// Display the original Stack
		
		System.out.println("Original Stack : " + studentNames);
		System.out.println();

		// View the top element using peek()
		
		System.out.println("Top Student    : " + studentNames.peek());
		System.out.println();

		// Remove the top element using pop()
		
		System.out.println("Popped Student : " + studentNames.pop());
		System.out.println();

		// Search for an element using search()
		
		System.out.println("Search Rahul   : " + studentNames.search("Rahul"));
		System.out.println();

		// Display the size of the Stack
		
		System.out.println("Stack Size     : " + studentNames.size());
		System.out.println();

		// Check whether the Stack is empty
		
		System.out.println("Is Stack Empty : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("===============================================");
		
	}

}
