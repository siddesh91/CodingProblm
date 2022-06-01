package com.geeks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List<String> datesList = new ArrayList<>();

		datesList.add("2020-03-25");
		datesList.add("2020-11-18");
		datesList.add("2020-03-21");
		datesList.add("2021-10-21");

		System.out.println("Dates Object before sorting : ");
		
		for(String dates : datesList)
			System.out.println(dates);
		
		Collections.sort(datesList);
		
		System.out.println("Dates Object after sorting : ");
		
		for(String dates : datesList)
			System.out.println(dates);

	}

}
