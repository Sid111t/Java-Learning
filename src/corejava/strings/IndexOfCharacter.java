package corejava.strings;

/**
 * Topic: Strings
 * Program: Index Of Character
 * Description: Demonstrates the use of the indexOf() method to find the first occurrence of a character in a string.
 * Author: Siddhesh
 */

public class IndexOfCharacter {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";
		char searchCharacter = 'a';

		// Display the results
		
		System.out.println("===================================");
		System.out.println("         INDEX OF CHARACTER        ");
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Original String  : " + originalString);
		System.out.println("Search Character : " + searchCharacter);
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println();

		// Perform calculations
		
		int index = originalString.indexOf(searchCharacter);
		
		System.out.println("Index            : " + index);
		System.out.println();
		
		System.out.println("===================================");
		
	}

}
