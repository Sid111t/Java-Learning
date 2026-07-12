package corejava.variables;

/**
 * Topic: Variables
 * Program: Salary Calculator
 * Description: Calculates gross salary using basic salary, HRA, and bonus.
 * Author: Siddhesh
 */

public class SalaryCalculator {

	public static void main(String[] args) {
		
		String employeeName = "Rahul";
		int employeeId = 101;
		double basicSalary = 35000;
		double hra = 10000;
		double bonus = 2000;
		
		System.out.println("=================================");
		System.out.println("        SALARY CALCULATOR        ");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee ID   : " + employeeId);
		System.out.println();
		System.out.println("Basic Salary  : ₹" + basicSalary);
		System.out.println("HRA           : ₹" + hra);
		System.out.println("Bonus         : ₹" + bonus);
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		
		double grossSalary = basicSalary + hra + bonus;
		
		System.out.println("Gross Salary : ₹" + grossSalary);
		System.out.println();
		
		System.out.println("=================================");
	}

}
