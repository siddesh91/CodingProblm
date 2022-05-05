package com.technicalround.machinetest;

import java.util.HashSet;

/**
 * @author siddsawa
 *	
 *	Given a string, find the first repeated character in it
 *	
 *	Input: ch = “geeksforgeeks” 
 *	Output: e 
 *	e is the first element that repeats
 *
 *
 */
public class RepeatedChar {
	
	static char firstRepeating(char str[]) {
		
		HashSet<Character> h = new HashSet<>();
		
		for(int i=0; i<str.length; i++) 
		{
			char c = str[i];
			
			if(h.contains(c))
				return c;
			else
				h.add(c);
			
		}
		
		return '\0';
	}
	
	

	public static void main(String[] args) {
		String str = "siddesh";
		char[] arr = str.toCharArray();
		System.out.println(firstRepeating(arr));

	}

}
