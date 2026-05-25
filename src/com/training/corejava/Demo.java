package com.training.corejava;

import java.util.Scanner;

// ctrl+shift+o Shortcut for importing

public class Demo {

	public static void main(String[] args) {
		//Typecasting 
		/*
			byte b = 112;
			short s = 113;
			b = (byte)s; //Explicit
			s = b; //Implicit
		*/
	
		
		//sysout then ctrl+spacebar for auto-fill
		//nextline() allows space || next() will take one string without space
		//nextInt() will take only numbers
		
		// Create variables that will store customer first name,
		// customer last name, customer age, and display all details in a single line
		//Scanner object helps you take input from users
			Scanner sc = new Scanner(System.in);
			
			int i = 0;
			
			while(true) 
			{
				System.out.println("Enter X to exit or Enter to create a customer record");
				String choice = sc.nextLine();
				if(choice.equalsIgnoreCase("X")) 
					{
						break;
					}
					i++;
					System.out.println("Enter First Name for customer "+i);
					String customerFirstName = sc.nextLine();
					System.out.println("Enter Last Name for customer "+i);
					String customerLastName = sc.nextLine();
					System.out.println("Enter Age for customer "+i);
					int customerAge = sc.nextLine().charAt(0);
//					int customerAge = Integer.parseInt(sc.nextLine());
					System.out.println(customerAge);
							// 
					
					
				}
			System.out.println("Total number of customers saved: "+i);
			
			int k = 0;
			do	{
					System.out.println("Inside Do While Loop: "+k);
					k++;
				} 
			while(k<3);
			
			for(int j = 0; j<3; j++) 
				{
					System.out.println("For loop values: "+j);
				};
//			System.out.println("Enter customer first name: \n");
//			String customerFirstName = sc.nextLine();
//			System.out.println("Enter customer last name: \n");
//			String customerLastName = sc.nextLine();
//			System.out.println("Enter customer age: \n");
//			int customerAge = sc.nextInt();
//			System.out.println("\n");
//			System.out.println("Welcome "+customerFirstName+" "+customerLastName+"!"+"\n"+
//			"You are "+customerAge+" years old! \n");
	
		
		// Check if the customer is more than 18 than display eligible to open an account
		// else display: Not yet eligible to open an account
//			if (customerAge >= 18) 
//				{
//					System.out.println("You are eligible to open an account!");
//				}
//			else
//				System.out.println("You are not eligible to open an account");
//			&& AND 
//			|| OR
		// 	
			

}}
