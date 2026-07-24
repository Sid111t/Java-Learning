package corejava.loops;

/**
 * Topic: Loops
 * Program: Print Numbers Using Do-While Loop
 * Description: Demonstrates the use of a do-while loop to print numbers from 1 to 10.
 * Author: Siddhesh
 */

public class PrintNumbersDoWhileLoop {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int i = 1;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("     PRINT NUMBERS (DO-WHILE)     ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Numbers : 1 to 10");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
			
		System.out.println();
		System.out.println("==================================");
	}

}
