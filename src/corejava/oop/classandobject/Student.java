package corejava.oop.classandobject;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: Student
 * Description: Represents a student with basic details such as name and age.
 * Author: Siddhesh
 */

public class Student {
	
	// Instance variables to store student details
	
	String studentName;
	int studentAge;
	
	// Instance method to display student details

    public void displayStudentDetails() {

        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age  : " + studentAge);

    }

}
