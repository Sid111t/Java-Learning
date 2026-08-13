package corejava.collections.queue;

/**
 * Topic: Collections Framework
 * Program: Queue Methods
 * Description: Demonstrates commonly used Queue methods such as add(), offer(), peek(), poll(), remove(), element(), size(), and isEmpty().
 * Author: Siddhesh
 */

import java.util.Queue;
import java.util.LinkedList;

public class QueueMethods {
	
	public static void main(String[] args) {
		
		// Create a Queue to store student names
		
		Queue<String> studentNames = new LinkedList<>();

		// Add elements to the Queue
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("=================================================");
		System.out.println("                  QUEUE METHODS                  ");
		System.out.println("=================================================");
		System.out.println();

		// Display the original Queue
		
		System.out.println("Original Queue  : " + studentNames);
		System.out.println();

		// Add an element using offer()
		
		studentNames.offer("Priya");
		
		System.out.println("After offer()   : " + studentNames);
		System.out.println();

		// View the front element using peek()
		
		System.out.println("Front Student   : " + studentNames.peek());
		System.out.println();

		// Remove and return the front element using poll()
		
		System.out.println("Polled Student  : " + studentNames.poll());
		System.out.println();
		
		System.out.println("After poll()    : " + studentNames);
		System.out.println();

		// Remove the front element using remove()
		
		System.out.println("Removed Student : " + studentNames.remove());
		System.out.println();
		
		System.out.println("After remove()  : " + studentNames);
		System.out.println();

		// View the front element using element()
		
		System.out.println("Front Student   : " + studentNames.element());
		System.out.println();

		// Display the size of the Queue
		
		System.out.println("Queue Size      : " + studentNames.size());
		System.out.println();

		// Check whether the Queue is empty
		
		System.out.println("Is Queue Empty  : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("=================================================");
		
	}

}
