package com.blob.stringoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
		
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Alice");
		a1.add("Bob");
		
		StringJoiner sj1 = new StringJoiner(", ");
		
		sj1.setEmptyValue("sj1 is empty");
		System.out.println(sj1);
		
		sj1.add(a1.get(0)).add(a1.get(1));
		System.out.println(sj1);
		
		System.out.println("Length of string: " + sj1.length());
		
		StringJoiner sj2 = new StringJoiner(" : ");
		sj2.add(a1.get(2)).add(a1.get(3));
		
		sj1.merge(sj2);
		
		System.out.println(sj1.toString());
		System.out.println("Length of new string: " + sj1.length());
	}

}
