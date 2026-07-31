package corejava.oop.multipleobjects;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Program: Multiple Objects
 * Description: Demonstrates how multiple objects of the same class can store different data independently.
 * Author: Siddhesh
 */

public class MultipleObjects {
	
	public static void main(String[] args) {
		
		// Create the first Student object
		
		Student student1 = new Student();
		
		// Assign values to the first Student object
		
		student1.studentName = "Siddhesh";
		student1.studentAge = 22;
		
		// Create the second Student object
		
		Student student2 = new Student();
		
	    // Assign values to the second Student object
		
		student2.studentName = "Rahul";
		student2.studentAge = 21;
		
		// Display the details of both Student objects
		
		System.out.println("==================================");
		System.out.println("         MULTIPLE OBJECTS         ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("First Student");
		System.out.println();
		
		System.out.println("Student Name : " + student1.studentName);
		System.out.println("Student Age  : " + student1.studentAge);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Second Student");
		System.out.println();
		
		System.out.println("Student Name : " + student2.studentName);
		System.out.println("Student Age  : " + student2.studentAge);
		System.out.println();
		
		System.out.println("==================================");
		
	}

}
