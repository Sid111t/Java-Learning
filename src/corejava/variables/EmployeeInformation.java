package corejava.variables;

/**
 * Topic: Variables
 * Program: Employee Information
 * Description: Stores and displays employee details using local variables.
 * Author: Siddhesh
 */

public class EmployeeInformation {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String employeeName = "Rohit Sharma";
		int employeeId = 45;
		String department = "HR";
		int salary = 100000;
		int experience = 15;
		String email = "rohitsharma45@gmail.com";
		String mobileNumber = "+91 9370264045";
		boolean isPermanent = true;
		
		// Display the variable values
		
		System.out.println("========================================");
		System.out.println("          EMPLOYEE INFORMATION          ");
		System.out.println("========================================");
		System.out.println();
		
		System.out.println("Name          : " + employeeName); 
		System.out.println("ID            : " + employeeId);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : " + salary);
		System.out.println("Experience    : " + experience + " years");
		System.out.println("Email         : " + email);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("IsPermanent   : " + isPermanent);
		
		System.out.println();
		System.out.println("========================================");

	}

}
