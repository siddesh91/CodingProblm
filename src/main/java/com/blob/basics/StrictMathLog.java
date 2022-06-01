package com.blob.basics;

public class StrictMathLog {

	public static void main(String[] args) {
		double num =10;
		
		double log_value = StrictMath.log(num);
		
		System.out.print("Log value of: " + num + " = " + log_value);
		
		StringBuffer sbf = new StringBuffer("Pradee");
		System.out .println("String buffer: " + sbf);
		
		sbf.appendCodePoint(112);
		System.out.println("After appending CodePoint: " + sbf);

	}

}
