/**
 * Author: Jason Beach
 * Date: 01/19/2023
 * CSCI 1111: Exercise 11-3
 * An account has the properties account number, balance, annual interest rate, and date created, 
 * and methods to deposit and withdraw funds. Create two subclasses: checking accounts and 
 * saving accounts. A checking account has an overdraft limit, but a savings account cannot be 
 * overdrawn.
 * Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and 
 * invokes their toString() methods.
 * */

public class Driver {

	public static void main(String[] args) {
		
		/**Create Account Object */
		Account baseAccount1 = new Account(101, 100, 2.0);
		
		/** Create Checking Account Object */
		Checking checking1 = new Checking (2501, 5000, 2.5);
		
		/** Create Savings Account Object */
		Savings savings1 = new Savings (2505, 12000, 5.0);
		
		/** Invoke toString() method for each Account Object */
		System.out.println("\nAccount Type: Base Account\n" + baseAccount1.toString());
		System.out.println("\nAccount Type: Checking\n" + checking1.toString());
		System.out.println("\nAccount Type: Savings\n" + savings1.toString());
		
	}

}
