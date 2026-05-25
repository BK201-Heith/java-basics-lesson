package com.training.java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.corejava.User;

public class LambdaDemo {

	//Lambda is a replacement for a method
	//Return type of lambda is a functional interface
	public static void main(String[] args) {
		//Sum from method
		System.out.println(sum(3,8));
		
		//Sum from Lambda
		// Functional interface object = Lambda method
		MyFunctionalInterface obj = (x,y) -> x+y;
		// print(object.functionalInterfaceMethod())
		System.out.println(obj.sum(2, 5));
		
		//Benefit of Lambda -> Entire method can be put into a parameter
		List <Integer> numList = Arrays.asList(2,5,6,7);
		numList.forEach(a->System.out.println(a));
		
		//Predicate is Boolean checks
		Predicate<Integer> p = (a) -> a%2 == 0;
		System.out.println("Value is Even: "+p.test(12));
		
		Predicate<String> stringLength = str -> str.length() > 5;
		System.out.println("Value is Greater than 5: "+stringLength.test("Hello World"));
		
		//Consumer doesn't return values
		Consumer<Integer> c = y->System.out.println(y*10);
		c.accept(5);
		
		User user1 = new User("A01", "Yusef", "y@gmail.com",22);
		Consumer<User> user = y->System.out.println(y);
		user.accept(user1);
		
		//Supplier returns values without any inputs
		Supplier<LocalDate> today = () -> LocalDate.now();
		System.out.println(today.get());
		
		//Function takes a value and returns a value
		Function<String,String> upper = str -> str.toUpperCase();
		System.out.println(upper.apply("hello"));
		
	}
	

	// Method
	static int sum(int x, int y) {
		return x+y;
	}
	
	
	// Create one object of a User class and display the details
	// using Consumer
	

}

