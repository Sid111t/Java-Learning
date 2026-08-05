package corejava.collections.linkedlist;

/**
 * Topic: Collections Framework
 * Program: LinkedList Searching
 * Description: Demonstrates how to search elements in a LinkedList using contains(), indexOf(), and lastIndexOf() methods.
 * Author: Siddhesh
 */

import java.util.LinkedList;

public class LinkedListSearching {
	
	public static void main(String[] args) {
		
		// Create a LinkedList to store student names
		
		LinkedList<String> studentNames = new LinkedList<>();
		
		// Add elements to the LinkedList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Rahul");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("======================================================");
		System.out.println("                 LINKEDLIST SEARCHING                 ");
		System.out.println("======================================================");
		System.out.println();

		// Display the original LinkedList
		
		System.out.println("Student List   : "  + studentNames);
		System.out.println();

		// Search an element using contains()
		
		System.out.println("Contains Rahul : " + studentNames.contains("Rahul"));
		System.out.println();

		// Find the index of an element using indexOf()
		
		System.out.println("First Index    : " + studentNames.indexOf("Rahul"));
		System.out.println();

		// Find the last occurrence of an element using lastIndexOf()
		
		System.out.println("Last Index     : " + studentNames.lastIndexOf("Rahul"));
		System.out.println();
		
		System.out.println("======================================================");
		
	}

}
