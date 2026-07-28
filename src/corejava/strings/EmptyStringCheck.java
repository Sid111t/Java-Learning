package corejava.strings;

/**
 * Topic: Strings
 * Program: Empty String Check
 * Description: Demonstrates the use of the isEmpty() method to check whether a string is empty.
 * Author: Siddhesh
 */

public class EmptyStringCheck {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("      EMPTY STRING CHECK      ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Original String : \"" + originalString + "\"");
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		boolean isEmpty = originalString.isEmpty();
		
		System.out.println("Is Empty        : " + isEmpty);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
