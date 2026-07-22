package corejava.loops;

/**
 * Topic: Loops
 * Program: Factorial of a Number
 * Description: Demonstrates the use of a for loop to calculate the factorial of a number.
 * Author: Siddhesh
 */

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 5;
		long factorial = 1;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("        FACTORIAL OF NUMBER       ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Number : " + number);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial : " + factorial);
		System.out.println();
		
		System.out.println("==================================");
	}

}
