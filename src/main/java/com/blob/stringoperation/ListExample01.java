package com.blob.stringoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class ListExample01 {

	public static <T> List<T> removeNullUsingIterator(List<T> l, Predicate<T>p){

		Iterator<T> itr = l.iterator();

		while(itr.hasNext()) {

			T t = itr.next();

			if(p.test(t)) {

				itr.remove();
			}
		}

		return l;
	}

	public static void main(String[] args) {

		List<String> l = new ArrayList<>(
				Arrays.asList("Geeks",
						null,
						"forGeeks",
						null,
						"A computer portal"));

		System.out.println("List with null values: " + l);

		Predicate<String> isNull = item -> Objects.nonNull(item);

		l = removeNullUsingIterator(l, isNull);

		System.out.println("List with null values removed: " + l); 

	}

}
