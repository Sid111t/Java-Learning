package corejava.collections.priorityqueue;

/**
 * Topic: Collections Framework
 * Program: PriorityQueue Traversal
 * Description: Demonstrates different ways to traverse a PriorityQueue using an enhanced for loop and Iterator.
 * Author: Siddhesh
 */

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueTraversal {
	
	public static void main(String[] args) {
		
		// Create a PriorityQueue to store student names
		
		PriorityQueue<String> studentNames = new PriorityQueue<>();

		// Add elements to the PriorityQueue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=================================");
		System.out.println("     PRIORITYQUEUE TRAVERSAL     ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the PriorityQueue using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the PriorityQueue using an Iterator
		
		System.out.println("Using Iterator");
		System.out.println();
		
		Iterator<String> it = studentNames.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		System.out.println();
		
		System.out.println("=================================");
		
	}

}
