package com.training;

public class Admin extends User{

	private boolean isSuperAdmin;
	
	public Admin(String userId, String userName, String userEmail, boolean isSuperAdmin) {
		super(userId, userName, userEmail);
		this.isSuperAdmin = isSuperAdmin;
	}
	public Admin() {
		
	}

	@Override
	public String toString() {
		return "Admin [isSuperAdmin=" + isSuperAdmin + ", toString()=" + super.toString() + "]"
				+ "User [userId=\" + userId + \", userName=\" + userName + \", userEmail=\" +"
				+ " userEmail + \"]";
	}

	

	// Inheritance: IS A
	// Association: HAS A
	// It calls both constructors for Admin and User (In case of multiple classes, it will call all from
	// the bottom up.
	// Keyword private makes it so only the main/parent class can access the variables. 
	// Keyword protected makes it so it's available for the child class as well.
}
