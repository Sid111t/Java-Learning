package corejava.oop.encapsulation;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Encapsulation
 * Description: Demonstrates encapsulation by declaring instance variables as private and accessing them using getter and setter methods.
 * Author: Siddhesh
 */

public class Encapsulation {
	
	public static void main(String[] args) {
		
		// Create a Student object
		
		StudentEncapsulation student = new StudentEncapsulation(); 

		// Set student details using setter methods
		
		student.setStudentName("Siddhesh");
		student.setStudentAge(22);

		// Display the results
		
		System.out.println("==================================");
		System.out.println("           ENCAPSULATION          ");
		System.out.println("==================================");
		System.out.println();

		// Display student details using getter methods
		
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student Age  : " + student.getStudentAge());
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
