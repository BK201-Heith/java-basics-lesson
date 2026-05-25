package com.training.java8;

@FunctionalInterface // Forces interface to be a functional one
public interface MyFunctionalInterface {

	int sum(int a, int b); //abstract method
	//void display();
}

// Interface is 100% abstract
// all methods in an interface are abstract
// Functional interface: only one abstract method is allowed.
// can have static and default methods.
