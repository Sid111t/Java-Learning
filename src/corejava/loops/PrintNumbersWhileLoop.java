package corejava.loops;

/**
 * Topic: Loops
 * Program: Print Numbers Using While Loop
 * Description: Demonstrates the use of a while loop to print numbers from 1 to 10.
 * Author: Siddhesh
 */

public class PrintNumbersWhileLoop {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int i = 1;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("       PRINT NUMBERS (WHILE)      ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Numbers : 1 to 10");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		System.out.println("==================================");

	}

}
