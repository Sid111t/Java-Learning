package corejava.oop.constructors;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: StudentOverloading
 * Description: Represents a student whose details can be initialized using overloaded constructors.
 * Author: Siddhesh
 */

public class StudentOverloading {
	
	// Instance variables to store student details
	
	String studentName;
	int studentAge;
	
	// Default constructor to initialize student details
	
	public StudentOverloading() {
		studentName = "Siddhesh";
		studentAge = 22;
	}
	
	// Parameterized constructor to initialize student details
	
	public StudentOverloading(String studentName, int studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	// Instance method to display student details
	
	public void displayStudentDetails() {

        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age  : " + studentAge);

    }

}
