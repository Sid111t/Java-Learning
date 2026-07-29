package corejava.methods;

/**
 * Topic: Methods
 * Program: Method with Parameters
 * Description: Demonstrates the use of methods that accept parameters.
 * Author: Siddhesh
 */

public class MethodWithParameters {
	
	public static void main(String[] args) {
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("    METHOD WITH PARAMETERS    ");
		System.out.println("==============================");
		System.out.println();
		
		// Display student details using the displayStudent() method
		
		displayStudent("Siddhesh", 22);
		
		System.out.println();
		System.out.println("==============================");
		
	}
	
	// Method to display student details
	
	public static void displayStudent(String name, int age) {
		
		System.out.println("Student Name : " + name);
		System.out.println("Student Age  : " + age);
		
	}

}
