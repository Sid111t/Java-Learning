package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Print Array Elements
 * Description: Demonstrates the use of a for loop to print all elements of an array.
 * Author: Siddhesh
 */

public class PrintArrayElements {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};

		// Display the results
		
		System.out.println("==============================");
		System.out.println("     PRINT ARRAY ELEMENTS     ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Display the array elements
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element " + (i + 1) + " : " + numbers[i]);
		}
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
