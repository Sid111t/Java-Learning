package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Count Even and Odd Elements
 * Description: Demonstrates the use of a for loop to count even and odd elements in an array.
 * Author: Siddhesh
 */

public class CountEvenOddElements {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};
		int evenCount = 0;
		int oddCount = 0;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("    COUNT EVEN ODD ELEMENTS   ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd Count  : " + oddCount);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
