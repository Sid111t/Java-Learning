package corejava.strings;

/**
 * Topic: Strings
 * Program: Replace Characters
 * Description: Demonstrates the use of the replace() method to replace characters in a string.
 * Author: Siddhesh
 */

public class ReplaceCharacters {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";
		char characterToReplace = 'a';
		char replacementCharacter = '@';

		// Display the results
		
		System.out.println("========================================");
		System.out.println("           REPLACE CHARACTERS           ");
		System.out.println("========================================");
		System.out.println();
		
		System.out.println("Original String       : " + originalString);
		System.out.println("Replace Character     : " + characterToReplace);
		System.out.println("Replacement Character : " + replacementCharacter);
		System.out.println();
		
		System.out.println("----------------------------------------");
		System.out.println();

		// Perform calculations
		
		String modifiedString = originalString.replace(characterToReplace, replacementCharacter);
		
		System.out.println("Modified String       : " + modifiedString);
		System.out.println();
		
		System.out.println("========================================");
		
	}

}
