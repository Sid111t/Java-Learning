package corejava.strings;

/**
 * Topic: Strings
 * Program: String Concatenation
 * Description: Demonstrates the use of the + operator to concatenate multiple strings.
 * Author: Siddhesh
 */

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String firstName = "Siddhesh";
		String lastName = "Thakur";

		// Display the results
		
		System.out.println("==============================");
		System.out.println("     STRING CONCATENATION     ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform calculations
		
		String fullName = firstName + " " + lastName;
		
		System.out.println("Full Name  : " + fullName);
		System.out.println();
		
		System.out.println("==============================");
		
	}

}
