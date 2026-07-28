package corejava.strings;

/**
 * Topic: Strings
 * Program: Character at Index
 * Description: Demonstrates the use of the charAt() method to access a character at a specific index in a string.
 * Author: Siddhesh
 */

public class CharacterAtIndex {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String programmingLanguage = "Java Programming";
		int index = 5;

		// Display the results
		
		System.out.println("==============================");
		System.out.println("      CHARACTER AT INDEX      ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("String    : " + programmingLanguage);
		System.out.println("Index     : " + index);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform calculations
		
		char characterAtIndex = programmingLanguage.charAt(index);
		System.out.println("Character : " + characterAtIndex);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
