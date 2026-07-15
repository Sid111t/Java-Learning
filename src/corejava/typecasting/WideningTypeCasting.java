package corejava.typecasting;

/**
 * Topic: Type Casting
 * Program: Widening Type Casting
 * Description: Demonstrates automatic conversion from int to double.
 * Author: Siddhesh
 */

public class WideningTypeCasting {

	public static void main(String[] args) {
		
		// Declare and initialize variables

		int number = 100;
		
		// Perform widening type casting
		
		double convertedNumber = number;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("       WIDENING TYPE CASTING      ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Original Integer Value : " + number);
		System.out.println("Converted Double Value : " + convertedNumber);
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
