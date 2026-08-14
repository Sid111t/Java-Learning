package corejava.collections.priorityqueue;

/**
 * Topic: Collections Framework
 * Program: PriorityQueue Searching
 * Description: Demonstrates how to search elements in a PriorityQueue using the contains() method.
 * Author: Siddhesh
 */

import java.util.PriorityQueue;

public class PriorityQueueSearching {
	
	public static void main(String[] args) {
		
		// Create a PriorityQueue to store student names
		
		PriorityQueue<String> studentNames = new PriorityQueue<>();

		// Add elements to the PriorityQueue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=======================================================");
		System.out.println("                PRIORITYQUEUE SEARCHING                ");
		System.out.println("=======================================================");
		System.out.println();

		// Display the original PriorityQueue
		
		System.out.println("Student PriorityQueue : " + studentNames);
		System.out.println();

		// Search for an existing element using contains()
		
		System.out.println("Contains Priya        : " + studentNames.contains("Priya"));
		System.out.println();

		// Search for another existing element using contains()
		
		System.out.println("Contains Rahul        : " + studentNames.contains("Rahul"));
		System.out.println();

		// Search for an element that does not exist using contains()
		
		System.out.println("Contains Rohan        : " + studentNames.contains("Rohan"));
		System.out.println();
		
		System.out.println("=======================================================");
		
	}

}
