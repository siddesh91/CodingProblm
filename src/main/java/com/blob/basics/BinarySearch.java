package com.blob.basics;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10, 75, 67, 99, 150};
		
		//Arrays.sort(arr);
		
		int key = 67;
		
		int found = Arrays.binarySearch(arr, key);
		
		if(found >= 0)
			System.out.println(key + " found at index = " + found);
		else
			System.out.println(key + "not found");

	}

}

