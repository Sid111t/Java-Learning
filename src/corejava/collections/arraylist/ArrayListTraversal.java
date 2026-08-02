package corejava.collections.arraylist;

/**
 * Topic: Collections Framework
 * Program: ArrayList Traversal
 * Description: Demonstrates different ways to traverse an ArrayList using a for loop, enhanced for loop, and Iterator.
 * Author: Siddhesh
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {
	
	public static void main(String[] args) {
		
		// Create an ArrayList to store student names
		
		ArrayList<String> studentNames = new ArrayList<>();

		// Add elements to the ArrayList
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");
		studentNames.add("Priya");

		// Display the results
		
		System.out.println("=================================");
		System.out.println("       ARRAYLIST TRAVERSAL       ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the ArrayList using a for loop
		
		System.out.println("Using for Loop");
		System.out.println();
		
		for (int i = 0; i < studentNames.size(); i++) {
			
			System.out.println(studentNames.get(i));
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the ArrayList using an enhanced for loop
		
		System.out.println("Using Enhanced for Loop");
		System.out.println();
		
		for (String student : studentNames) {
			
			System.out.println(student);
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();

		// Traverse the ArrayList using an Iterator
		
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
