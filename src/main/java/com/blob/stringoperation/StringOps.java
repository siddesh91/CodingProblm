package com.blob.stringoperation;

import java.util.Locale;
import java.util.StringTokenizer;

public class StringOps {

	public static void main(String[] args) {
		String s = "I Know YOU BuT You Don't Know ME.";

		Locale TURKISH = Locale.forLanguageTag("tr");
		Locale FRENCH = Locale.forLanguageTag("fr");

		String str1 = s.toLowerCase(TURKISH);
		String str2 = s.toLowerCase(FRENCH);
		System.out.println("String LowerCase: "+ str1);
		System.out.println("String LowerCase: "+ str2);

		StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");

		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println("************");

		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");

		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		System.out.println("************");

		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String" , " :", true);

		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}

}
