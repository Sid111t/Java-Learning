package corejava.collections.arraylist;

/**
 * Topic: Collections Framework
 * Program: ArrayList Searching
 * Description: Demonstrates how to search elements in an ArrayList using contains(), indexOf(), and lastIndexOf() methods.
 * Author: Siddhesh
 */

import java.util.ArrayList;

public class ArrayListSearching {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store student names
		
		ArrayList<String> studentNames = new ArrayList<>();

		// Add elements to the ArrayList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Rahul");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=======================================================");
		System.out.println("                  ARRAYLIST SEARCHING                  ");
		System.out.println("=======================================================");
		System.out.println();
		
		// Display the original ArrayList
		
		System.out.println("Student List   : " + studentNames);
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
		
		System.out.println("=======================================================");
		
	}

}
