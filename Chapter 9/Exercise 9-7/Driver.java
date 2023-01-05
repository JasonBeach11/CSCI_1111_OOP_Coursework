
public class Driver {
	
	public static void main(String[] args) {
		
		/* Create an Account object with an account ID of 1122, a balance of $20,000
		 * and an annual interest rate of 4.5% */
		Account testAccount1 = new Account (1122, 20000, 4.5);
		testAccount1.withdraw(2500);
		testAccount1.deposit(3000);
		
		
		
		System.out.println ("Account ID: " + testAccount1.getID());
		System.out.printf("Account Balance: $%2.2f" ,testAccount1.getBalance());
		System.out.printf("\nMonthly Interest: $%2.2f" ,testAccount1.getMonthlyInterest());
		System.out.println("\nDate created: " + testAccount1.getDateCreated());
	
	}
}
