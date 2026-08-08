package corejava.collections.vector;

/**
 * Topic: Collections Framework
 * Program: Vector Traversal
 * Description: Demonstrates different ways to traverse a Vector using a for loop, enhanced for loop, Iterator, and Enumeration.
 * Author: Siddhesh
 */

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class VectorTraversal {
	
	public static void main(String[] args) {
		
		// Create a Vector to store student names
		
		Vector<String> studentNames = new Vector<>();

		// Add elements to the Vector
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("==================================");
		System.out.println("         VECTOR TRAVERSAL         ");
		System.out.println("==================================");
		System.out.println();

		// Traverse the Vector using a for loop
		
		System.out.println("Using for Loop");
		System.out.println();
		
		for (int i = 0; i < studentNames.size(); i++) {
			
			System.out.println(studentNames.get(i));
			
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Traverse the Vector using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Traverse the Vector using an Iterator
		
		System.out.println("Using Iterator");
		System.out.println();
		
		Iterator<String> it = studentNames.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Traverse the Vector using an Enumeration
		
		System.out.println("Using Enumeration");
		System.out.println();
		
		Enumeration<String> e = studentNames.elements();
		
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
