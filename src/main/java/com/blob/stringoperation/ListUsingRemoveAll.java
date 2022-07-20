package com.blob.stringoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class ListUsingRemoveAll {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>(Arrays.asList("1", "10", "15", "10", "12", "5", "10", "20"));

		System.out.println("Original List: " + l); 
		
		Predicate<String> is10 = i -> (i == "10");
		
		l = removeElements(l, is10);
		
		System.out.println("Updated List: " + l); 

	}

	public static <T> List<T> removeElements(List<T> l, Predicate<T> p){

		Collection<T> collection = new ArrayList<>();

		for(T t:l) {
			if(p.test(t)) {
				collection.add(t);
			}
		}

		// Print the list 
		System.out.println("Collection to be removed: " + collection); 

		l.removeAll(collection);

		return l;
	}

}
