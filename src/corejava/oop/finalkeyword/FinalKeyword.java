package corejava.oop.finalkeyword;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: final Keyword
 * Description: Demonstrates the use of the final keyword by creating a final class and explaining its behavior.
 * Author: Siddhesh
 */

public class FinalKeyword {
	
	public static void main(String[] args) {
		
		// Create a PersonFinal object
		
		PersonFinal person = new PersonFinal();

		// Display the results
		
		System.out.println("==================================");
		System.out.println("           FINAL KEYWORD          ");
		System.out.println("==================================");
		System.out.println();

		// Invoke the instance method
		
		person.displayMessage();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
