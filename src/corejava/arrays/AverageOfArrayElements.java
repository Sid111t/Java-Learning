package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Average of Array Elements
 * Description: Demonstrates the use of a for loop to calculate the average of all elements in an array.
 * Author: Siddhesh
 */

public class AverageOfArrayElements {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};
		int sum = 0;
		double average;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("   AVERAGE OF ARRAY ELEMENTS  ");
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
		average = (double) sum / numbers.length;
		System.out.println("Average    : " + average);
		System.out.println();
		
		System.out.println("==============================");
	}

}
