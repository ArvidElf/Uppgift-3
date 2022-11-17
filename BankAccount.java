package newVersionAssignment;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private Person owner;
	
	
	
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	
	
	
	// Deposit
	public void deposit(double amount) {
		this.balance += amount;
	}

	// Withdraw
	public void withdraw(double amount) {
		if (balance <= 0) {
			System.out.println("Balance is less than 0, can not withdraw");

		} else {
			if (amount <= balance / 2) {
			//	balance = balance - amount;
				double newAmount = (balance = balance - amount);
				setBalance(newAmount);
			} else {
				System.out.println("You can only withdraw $" + balance / 2 + " at most.");
			}
		}
	}

	// Getters and Setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
