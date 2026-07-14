package corejava.operators;

/**
 * Topic: Operators
 * Program: Logical Operators
 * Description: Demonstrates the use of logical operators in Java.
 * Author: Siddhesh
 */

public class LogicalOperators {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		int age = 22;
		boolean hasDrivingLicense = true;
		boolean hasPassport = false;
		
		// Perform logical operations
		
		boolean canDrive = age >= 18 && hasDrivingLicense;
		boolean canTravelAbroad = hasDrivingLicense || hasPassport;
		boolean needsPassport = !hasPassport;
		
		// Display the results
		
		System.out.println("====================================");
		System.out.println("          LOGICAL OPERATORS         ");
		System.out.println("====================================");
		System.out.println();
		
		System.out.println("Age               : " + age);
		System.out.println("Driving License   : " + hasDrivingLicense);
		System.out.println("Passport          : " + hasPassport);
		System.out.println();
		
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("Can Drive         : " + canDrive);
		System.out.println("Can Travel Abroad : " + canTravelAbroad);
		System.out.println("Needs Passport    : " + needsPassport);
		System.out.println();
		
		System.out.println("====================================");

	}

}
