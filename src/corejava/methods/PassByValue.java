package corejava.methods;

/**
 * Topic: Methods
 * Program: Pass by Value
 * Description: Demonstrates pass by value by passing a primitive variable to a method.
 * Author: Siddhesh
 */

public class PassByValue {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 10;
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("         PASS BY VALUE        ");
		System.out.println("==============================");
		System.out.println();
		
		// Display the value before calling the updateNumber() method
		
		System.out.println("Before Method Call : " + number);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Update the number using the updateNumber() method
		
		updateNumber(number);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		System.out.println("After Method Call : " + number);
		System.out.println();
		
		System.out.println("==============================");
		
	}
	
	// Method to update the value of a number
	
	public static void updateNumber(int number) {
		
		 number = 20;
		 System.out.println("Inside Method     : " + number);
		
	}

}
