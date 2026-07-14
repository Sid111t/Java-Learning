package corejava.operators;

/**
 * Topic: Operators
 * Program: Bitwise Operators
 * Description: Demonstrates the use of bitwise operators in Java.
 * Author: Siddhesh
 */

public class BitwiseOperators {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number1 = 5;
		int number2 = 3;
		
		// Perform bitwise operations
		
		int bitwiseAnd = number1 & number2;
		int bitwiseOr = number1 | number2;
		int bitwiseXor = number1 ^ number2;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("         BITWISE OPERATORS        ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("First Number  : " + number1);
		System.out.println("Second Number : " + number2);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Bitwise AND   : " + bitwiseAnd);
		System.out.println("Bitwise OR    : " + bitwiseOr);
		System.out.println("Bitwise XOR   : " + bitwiseXor);
		System.out.println();
		
		System.out.println("==================================");

	}

}
