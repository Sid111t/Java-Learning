package corejava.collections.priorityqueue;

/**
 * Topic: Collections Framework
 * Program: PriorityQueue Methods
 * Description: Demonstrates commonly used PriorityQueue methods such as add(), offer(), peek(), poll(), remove(), size(), and isEmpty().
 * Author: Siddhesh
 */

import java.util.PriorityQueue;

public class PriorityQueueMethods {
	
	public static void main(String[] args) {
		
		// Create a PriorityQueue to store student names
		
		PriorityQueue<String> studentNames = new PriorityQueue<>();

		// Add elements to the PriorityQueue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("==============================================================");
		System.out.println("                      PRIORITYQUEUE DEMO                      ");
		System.out.println("==============================================================");
		System.out.println();

		// Display the original PriorityQueue
		
		System.out.println("Original PriorityQueue : " + studentNames);
		System.out.println();

		// Add an element using offer()
		
		studentNames.offer("Rohan");
		
		System.out.println("After offer()          : " + studentNames);
		System.out.println();

		// View the highest-priority element using peek()
		
		System.out.println("Highest Priority       : " + studentNames.peek());
		System.out.println();

		// Remove and return the highest-priority element using poll()
		
		System.out.println("Polled Student         : " + studentNames.poll());
		System.out.println();
		
		System.out.println("After poll()           : " + studentNames);
		System.out.println();

		// Remove the highest-priority element using remove()
		
		System.out.println("Removed Student        : " + studentNames.remove());
		System.out.println();
		
		System.out.println("After remove()         : " + studentNames);
		System.out.println();

		// Display the size of the PriorityQueue
		
		System.out.println("PriorityQueue Size     : " + studentNames.size());
		System.out.println();

		// Check whether the PriorityQueue is empty

		System.out.println("Is PriorityQueue Empty : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("==============================================================");
		
	}

}
