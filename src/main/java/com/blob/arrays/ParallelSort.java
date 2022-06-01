package com.blob.arrays;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {
		int num[] = {0, 9, 3, 8, 6, 1, 7, 5 };
		
		System.out.println("Unsorted Arrays: ");		
		Arrays.stream(num).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//--- Sort in ascending order
		Arrays.parallelSort(num);
		System.out.println("Sorted Arrays: ");
		Arrays.stream(num).forEach(n -> System.out.print(n + " "));

	}

}
