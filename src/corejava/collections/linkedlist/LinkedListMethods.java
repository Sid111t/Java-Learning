package corejava.collections.linkedlist;

/**
 * Topic: Collections Framework
 * Program: LinkedList Methods
 * Description: Demonstrates commonly used LinkedList-specific methods such as addFirst(), addLast(), getFirst(), getLast(), removeFirst(), and removeLast().
 * Author: Siddhesh
 */

import java.util.LinkedList;

public class LinkedListMethods {
	
	public static void main(String[] args) {
		
		// Create a LinkedList to store student names
		
		LinkedList<String> studentNames = new LinkedList<>();

		// Add elements to the LinkedList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("==========================================================");
		System.out.println("                    LINKEDLIST METHODS                    ");
		System.out.println("==========================================================");
		System.out.println();

		// Display the original LinkedList
		
		System.out.println("Original List     : " + studentNames);
		System.out.println();

		// Add an element at the beginning using addFirst()
		
		studentNames.addFirst("Priya");
		
		System.out.println("After addFirst    : " + studentNames);
		System.out.println();

		// Add an element at the end using addLast()
		
		studentNames.addLast("Rohan");
		
		System.out.println("After addLast     : " + studentNames);
		System.out.println();

		// Display the first element using getFirst()
		
		System.out.println("First Student     : " + studentNames.getFirst());
		System.out.println();

		// Display the last element using getLast()
		
		System.out.println("Last Student      : " + studentNames.getLast());
		System.out.println();

		// Remove the first element using removeFirst()
		
		studentNames.removeFirst();
		
		System.out.println("After removeFirst : " + studentNames);
		System.out.println();

		// Remove the last element using removeLast()
		
		studentNames.removeLast();
		
		System.out.println("After removeLast  : " + studentNames);
		System.out.println();
		
		System.out.println("==========================================================");
		
	}

}
