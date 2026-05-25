package com.training;

import java.util.Scanner;

public class AssessmentOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingAccount[] savingAccount = new SavingAccount[3];
		CurrentAccount[] currentAccount = new CurrentAccount[3];
		
		int accType;
		int accNum;
		String cName;
		double cBalance;
		float interestRate;
		double ovDraft;
		

		int i = 0;
		int j = 0;
		
		while(true) {
			try{	
				System.out.println("Enter 1 for Saving Account or 2 for Current Account: ");
				accType = Integer.parseInt(sc.nextLine());
			System.out.println("Press x to exit or enter to add new account");
			if(sc.nextLine().equalsIgnoreCase("x")) {
					break;
				}
			else if(accType == 1){
				System.out.println("Enter Account Number: ");
				accNum = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Name: ");
				cName = sc.nextLine();
				System.out.println("Enter Balance: ");
				cBalance = Double.parseDouble(sc.nextLine());
				System.out.println("Enter Interest: ");
				interestRate = Float.parseFloat(sc.nextLine());
				savingAccount[i] = new SavingAccount(accNum,cName,cBalance, interestRate);
				i++;
			}
			else if(accType == 2) {
				System.out.println("Enter Account Number: ");
				accNum = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Name: ");
				cName = sc.nextLine();
				System.out.println("Enter Balance: ");
				cBalance = Double.parseDouble(sc.nextLine());
				System.out.println("Enter Interest: ");
				ovDraft = Double.parseDouble(sc.nextLine());
				currentAccount[j]= new CurrentAccount(accNum,cName,cBalance, ovDraft);
				j++;
			}
		}
		
		
		catch(Exception e) {
			System.out.println("Error! Please enter the information again");
			//continue;
		}
		
		}
	}
}

