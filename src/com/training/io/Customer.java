package com.training.io;

import java.io.Serializable;

public class Customer implements Serializable { // Interfaces without methods are marker interfaces
	private static final long serialVersionUID = 4088185314995535229L;

	
	protected String custId;
	protected String custName;
	protected String gender;
	protected String city;
	
	
	public Customer() {
		
		
	}
	
	public Customer(String custId, String custName, String gender, String city) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", gender=" + gender + ", city=" + city + "]";
	}	
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
