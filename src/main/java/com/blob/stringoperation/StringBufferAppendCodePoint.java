package com.blob.stringoperation;

public class StringBufferAppendCodePoint {

	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Hello World");
		
		obj.appendCodePoint(115);
		
		System.out.println("After appending codePoint: " + obj);
		
		obj.deleteCharAt(11);
		System.out.println("After deletion of character: " + obj);
	}

}
