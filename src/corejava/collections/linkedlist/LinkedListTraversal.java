package corejava.collections.linkedlist;

/**
 * Topic: Collections Framework
 * Program: LinkedList Traversal
 * Description: Demonstrates different ways to traverse a LinkedList using a for loop, enhanced for loop, and Iterator.
 * Author: Siddhesh
 */

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTraversal {
	
	public static void main(String[] args) {
		
		// Create a LinkedList to store student names
		
		LinkedList<String> studentNames = new LinkedList<>();

		// Add elements to the LinkedList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("==================================");
		System.out.println("       LINKEDLIST TRAVERSAL       ");
		System.out.println("==================================");
		System.out.println();

		// Traverse the LinkedList using a for loop
		
		System.out.println("Using for Loop");
		System.out.println();
		
		for (int i = 0; i < studentNames.size(); i++) {
			
			System.out.println(studentNames.get(i));
			
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Traverse the LinkedList using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Traverse the LinkedList using an Iterator
		
		System.out.println("Using Iterator");
		System.out.println();
		
		Iterator<String> it = studentNames.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
