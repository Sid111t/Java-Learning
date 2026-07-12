package corejava.variables;

/**
 * Topic: Variables
 * Program: Rectangle Area
 * Description: Calculates the area and perimeter of a rectangle using variables.
 * Author: Siddhesh
 */

public class RectangleArea {

	public static void main(String[] args) {
		
		double length = 10.0;
		double width = 5.0;
		
		System.out.println("=================================");
		System.out.println("        RECTANGLE DETAILS        ");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("Length : " + length);
		System.out.println("Width  : " + width);
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println();
		
		double area = length * width;
		double perimeter = 2 * (length + width);
		
		System.out.println("Area      : " + area);
		System.out.println("Perimeter : " + perimeter);
		System.out.println();
		
		System.out.println("=================================");
	}

}
