package corejava.scanner;

/**
 * Topic: Scanner Class
 * Program: Student Input
 * Description: Demonstrates reading student details using the Scanner class.
 * Author: Siddhesh
 */

//Import Scanner class

import java.util.Scanner;

public class StudentInput {

	public static void main(String[] args) {
		
		// Create Scanner object

		Scanner scanner = new Scanner(System.in);
		
		// Read user input
		
		System.out.println("==================================");
		System.out.println("           STUDENT INPUT          ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.print("Enter Student Name : ");
		String studentName = scanner.nextLine();
		
		System.out.print("Enter Age          : ");
		int age = scanner.nextInt();
		
		System.out.print("Enter Grade        : ");
		char grade = scanner.next().charAt(0);
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Display the entered details
		
		System.out.println("Student Name     : " + studentName);
		System.out.println("Age              : " + age);
		System.out.println("Grade            : " + grade);
		System.out.println();
		
		System.out.println("==================================");
		
		// Close Scanner
		
		scanner.close();
	}

}
