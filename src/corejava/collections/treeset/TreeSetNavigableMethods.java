package corejava.collections.treeset;

/**
 * Topic: Collections Framework
 * Program: TreeSet Navigable Methods
 * Description: Demonstrates commonly used TreeSet navigable methods such as higher(), lower(), ceiling(), floor(), pollFirst(), and pollLast().
 * Author: Siddhesh
 */

import java.util.TreeSet;

public class TreeSetNavigableMethods {
	
	public static void main(String[] args) {
		
		// Create a TreeSet to store student names
		
		TreeSet<String> studentNames = new TreeSet<>();

		// Add elements to the TreeSet
		
		studentNames.add("Amit");
		studentNames.add("Priya");
		studentNames.add("Rahul");
		studentNames.add("Siddhesh");

		// Display the results
		
		System.out.println("===================================================");
		System.out.println("             TREESET NAVIGABLE METHODS             ");
		System.out.println("===================================================");
		System.out.println();

		// Display the original TreeSet
		
		System.out.println("Original Set      : " + studentNames);
		System.out.println();

		// Find the element higher than a given element using higher()
		
		System.out.println("Higher than Priya : " + studentNames.higher("Priya"));
		System.out.println();

		// Find the element lower than a given element using lower()
		
		System.out.println("Lower than Rahul  : " + studentNames.lower("Rahul"));
		System.out.println();
		
		// Find the ceiling element using ceiling()
		
		System.out.println("Ceiling of Priya  : " + studentNames.ceiling("Priya"));
		System.out.println();

		// Find the floor element using floor()
		
		System.out.println("Floor of Rahul    : " + studentNames.floor("Rahul"));
		System.out.println();

		// Remove and return the first element using pollFirst()
		
		System.out.println("pollFirst()       : " + studentNames.pollFirst());
		System.out.println();
		
		// Display the TreeSet after pollFirst()
		
		System.out.println("After pollFirst() : " + studentNames);
		System.out.println();

		// Remove and return the last element using pollLast()
		
		System.out.println("pollLast()        : " + studentNames.pollLast());
		System.out.println();

		// Display the TreeSet after pollLast()
		
		System.out.println("After pollLast()  : " + studentNames);
		System.out.println();
		
		System.out.println("===================================================");
		
	}

}
