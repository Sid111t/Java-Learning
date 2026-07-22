package corejava.loops;

/**
 * Topic: Loops
 * Program: Multiplication Table
 * Description: Demonstrates the use of a for loop to display the multiplication table of a number.
 * Author: Siddhesh
 */

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 5;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("       MULTIPLICATION TABLE       ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Number : " + number);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number*i));
		}
		System.out.println();
		System.out.println("==================================");
		
	}

}
