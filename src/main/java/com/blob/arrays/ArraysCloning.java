package com.blob.arrays;

public class ArraysCloning {

	public static void main(String[] args) {
		int intArray[] = {7, 5,9};
		
		int cloneArr[] = intArray.clone();
		
		System.out.println(intArray == cloneArr);
		
		for(int i = 0; i < cloneArr.length; i++)
			System.out.println(cloneArr[i] + " ");

	}

}
