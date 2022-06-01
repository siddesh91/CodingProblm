package com.blob.basics;

public class BlankFinal {
	
	final public int j;
	
	public BlankFinal() {
		this(10);
	}
	
	BlankFinal(int val){
		this.j = val;
	}

	public static void main(String[] args) {
		BlankFinal obj1 = new BlankFinal();
		System.out.println(obj1.j);
		
		
		BlankFinal obj2 = new BlankFinal(20);
		System.out.println(obj2.j);

	}

}
