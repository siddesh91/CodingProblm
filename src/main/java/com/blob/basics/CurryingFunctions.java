package com.blob.basics;

import java.util.function.Function;

public class CurryingFunctions {

	public static void main(String[] args) {
		Function<Integer, Function<Integer, Integer>> curryAdder = u -> v -> u + v;
		System.out.println("Addition of 7 & 5 is: " + curryAdder.apply(7).apply(5));

	}

}
