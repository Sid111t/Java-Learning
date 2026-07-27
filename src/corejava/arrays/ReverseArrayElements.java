package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Reverse Array Elements
 * Description: Demonstrates the use of a for loop to print array elements in reverse order.
 * Author: Siddhesh
 */

public class ReverseArrayElements {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};

		// Display the results
		
		System.out.println("==============================");
		System.out.println("    REVERSE ARRAY ELEMENTS    ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = numbers.length -1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		System.out.println("==============================");
		
	}

}
