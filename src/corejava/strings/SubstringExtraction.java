package corejava.strings;

/**
 * Topic: Strings
 * Program: Substring Extraction
 * Description: Demonstrates the use of the substring() method to extract a portion of a string.
 * Author: Siddhesh
 */

public class SubstringExtraction {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";
		int startIndex = 5;
		int endIndex = 16;

		// Display the results
		
		System.out.println("===================================");
		System.out.println("        SUBSTRING EXTRACTION       ");
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Original String : " + originalString);
		System.out.println("Start Index     : " + startIndex);
		System.out.println("End Index       : " + endIndex);
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println();

		// Perform calculations
		
		String extractedSubstring = originalString.substring(startIndex, endIndex);
		
		System.out.println("Substring       : " + extractedSubstring);
		System.out.println();
		
		System.out.println("===================================");
	}

}
