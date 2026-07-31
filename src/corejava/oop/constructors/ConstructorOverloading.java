package corejava.oop.constructors;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Constructor Overloading
 * Description: Demonstrates constructor overloading by creating multiple constructors with different parameter lists.
 * Author: Siddhesh
 */

public class ConstructorOverloading {
	
	public static void main(String[] args) {
		
		// Create the first Student object using the default constructor
		
		StudentOverloading student1 = new StudentOverloading();
		
		// Create the second Student object using the parameterized constructor
		
		StudentOverloading student2 = new StudentOverloading("Rahul", 21);
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("      CONSTRUCTOR OVERLOADING     ");
		System.out.println("==================================");
		System.out.println();
		
		// Display the details of the first Student object
		
		System.out.println("First Student");
		System.out.println();
		
		student1.displayStudentDetails();
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Display the details of the second Student object
		
		System.out.println("Second Student");
		System.out.println();
		
		student2.displayStudentDetails();
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
