package corejava.collections.arraylist.customobject;

/**
 * Topic: Collections Framework
 * Class: Student
 * Description: Represents a student with basic details that can be stored in an ArrayList.
 * Author: Siddhesh
 */

public class Student {
	
	// Instance variables to store student details
	
	String studentName;
	int studentAge;
	
	// Parameterized constructor to initialize student details
	
	public Student(String studentName, int studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	// Instance method to display student details
	
	public void displayStudent() {
		
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age  : " + studentAge);
		System.out.println();
		
	}

}
