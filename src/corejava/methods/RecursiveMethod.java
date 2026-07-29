package corejava.methods;

/**
 * Topic: Methods
 * Program: Recursive Method
 * Description: Demonstrates the use of recursion to calculate the factorial of a number.
 * Author: Siddhesh
 */

public class RecursiveMethod {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 5;
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("       RECURSIVE METHOD       ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Number    : " + number);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Calculate the factorial using the factorial() method
		
		int factorial = factorial(number);
		
		System.out.println("Factorial : " + factorial);
		System.out.println();
		
		System.out.println("==============================");
		
	}
	
	// Recursive method to calculate the factorial of a number
	
	public static int factorial(int number) {
		
		if (number == 0) {
			return 1;
		}
		
		return number * factorial(number - 1);
		
	}

}
