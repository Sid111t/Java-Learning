package corejava.loops;

/**
 * Topic: Loops
 * Program: Sum of First 10 Natural Numbers
 * Description: Demonstrates the use of a for loop to calculate the sum of the first 10 natural numbers.
 * Author: Siddhesh
 */

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int sum = 0;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("      SUM OF NATURAL NUMBERS      ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Numbers : 1 to 10");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum     : " + sum);
		System.out.println();
		System.out.println("==================================");
		
	}

}
