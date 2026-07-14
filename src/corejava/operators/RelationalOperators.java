package corejava.operators;

/**
 * Topic: Operators
 * Program: Relational Operators
 * Description: Demonstrates the use of relational operators in Java.
 * Author: Siddhesh
 */

public class RelationalOperators {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number1 = 25;
		int number2 = 20;
		
		// Perform relational comparisons
		
		boolean isEqual = number1 == number2;
		boolean isNotEqual = number1 != number2;
		boolean isGreater = number1 > number2;
		boolean isLess = number1 < number2;
		boolean isGreaterOrEqual = number1 >= number2;
		boolean isLessOrEqual = number1 <= number2;
		
		// Display the comparison results
		
		System.out.println("==================================");
		System.out.println("        RELATIONAL OPERATORS        ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("First Number          : " + number1);
		System.out.println("Second Number         : " + number2);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Equal To              : " + isEqual);
		System.out.println("Not Equal To          : " + isNotEqual);
		System.out.println("Greater Than          : " + isGreater);
		System.out.println("Less Than             : " + isLess);
		System.out.println("Greater Than Equal To : " + isGreaterOrEqual);
		System.out.println("Less Than Equal To    : " + isLessOrEqual);
		System.out.println();
		
		System.out.println("==================================");
	}

}
