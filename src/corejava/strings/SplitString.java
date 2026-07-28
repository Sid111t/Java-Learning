package corejava.strings;

/**
 * Topic: Strings
 * Program: Split String
 * Description: Demonstrates the use of the split() method to divide a string into multiple words.
 * Author: Siddhesh
 */

public class SplitString {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming Language";
		String delimiter = " ";

		// Display the results
		
		System.out.println("========================================");
		System.out.println("              SPLIT STRING              ");
		System.out.println("========================================");
		System.out.println();
		
		System.out.println("Original String : " + originalString);
		System.out.println("Delimiter       : \"" + delimiter + "\"");
		System.out.println();
		
		System.out.println("-----------------------------------------");
		System.out.println();

		// Perform calculations
		
		String[] words = originalString.split(delimiter);
		System.out.println("Words:");
		
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("========================================");
		
	}

}
