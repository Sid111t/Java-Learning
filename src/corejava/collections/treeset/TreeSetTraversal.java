package corejava.collections.treeset;

/**
 * Topic: Collections Framework
 * Program: TreeSet Traversal
 * Description: Demonstrates different ways to traverse a TreeSet using an enhanced for loop and Iterator.
 * Author: Siddhesh
 */

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTraversal {
	
	public static void main(String[] args) {
		
		// Create a TreeSet to store student names
		
		TreeSet<String> studentNames = new TreeSet<>();

		// Add elements to the TreeSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=================================");
		System.out.println("        TREESET TRAVERSAL        ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the TreeSet using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the TreeSet using an Iterator
		
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
