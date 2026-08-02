package corejava.collections.arraylist.studentmanagement;

/**
 * Topic: Collections Framework
 * Class: StudentManagement
 * Description: Represents a student with basic details used in the student management application.
 * Author: Siddhesh
 */

public class StudentManagement {
	
	// Instance variables to store student details
	
	int studentId;
	String studentName;
	int studentAge;
	
	// Parameterized constructor to initialize student details
	
	public StudentManagement(int studentId, String studentName, int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	// Instance method to display student details
	
	public void displayStudentDetails() {
		
		System.out.println("Student ID   : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age  : " + studentAge);
		System.out.println();
		
	}

}
