package com.training;

public class BankClient {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(1234,"Anwar",500,4);
			
		System.out.println("Before deposit: "+savingAccount.accountBalance());
		savingAccount.accountDeposit(300);
		System.out.println("After deposit: "+savingAccount.accountBalance());
		savingAccount.accountWithdraw(200);
		System.out.println("After withdraw: "+savingAccount.accountBalance());
		savingAccount.addInterest();
		//Overloading --- Same method, different parameter list --- Static polymorphism
		// savingAccount.addInterest(6);
		System.out.println("After interest: "+savingAccount.accountBalance());
		
		//Parent account can be used as object Type --- Dynamic polymorphism
		//Method ran and compiled are different based on Class
		Account currentAccount = new CurrentAccount(2781, "Ahmed",400,100);
		
		System.out.println("Before deposit: "+currentAccount.accountBalance());
		currentAccount.accountDeposit(500);
		System.out.println("After deposit: "+currentAccount.accountBalance());
		currentAccount.accountWithdraw(1100);
		currentAccount.accountWithdraw(1000);
		System.out.println("After withdraw: "+currentAccount.accountBalance());
	
		
	}

}
