package com.blob.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListSpliterator {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		list1.add("abc@gmail.com");
		list1.add("xyz@gmail.com");
		list1.add("user@gmail.com");
		list1.add("mno@gmail.com");
		list1.add("random@gmail.com");
		
		Spliterator<String> emails = list1.spliterator();
		
		System.out.println("List of Emails: ");
		
		emails.forEachRemaining(n -> System.out.println(n));
		
		List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Integer[] arr = new Integer[al.size()];
		
		arr = al.toArray(arr);
		
		for(Integer x:arr)
			System.out.println(x + " ");
		

	}

}
