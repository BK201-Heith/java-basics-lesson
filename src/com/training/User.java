package com.training;

public class User {
	
	// Default Constructor, is written whether defined or not. Anything inside it will be called 
	// when an object is created.
	public User() {
		
	} 
	
	// Parameterized Constructor, is written whether defined or not. Anything inside it will be called 
		// when an object is created.
		public User(String userId, String userName, String userEmail) {
			this.userId = userId;
			this.userName = userName;
			this.userEmail = userEmail;
		} 
	
	// 1. Attributes
	// instance variables
	private String userId;
	private String userName;
	private String userEmail;
	
	// static variables
	static String organizationName = "OAB";
	
	// 2. Behaviors
		// Setter and Getter generated through Source > Generate Setters and Getters
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	// When putting object into a string, it will show this instead of the hash value --- Source > toString
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	
	
	
	
}
