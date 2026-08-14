package corejava.collections.priorityqueue;

/**
 * Topic: Collections Framework
 * Program: PriorityQueue Demo
 * Description: Demonstrates how to create a PriorityQueue, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		// Create a PriorityQueue to store student names
		
		PriorityQueue<String> studentNames = new PriorityQueue<>();

		// Add elements to the PriorityQueue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("======================================================");
		System.out.println("                  PRIORITYQUEUE DEMO                  ");
		System.out.println("======================================================");
		System.out.println();

		// Display the PriorityQueue
		
		System.out.println("Student PriorityQueue : " + studentNames);
		System.out.println();
		
		System.out.println("======================================================");
		
	}

}
