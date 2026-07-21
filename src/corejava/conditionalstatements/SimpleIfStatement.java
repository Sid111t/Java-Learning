package corejava.conditionalstatements;

/**
 * Topic: Conditional Statements
 * Program: Voting Eligibility
 * Description: Demonstrates the use of a simple if statement to check voting eligibility.
 * Author: Siddhesh
 */

public class SimpleIfStatement {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String personName = "Rahul";
		int age = 20;
		
		// Display the details
		
		System.out.println("==================================");
		System.out.println("        VOTING ELIGIBILITY        ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Person Name : " + personName);
		System.out.println("Age         : " + age);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Check the condition
		
		if (age >= 18) {
					
			System.out.println("Eligible to Vote");
					
		}
		System.out.println();
		System.out.println("==================================");

	}

}
