package corejava.collections.arraylist;

/**
 * Topic: Collections Framework
 * Program: ArrayList Sorting
 * Description: Demonstrates how to sort the elements of an ArrayList using the Collections.sort() method.
 * Author: Siddhesh
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store student names
		
		ArrayList<String> studentNames = new ArrayList<>();

		// Add elements to the ArrayList
		
		studentNames.add("Siddhesh");
		studentNames.add("Amit");
		studentNames.add("Rahul");
		studentNames.add("Priya");
		
		// Display the results
		
		System.out.println("=============================================");
		System.out.println("              ARRAYLIST SORTING              ");
		System.out.println("=============================================");
		System.out.println();

		// Display the original ArrayList
		
		System.out.println("Original List : " + studentNames);
		System.out.println();

		// Sort the ArrayList in ascending order
		
		Collections.sort(studentNames);

		// Display the sorted ArrayList
		
		System.out.println("Sorted List   : " + studentNames);
		System.out.println();
		
		System.out.println("=============================================");
		
	}

}
