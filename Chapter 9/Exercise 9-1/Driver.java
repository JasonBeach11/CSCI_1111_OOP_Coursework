/**
 * Author: Jason Beach
 * Date: 12/19/2022
 * CSCI 1111 Exercise 9-1: This is a test program that creates two Rectangle objects
 * and displays the parameters of the rectangles created.
 * */

public class Driver {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle (4,40);
		Rectangle rectangle2 = new Rectangle (3.5, 35.9);
		
		
		// Display parameters of Rectangle 1
		System.out.print ("The parameters of Rectangle 1 are: ");
		System.out.printf("Width: %2.1f, Height: %2.1f, Area: %2.1f, Perimeter: %2.1f\n"
		,rectangle1.width, rectangle1.height, rectangle1.getArea(), rectangle1.getPerimeter());
		
		// Display parameters of Rectangle 2
		System.out.print ("The parameters of Rectangle 2 are: ");
		System.out.printf("Width: %2.1f, Height: %2.1f, Area: %2.1f, Perimeter: %2.1f"
		,rectangle2.width, rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());
	}

}
