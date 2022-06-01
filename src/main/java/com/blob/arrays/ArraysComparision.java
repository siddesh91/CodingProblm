package com.blob.arrays;

import java.util.Arrays;

public class ArraysComparision {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Both are equal arrays");
		}else {
			System.out.println("Not Equals");
		}
		
		
		// -- Deep Equal Comparision
		
		Object[] obj1 = {arr1};
		Object[] obj2 = {arr2};
		
		if(Arrays.deepEquals(obj1, obj2))
			System.out.println("Both are equals...");
		
		// -- Copy Arrays
		
		int[] copy = Arrays.copyOf(arr1, 5);
		
		copy[3] = 10;
		copy[4] = 20;
		
		System.out.println("Copied Arrays: " + Arrays.toString(copy));

	}

}
