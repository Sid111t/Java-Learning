package corejava.methods;

/**
 * Topic: Methods
 * Program: Method Calling Another Method
 * Description: Demonstrates how one method can invoke another method within the same class.
 * Author: Siddhesh
 */

public class MethodCallingAnotherMethod {
	
	public static void main(String[] args) {
		
		// Display the results
		
		System.out.println("===============================");
		System.out.println(" METHOD CALLING ANOTHER METHOD ");
		System.out.println("===============================");
		System.out.println();
		
		// Display the welcome message using the displayWelcome() method
		
		displayWelcome();
		
		System.out.println();
		System.out.println("===============================");
		
	}
	
	// Method to display the welcome message
	
	public static void displayWelcome() {
		
		System.out.println("Welcome to Java Learning.");
		
		displayCourse();
		
	}
	
	// Method to display the course information
	
	public static void displayCourse() {
		
		System.out.println("Course : Core Java");
		
	}

}
