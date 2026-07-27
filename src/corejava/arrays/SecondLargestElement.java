package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Second Largest Element
 * Description: Demonstrates the use of a for loop to find the second largest element in an array.
 * Author: Siddhesh
 */

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};
		int largestElement = numbers[0];
		int secondLargestElement = numbers[0];

		// Display the results
		
		System.out.println("==============================");
		System.out.println("    SECOND LARGEST ELEMENT    ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largestElement) {
				secondLargestElement = largestElement;
				largestElement = numbers[i];
			} else if (numbers[i] > secondLargestElement) {
				secondLargestElement = numbers[i];
			}
		}
		System.out.println("Second Largest Element : " + secondLargestElement);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
