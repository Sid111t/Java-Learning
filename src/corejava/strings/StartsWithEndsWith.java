package corejava.strings;

/**
 * Topic: Strings
 * Program: Starts With and Ends With
 * Description: Demonstrates the use of startsWith() and endsWith() methods to check the beginning and ending of a string.
 * Author: Siddhesh
 */

public class StartsWithEndsWith {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";
		String prefix = "Java";
		String suffix = "Programming";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("     STARTS WITH ENDS WITH    ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("String      : " + originalString);
		System.out.println("Prefix      : " + prefix);
		System.out.println("Suffix      : " + suffix);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		boolean stringStartsWith = originalString.startsWith(prefix);
		boolean stringEndsWith = originalString.endsWith(suffix);
		
		System.out.println("Starts With : " + stringStartsWith);
		System.out.println("Ends With   : " + stringEndsWith);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
