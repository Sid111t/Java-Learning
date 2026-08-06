package corejava.collections.hashset;

/**
 * Topic: Collections Framework
 * Program: HashSet Duplicate Elements
 * Description: Demonstrates that HashSet does not allow duplicate elements.
 * Author: Siddhesh
 */

import java.util.HashSet;

public class HashSetDuplicateElements {
	
	public static void main(String[] args) {
		
		// Create a HashSet to store student names
		
		HashSet<String> studentNames = new HashSet<>();

		// Add elements to the HashSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Attempt to add a duplicate element
		
		boolean isAdded = studentNames.add("Rahul");

		// Display the results
		
		System.out.println("==========================================");
		System.out.println("        HASHSET DUPLICATE ELEMENTS        ");
		System.out.println("==========================================");
		System.out.println();

		// Display whether the duplicate element was added
		
		System.out.println("Duplicate Added : " + isAdded);
		System.out.println();

		// Display all elements of the HashSet
		
		System.out.println("Student Names   : " + studentNames);
		System.out.println();
		
		System.out.println("==========================================");
		
	}

}
