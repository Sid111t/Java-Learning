package corejava.collections.arraylist;

/**
 * Topic: Collections Framework
 * Program: ArrayList Methods
 * Description: Demonstrates commonly used ArrayList methods such as add(), get(), set(), remove(), contains(), size(), isEmpty(), and clear().
 * Author: Siddhesh
 */

import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store student names
		
		ArrayList<String> studentNames = new ArrayList<>();

		// Add elements to the ArrayList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");
		
		// Display the results
		
		System.out.println("===================================================");
		System.out.println("                 ARRAYLIST METHODS                 ");
		System.out.println("===================================================");
		System.out.println();
		
		// Display the original ArrayList
		
		System.out.println("Original List      : " + studentNames);
		System.out.println();

		// Access an element using get()
		
		System.out.println("Second Student     : " + studentNames.get(1));
		System.out.println();

		// Update an element using set()
		
		studentNames.set(1, "Rohan");
		
		System.out.println("Updated List       : " + studentNames);
		System.out.println();

		// Remove an element using remove()
		
		studentNames.remove(2);
		
		System.out.println("After Removing     : " + studentNames);
		System.out.println();

		// Check if an element exists using contains()
		
		System.out.println("Contains Rahul     : " + studentNames.contains("Rahul"));
		System.out.println();

		// Display the size of the ArrayList
		
		System.out.println("Total Students     : " + studentNames.size());
		System.out.println();

		// Check whether the ArrayList is empty
		
		System.out.println("Is ArrayList Empty : " + studentNames.isEmpty());
		System.out.println();

		// Remove all elements using clear()
		
		studentNames.clear();
		
		System.out.println("After Clearing     : " + studentNames);
		System.out.println();

		// Check whether the ArrayList is empty after clearing
		
		System.out.println("Is ArrayList Empty : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("===================================================");
		
	}

}
