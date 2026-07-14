package corejava.variables;

/**
 * Topic: Variables
 * Program: Student Result
 * Description: Calculates total, average, and percentage using variables.
 * Author: Siddhesh
 */

public class StudentResult {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		
		String studentName = "Rohit";
		int javaMarks = 80;
		int pythonMarks = 70;
		int dbmsMarks = 90;
		
		// Display initial values
		
		System.out.println("=================================");
		System.out.println("          STUDENT RESULT         ");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("Student Name : " + studentName);
		System.out.println("Java Marks   : " + javaMarks);
		System.out.println("Python Marks : " + pythonMarks);
		System.out.println("DBMS Marks   : " + dbmsMarks);
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		
		// Perform calculations and store the results
		
		int totalMarks = javaMarks + pythonMarks + dbmsMarks;
		double averageMarks = totalMarks / 3.0;
		double percentage = (totalMarks * 100.0) / 300;
		
		// Display the results
		
		System.out.println("Total Marks   : " + totalMarks + "/300");
		System.out.println("Average Marks : " + averageMarks);
		System.out.println("Percentage    : " + percentage);
		System.out.println();
		
		System.out.println("=================================");
	}

}
