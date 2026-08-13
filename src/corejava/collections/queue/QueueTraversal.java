package corejava.collections.queue;

/**
 * Topic: Collections Framework
 * Program: Queue Traversal
 * Description: Demonstrates different ways to traverse a Queue using an enhanced for loop and Iterator.
 * Author: Siddhesh
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class QueueTraversal {
	
	public static void main(String[] args) {
		
		// Create a Queue to store student names
		
		Queue<String> studentNames = new LinkedList<>();

		// Add elements to the Queue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=================================");
		System.out.println("         QUEUE TRAVERSAL         ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the Queue using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the Queue using an Iterator
		
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
