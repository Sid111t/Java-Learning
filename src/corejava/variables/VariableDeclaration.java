package corejava.variables;

/**
 * Topic: Variables
 * Program: Variable Declaration
 * Description: Demonstrates how to declare, initialize, and display variables in Java.
 * Author: Siddhesh
 */

public class VariableDeclaration {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String name = "Siddhesh Thakur";
		int age = 22;
		double percentage = 80.20;
		char grade = 'O';
		boolean isStudent = true;
		
		// Display the variable values
		
		System.out.println("=============================");
		System.out.println("     VARIABLE DECLARATION    ");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("Name       : " + name); 
	    System.out.println("Age        : " + age);
		System.out.println("Percentage : " + percentage);
		System.out.println("Grade      : " + grade);
		System.out.println("IsStudent  : " + isStudent);
		
		System.out.println();
		System.out.println("=============================");
	}

}
