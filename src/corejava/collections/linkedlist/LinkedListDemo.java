package corejava.collections.linkedlist;

/**
 * Topic: Collections Framework
 * Program: LinkedList Demo
 * Description: Demonstrates how to create a LinkedList, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		// Create a LinkedList to store student names
		
		LinkedList<String> studentNames = new LinkedList<>();

		// Add elements to the LinkedList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("=======================================");
		System.out.println("            LINKEDLIST DEMO            ");
		System.out.println("=======================================");
		System.out.println();

		// Display all elements of the LinkedList
		
		System.out.println("Student Names : " + studentNames);
		System.out.println();
		
		System.out.println("=======================================");
		
	}

}
