/**
 * Author: Jason Beach
 * Date: 01/30/2023
 * 
 * CSCI 1111: Exercise 13-7
 * Create the Colorable, Triangle, and GeometricObject classes. Write a test program that creates 
 * an array of five GeometricObjects. For each object in the array, display its area and invoke 
 * its howToColor method if it is colorable.
 * 
 * */
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		// Create an array of five GeometricObjects
		GeometricObject[] arrayOfObjects = {new Triangle(5,5,2), new Triangle(9,8,4), 
				new Triangle(6,5,4), new Triangle(6,6,4), new Triangle(7,8,9)};
		
		
		// For each object in the array, display its area
		for (int i = 0; i < arrayOfObjects.length; i++) {
			System.out.printf("Area of Triangle: %.2f\n" ,arrayOfObjects[i].getArea());
		}
		
		
		// Invoke how to color method if object is colorable
		for (int j = 0; j < arrayOfObjects.length; j++) {
			if(arrayOfObjects[j] instanceof Colorable) {
				System.out.println(((Colorable)arrayOfObjects[j]).howToColor());
			}
		}
		
		
	} // End Main

} // End Driver Class
