package corejava.variables;

/**
 * Topic: Variables
 * Program: Variable Reassignment
 * Description: Demonstrates how variable values can be updated after initialization.
 * Author: Siddhesh
 */

public class VariableReassignment {

	public static void main(String[] args) {
		
		String studentName = "Siddhesh";
		int age = 22;
		String city = "Navi Mumbai";
		
		System.out.println("=============================");
		System.out.println("        BEFORE UPDATE        ");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("Name : " + studentName);
		System.out.println("Age  : " + age);
		System.out.println("City : " + city);
		System.out.println("=============================");
		System.out.println();
		
		age = 23;
		city = "Pune";
		
		System.out.println("=============================");
		System.out.println("         AFTER UPDATE        ");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("Name : " + studentName);
		System.out.println("Age  : " + age);
		System.out.println("City : " + city);
		System.out.println("=============================");

	}

}
