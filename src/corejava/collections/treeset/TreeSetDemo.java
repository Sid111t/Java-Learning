package corejava.collections.treeset;

/**
 * Topic: Collections Framework
 * Program: TreeSet Demo
 * Description: Demonstrates how to create a TreeSet, add elements, and display its contents in sorted order.
 * Author: Siddhesh
 */

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		// Create a TreeSet to store student names
		
		TreeSet<String> studentNames = new TreeSet<>();

		// Add elements to the TreeSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("========================================");
		System.out.println("              TREESET DEMO              ");
		System.out.println("========================================");
		System.out.println();

		// Display all elements of the TreeSet
		
		System.out.println("Student Names : " + studentNames);
		System.out.println();
		
		System.out.println("========================================");
		
	}

}
