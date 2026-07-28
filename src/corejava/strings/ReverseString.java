package corejava.strings;

/**
 * Topic: Strings
 * Program: Reverse String
 * Description: Demonstrates the use of a for loop to reverse a string.
 * Author: Siddhesh
 */

public class ReverseString {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";

		// Display the results
		
		System.out.println("===================================");
		System.out.println("           REVERSE STRING          ");
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Original String : " + originalString);
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println();

		// Perform calculations
		
		char currentCharacter;
		
		System.out.print("Reversed String : ");
		for (int i = originalString.length() -1; i >= 0; i--) {
			currentCharacter = originalString.charAt(i);
			System.out.print(currentCharacter);
		}
		System.out.println();
		System.out.println();
		System.out.println("===================================");
		
	}

}
