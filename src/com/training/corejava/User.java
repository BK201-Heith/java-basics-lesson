package com.training.corejava;

import java.util.Objects;

//SOLID principle dictates that every class should have a single responsibility
public class User {
	
	// Default Constructor, is written whether defined or not. Anything inside it will be called 
	// when an object is created.
	public User() {
		
	} 
	
	// Parameterized Constructor, is written whether defined or not. Anything inside it will be called 
		// when an object is created.
		public User(String userId, String userName, String userEmail, int userAge) {
			this.userId = userId;
			this.userName = userName;
			this.userEmail = userEmail;
			this.userAge = userAge;
		} 
	
	// 1. Attributes
	// instance variables
	protected String userId;
	protected String userName;
	protected String userEmail;
	protected int userAge;
	
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
	

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	// When putting object into a string, it will show this instead of the hash value --- Source > toString
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userAge=" + userAge +"]";
	}

	//hashCode and equals override ensures no duplicates are saved in sets as
	@Override
	public int hashCode() {
		return Objects.hash(userEmail, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userEmail, other.userEmail) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName);
	}




	
	
	
	
	
	
	
}
