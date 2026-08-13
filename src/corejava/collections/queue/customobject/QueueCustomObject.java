package corejava.collections.queue.customobject;

/**
 * Topic: Collections Framework
 * Program: Queue with Custom Objects
 * Description: Demonstrates how to store and traverse custom objects in a Queue.
 * Author: Siddhesh
 */

import java.util.Queue;
import java.util.LinkedList;

public class QueueCustomObject {
	
	public static void main(String[] args) {
		
		// Create a Queue to store Student objects
		
		Queue<Student> students = new LinkedList<>();

		// Create Student objects using the parameterized constructor
		
		Student student1 = new Student(101, "Siddhesh", 22);
		Student student2 = new Student(102, "Rahul", 21);
		Student student3 = new Student(103, "Amit", 23);

		// Add Student objects to the Queue
		
		students.add(student1);
		students.add(student2);
		students.add(student3);

		// Display the results
		
		System.out.println("=================================");
		System.out.println("    QUEUE WITH CUSTOM OBJECTS    ");
		System.out.println("=================================");
		System.out.println();

		// Traverse the Queue and display student details
		
		for (Student currentStudent : students) {
			
			currentStudent.displayStudent();
			
		}
		
		System.out.println("=================================");
		
	}

}
