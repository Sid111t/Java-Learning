package corejava.oop.encapsulation;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: StudentEncapsulation
 * Description: Represents a student whose data is accessed using getter and setter methods.
 * Author: Siddhesh
 */

public class StudentEncapsulation {
	
	// Private instance variables to store student details
	
	private String studentName;
	private int studentAge;
	
	// Getter method to return the student name
	
	public String getStudentName() {
		return studentName;
	}
	
	// Setter method to set the student name
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// Getter method to return the student age
	
	public int getStudentAge() {
		return studentAge;
	}
	
	// Setter method to set the student age
	
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
