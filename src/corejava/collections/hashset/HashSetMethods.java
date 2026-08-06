package corejava.collections.hashset;

/**
 * Topic: Collections Framework
 * Program: HashSet Methods
 * Description: Demonstrates commonly used HashSet methods such as add(), remove(), contains(), size(), isEmpty(), and clear().
 * Author: Siddhesh
 */

import java.util.HashSet;

public class HashSetMethods {
	
	public static void main(String[] args) {
		
		// Create a HashSet to store student names
		
		HashSet<String> studentNames = new HashSet<>();

		// Add elements to the HashSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("===============================================");
		System.out.println("                HASHSET METHODS                ");
		System.out.println("===============================================");
		System.out.println();

		// Display the original HashSet
		
		System.out.println("Original Set     : " + studentNames);
		System.out.println();

		// Add a new element using add()
		
		studentNames.add("Priya");
		
		System.out.println("After add()      : " + studentNames);
		System.out.println();

		// Remove an element using remove()
		
		studentNames.remove("Rahul");
		
		System.out.println("After remove()   : " + studentNames);
		System.out.println();

		// Check if an element exists using contains()
		
		System.out.println("Contains Amit    : " + studentNames.contains("Amit"));
		System.out.println();

		// Display the size of the HashSet
		
		System.out.println("Total Students   : " + studentNames.size());
		System.out.println();

		// Check whether the HashSet is empty
		
		System.out.println("Is HashSet Empty : " + studentNames.isEmpty());
		System.out.println();

		// Remove all elements using clear()
		
		studentNames.clear();
		
		System.out.println("After clear()    : " + studentNames);
		System.out.println();

		// Check whether the HashSet is empty after clearing
		
		System.out.println("Is HashSet Empty : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("===============================================");
		
	}

}
