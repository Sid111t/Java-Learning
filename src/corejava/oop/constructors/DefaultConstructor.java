package corejava.oop.constructors;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Constructor Demo
 * Description: Demonstrates the use of a default constructor to initialize object data automatically.
 * Author: Siddhesh
 */

public class DefaultConstructor {
	
	public static void main(String[] args) {
		
		// Create a Student object
		
		StudentConstructor student = new StudentConstructor();
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("         CONSTRUCTOR DEMO         ");
		System.out.println("==================================");
		System.out.println();
		
		// Display student details using the instance method
		
		student.displayStudentDetails();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
