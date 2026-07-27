package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Copy Array
 * Description: Demonstrates the use of a for loop to copy elements from one array to another.
 * Author: Siddhesh
 */

public class CopyArray {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] sourceArray = {10, 20, 30, 40, 50};
		int[] destinationArray = new int[sourceArray.length];

		// Display the results
		
		System.out.println("==============================");
		System.out.println("          COPY ARRAY          ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + sourceArray.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 0; i < sourceArray.length; i++) {
			destinationArray[i] = sourceArray[i];
			System.out.println(destinationArray[i]);
		}
		System.out.println();
		System.out.println("==============================");
		
	}

}
