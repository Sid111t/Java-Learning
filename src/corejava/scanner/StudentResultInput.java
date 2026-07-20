package corejava.scanner;

/**
 * Topic: Scanner Class
 * Program: Student Result Input
 * Description: Demonstrates reading student marks and calculating total, average, and result using the Scanner class.
 * Author: Siddhesh
 */

//Import Scanner class

import java.util.Scanner;

public class StudentResultInput {

	public static void main(String[] args) {
		
		// Create Scanner object

		Scanner scanner = new Scanner(System.in);
		
		// Read user input
		
		System.out.println("==================================");
		System.out.println("       STUDENT RESULT INPUT       ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.print("Enter Student Name      : ");
		String studentName = scanner.nextLine();
		
		System.out.print("Enter Physics Marks     : ");
		int physicsMarks = scanner.nextInt();
		
		System.out.print("Enter Chemistry Marks   : ");
		int chemistryMarks = scanner.nextInt();
		
		System.out.print("Enter Mathematics Marks : ");
		int mathematicsMarks = scanner.nextInt();
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations

		int totalMarks = physicsMarks + chemistryMarks + mathematicsMarks;
		double averageMarks = totalMarks / 3.0;
		String result = (averageMarks >= 35) ? "Pass" : "Fail";;
		
		// Display the entered details
		
		System.out.println("Student Name          : " + studentName);
		System.out.println("Physics Marks         : " + physicsMarks);
		System.out.println("Chemistry Marks       : " + chemistryMarks);
		System.out.println("Mathematics Marks     : " + mathematicsMarks);
		System.out.println("Total Marks           : " + totalMarks);
		System.out.println("Average Marks         : " + averageMarks);
		System.out.println("Result                : " + result);
		System.out.println();
		
		System.out.println("==================================");
		
		// Close Scanner
		
		scanner.close();
	}

}
