package corejava.oop.abstraction;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Abstraction
 * Description: Demonstrates abstraction using an abstract class and an abstract method.
 * Author: Siddhesh
 */

public class Abstraction {
	
	public static void main(String[] args) {
		
		// Create a Circle object
		
		Shape circle = new Circle();

		// Display the results
		
		System.out.println("==================================");
		System.out.println("            ABSTRACTION           ");
		System.out.println("==================================");
		System.out.println();

		// Invoke the implemented abstract method
		
		circle.draw();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
