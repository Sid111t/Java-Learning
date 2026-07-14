package corejava.variables;

/**
 * Topic: Variables
 * Program: Bank Account
 * Description: Demonstrates deposit and withdrawal operations using variables.
 * Author: Siddhesh
 */

public class BankAccount {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String accountHolderName = "Rocky";
		int accountNumber = 7979;
		double balance = 50000.00;
		double depositAmount = 10000.00;
		double withdrawAmount = 49999.00;
		
		// Display initial values
		
		System.out.println("=================================");
		System.out.println("           BANK ACCOUNT          ");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println();
		System.out.println("Initial Balance : ₹" + balance);
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();
		
		// Perform calculations and store the results
		
		balance = balance + depositAmount;
		
		// Display the results
		
		System.out.println("Deposit Amount : ₹" + depositAmount);
		System.out.println();
		
		System.out.println("Balance After Deposit : ₹" + balance);
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();
		
		System.out.println("Withdrawal Amount : ₹" + withdrawAmount);
		System.out.println();
		
		// Perform calculations and store the results
		
		balance = balance - withdrawAmount;
		
		// Display the results
		
		System.out.println("Final Balance : ₹" + balance);
		System.out.println();
		
		System.out.println("=================================");
		
	}

}
