package com.technicalround.machinetest;

import java.util.HashMap;
import java.util.Set;

public class AnagramString {


	public static boolean isAnagram(String a, String b) {

		if(a.length() != b.length())
			return false;

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0; i < a.length(); i++) {
			if(map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else
			{
				map.put(a.charAt(i), 1);
			}
		}


		for(int j = 0; j < b.length(); j++) {
			if(map.containsKey(b.charAt(j))) {
				map.put(b.charAt(j), map.get(b.charAt(j))-1);
			}
		}


		Set<Character> keys = map.keySet();

		for(Character k: keys)
		{
			if(map.get(k) != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		if(isAnagram(str1, str2))
			System.out.print("The two strings are "
					+ "anagram of each other");
		else
			System.out.print("The two strings are "
					+ "not anagram of each other");

	}

}
