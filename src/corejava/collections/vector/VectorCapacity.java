package corejava.collections.vector;

/**
 * Topic: Collections Framework
 * Program: Vector Capacity
 * Description: Demonstrates the difference between the size and capacity of a Vector and how its capacity grows as elements are added.
 * Author: Siddhesh
 */

import java.util.Vector;

public class VectorCapacity {
	
	public static void main(String[] args) {
		
		// Create a Vector with an initial capacity
		
		Vector<String> studentNames = new Vector<>(3);

		// Display the initial size and capacity
		
		System.out.println("=========================================================");
		System.out.println("                     VECTOR CAPACITY                     ");
		System.out.println("=========================================================");
		System.out.println();
		
		System.out.println("Initial Size     : " + studentNames.size());
		System.out.println("Initial Capacity : " + studentNames.capacity());
		System.out.println();

		// Add elements to the Vector
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the Vector contents
		
		System.out.println("Vector           : " + studentNames);
		System.out.println();

		// Display the size and capacity after adding elements
		
		System.out.println("Size             : " + studentNames.size());
		System.out.println("Capacity         : " + studentNames.capacity());
		System.out.println();

		// Add more elements to observe capacity growth
		
		studentNames.add("Priya");
		studentNames.add("Rohan");
		
		System.out.println("Vector           : " + studentNames);
		System.out.println();

		// Display the final size and capacity
		
		System.out.println("Final Size       : " + studentNames.size());
		System.out.println("Final Capacity   : " + studentNames.capacity());
		System.out.println();
		
		System.out.println("=========================================================");
		
	}

}
