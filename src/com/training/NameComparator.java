package com.training;

import java.util.Comparator;

// implements Comparator is used to ensure objects work with TreeSet
public class NameComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		return o1.getUserName().compareTo(o2.getUserName());
	}
	

//	Looks like this when made vvv

//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
