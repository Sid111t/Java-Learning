package corejava.strings;

/**
 * Topic: Strings
 * Program: String Length
 * Description: Demonstrates the use of the length() method to find the number of characters in a string.
 * Author: Siddhesh
 */

public class StringLength {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String name = "Siddhesh Thakur";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("         STRING LENGTH        ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("String : " + name);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		int length = name.length();
		
		System.out.println("Length : " + length);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
