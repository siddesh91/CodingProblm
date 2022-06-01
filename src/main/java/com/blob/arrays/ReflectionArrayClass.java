package com.blob.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectionArrayClass {

	public static void main(String[] args) {
		int sizeOfArray = 3;
		
		// Create an integer array using 
		// reflection.Array class
		int[] intArray = (int[])Array.newInstance(int.class, sizeOfArray);
		
		Array.set(intArray, 0, 10);
		Array.set(intArray, 1, 20);
		Array.set(intArray, 2, 30);
		
		System.out.println(Arrays.toString(intArray));
		
		System.out.println("Element at index 0: " + Array.getInt(intArray, 0));

	}

}
