package corejava.scanner;

/**
 * Topic: Scanner Class
 * Program: Employee Input
 * Description: Demonstrates reading employee details using the Scanner class.
 * Author: Siddhesh
 */

//Import Scanner class

import java.util.Scanner;

public class EmployeeInput {

	public static void main(String[] args) {
		
		// Create Scanner object

		Scanner scanner = new Scanner(System.in);
		
		// Read user input
		
		System.out.println("==================================");
		System.out.println("          EMPLOYEE INPUT          ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.print("Enter Employee Name  : ");
		String employeeName = scanner.nextLine();
		
		System.out.print("Enter Employee ID    : ");
		int employeeId = scanner.nextInt();
		
		System.out.print("Enter Salary         : ");
		double salary = scanner.nextDouble();
		
		System.out.print("Enter Is Permanent   : ");
		boolean isPermanent = scanner.nextBoolean();
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Display the entered details
		
		System.out.println("Employee Name      : " + employeeName);
		System.out.println("Employee ID        : " + employeeId);
		System.out.println("Salary             : " + salary);
		System.out.println("Is Permanent       : " + isPermanent);
		System.out.println();
		
		System.out.println("==================================");
		
		// Close Scanner
		
		scanner.close();
	}

}
