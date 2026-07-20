package corejava.scanner;

/**
 * Topic: Scanner Class
 * Program: Bank Account Input
 * Description: Demonstrates reading bank account details using the Scanner class.
 * Author: Siddhesh
 */

//Import Scanner class

import java.util.Scanner;

public class BankAccountInput {

	public static void main(String[] args) {
		
		// Create Scanner object

		Scanner scanner = new Scanner(System.in);
		
		// Read user input
		
		System.out.println("==================================");
		System.out.println("        BANK ACCOUNT INPUT        ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.print("Enter Account Holder Name : ");
		String accountHolderName = scanner.nextLine();
		
		System.out.print("Enter Account Number      : ");
		long accountNumber = scanner.nextLong();
		
		System.out.print("Enter Balance             : ");
		double balance = scanner.nextDouble();
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Perform calculations

		double bonus = balance * 0.10;
		double finalBalance = balance + bonus;
		
		// Display the entered details
		
		System.out.println("Account Holder Name     : " + accountHolderName);
		System.out.println("Account Number          : " + accountNumber);
		System.out.println("Balance                 : " + balance);
		System.out.println("Bonus                   : " + bonus);
		System.out.println("Final Balance           : " + finalBalance);
		System.out.println();
		
		System.out.println("==================================");
		
		// Close Scanner
		
		scanner.close();
	}

}
