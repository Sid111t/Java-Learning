package corejava.typecasting;

/**
 * Topic: Type Casting
 * Program: Real World Casting
 * Description: Demonstrates type casting using a real-world percentage example.
 * Author: Siddhesh
 */

public class RealWorldCasting {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		double percentage = 87.75;
		
		// Perform type casting
		
		int roundedPercentage = (int) percentage;
		
		// Display the results
		
		System.out.println("==================================");
		System.out.println("        REAL WORLD CASTING        ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Original Percentage  : " + percentage);
		System.out.println("Converted Percentage : " + roundedPercentage);
		System.out.println();
		
		System.out.println("==================================");

	}

}
