package corejava.methods;

/**
 * Topic: Methods
 * Program: Menu-Driven Calculator
 * Description: Demonstrates the use of multiple methods to perform basic arithmetic operations in a menu-driven calculator.
 * Author: Siddhesh
 */

public class MenuDrivenCalculator {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int firstNumber = 20;
		int secondNumber = 10;
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("    MENU DRIVEN CALCULATOR    ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("First Number   : " + firstNumber);
		System.out.println("Second Number  : " + secondNumber);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform arithmetic operations using methods
		
		int addition = add(firstNumber, secondNumber);
		int subtraction = subtract(firstNumber, secondNumber);
		int multiplication = multiply(firstNumber, secondNumber);
		int division = divide(firstNumber, secondNumber);
		
		System.out.println("Addition       : " + addition);
		System.out.println("Subtraction   : " + subtraction);
		System.out.println("Multiplication : " + multiplication);
		System.out.println("Division       : " + division);
		System.out.println();
		
		System.out.println("==============================");
		
	}
	
	// Method to add two numbers
	
	public static int add(int firstNumber, int secondNumber) {
		
		return firstNumber + secondNumber;
		
	}
	
	// Method to subtract two numbers
	
	public static int subtract(int firstNumber, int secondNumber) {
		
		return firstNumber - secondNumber;
		
	}
	
	// Method to multiply two numbers
	
	public static int multiply(int firstNumber, int secondNumber) {
		
		return firstNumber * secondNumber;
		
	}
	
	// Method to divide two numbers
	
	public static int divide(int firstNumber, int secondNumber) {
		
		return firstNumber / secondNumber;
		
	}

}
