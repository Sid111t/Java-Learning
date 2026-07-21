package corejava.conditionalstatements;

/**
 * Topic: Conditional Statements
 * Program: Day of Week
 * Description: Demonstrates the use of the switch statement to display the day of the week based on a number.
 * Author: Siddhesh
 */

public class SwitchStatement {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int dayNumber = 3;

		// Display the details
		
		System.out.println("==================================");
		System.out.println("            DAY OF WEEK           ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Day Number : " + dayNumber);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();

		// Check the condition
		
		switch (dayNumber) {
		
		case 1:
			System.out.println("Day        : Monday");
			break;
			
		case 2: 
			System.out.println("Day        : Tuesday");
			break;
		
		case 3:
			System.out.println("Day        : Wednesday");
			break;
			
		case 4:
			System.out.println("Day        : Thursday");
			break;
			
		case 5: 
			System.out.println("Day        : Friday");
			break;
			
		case 6:
			System.out.println("Day        : Saturday");
			break;
			
		case 7:
			System.out.println("Day        : Sunday");
			break;
			
		default:
			System.out.println("Day        : Invalid Day");
		}
		System.out.println();
		System.out.println("==================================");
		
	}

}
