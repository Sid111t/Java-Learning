package corejava.oop.polymorphism;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Method Overriding
 * Description: Demonstrates method overriding by invoking an overridden method through a parent class reference, illustrating runtime polymorphism.
 * Author: Siddhesh
 */

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		// Create a parent class reference pointing to a child class object
		
		Animal animal = new Dog();

		// Display the results
		
		System.out.println("==================================");
		System.out.println("         METHOD OVERRIDING        ");
		System.out.println("==================================");
		System.out.println();

		// Invoke the overridden method using the parent reference
		
		animal.sound();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
