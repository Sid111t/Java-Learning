package corejava.oop.constructors;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: StudentParameterized
 * Description: Represents a student whose details are initialized using a parameterized constructor.
 * Author: Siddhesh
 */

public class StudentParameterized {

    // Instance variables to store student details

    String studentName;
    int studentAge;

    // Parameterized constructor to initialize student details using the this keyword

    public StudentParameterized(String studentName, int studentAge) {
    	
    	   // Use the this keyword to refer to the current object's instance variables
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    // Instance method to display student details

    public void displayStudentDetails() {

        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age  : " + studentAge);

    }

}
