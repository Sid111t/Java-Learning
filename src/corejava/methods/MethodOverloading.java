package corejava.methods;

/**
 * Topic: Methods
 * Program: Method Overloading
 * Description: Demonstrates method overloading by creating multiple methods with the same name but different parameters.
 * Author: Siddhesh
 */

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int firstNumber = 10;
		int secondNumber = 20;
		int thirdNumber = 30;
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("      METHOD OVERLOADING      ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("First Number    : " + firstNumber);
		System.out.println("Second Number   : " + secondNumber);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Calculate the sum using overloaded methods
		
		int sum1 = calculateSum(firstNumber, secondNumber);
		
		System.out.println("Sum (2 Numbers) : " + sum1);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		System.out.println("First Number    : " + firstNumber);
		System.out.println("Second Number   : " + secondNumber);
		System.out.println("Third Number    : " + thirdNumber);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		int sum2 = calculateSum(firstNumber, secondNumber, thirdNumber);
		
		System.out.println("Sum (3 Numbers) : " + sum2);
		System.out.println();
		
		System.out.println("==============================");
		
	}
	
	// Method to calculate the sum of two integers
	
	public static int calculateSum(int firstNumber, int secondNumber) {
		
		return firstNumber + secondNumber;
		
	}
	
	// Method to calculate the sum of three integers
	
	public static int calculateSum(int firstNumber, int secondNumber, int thirdNumber) {
		
		return firstNumber + secondNumber + thirdNumber;
		
	}

}
