package corejava.oop.constructors;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Parameterized Constructor
 * Description: Demonstrates the use of a parameterized constructor and the this keyword to initialize object data during object creation.
 * Author: Siddhesh
 */

public class ParameterizedConstructor {
	
	public static void main(String[] args) {
		
		// Create a Student object using the parameterized constructor
		
		StudentParameterized student = new StudentParameterized("Siddhesh", 22);
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("     PARAMETERIZED CONSTRUCTOR    ");
		System.out.println("==================================");
		System.out.println();
		
		// Display student details using the instance method
		
		student.displayStudentDetails();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
