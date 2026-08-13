package corejava.collections.queue;

/**
 * Topic: Collections Framework
 * Program: Queue Searching
 * Description: Demonstrates how to search elements in a Queue using the contains() method.
 * Author: Siddhesh
 */

import java.util.Queue;
import java.util.LinkedList;

public class QueueSearching {
	
	public static void main(String[] args) {
		
		// Create a Queue to store student names
		
		Queue<String> studentNames = new LinkedList<>();

		// Add elements to the Queue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=================================================");
		System.out.println("                 QUEUE SEARCHING                 ");
		System.out.println("=================================================");
		System.out.println();

		// Display the original Queue
		
		System.out.println("Student Queue  : " + studentNames);
		System.out.println();

		// Search for an existing element using contains()
		
		System.out.println("Contains Priya : " + studentNames.contains("Priya"));
		System.out.println();

		// Search for another existing element using contains()
		
		System.out.println("Contains Rahul : " + studentNames.contains("Rahul"));
		System.out.println();

		// Search for an element that does not exist using contains()
		
		System.out.println("Contains Rohan : " + studentNames.contains("Rohan"));
		System.out.println();
		
		System.out.println("=================================================");
		
	}

}
