/**
 * Author: Jason Beach
 * Date: 01/12/2023
 * 
 * CSCI 1111: Exercise 10-7 (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 
 * to simulate an ATM machine. Create ten accounts in an array with id 0, 1,..., 9, and initial balance $100.
 * The system prompts the user to enter an id. If the id is entered incorrectly, ask the user to enter a 
 * correct id. Once an id is accepted, the main menu is displayed as shown in the sample run. You can enter 
 * a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money, and 4 for 
 * exiting the main menu.
 * Once you exit, the system will prompt for an id again. Thus, once the system starts, it will not stop.
 * */
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	// Setup Scanner
		
		int userInputChoice = 1; 	// Initialize user choice
		
		
		/** Create array of account objects with ID 0 - 9 and initialize balance to $100 */
		Account[] acct = new Account[10];
		
		for (int i = 0; i < 10; i++) {
			acct[i] = new Account(i, 100, 2.5);
		}
			
		while (userInputChoice <= 4) {
			
			userInputChoice = 1;
		
			/** Get account ID from user */
			System.out.print("Please enter an account ID: ");
		
			int userInputId = input.nextInt();
		
		
			/** Check for valid ID entered by user */
			while (userInputId > 9 || userInputId < 0) {
				System.out.print("Invalid ID entered. Please enter an account ID: ");
				userInputId = input.nextInt();
			}
		
			while (userInputChoice <= 3) {
			
		
				/** MAIN MENU */
				System.out.println("\n** MAIN MENU **");
				System.out.println("1: Check balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
		
				System.out.print("What would you like to do? ");
			
				/** Get user input navigation */
				userInputChoice = input.nextInt();
		
				/** User chooses option #1 */
				if (userInputChoice == 1) {
					System.out.println ("Account Balance: $" + acct[userInputId].getBalance());
				}
		
				/** User chooses option #2 */
				if (userInputChoice == 2) {
					System.out.print("Enter an amount to withdraw: $");
					double withdrawAmount = input.nextDouble();
			
					System.out.println("Your new account balance is: $" + acct[userInputId].withdraw(withdrawAmount));
				}
		
				/** User chooses option #3 */
				if (userInputChoice == 3) {
					System.out.print("Enter an amount to deposit: $");
					double depositAmount = input.nextDouble();
			
					System.out.println("Your new account balance is: $" + acct[userInputId].deposit(depositAmount));
					
				}
		
			} // End while loop
		
		} // End while loop
		
	} // End Main

} // End Driver Class
