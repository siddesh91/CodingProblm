package com.technicalround.machinetest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElements {


	public static int[] removeTheElement(int[] arr, int index) {
		if(arr == null || index<0 || index >= arr.length) {
			return arr;
		}

		return IntStream.range(0, arr.length)
				.filter(i -> i != index)
				.map(i -> arr[i])
				.toArray();
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println("Original Array: "
				+ Arrays.toString(arr));
		
		int index = 2;
		
		System.out.println("Index to be removed: "
                + index);
		
		
		arr = removeTheElement(arr, index);
		
		System.out.println("Resultant Array: "
                + Arrays.toString(arr));

	}

}
