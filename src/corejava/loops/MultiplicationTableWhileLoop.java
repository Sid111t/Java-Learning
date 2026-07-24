package corejava.loops;

/**
 * Topic: Loops
 * Program: Multiplication Table Using While Loop
 * Description: Demonstrates the use of a while loop to display the multiplication table of a number.
 * Author: Siddhesh
 */

public class MultiplicationTableWhileLoop {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int number = 5;
		int i = 1;

		// Display the results
		
		System.out.println("==============================");
		System.out.println(" MULTIPLICATION TABLE (WHILE) ");
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("Number : " + number);
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println();
		
		// Perform calculations
		
		while (i <= 10) {
			System.out.println(number + " x " + i + " = " + (number*i) );
			i++;
		}
		System.out.println();
		System.out.println("==============================");
	}

}
