package corejava.loops;

/**
 * Topic: Loops
 * Program: Sum of Odd Numbers
 * Description: Demonstrates the use of a for loop to calculate the sum of odd numbers from 1 to 20.
 * Author: Siddhesh
 */

public class SumOfOddNumbers {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int start = 1;
		int end = 20;
		int sum = 0;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("        SUM OF ODD NUMBERS        ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Range : 1 to 20");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum   : " + sum);
		System.out.println();
		
		System.out.println("==================================");
	}

}
