package corejava.collections.queue;

/**
 * Topic: Collections Framework
 * Program: Queue Demo
 * Description: Demonstrates how to create a Queue, add elements, and display its contents.
 * Author: Siddhesh
 */

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		// Create a Queue to store student names
		
		Queue<String> studentNames = new LinkedList<>();

		// Add elements to the Queue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("========================================");
		System.out.println("               QUEUE DEMO               ");
		System.out.println("========================================");
		System.out.println();

		// Display all elements of the Queue
		
		System.out.println("Student Queue : " + studentNames);
		System.out.println();
		
		System.out.println("========================================");
		
	}

}
