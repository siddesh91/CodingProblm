package com.technicalround.machinetest;

import java.util.HashSet;

/**
 * @author siddsawa
 * 
 * Given an array A[] of n numbers and another number x, determines whether or not there exist two elements in A[] whose sum is exactly x
 * 
 * Input: arr[] = {0, -1, 2, -3, 1}    
 * x= -2
 * Output: Pair with a given sum -2 is (-3, 1)
 * Valid pair exists
 * Explaination:  If we calculate the sum of the output,1 + (-3) = -2
 * 
 * Input: arr[] = {1, -2, 1, 0, 5}
 * x = 0
 * Output: No valid pair exists for 0 
 * 
 *
 */

public class PairSum {

	static void printpairs(int arr[], int sum) {

		HashSet<Integer> s = new HashSet<Integer>();

		for(int i = 0; i < arr.length; i++) {

			int temp = sum - arr[i];

			if(s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}

			s.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		printpairs(A, n);
	}

}
