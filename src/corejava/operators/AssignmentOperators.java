package corejava.operators;

/**
 * Topic: Operators
 * Program: Assignment Operators
 * Description: Demonstrates the use of assignment operators in Java.
 * Author: Siddhesh
 */

public class AssignmentOperators {

	public static void main(String[] args) {
		
		// Declare and initialize the variable
		
		int number = 20;
		
		// Display the original value
		
		System.out.println("==================================");
		System.out.println("       ASSIGNMENT OPERATORS       ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Original Value : " + number);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Apply assignment operators
		
		number += 10;
		
		// Display the updated values
		
		System.out.println("After += 10    : " + number );
		
		number -= 5;
		System.out.println("After -= 5     : " + number );
		
		number *= 2;
		System.out.println("After *= 2     : " + number );
		
		number /= 5;
		System.out.println("After /= 5     : " + number );
		
		number %= 3;
		System.out.println("After %= 3     : " + number );
		System.out.println();
		
		System.out.println("==================================");
	}

}
