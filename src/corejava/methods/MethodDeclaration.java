package corejava.methods;

/**
 * Topic: Methods
 * Program: Method Declaration
 * Description: Demonstrates the declaration and invocation of a simple method in Java.
 * Author: Siddhesh
 */

public class MethodDeclaration {
	
	public static void main(String[] args) {
		
		// Display the results
		
		System.out.println("========================================");
		System.out.println("           METHOD DECLARATION           ");
		System.out.println("========================================");
		System.out.println();

		// Display the message using the displayMessage() method
		
		displayMessage();
		
		System.out.println();
		System.out.println("========================================");
		
	}
		
	// Method to display a welcome message
		
	public static void displayMessage() {
			
		System.out.println("Hello from the displayMessage() method.");
			
	}

}
