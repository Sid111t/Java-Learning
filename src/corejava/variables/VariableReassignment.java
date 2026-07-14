package corejava.variables;

/**
 * Topic: Variables
 * Program: Variable Reassignment
 * Description: Demonstrates how variable values can be updated after initialization.
 * Author: Siddhesh
 */

public class VariableReassignment {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String studentName = "Siddhesh";
		int age = 22;
		String city = "Navi Mumbai";
		
		// Display initial values
		
		System.out.println("=============================");
		System.out.println("        BEFORE UPDATE        ");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("Name : " + studentName);
		System.out.println("Age  : " + age);
		System.out.println("City : " + city);
		System.out.println("=============================");
		System.out.println();
		
		// Update variable values
		
		age = 23;
		city = "Pune";
		
		// Display updated values
		
		System.out.println("=============================");
		System.out.println("         AFTER UPDATE        ");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("Name : " + studentName);
		System.out.println("Age  : " + age);
		System.out.println("City : " + city);
		System.out.println("=============================");

	}

}
