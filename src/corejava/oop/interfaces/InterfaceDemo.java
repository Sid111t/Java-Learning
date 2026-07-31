package corejava.oop.interfaces;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Interface
 * Description: Demonstrates the use of an interface by implementing its abstract method in a class.
 * Author: Siddhesh
 */

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		// Create a Document object
		
		Printable document = new Document();

		// Display the results
		
		System.out.println("==================================");
		System.out.println("            INTERFACE             ");
		System.out.println("==================================");
		System.out.println();

		// Invoke the implemented interface method
		
		document.print();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
