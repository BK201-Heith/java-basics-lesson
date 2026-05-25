package com.training;

public abstract class Account {
	// Variables
	protected int accountNo;
	protected String custName;
	protected double balance;
	
	// Default Constructor
	public Account() {
		
	}

	// Parameterized Constructor
	public Account(int accountNo, String custName, double balance) {
		this.accountNo = accountNo;
		this.custName = custName;
		this.balance = balance;
	}
	
	// Methods
	public String accountDeposit(double deposited) {
		balance = balance + deposited;
		return balance+" got deposited successfully!";
		}
	
	public double accountBalance() {
		return balance;
	}
	
	// Concrete method -- Implementation when called
	
	/*public void accountWithdraw(double withdraw) {
		if(withdraw > this.balance) {
			System.out.println("Insufficient amount!");
		}
		else {
			balance -= withdraw;
		System.out.println(withdraw+" got withdrawn successfully!");
		}		
	} */
	
	// Abstract method -- No implementation, just a rule for sub-classes to create their own method
	public abstract void accountWithdraw(double withdraw);

	
	
	// Setters and Getters
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
