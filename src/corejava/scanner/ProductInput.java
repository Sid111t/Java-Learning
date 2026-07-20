package corejava.scanner;

/**
 * Topic: Scanner Class
 * Program: Product Input
 * Description: Demonstrates reading product details using the Scanner class.
 * Author: Siddhesh
 */

//Import Scanner class

import java.util.Scanner;

public class ProductInput {

	public static void main(String[] args) {
		
		// Create Scanner object

		Scanner scanner = new Scanner(System.in);
		
		// Read user input
		
		System.out.println("==================================");
		System.out.println("           PRODUCT INPUT          ");
		System.out.println("==================================");
		System.out.println();
		
		System.out.print("Enter Product Name     : ");
		String productName = scanner.nextLine();
		
		System.out.print("Enter Product Price    : ");
		double productPrice = scanner.nextDouble();
		
		System.out.print("Enter Product Quantity : ");
		int productQuantity = scanner.nextInt();
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println();
		
		// Calculate total amount

		double totalAmount = productPrice * productQuantity;
		
		// Display the entered details
		
		System.out.println("Product Name         : " + productName);
		System.out.println("Product Price        : " + productPrice);
		System.out.println("Product Quantity     : " + productQuantity);
		System.out.println("Total Amount         : " + totalAmount);
		
		System.out.println();
		
		System.out.println("==================================");
		
		// Close Scanner
		
		scanner.close();
	}

}
