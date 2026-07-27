package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Enhanced For Loop Array Traversal
 * Description: Demonstrates the use of the enhanced for loop (for-each loop) to traverse array elements.
 * Author: Siddhesh
 */

public class EnhancedForLoopArrayTraversal {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};

		// Display the results
		
		System.out.println("==============================");
		System.out.println("  ENHANCED FOR LOOP TRAVERSAL ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size : " + numbers.length);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("==============================");
		
	}

}
