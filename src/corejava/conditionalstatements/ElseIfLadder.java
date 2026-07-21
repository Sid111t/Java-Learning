package corejava.conditionalstatements;

/**
 * Topic: Conditional Statements
 * Program: Student Grade
 * Description: Demonstrates the use of an else-if ladder to determine a student's grade based on marks.
 * Author: Siddhesh
 */

public class ElseIfLadder {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String studentName = "Raj";
		int marks = 25;

		// Display the details
		
		System.out.println("==================================");
		System.out.println("           STUDENT GRADE          ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Student Name : " + studentName);
		System.out.println("Marks        : " + marks);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Check the conditions

		if (marks >= 90) {
			System.out.println("Grade        : A");
		} else if (marks >= 75) {
			System.out.println("Grade        : B");
		} else if (marks >= 60) {
			System.out.println("Grade        : C");
		} else if (marks >= 35) {
			System.out.println("Grade        : D");
		} else {
			System.out.println("Grade        : Fail");
		}
		System.out.println();
		System.out.println("==================================");
		
	}

}
