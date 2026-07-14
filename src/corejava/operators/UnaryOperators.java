package corejava.operators;

/**
 * Topic: Operators
 * Program: Unary Operators
 * Description: Demonstrates increment and decrement operators, including prefix and postfix.
 * Author: Siddhesh
 */

public class UnaryOperators {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number1 = 10;
		int number2 = 10;
		int number3 = 20;
		int number4 = 20;
		
		// Demonstrate increment operators
		
		int prefixIncrement = ++number1;
		int postfixIncrement = number2++;
		
		// Demonstrate decrement operators
		
		int prefixDecrement = --number3;
		int postfixDecrement = number4--;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("          UNARY OPERATORS         ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Prefix Increment");
		System.out.println();
		
		System.out.println("Original Value : 10");
		System.out.println("Returned Value : " + prefixIncrement);
		System.out.println("Current Value  : " + number1);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Postfix Increment");
		System.out.println();
		
		System.out.println("Original Value : 10");
		System.out.println("Returned Value : " + postfixIncrement);
		System.out.println("Current Value  : " + number2);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Prefix Decrement");
		System.out.println();
		
		System.out.println("Original Value : 20");
		System.out.println("Returned Value : " + prefixDecrement);
		System.out.println("Current Value  : " + number3);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Postfix Decrement");
		System.out.println();
		
		System.out.println("Original Value : 20");
		System.out.println("Returned Value : " + postfixDecrement);
		System.out.println("Current Value  : " + number4);
		System.out.println();
		
		System.out.println("==================================");

	}

}
