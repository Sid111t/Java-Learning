package corejava.loops;

/**
 * Topic: Loops
 * Program: Even Numbers Using While Loop
 * Description: Demonstrates the use of a while loop to print even numbers from 1 to 20.
 * Author: Siddhesh
 */

public class EvenNumbersWhileLoop {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int start = 1;
		int end = 20;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("     EVEN NUMBERS (WHILE)     ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Range : 1 to 20");
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform calculations
		
		while (start <= end) {
			if (start % 2 == 0) {
				System.out.println(start);
			}
			start++;
		}
		System.out.println(); 
		System.out.println("==============================");
	}

}
