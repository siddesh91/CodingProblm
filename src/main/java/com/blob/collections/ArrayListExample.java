package com.blob.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		int size = 5;
		
		ArrayList<Integer> arrlt = new ArrayList<>(size);
		
		
		for (int i = 1; i < size; i++)
			arrlt.add(i);
		
		System.out.println(arrlt);
		
		arrlt.remove(3);
		System.out.println(arrlt);
		
		for(int i = 0; i< arrlt.size();i++)
			System.out.println(arrlt.get(i) + " ");

	}

}
