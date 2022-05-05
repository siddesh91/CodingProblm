package com.technicalround.machinetest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class CheckDuplicates {
	
	
	private static<T> boolean checkForDuplicates(T... arrs) {
		Set<T> set = new HashSet<>(Arrays.asList(arrs));
		return  arrs.length != set.size();
	}

	public static void main(String[] args) {
		String[] arr = {"public", "static", "void", "main", "public" };
		
		if(checkForDuplicates(arr)) {
			System.out.println("Duplicate found");
		}

	}

}
