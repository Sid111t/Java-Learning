package corejava.loops;

/**
 * Topic: Loops
 * Program: Factorial of a Number Using While Loop
 * Description: Demonstrates the use of a while loop to calculate the factorial of a number.
 * Author: Siddhesh
 */

public class FactorialWhileLoop {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 5;
		int i = 1;
		long factorial = 1;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("  FACTORIAL OF NUMBER (WHILE) ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Number    : " + number);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform calculations
		
		while (i <= number) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("Factorial : " + factorial);
		System.out.println();
		System.out.println("==============================");
	}

}
