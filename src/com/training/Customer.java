package com.training;

import java.util.Scanner;

// ctrl+shift+o Shortcut for importing

public class Customer {

	public static void main(String[] args) {
		//Typecasting 
		/*
			byte b = 112;
			short s = 113;
			b = (byte)s;
			s = b;
		*/
		
		//sysout then ctrl+spacebar for auto-fill
		//nextline() allows space || next() will take one string without space
		//nextInt() will take only numbers
		
		// Create variables that will store customer first name,
		// customer last name, customer age, and display all details in a single line
		//Scanner object helps you take input from users
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter customer first name: \n");
			String customerFirstName = sc.nextLine();
			System.out.println("Enter customer last name: \n");
			String customerLastName = sc.nextLine();
			System.out.println("Enter customer age: \n");
			int customerAge = sc.nextInt();
			System.out.println("\n");
			System.out.println("Welcome "+customerFirstName+" "+customerLastName+"!"+"\n"+
			"You are "+customerAge+" years old! \n");
		
		// Check if the customer is more than 18 than display eligible to open an account
		// else display: Not yet eligible to open an account
			if (customerAge >= 18) 
				{
					System.out.println("You are eligible to open an account!");
				}
			else
				System.out.println("You are not eligible to open an account");
//			&& AND 
//			|| OR
			

}}
