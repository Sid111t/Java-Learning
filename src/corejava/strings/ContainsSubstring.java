package corejava.strings;

/**
 * Topic: Strings
 * Program: Contains Substring
 * Description: Demonstrates the use of the contains() method to check whether a string contains a specific substring.
 * Author: Siddhesh
 */

public class ContainsSubstring {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String originalString = "Java Programming";
		String searchText = "Programming";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("      CONTAINS SUBSTRING      ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("String      : " + originalString);
		System.out.println("Search Text : " + searchText);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();

		// Perform calculations
		
		boolean containsSearchText = originalString.contains(searchText);
		
		System.out.println("Contains    : " + containsSearchText);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
