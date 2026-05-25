package com.training;

public class SavingAccount extends Account{

	private float interestRate = 4.5f;

	public SavingAccount() {
		
	}
	
	public SavingAccount(int accountNo, String custName, double balance, float interestRate) {
		super(accountNo, custName, balance);
		this.interestRate = interestRate;
	}

	
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = (balance * interestRate)/100;
		balance += interest;
		System.out.println(interest+" Interest added to the balance");
	}
	//Overloading method -- Same method, different parameter list
	public void addInterest(double interestRate) {
		double interest = (balance * interestRate)/100;
		balance += interest;
		System.out.println(interest+" Interest added to the balance");
	}
	
	@Override
	public void accountWithdraw(double withdraw) {
		if(withdraw > this.balance) {
			try {
			throw new InsufficientBalanceException("Insufficient balance!");
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
		}
		else {
			
			balance -= withdraw;
		System.out.println(withdraw+" got withdrawn successfully!");
		}		
	}

	
	
}
