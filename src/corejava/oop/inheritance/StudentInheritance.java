package corejava.oop.inheritance;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: StudentInheritance
 * Description: Represents a student that inherits properties and methods from the Person class.
 * Author: Siddhesh
 */

//Inherit the Person class

public class StudentInheritance extends Person {

	// Instance variable to store the student's age
	
	int studentAge;

	// Instance method to display the student's age
	
	public void displayStudentDetails() {
		
		System.out.println("Student Age  : " + studentAge);
		
	}

}
