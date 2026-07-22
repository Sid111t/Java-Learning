package corejava.loops;

/**
 * Topic: Loops
 * Program: Even Numbers
 * Description: Demonstrates the use of a for loop to print even numbers from 1 to 20.
 * Author: Siddhesh
 */

public class EvenNumbers {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int start = 1;
		int end = 20;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("           EVEN NUMBERS           ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Range : 1 to 20");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("==================================");
	}

}
