package corejava.strings;

/**
 * Topic: Strings
 * Program: Convert Case
 * Description: Demonstrates the use of toUpperCase() and toLowerCase() methods to convert the case of a string.
 * Author: Siddhesh
 */

public class ConvertCase {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";

		// Display the results
		
		System.out.println("===================================");
		System.out.println("            CONVERT CASE           ");
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Original String : " + originalString);
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		String uppercase = originalString.toUpperCase();
		String lowercase = originalString.toLowerCase();
		
		System.out.println("Upper Case      : " + uppercase);
		System.out.println("Lower Case      : " + lowercase);
		System.out.println();
		
		System.out.println("===================================");
		
	}

}
