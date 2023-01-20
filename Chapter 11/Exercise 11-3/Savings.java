import java.util.Date;

public class Savings extends Account{
	
	/** Default no-arg constructor */
	public Savings() {
		
	}
	
	/** Constructor with parameters */
	public Savings (int newID, double initialBalance, double newAnnualInterestRate){
		setID(newID);
		setBalance(initialBalance);
		setAnnualInterestRate(newAnnualInterestRate);
		dateCreated = new Date();
	}
	
	/** Withdraw from Savings account - do not allow overdraft */
	public double withdraw(double withdrawAmount){
		
		setBalance(getBalance() - withdrawAmount);
		
		if (getBalance() < 0) {
			System.out.println ("Error! Withdraw smaller amount. Cannot reduce savings account balance below $0.00");
			
			return getBalance();
		}
		
		else {
			System.out.println ("Withdraw Success!");
			
		return getBalance();
		}
		
	}
	
} // End Savings Class
