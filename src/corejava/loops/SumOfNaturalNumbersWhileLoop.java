package corejava.loops;

/**
 * Topic: Loops
 * Program: Sum of First 10 Natural Numbers Using While Loop
 * Description: Demonstrates the use of a while loop to calculate the sum of the first 10 natural numbers.
 * Author: Siddhesh
 */

public class SumOfNaturalNumbersWhileLoop {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int i = 1;
		int sum = 0;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("  SUM OF NATURAL NUMBERS (WHILE)  ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Numbers : 1 to 10");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum     : " + sum);
		System.out.println();
		System.out.println("==================================");
	}

}
