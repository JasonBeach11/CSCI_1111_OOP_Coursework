import java.util.Date;

public class Checking extends Account{
	
	/** Default no-arg constructor */
	public Checking() {
		dateCreated = new Date();
	}
	
	/** Constructor with parameters */
	public Checking (int newID, double initialBalance, double newAnnualInterestRate){
		setID(newID);
		setBalance(initialBalance);
		setAnnualInterestRate(newAnnualInterestRate);
		dateCreated = new Date();
	}
	
	/** Withdraw from checking account - allow overdraft limit of $100 */
	public double withdraw(double withdrawAmount){
		setBalance(getBalance() - withdrawAmount);
		
		if (getBalance() < -100) {
			System.out.println ("Error! Withdraw smaller amount. Cannot exceed $100 overdraft limit.");
			
			return getBalance();
		}
		
		else {
			System.out.println ("Withdraw Success!");
			
		return getBalance();
		}
		
	} 
	
} // End Checking Class
