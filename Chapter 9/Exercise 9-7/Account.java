import java.util.Date;

public class Account {

	/* Account data */
	private int ID = 0;  // default 0
	private double balance = 0;  // default 0
	private double annualInterestRate = 0;  // default 0;
	private Date dateCreated;
	
	/* Construct a no-arg Account object */
	Account (){
		dateCreated = new Date();
	}
	
	/* Construct an Account object */
	Account (int newID, double initialBalance, double newAnnualInterestRate){
		ID = newID;
		balance = initialBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = new Date();
	}
	
	
	/* Method - Get Monthly Interest Rate */
	double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		
		return monthlyInterestRate;
	}
	
	
	/* Method - Get Monthly Interest */
	double getMonthlyInterest(){
		double monthlyInterest = balance * (getMonthlyInterestRate()/100);
		
		return monthlyInterest;
	}
	
	
	/* Method - Withdraw */
	double withdraw(double withdrawAmount){
		balance = balance - withdrawAmount;
		
		return balance;
	}
	
	
	/* Method - Deposit */
	double deposit(double depositAmount){
		balance = balance + depositAmount;
		
		return balance;
		
	}
	
	
	/* Accessors */
	
	public int getID() {
		return ID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	
	/* Mutators */
	
	public void setID(int newID) {
		ID = newID;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
}
