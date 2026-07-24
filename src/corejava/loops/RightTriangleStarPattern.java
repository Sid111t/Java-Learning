package corejava.loops;

/**
 * Topic: Loops
 * Program: Right Triangle Star Pattern
 * Description: Demonstrates the use of nested for loops to print a right triangle star pattern.
 * Author: Siddhesh
 */

public class RightTriangleStarPattern {
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int rows = 5;

		// Display the results
				
		System.out.println("==================================");
		System.out.println("    RIGHT TRIANGLE STAR PATTERN   ");
		System.out.println("==================================");
		System.out.println();
				
		System.out.println("Rows : " + rows);
		System.out.println();
				
		System.out.println("----------------------------------");
		System.out.println();
				
		// Perform calculations
				
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==================================");
		
	}

}
