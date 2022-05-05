package com.technicalround.machinetest;

public class ReverseString {

	public static void main(String[] args) {
		String str = "geeks", nnstr="";
		char ch;
		
		System.out.println("Original word: ");
		System.out.println("Geeks");
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			nnstr = ch + nnstr;
		}
		
		System.out.println("Reversed word: "+ nnstr);

	}

}
