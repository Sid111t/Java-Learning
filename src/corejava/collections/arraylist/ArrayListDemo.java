package corejava.collections.arraylist;

/**
 * Topic: Collections Framework
 * Program: ArrayList Demo
 * Description: Demonstrates how to create an ArrayList, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store student names
		
		ArrayList<String> studentNames = new ArrayList<>();

		// Add elements to the ArrayList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("=======================================");
		System.out.println("             ARRAYLIST DEMO            ");
		System.out.println("=======================================");
		System.out.println();

		// Display all elements of the ArrayList
		
		System.out.println("Student Names : " + studentNames);
		System.out.println();
		
		System.out.println("=======================================");
		
	}

}
