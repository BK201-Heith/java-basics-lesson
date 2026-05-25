package com.training;

//Custom Exception
//extending Exception makes it check for errors during compilation, 
//while only RuntimeException checks during execution
public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
