package corejava.collections.vector;

/**
 * Topic: Collections Framework
 * Program: Vector Methods
 * Description: Demonstrates commonly used Vector methods such as add(), addElement(), get(), set(), remove(), contains(), size(), clear(), and isEmpty().
 * Author: Siddhesh
 */

import java.util.Vector;

public class VectorMethods {
	
	public static void main(String[] args) {
		
		// Create a Vector to store student names
		
		Vector<String> studentNames = new Vector<>();

		// Add elements to the Vector
		
		studentNames.add("Siddhesh");
		studentNames.add("Rahul");
		studentNames.add("Amit");

		// Display the results
		
		System.out.println("====================================================");
		System.out.println("                   VECTOR METHODS                   ");
		System.out.println("====================================================");
		System.out.println();

		// Display the original Vector
		
		System.out.println("Original Vector    : " + studentNames);
		System.out.println();

		// Add an element using addElement()
		
		studentNames.addElement("Priya");
		
		System.out.println("After addElement() : " + studentNames);
		System.out.println();

		// Access an element using get()
		
		System.out.println("Second Student     : " + studentNames.get(1));
		System.out.println();

		// Update an element using set()
		
		studentNames.set(1, "Rohan");
		
		System.out.println("Updated Vector     : " + studentNames);
		System.out.println();

		// Remove an element using remove()
		
		studentNames.remove(2);
		
		System.out.println("After remove()     : " + studentNames);
		System.out.println();

		// Check if an element exists using contains()
		
		System.out.println("Contains Rohan     : " + studentNames.contains("Rohan"));
		System.out.println();

		// Display the size of the Vector
		
		System.out.println("Total Students     : " + studentNames.size());
		System.out.println();

		// Remove all elements using clear()
		
		studentNames.clear();
		
		System.out.println("After clear()      : " + studentNames);
		System.out.println();

		// Check whether the Vector is empty after clearing
		
		System.out.println("Is Vector Empty    : " + studentNames.isEmpty());
		System.out.println();
		
		System.out.println("====================================================");
		
	}

}
