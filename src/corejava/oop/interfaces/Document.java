package corejava.oop.interfaces;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: Document
 * Description: Represents a document that implements the Printable interface.
 * Author: Siddhesh
 */

public class Document implements Printable{
	
	// Implement the print() method of the Printable interface
	
	@Override
	public void print() {
		System.out.println("Printing Document.");
	}

}
