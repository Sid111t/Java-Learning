package corejava.variables;

/**
 * Topic: Variables
 * Program: Variable Operations
 * Description: Demonstrates arithmetic operations using variables.
 * Author: Siddhesh
 */

public class VariableOperations {

	public static void main(String[] args) {
		
		int number1 = 45;
		int number2 = 10;
		
		System.out.println("=================================");
		System.out.println("       VARIABLE OPERATIONS      ");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("First Number  : " + number1);
		System.out.println("Second Number : " + number2);
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		
		System.out.println("Addition       : " + sum);
		System.out.println("Subtraction    : " + difference);
		System.out.println("Multiplication : " + product);
		System.out.println("Division       : " + quotient);
		System.out.println("Modulus        : " + remainder);
		System.out.println();
		
		System.out.println("=================================");

	}

}
