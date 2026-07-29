package corejava.methods;

/**
 * Topic: Methods
 * Program: Variable Scope in Methods
 * Description: Demonstrates the scope of local variables declared inside different methods.
 * Author: Siddhesh
 */

public class VariableScopeInMethods {
	
	public static void main(String[] args) {
		
		// Display the results
		
		System.out.println("==============================");
		System.out.println("   VARIABLE SCOPE IN METHODS  ");
		System.out.println("==============================");
		System.out.println();
		
		// Display student information using the displayStudent() method
		
		displayStudent();
		System.out.println();
		
		// Display employee information using the displayEmployee() method
		
		displayEmployee();
		System.out.println();
		
		System.out.println("==============================");
		
	}
	
	// Method to display student information
	
	public static void displayStudent() {
		
		String studentName = "Siddhesh";
		int studentAge = 22;
		
		System.out.println("Student Name  : " + studentName);
		System.out.println("Student Age   : " + studentAge);
		
	}
	
	// Method to display employee information
	
	public static void displayEmployee() {
		
		String employeeName = "Rahul";
		int employeeId = 101;
		
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee ID   : " + employeeId);
		
	}

}
