package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CustomerCSVReader {

public static void main(String[] args) throws IOException {
		
		// File Reader and Writers initialized within Try block so that it is closed as soon as the try is done
		Scanner sc = new Scanner(System.in);
		
		try (BufferedReader br = new BufferedReader(new FileReader("customer.csv")); //Semi-colon instead of comma for multiple objects
				BufferedWriter bw = new BufferedWriter(new FileWriter("male_customer.csv"));
					BufferedWriter inW = new BufferedWriter(new FileWriter("customer_input.csv"));
						ObjectOutputStream oos = new ObjectOutputStream(
													new FileOutputStream("customer.ser"))
				) {
		 bw.write("customer_id, customer_name, gender, city");
		 bw.newLine(); //To go to a new line after creating the header above
		 inW.write("customer_id, customer_name, gender, city, balance");
		 inW.newLine();
		 
		 
		 br.readLine(); // to skip header
		 String line = null;
		 while((line = br.readLine()) !=null) {
		 // Splits line data
		 String[] data = line.split(",");
		 Customer customer = new Customer(data[0],data[1],data[2], data[3]);
		 System.out.println(customer);
		 oos.writeObject(customer); //serialization
		 // Insert data for male only 
		 if(data[2].equalsIgnoreCase("Male")) {
			 bw.write(data[0]+","+data[1]+","+data[2]+","+data[3]);
			 bw.newLine();
			 }
		 }
		 
//		 while((line = inW.readLine()) !=null) {
		 System.out.println("Enter x to exit or Enter to insert");
		 while(!sc.nextLine().equalsIgnoreCase("x")) {
			 System.out.println("Enter ID");
			 String custId = sc.nextLine();
			 System.out.println("Enter Username");
			 String custName = sc.nextLine();
			 System.out.println("Enter gender");
			 String custGender = sc.nextLine();
			 System.out.println("Enter city");
			 String custCity = sc.nextLine();
			 System.out.println("Balance");
			 int custBalance = Integer.parseInt(sc.nextLine());
			 if(custBalance > 1000) {			
				 inW.write(custId+","+custName+","+custGender+","+custCity+","+custBalance);
				 inW.newLine();}
		 else
			 {
			 System.out.println("Not enough balance to save!");
			 }
//		 }
		 }}
		catch(FileNotFoundException e) {
			System.out.println("file is not availabe or incorrect");
			e.printStackTrace();
		}
		finally {
		}
}
}
