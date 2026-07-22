package corejava.loops;

/**
 * Topic: Loops
 * Program: Reverse Numbers
 * Description: Demonstrates the use of a for loop to print numbers from 10 to 1 in reverse order.
 * Author: Siddhesh
 */

public class ReverseNumbers {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int start = 10;
		int end = 1;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("         REVERSE NUMBERS          ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Range : 10 to 1");
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		for (int i = start; i >= end; i--) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("==================================");
	}

}
