package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Array Declaration
 * Description: Demonstrates the declaration, initialization, and access of array elements.
 * Author: Siddhesh
 */

public class ArrayDeclaration {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};

		// Display the results
		
		System.out.println("==============================");
		System.out.println("       ARRAY DECLARATION      ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		System.out.println("Element 1  : " + numbers[0]);
		System.out.println("Element 2  : " + numbers[1]);
		System.out.println("Element 3  : " + numbers[2]);
		System.out.println("Element 4  : " + numbers[3]);
		System.out.println("Element 5  : " + numbers[4]);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
