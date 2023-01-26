/**
 * Author: Jason Beach
 * Date: 01/24/2023
 * CSCI 1111: Exercise 12-3
 * 
 * Write a program that meets the following requirements:
 * - Creates an array with 100 randomly chosen integers.
 * - Prompts the user to enter the index of the array, then displays the corresponding
 * value. If the specified index is out of bounds, display the message "Out of Bounds".
 * */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ArrayOutOfBoundsException {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		// Create array and fill with 100 random values
		int [] randomArray = new int [100];
		
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = ThreadLocalRandom.current().nextInt(1,1000);
		}
		
		
		// Prompt user to enter index of array
		System.out.print("Enter index of array: ");
		
		int userIndex = input.nextInt();
		
		
		// Check for exception
		try {
			arrayCheck(userIndex);
			System.out.print("The value at index '" + userIndex + "' is: " + randomArray[userIndex]);
			
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println ("Exeption: Index must be between 0 and 100.");
		}
		
	} // End Main
	
	
	public static void arrayCheck (int userIndex) {
		
		if (userIndex < 0 || userIndex > 100) {
			throw new IndexOutOfBoundsException ("Index cannot be less than 0 or more than 100");
		}
		
	}
	

} // End ArrayOutOfBoundsException Class
