package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Smallest Element
 * Description: Demonstrates the use of a for loop to find the smallest element in an array.
 * Author: Siddhesh
 */

public class SmallestElement {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};
		int smallestElement = numbers[0];

		// Display the results
		
		System.out.println("==============================");
		System.out.println("       SMALLEST ELEMENT       ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size       : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 1; i < numbers.length; i++) {
			if (smallestElement > numbers[i]) {
				smallestElement = numbers[i];
			}
		}
		System.out.println("Smallest Element : " + smallestElement);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
