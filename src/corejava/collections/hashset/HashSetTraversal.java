package corejava.collections.hashset;

/**
 * Topic: Collections Framework
 * Program: HashSet Traversal
 * Description: Demonstrates different ways to traverse a HashSet using an enhanced for loop and Iterator.
 * Author: Siddhesh
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversal {
	
	public static void main(String[] args) {
		
		// Create a HashSet to store student names
		
		HashSet<String> studentNames = new HashSet<>();

		// Add elements to the HashSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=================================");
		System.out.println("        HASHSET TRAVERSAL        ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the HashSet using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the HashSet using an Iterator
		
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
