package corejava.collections.arraylist;

/**
 * Topic: Collections Framework
 * Program: ArrayList Conversion
 * Description: Demonstrates how to convert an ArrayList into an array using the toArray() method.
 * Author: Siddhesh
 */

import java.util.ArrayList;

public class ArrayListConversion {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store student names
		
		ArrayList<String> studentNames = new ArrayList<>();

		// Add elements to the ArrayList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Convert the ArrayList to an array
		
		String[] array = studentNames.toArray(new String[0]);

		// Display the results
		
		System.out.println("==================================");
		System.out.println("       ARRAYLIST CONVERSION       ");
		System.out.println("==================================");
		System.out.println();

		// Traverse and display the array elements
		
		System.out.println("Array Elements");
		System.out.println();
		
		for (String currentStudent : array) {
			
			System.out.println(currentStudent);
			
		}
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
