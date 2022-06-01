package com.blob.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorException {
	
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		Integer[] arr = new Integer[1000 * 1000];
		
		System.out.println(arr);

	}

}
