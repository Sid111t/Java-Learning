package corejava.collections.vector;

/**
 * Topic: Collections Framework
 * Program: Vector Demo
 * Description: Demonstrates how to create a Vector, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		// Create a Vector to store student names
		
		Vector<String> studentNames = new Vector<>();

		// Add elements to the Vector
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("=======================================");
		System.out.println("              VECTOR DEMO              ");
		System.out.println("=======================================");
		System.out.println();

		// Display all elements of the Vector
		
		System.out.println("Student Names : " + studentNames);
		System.out.println();
		
		System.out.println("=======================================");
		
	}

}
