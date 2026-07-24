package corejava.loops;

/**
 * Topic: Loops
 * Program: Square Star Pattern
 * Description: Demonstrates the use of nested for loops to print a square star pattern.
 * Author: Siddhesh
 */

public class SquareStarPattern {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int rows = 5;
		int columns = 5;

		// Display the results
		
		System.out.println("==================================");
		System.out.println("        SQUARE STAR PATTERN       ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Rows    : " + rows);
		System.out.println("Columns : " + columns);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==================================");
	}

}
