package corejava.methods;

/**
 * Topic: Methods
 * Program: Method with Return Value
 * Description: Demonstrates the use of a method that returns a value using the return keyword.
 * Author: Siddhesh
 */

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 5;
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("   METHOD WITH RETURN VALUE   ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Number : " + number);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Calculate the square using the calculateSquare() method
		
		int square = calculateSquare(number);
		
		System.out.println("Square : " + square);
		System.out.println();
		
		System.out.println("==============================");
		
	}
	
	// Method to calculate and return the square of a number
	
	public static int calculateSquare(int number) {
		
		return number * number;
		
	}

}
