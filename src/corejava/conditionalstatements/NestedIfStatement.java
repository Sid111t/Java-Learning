package corejava.conditionalstatements;

/**
 * Topic: Conditional Statements
 * Program: Driving License Eligibility
 * Description: Demonstrates the use of nested if statements to check driving license eligibility.
 * Author: Siddhesh
 */

public class NestedIfStatement {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String personName = "Rahul";
		int age = 20;
		boolean hasDocuments = true;

		// Display the details
		
		System.out.println("======================================================");
		System.out.println("             DRIVING LICENSE ELIGIBILITY              ");
		System.out.println("======================================================");
		System.out.println();
		
		System.out.println("Person Name         : " + personName);
		System.out.println("Age                 : " + age);
		System.out.println("Documents Available : " + hasDocuments);
		System.out.println();
		
		System.out.println("------------------------------------------------------");
		System.out.println();
		
		// Check the conditions
		
		if (age >= 18) {
			if (hasDocuments) {
				System.out.println("Status              : Eligible for Driving License");
			} else {
				System.out.println("Status              : Documents Required");
			}
		} else {
			System.out.println("Status              : Not Eligible");
		}
		System.out.println();
		System.out.println("======================================================");
		
	}

}
