package corejava.operators;

/**
 * Topic: Operators
 * Program: Arithmetic Operators
 * Description: Demonstrates the use of arithmetic operators in Java.
 * Author: Siddhesh
 */

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number1 = 45;
		int number2 = 10;
		
		// Perform operations and store the results
		
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		int modulus = number1 % number2;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("       ARITHMETIC OPERATORS       ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("First Number   : " + number1);
		System.out.println("Second Number  : " + number2);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Addition       : " + addition);
		System.out.println("Subtraction    : " + subtraction);
		System.out.println("Multiplication : " + multiplication);
		System.out.println("Division       : " + division);
		System.out.println("Modulus        : " + modulus);
		System.out.println();
		
		System.out.println("==================================");
	}

}
