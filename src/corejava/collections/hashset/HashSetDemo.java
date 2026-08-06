package corejava.collections.hashset;

/**
 * Topic: Collections Framework
 * Program: HashSet Demo
 * Description: Demonstrates how to create a HashSet, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		// Create a HashSet to store student names
		
		HashSet<String> studentNames = new HashSet<>();

		// Add elements to the HashSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("========================================");
		System.out.println("              HASHSET DEMO              ");
		System.out.println("========================================");
		System.out.println();

		// Display all elements of the HashSet
		
		System.out.println("Student Names : " + studentNames);
		System.out.println();
		
		System.out.println("========================================");
		
	}

}
