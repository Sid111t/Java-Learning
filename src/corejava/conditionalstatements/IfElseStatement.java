package corejava.conditionalstatements;

/**
 * Topic: Conditional Statements
 * Program: Pass or Fail
 * Description: Demonstrates the use of an if-else statement to determine whether a student has passed or failed.
 * Author: Siddhesh
 */

public class IfElseStatement {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String studentName = "Raj";
		int marks = 60;

		// Display the details
		
		System.out.println("==================================");
		System.out.println("           PASS OR FAIL           ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Student Name : " + studentName);
		System.out.println("Marks        : " + marks);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Check the condition
		
		if (marks >= 35) {
			System.out.println("Result       : Pass");
		} else {
			System.out.println("Result       : Fail");
		}
		System.out.println();
		System.out.println("==================================");
	}

}
