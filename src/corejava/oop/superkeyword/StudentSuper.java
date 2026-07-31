package corejava.oop.superkeyword;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: StudentSuper
 * Description: Represents a student that uses the super keyword to invoke the parent class constructor and methods.
 * Author: Siddhesh
 */

//Inherit the PersonSuper class

public class StudentSuper extends PersonSuper{
	
	// Instance variable to store the student's age
	
	int studentAge;
	
	// Parameterized constructor to initialize student details using the super keyword
	
	public StudentSuper(String personName, int studentAge) {
		super(personName);
		this.studentAge = studentAge;
	}

	// Instance method to display the student's age
	
	public void displayStudentAge() {
		System.out.println("Student Age  : " + studentAge);
	}

}
