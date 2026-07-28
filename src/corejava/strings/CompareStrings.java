package corejava.strings;

/**
 * Topic: Strings
 * Program: Compare Strings
 * Description: Demonstrates the use of equals() and equalsIgnoreCase() methods to compare strings.
 * Author: Siddhesh
 */

public class CompareStrings {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String firstString = "Java";
		String secondString = "java";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("        COMPARE STRINGS       ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("First String       : " + firstString);
		System.out.println("Second String      : " + secondString);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		boolean isEqual = firstString.equals(secondString);
		boolean isEqualIgnoreCase = firstString.equalsIgnoreCase(secondString);
		
		System.out.println("Equals             : " + isEqual);
		System.out.println("Equals Ignore Case : " + isEqualIgnoreCase);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
