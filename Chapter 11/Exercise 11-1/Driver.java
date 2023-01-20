/**
 * Author: Jason Beach
 * Date: 01/18/2023
 * 
 * CSCI 1111: Exercise 11-1: Write a test program that prompts the user to enter three 
 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle 
 * is filled. The program should create a Triangle object with these sides and set the 
 * color and filled properties using the input. The program should display the area, 
 * perimeter, color, date created, and true or false to indicate whether it is filled 
 * or not.
 * */
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		/** Prompt user to input 3 sides of triangle */ 
		System.out.println("Please enter the lengths of 3 sides of a triangle.");
		
		System.out.print("\nSide 1: ");
		double side1 = input.nextDouble();
		
		System.out.print("Side 2: ");
		double side2 = input.nextDouble();
		
		System.out.print("Side 3: ");
		double side3 = input.nextDouble();
		
		/** Prompt user to input color of triangle */
		System.out.print("Please input color of the triangle: ");
		String color = input.next();

		/** Prompt user to input boolean value to indicate whether the triangle is 
		 * filled or unfilled */
		System.out.println("Is the triangle filled or un-filled?");
		System.out.print("Enter '1' for filled, and '0' for unfilled: ");
		
		int filledChoice = input.nextInt();
		boolean filled;
		
		if (filledChoice == 1) {
			filled = true;
		}
		else {
			filled = false;
		}
		
		/** Create Triangle Object based on input parameters*/
		Triangle triangle1 = new Triangle (side1, side2, side3);
		
		/** Set color of Triangle Object */
		triangle1.setColor(color);
		
		/** Set filled properties of Triangle Object */
		triangle1.setFilled(filled);
		
		/** Display the area, perimeter, color, date created, and true/false to indicate 
		 * whether the Triangle Object is filled or not */
		System.out.println ("\n" + triangle1.toString());
		System.out.println ("\n"+ triangle1.toStringGeo());
				
	} // End Main

} // End Driver Class
