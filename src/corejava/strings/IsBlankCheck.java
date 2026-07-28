package corejava.strings;

/**
 * Topic: Strings
 * Program: Is Blank Check
 * Description: Demonstrates the use of the isBlank() method to check whether a string is empty or contains only whitespace.
 * Author: Siddhesh
 */

public class IsBlankCheck {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "  ";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("        IS BLANK CHECK        ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Original String : \"" + originalString + "\"");
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		boolean isBlank = originalString.isBlank();
		
		System.out.println("Is Blank        : " + isBlank);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
