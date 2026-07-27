package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Sum of Array Elements
 * Description: Demonstrates the use of a for loop to calculate the sum of all elements in an array.
 * Author: Siddhesh
 */

public class SumOfArrayElements {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};
		int sum = 0;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("     SUM OF ARRAY ELEMENTS    ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform calculations
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum        : " + sum);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
