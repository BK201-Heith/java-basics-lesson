package com.training;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		try{
		 y = 8/2;
		}
		//Specific exceptions to handle only the specific problems.
		catch(ArithmeticException e){
			System.out.println("Error -- Cannot be divided");
		}
		// Exception is the parent, for a wide generalized net.
		catch(Exception e){
			System.out.println("Error");
		}
		//Alternatively can use catch(ArithmeticException | NullPointerException e){} for multiple
		//finally is a command for executing code regardless of the exceptions, 
		//useful for closing connections
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Value of y is: "+y);
	}

}
