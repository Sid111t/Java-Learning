package corejava.strings;

/**
 * Topic: Strings
 * Program: Trim Whitespace
 * Description: Demonstrates the use of the trim() method to remove leading and trailing whitespace from a string.
 * Author: Siddhesh
 */

public class TrimWhitespace {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "   Java Programming   ";

		// Display the results
		
		System.out.println("========================================");
		System.out.println("             TRIM WHITESPACE            ");
		System.out.println("========================================");
		System.out.println();
		
		System.out.println("Original String : \"" + originalString + "\"");
		System.out.println();
		
		System.out.println("----------------------------------------");
		System.out.println();

		// Perform calculations
		
		String trimmedString = originalString.trim();
		
		System.out.println("Trimmed String  : \"" + trimmedString + "\"");
		System.out.println();
		
		System.out.println("========================================");
		
	}

}
