package com.training.oops;

public class CurrentAccount extends Account {

	private double overdraftLimit = 200;
	
	public CurrentAccount() {
		
	}
	
	public CurrentAccount(int accountNo, String custName, double balance, double overdraftLimit) {
		super(accountNo, custName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	//@Override
	public void accountWithdraw(double amount) {
		if(balance+overdraftLimit >= amount) {
			balance -= amount;
			System.out.println(amount+" withdrawn from current account");
		}
		else {
			System.out.println("Exceeds Overdraft");
		}
	}
}
