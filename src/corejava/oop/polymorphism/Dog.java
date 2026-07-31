package corejava.oop.polymorphism;

/**
 * Topic: Object-Oriented Programming (OOP)
 * Class: Dog
 * Description: Represents a dog that overrides the sound method of the Animal class.
 * Author: Siddhesh
 */

public class Dog extends Animal{
	
	// Override the sound() method of the Animal class
	
	@Override
	public void sound() {
		System.out.println("Dog Barks.");
	}

}
