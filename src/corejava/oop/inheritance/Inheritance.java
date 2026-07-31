package corejava.oop.inheritance;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Inheritance
 * Description: Demonstrates inheritance by creating a StudentInheritance class that inherits properties and methods from the Person class.
 * Author: Siddhesh
 */

public class Inheritance {
	
	public static void main(String[] args) {
		
		// Create a Student object
		
		StudentInheritance student = new StudentInheritance();

		// Assign values to the inherited and child class variables
		
		student.personName = "Siddhesh";
		student.studentAge = 22;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("            INHERITANCE           ");
		System.out.println("==================================");
		System.out.println();

		// Display student details using the inherited and child class methods
		
		student.displayPersonDetails();
		student.displayStudentDetails();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
