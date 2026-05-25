package com.training.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.corejava.User;

public class StreamDemo {

	//Stream API used to process collection efficiently
	//1. Intermediate operations -> Multiple
	//2. Terminal operations -> Single
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,2,6,7);
		//Traditional way:
		Collections.sort(numList);
		System.out.println("Traditionally");
		for(int i:numList) {
			int square = i*i;
			System.out.println(+square);
		}
		//Stream way:
		System.out.println("Stream API + Filtered");
		Stream<Integer> numStream = numList.stream();
		//Stream.IntermediateOp.IntermediateOp.IntermediateOp
		//	.TerminalOp;
		numStream.filter(f->f%2!=0).map(n->n*n).sorted()
			.forEach(x->System.out.println(x));
		
		List<User> userList = Arrays.asList(new User("A233","Ali","Al@gm.com",22),
				new User("A222","Abbas","Ab@gm.com",22),
				new User("A244","Sara","Sa@gm.com",26),
				new User("A255","Annad","An@gm.com",26));

		userList.stream().filter(usr->usr.getUserName().startsWith("A"))
//			.sorted((u1,u2)->u1.getUserId()
//					.compareTo(u2.getUserId()))
//						.forEach(u->System.out.println(u));
				.sorted(Comparator.comparing(User::getUserId)) //Class::methodWithinClass
					.forEach(System.out::println); //Same as the commented lines above
		
		// Add age field in User class then use Stream to show details of youngest user
		// max/min functions; or sort the user objects then use findFirst();
				
		System.out.println(" ");
		System.out.println("Youngest using Min:");	
		System.out.println(userList.stream()
			.min(Comparator.comparing(User::getUserAge)).get());
		
		System.out.println(" ");
		System.out.println("Youngest using Sort + FindFirst():");
		System.out.println(userList.stream()
				.sorted(Comparator.comparing(User::getUserAge))
			.findFirst().get());
		
		System.out.println(" ");
		System.out.println("Group By Age:");
		Map<Integer,List<User>> userMap = userList.stream()
				.collect(Collectors.groupingBy(User::getUserAge));
		System.out.println(userMap);
		
		System.out.println(" ");
		System.out.println("Count By Age:");
		Map<Integer, Long> userCount = userList.stream()
				.collect(Collectors.groupingBy(User::getUserAge,
						Collectors.counting()));
		System.out.println(userCount);
	}

}
