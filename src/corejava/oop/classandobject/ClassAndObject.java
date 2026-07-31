package corejava.oop.classandobject;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Class and Object
 * Description: Demonstrates how to create a class, create an object, assign values to instance variables, and invoke an instance method.
 * Author: Siddhesh
 */

public class ClassAndObject {
	
	public static void main(String[] args) {
		
		// Create an object of the Student class
		
		Student student = new Student();
		
		// Assign values to the instance variables
		
		student.studentName = "Siddhesh";
		student.studentAge = 22;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("         CLASS AND OBJECT         ");
		System.out.println("==================================");
		System.out.println();
		
		// Display student details using the instance variable
		
		System.out.println("Display Using Instance Variables");
		System.out.println();
		
		System.out.println("Student Name : " + student.studentName);
		System.out.println("Student Age  : " + student.studentAge);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Display student details using the instance method displayStudentDetails()
		
		System.out.println("Display Using Instance Method");
		System.out.println();

		student.displayStudentDetails();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
