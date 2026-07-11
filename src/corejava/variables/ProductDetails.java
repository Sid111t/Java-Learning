package corejava.variables;

/**
 * Topic: Variables
 * Program: Product Details
 * Description: Stores and displays product details using local variables.
 * Author: Siddhesh
 */

public class ProductDetails {

	public static void main(String[] args) {
		
		String productName = "Iphone";
		int productId = 1;
		String category = "Smart Phone";
		String brandName = "Apple";
		double price = 149999.00;
		int quantity = 1;
		double discountPercentage = 19.99;
		boolean isInStock = true;
		double rating = 4.9;
		
		System.out.println("===================================");
		System.out.println("         PRODUCT DETAILS           ");
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Name                : " + productName);
		System.out.println("ID                  : " + productId);
		System.out.println("Category            : " + category);
		System.out.println("Brand               : " + brandName);
		System.out.println("Price               : " + price);
		System.out.println("Quantity            : " + quantity);
		System.out.println("Discount Percentage : " + discountPercentage);
		System.out.println("IsInStock           : " + isInStock);
		System.out.println("Rating              : " + rating);
		
		System.out.println("===================================");
	}

}
