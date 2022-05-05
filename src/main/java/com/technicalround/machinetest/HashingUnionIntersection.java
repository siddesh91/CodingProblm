package com.technicalround.machinetest;

import java.util.HashSet;

public class HashingUnionIntersection {
	
	static void printUnion(int arr1[], int arr2[]) {
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++)
			hs.add(arr1[i]);
		
		for(int j=0; j<arr2.length; j++)
			hs.add(arr2[j]);
		System.out.println(hs);
	}
	
	
	static void printIntersection(int arr1[], int arr2[]) {
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i <arr1.length; i++)
			hs.add(arr1[i]);
		
		for(int j=0; j<arr2.length;j++)
			if(hs.contains(arr2[j]))
				System.out.println(arr2[j]+" ");
	} 

	public static void main(String[] args) {
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
 
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);
 
        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);

	}

}
