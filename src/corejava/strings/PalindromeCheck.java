package corejava.strings;

/**
 * Topic: Strings
 * Program: Palindrome Check
 * Description: Demonstrates the use of a for loop and equals() method to check whether a string is a palindrome.
 * Author: Siddhesh
 */

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "madam";
		String reversedString = "";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("       PALINDROME CHECK       ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Original String : " + originalString);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		boolean isPalindrome;
		
		for (int i = originalString.length() -1; i >= 0; i--) {
			char currentCharacter = originalString.charAt(i);
			reversedString = reversedString + currentCharacter;
		}
		
		isPalindrome = originalString.equals(reversedString);
		
		System.out.println("Reversed String : " + reversedString);
		System.out.println("Is Palindrome   : " + isPalindrome);
		System.out.println();
		
		System.out.println("==============================");
	}

}
