package corejava.strings;

/**
 * Topic: Strings
 * Program: Count Vowels
 * Description: Demonstrates the use of a for loop and conditional statements to count the number of vowels in a string.
 * Author: Siddhesh
 */

public class CountVowels {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";
		int vowelCount = 0;

		// Display the results
		
		System.out.println("===================================");
		System.out.println("            COUNT VOWELS           ");
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Original String : " + originalString);
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println();

		// Perform calculations
		
		originalString = originalString.toLowerCase();
		
		for (int i = 0; i < originalString.length(); i++) {
			char currentCharacter = originalString.charAt(i);
			if (currentCharacter == 'a' 
					|| currentCharacter == 'e' 
					|| currentCharacter == 'i' 
					|| currentCharacter == 'o' 
					|| currentCharacter == 'u') {
				vowelCount++;
			}
		}
		System.out.println("Vowel Count     : " + vowelCount);
		System.out.println();
		
		System.out.println("===================================");
		
	}

}
