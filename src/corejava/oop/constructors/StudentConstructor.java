package corejava.oop.constructors;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: StudentConstructor
 * Description: Represents a student whose details are initialized using a default constructor.
 * Author: Siddhesh
 */

public class StudentConstructor {
	
	// Instance variables to store student details
	
	String studentName;
	int studentAge;
	
	// Default constructor to initialize student details
	
	public StudentConstructor() {
		studentName = "Siddhesh";
		studentAge = 22;
	}
	
	// Instance method to display student details

    public void displayStudentDetails() {

        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age  : " + studentAge);

    }
	
}
