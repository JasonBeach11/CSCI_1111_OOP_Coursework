/**
 * Author: Jason Beach
 * Date: 01/25/2023
 * CSCI 1111: Exercise 12-15
 * 
 * (Write/read data) Write a program to create a file named Exercise12_15.txt
 * if it does not exist. Write 100 integers created randomly into the file
 * using text I/O. Integers are separated by spaces in the file. Read the
 * data back from the file and display the data in increasing order. 
 * 
 * */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WriteAndReadData {

	public static void main(String[] args) throws IOException {
		
		
		// Create file instance
		File file = new File("Exercise12_15.txt");
		
				
		// Create file-writer and write 100 random integers to the file
		try (PrintWriter output = new PrintWriter(file)) {
			
			for (int i=0; i<100; i++) {
				output.print(ThreadLocalRandom.current().nextInt(1,100));
				output.print(" ");
			}
		}
		
				
		// Create Scanner to read from file
		Scanner input = new Scanner(file);
			
		// Create array to store 100 random numbers from file
		int [] inputNum = new int[100]; 
		
		
		// Read data from file and store in array 
		while (input.hasNext()) {
			for (int i = 0; i < 100; i++) {
				inputNum[i] = input.nextInt(); 
			}
		}
		
		
		// Sort array in ascending order
		int temp = 0;
		for (int i = 0; i < inputNum.length; i++) {
			for (int j = i + 1; j<inputNum.length; j++) {
				
				if (inputNum[i]> inputNum[j]) {
					temp = inputNum[i];
					inputNum[i] = inputNum[j];
					inputNum[j] = temp;
				}
			}
		}
		
		
		// Output sorted array
		for (int k = 0; k < inputNum.length; k++) {
			System.out.print(inputNum[k] + " ");
		}
		
		
		// Close the file
		input.close();
			
		
	} // End Main
	
} // End WriteAndReadData Class
