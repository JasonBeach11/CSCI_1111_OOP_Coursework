/**
 * Author: Jason Beach
 * Date: 01/31/2023
 * 
 * CSCI 1111: Exercise 13-11: Write a test program that creates an Octagon object. 
 * Clone the first octagon into a second, then use the .compareTo method to 
 * compare the two objects.
 * 
 * */

public class Driver {

	public static void main(String[] args) {
		
		
		// Create first Octagon object
		Octagon oct1 = new Octagon(5);
		
		
		// Clone first Octagon object
		Octagon octClone = (Octagon)oct1.clone();
		
		
		// Compare oct1 and octClone
		int compareValue = octClone.compareTo(oct1);
		
		if (compareValue == 1) {
			System.out.println("Value of oct1 is larger than octCloned");
		}
		else if (compareValue == -1) {
			System.out.println ("Value of oct1 is smaller than octCloned");
		}
		else {
			System.out.println("Value of oct1 and octCloned are equal");
		}
		
		
	} // End Main

} // End Driver Class
