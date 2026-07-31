package corejava.oop.superkeyword;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: PersonSuper
 * Description: Represents a person whose constructor and methods can be accessed using the super keyword.
 * Author: Siddhesh
 */

public class PersonSuper {
	
	// Instance variable to store the person's name
	
	String personName;
	
	// Parameterized constructor to initialize the person's name

	public PersonSuper(String personName) {
		this.personName = personName;
	}

	// Instance method to display the person's name
	
	public void displayPersonName() {
		
		System.out.println("Student Name : " + personName);
		
	}

}
