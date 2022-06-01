package com.blob.basics;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		TreeSet<Integer> tree_set = new TreeSet<>();
		
		tree_set.add(45);
		tree_set.add(24);
		tree_set.add(30);
		tree_set.add(35);
		tree_set.add(20);
		tree_set.add(50);
		
		System.out.println("Tree Set values are: " + tree_set);
		
		Comparator comp = tree_set.comparator();
		System.out.println("Is it follows natural ordering?: " + comp);
		

		

	}

}
