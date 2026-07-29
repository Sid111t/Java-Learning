package corejava.methods;

/**
 * Topic: Methods
 * Program: Method with No Parameters
 * Description: Demonstrates the use of multiple methods that do not accept parameters.
 * Author: Siddhesh
 */

public class MethodWithNoParameters {
	
	public static void main(String[] args) {
		
		// Display the results
		
		System.out.println("===================================");
		System.out.println("     METHOD WITH NO PARAMETERS     ");
		System.out.println("===================================");
		System.out.println();

		// Display messages using different methods
		
		displayGreeting();
		displayFarewell();
		
		System.out.println();
		System.out.println("===================================");

	}
	
	// Method to display a greeting message
	
	public static void displayGreeting() {
		System.out.println("Hello! Welcome to Java Methods.");
	}
	
	// Method to display a farewell message
	
	public static void displayFarewell() {
		System.out.println("Thank you for learning Java Methods.");
	}

}
