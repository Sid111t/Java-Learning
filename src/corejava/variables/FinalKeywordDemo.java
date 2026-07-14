package corejava.variables;

/**
 * Topic: Variables
 * Program: Final Keyword Demo
 * Description: Demonstrates the use of the final keyword to create constants.
 * Author: Siddhesh
 */

public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		final String COMPANY_Name = "RockStar India";
		final String COUNTRY = "India";
		final int MAX_MARKS = 95;
		final double PI = 3.14159;
		
		// Display the variable values
		
		System.out.println("=================================");
		System.out.println("   FINAL KEYWORD DEMONSTRATION   ");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("Company Name : " + COMPANY_Name);
		System.out.println("Country      : " + COUNTRY);
		System.out.println("Marks        : " + MAX_MARKS);
		System.out.println("PI           : " + PI);
		System.out.println();
		
		System.out.println("=================================");
	}

}
