package corejava.arrays;

/**
 * Topic: Arrays
 * Program: Search Element
 * Description: Demonstrates the use of a for loop to search for an element in an array.
 * Author: Siddhesh
 */

public class SearchElement {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int[] numbers = {10, 20, 30, 40, 50};
		int searchElement = 30;
		boolean isFound = false;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("        SEARCH ELEMENT        ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Array Size     : " + numbers.length);
		System.out.println("Search Element : " + searchElement);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchElement) {
				isFound = true;
				System.out.println("Element Found");
				break;
			}
			
		}
		if (!isFound) {
			System.out.println("Element Not Found");
		}
		System.out.println();
		System.out.println("==============================");
		
	}

}
