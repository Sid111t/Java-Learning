package corejava.collections.stack.customobject;

/**
 * Topic: Collections Framework
 * Class: Student
 * Description: Represents a student with basic details that can be stored in a Stack.
 * Author: Siddhesh
 */

public class Student {
	
	// Instance variables to store student details
	
	int studentId;
	String studentName;
	int studentAge;
	
	// Parameterized constructor to initialize student details
	
	public Student(int studentId, String studentName, int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	// Instance method to display student details
	
	public void displayStudent() {
		
		System.out.println("Student ID   : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age  : " + studentAge);
		System.out.println();
		
	}

}
