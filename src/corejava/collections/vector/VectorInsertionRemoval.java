package corejava.collections.vector;

/**
 * Topic: Collections Framework
 * Program: Vector Insertion and Removal
 * Description: Demonstrates inserting and removing elements at specific positions in a Vector.
 * Author: Siddhesh
 */

import java.util.Vector;

public class VectorInsertionRemoval {
	
	public static void main(String[] args) {
		
		// Create a Vector to store student names
		
		Vector<String> studentNames = new Vector<>();

		// Add elements to the Vector
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("==============================================================");
		System.out.println("                 VECTOR INSERTION AND REMOVAL                 ");
		System.out.println("==============================================================");
		System.out.println();

		// Display the original Vector
		
		System.out.println("Original Vector        : " + studentNames);
		System.out.println();

		// Insert an element at a specific index
		
		studentNames.add(2, "Rohan");

		// Display the Vector after insertion
		
		System.out.println("After Insertion        : " + studentNames);
		System.out.println();

		// Remove an element from a specific index
		
		studentNames.remove(1);

		// Display the Vector after removal
		
		System.out.println("After Removing Index 1 : " + studentNames);
		System.out.println();

		// Insert an element at the beginning
		
		studentNames.add(0, "Neha");

		// Display the Vector after insertion at the beginning
		
		System.out.println("After Inserting First  : " + studentNames);
		System.out.println();

		// Remove the last element
		
		studentNames.remove(studentNames.size() - 1);

		// Display the Vector after removal
		
		System.out.println("After Removing Last    : " + studentNames);
		System.out.println();
		
		System.out.println("==============================================================");
		
	}

}
