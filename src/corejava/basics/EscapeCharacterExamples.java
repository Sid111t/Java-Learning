package corejava.basics;

/**
 * Topic: Escape Characters
 * Description: Demonstrates the use of escape characters such as \n, \\, and \" in Java.
 * Author: Siddhesh
 */

public class EscapeCharacterExamples {

	public static void main(String[] args) {
		
		// Display messages on the console
		
		System.out.println("=========================");
		System.out.println("Escape Characters in Java");
		System.out.println("=========================");
		
		System.out.println("Print Quotes");
		System.out.println();
		System.out.println("He said, \"Java is amazing!\"");
		System.out.println("-------------------------");
		
		System.out.println("Windows Path");
		System.out.println();
		System.out.println("C:\\Users\\Siddhesh\\Documents\\Java");
		System.out.println("-------------------------");
		
		System.out.println("Multi-line Address");
		System.out.println();
		System.out.println("Name    : Siddhesh" + 
		                   "\nCity    : Navi Mumbai" + 
				           "\nState   : Maharashtra" + 
		                   "\nCountry : India");
	}

}
