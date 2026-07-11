package corejava.variables;

/**
 * Topic: Variables
 * Program: Student Details
 * Description: Stores and displays student information using local variables.
 * Author: Siddhesh
 */

public class StudentDetails{

	public static void main(String[] args) {
		
		String name = "Siddhesh Thakur";
		int rollNo = 41;
		String branch = "Information Technology";
		String collegeName = "Pillai HOC College of Engineering & Technology";
		String email = "siddheshthakur9876@gmail.com";
		String mobileNumber = "+91 9372047101";
		boolean isHosteller = false;
		
		System.out.println("==============================================================");
		System.out.println("                    STUDENT DETAILS                           ");
		System.out.println("==============================================================");
		System.out.println();
		
		System.out.println("Name          : " + name); 
		System.out.println("Roll Number   : " + rollNo);
		System.out.println("Branch        : " + branch);
		System.out.println("College Name  : " + collegeName);
		System.out.println("Email         : " + email);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("IsHosteller   : " + isHosteller);
		
		System.out.println();
		System.out.println("==============================================================");
	}

}
