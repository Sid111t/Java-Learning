package corejava.oop.superkeyword;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: super Keyword
 * Description: Demonstrates the use of the super keyword to invoke the parent class constructor and access parent class members.
 * Author: Siddhesh
 */

public class SuperKeyword {
	
	public static void main(String[] args) {
		
		// Create a Student object
		
		StudentSuper student = new StudentSuper("Siddhesh", 22);

		// Display the results
		
		System.out.println("==================================");
		System.out.println("          SUPER KEYWORD           ");
		System.out.println("==================================");
		System.out.println();

		// Display student details using methods inherited from the parent and child classes
		
		student.displayPersonName();
		student.displayStudentAge();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
