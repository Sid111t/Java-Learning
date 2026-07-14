package corejava.operators;

/**
 * Topic: Operators
 * Program: Ternary Operator
 * Description: Demonstrates the use of the ternary operator in Java.
 * Author: Siddhesh
 */

public class TernaryOperator {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String studentName = "Raj";
		int marks = 60;
		
		// Perform ternary operation
		
		String result = (marks >= 35) ? "Pass" : "Fail";
		
		// Display the result
		
		System.out.println("==================================");
		System.out.println("         TERNARY OPERATOR         ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Student Name : " + studentName);
		System.out.println("Marks        : " + marks);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Result       : " + result);
		System.out.println();
		
		System.out.println("==================================");

	}

}
