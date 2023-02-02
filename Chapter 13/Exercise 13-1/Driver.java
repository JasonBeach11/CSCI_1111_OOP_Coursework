/**
 * Author: Jason Beach
 * Date: 01/26/2023
 * 
 * CSCI 1111: Exercise 13-1
 * Write a test program that prompts the user to enter three sides of the triangle, 
 * a color, and a Boolean value to indicate whether the triangle is filled. 
 * The program should create a Triangle object with these sides and set the color 
 * and filled properties using the input. The program should display the area, 
 * perimeter, color, and true or false to indicate whether it is filled or not.
 * 
 * */
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		// Prompt user to input 3 sides of triangle
		System.out.println("Enter 3 sides of a triangle");
		
		System.out.print("Side 1: ");
		double side1 = input.nextDouble();
		
		System.out.print("Side 2: ");
		double side2 = input.nextDouble();
		
		System.out.print("Side 3: ");
		double side3 = input.nextDouble();
		
		
		// Prompt user to input color of triangle
		System.out.print("\nEnter color of triangle: ");
		String triangleColor = input.next();
		
		
		// Prompt user to input whether triangle is filled
		System.out.print("\nIs triangle filled? '1' for YES, '0' for NO: ");
		int triangleFilled = input.nextInt();
		
		while (triangleFilled != 1 && triangleFilled != 0) {
			System.out.print("\nError... Invalid input. Enter '1' or '0': ");
			triangleFilled = input.nextInt();
		}
		
		
		// Create new triangle object based on user inputs
		Triangle triangle1 = new Triangle (side1, side2, side3);
		
		triangle1.setColor(triangleColor);  // set color
		
		if (triangleFilled == 1) {
			triangle1.setFilled(true);
		}
		else {
			triangle1.setFilled(false);
		}
		
		
		// Display triangle object area, perimeter, color, and T/F to indicate if filled
		System.out.println("Triangle area is: " + triangle1.getArea());
		System.out.println("Triangle perimeter is: " + triangle1.getPerimeter());
		System.out.println("Triangle color is: " + triangle1.getColor());
		
		if (triangle1.isFilled() == true){
			System.out.println("Triangle IS filled.");
		}
		else {
			System.out.println("Triangle is NOT filled.");
		}
		
	} // End Main

} // End Driver Class
