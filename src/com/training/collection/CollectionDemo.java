package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {

//		Set names = new HashSet(); ----- Generic
		Set<String> names = new HashSet<String>(); //Forces Types to be string.
//		Set<String> names = new TreeSet<String>();  ---- Sorted Set
		names.add("Zahra");
		names.add("Tina");
		names.add("Sayeed");
//		names.add(23);
		Iterator it = names.iterator();
		
		
		// int primative gets converted to object Integer -- Autoboxing
		
		while(it.hasNext()) {
			String name = (String)it.next();
			System.out.println(name);
		}
		
		//Set
		Set<User> userSet = new TreeSet<>(new NameComparator()); // Right brackets will take value from left when empty
		User user1 = new User("A101","Gaith","g@gm.com");
		User user2 = new User("A202","Laith","l@gm.com");
		User user3 = new User("A303","Raith","r@gm.com");
		User user4 = new User("A404","Haith","h@gm.com");
		User user5 = new User("A303","Raith","r@gm.com");
		userSet.add(user1);
		userSet.add(user2);
		userSet.add(user3);
		userSet.add(user4);
		userSet.add(user5); // Will include this duplicate because it's a new object with a new
							// hash value. Override the hash and equals in User to ensure no duplicates 
		// Class newObject:SetCollection means:
		//For each newObject from the Set, execute the command in the bracket
		for(User user:userSet) {
			System.out.println(user);
		}
		
		System.out.println("------------");
		
		//List
		List<User> userList = new ArrayList<>(); // Right brackets will take value from left when empty
		User userl1 = new User("A101","Gaith","g@gm.com");
		User userl2 = new User("A202","Laith","l@gm.com");
		User userl3 = new User("A303","Raith","r@gm.com");
		User userl4 = new User("A404","Haith","h@gm.com");
		User userl5 = new User("A303","Raith","r@gm.com");
		userList.add(userl4);
		userList.add(userl5);
		userList.add(userl3);
		userList.add(userl1);
		userList.add(userl2); // List will go based on the order added
		Collections.sort(userList, new NameComparator()); // Sorts the list. 
		for(User user:userList) {
			System.out.println(user);
		}
		
		System.out.println("---------------------");
		
		//Map<Key type, Value type>
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(101, "John Wick");
		namesMap.put(102, "Babayaga");
		namesMap.put(103, "Keanu Silver");
		namesMap.put(999, "Neo");
		
		
		//Entry class is used by map as a foreach variable placeholder
		for(Entry<Integer,String> entry:namesMap.entrySet()) {
		System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println("-------------------Question-------------------------");	
		//Ask user to input some names and then store those names in an arraylist.
		//once saved, show a message that names are saved successfully
		// then ask the user to search for a particular name.
		//If the name is on the list display "Name Found" otherwise "Name not found."
		Scanner sc = new Scanner(System.in);
		List<String> empNames = new ArrayList<>();
		while(true)
		{
			System.out.println("Enter x to exit and save or press enter to add new employee.");
			if(sc.nextLine().equalsIgnoreCase("X")){
				System.out.println("Employees saved successfully!");
				break;
			}
			else {
				System.out.println("Enter employee name: ");
				empNames.add(sc.nextLine());
			}
				
		}
		
		System.out.println("Search for employees: ");
			if(empNames.contains(sc.nextLine())){
				System.out.println("Name found!");
			}
			else {
				System.out.println("Name not found!");
			}
		
		
	}

}
