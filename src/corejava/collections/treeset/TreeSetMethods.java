package corejava.collections.treeset;

/**
 * Topic: Collections Framework
 * Program: TreeSet Methods
 * Description: Demonstrates commonly used TreeSet methods such as add(), remove(), contains(), first(), last(), size(), isEmpty(), and clear().
 * Author: Siddhesh
 */

import java.util.TreeSet;

public class TreeSetMethods {
	
	public static void main(String[] args) {
		
		// Create a TreeSet to store student names
		
		TreeSet<String> studentNames = new TreeSet<>();

		// Add elements to the TreeSet
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("=================================================");
		System.out.println("                 TREESET METHODS                 ");
		System.out.println("=================================================");
		System.out.println();

		// Display the original TreeSet
		
		System.out.println("Original Set     : " + studentNames);
		System.out.println();

		// Add a new element using add()
		
		studentNames.add("Priya");
		
		System.out.println("After add()      : " + studentNames);
		System.out.println();

		// Remove an element using remove()
		
		studentNames.remove("Rahul");
		
		System.out.println("After remove()   : " + studentNames);
		System.out.println();

		// Check if an element exists using contains()
		
		System.out.println("Contains Amit    : " + studentNames.contains("Amit"));
		System.out.println();

		// Display the first element using first()
		
		System.out.println("First Student    : " + studentNames.first());
		System.out.println();

		// Display the last element using last()
		
		System.out.println("Last Student     : " + studentNames.last());
		System.out.println();

		// Display the size of the TreeSet
		
		System.out.println("Total Students   : " + studentNames.size());
		System.out.println();

		// Check whether the TreeSet is empty
		
		System.out.println("Is TreeSet Empty : " + studentNames.isEmpty());
		System.out.println();

		// Remove all elements using clear()
		
		studentNames.clear();
		
		System.out.println("After clear()    : " + studentNames);
		System.out.println();

		// Check whether the TreeSet is empty after clearing
		
		System.out.println("Is TreeSet Empty : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("=================================================");
		
	}

}
