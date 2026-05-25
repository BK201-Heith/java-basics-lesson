package com.training.corejava;


import java.util.Scanner;

public class UserClient {

	public static void main(String[] args) {
		
		//Admin extending the User class
		Admin admin = new Admin("Adm101","Adam","ad@gmail.com",22,true);
		System.out.println(admin);
		
		// Creating object using Default Constructor
		User user1 = new User(); 
		user1.setUserId("A101");
		user1.setUserName("Haitham");
		user1.setUserEmail("H@gmail.com");
		
		// Creating object using parameterized Constructor
		User user2 = new User("A202","Omar","o@gmail.com",22); 
		
		// Creating object using User Input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User ID: ");
		String uId = sc.nextLine();
		System.out.println("Enter User Name: ");
		String uName = sc.nextLine();
		System.out.println("Enter User Email: ");
		String uEmail = sc.nextLine();
		System.out.println("Enter User Age: ");
		int uAge = Integer.parseInt(sc.nextLine());
		
		User user3 = new User(uId,uName,uEmail,uAge); 
				
		
		// Static variable;
		String orgName = User.organizationName;
		
		// Output
		System.out.println("User ID: "+user1.getUserId()+"\n"
				+"User Name: "+user1.getUserName()+"\n"+"User Email: "+user1.getUserEmail()
				+"\n"+"Organization: "+orgName+"\n");
		System.out.println("User ID: "+user2.getUserId()+"\n"
				+"User Name: "+user2.getUserName()+"\n"+"User Email: "+user2.getUserEmail()
				+"\n"+"Organization: "+orgName+"\n");
		System.out.println("User ID: "+user3.getUserId()+"\n"
				+"User Name: "+user3.getUserName()+"\n"+"User Email: "+user3.getUserEmail()
				+"\n"+"Organization: "+orgName+"\n");
		
		
		// Have user enter number of users, then show the third user
		System.out.println("Enter number of users: ");
		int count = Integer.parseInt(sc.nextLine());
		User[] user = new User[count];
		
		for(int x=0;x<count;x++) {
			System.out.println("Enter User ID: ");
			String userId = sc.nextLine();
			System.out.println("Enter User Name: ");
			String userName = sc.nextLine();
			System.out.println("Enter User Email: ");
			String userEmail = sc.nextLine();
			System.out.println("Enter User Age: ");
			int userAge = Integer.parseInt(sc.nextLine());
			user[x] = new User(userId, userName, userEmail,userAge);
				}
		if(count>=3) {
			System.out.println(user[2]);
		}
		else {
			System.out.println("Less than three records");
		}
		}				
	}
