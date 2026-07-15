package corejava.typecasting;

/**
 * Topic: Type Casting
 * Program: Narrowing Type Casting
 * Description: Demonstrates explicit conversion from double to int.
 * Author: Siddhesh
 */

public class NarrowingTypeCasting {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		double price = 99.99;
		
		// Perform narrowing type casting
		
		int amount = (int) price;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("      NARROWING TYPE CASTING      ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Original Double Value   : " + price);
		System.out.println("Converted Integer Value : " + amount);
		System.out.println();
		
		System.out.println("==================================");

	}

}
