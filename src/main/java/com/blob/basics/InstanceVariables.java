package com.blob.basics;


class Marks{
	int mathMarks;
}
public class InstanceVariables {

	public static void main(String[] args) {
		Marks obj1 = new Marks();
		obj1.mathMarks = 99;

		Marks obj2 = new Marks();
		obj2.mathMarks = 90;

		System.out.println("Marks for first Object:" +obj1.mathMarks);
		System.out.println("Marks for second Object:" +obj2.mathMarks);

		Integer i = null;
		Integer j = 10;

		System.out.println(i instanceof Integer);
		System.out.println(j instanceof Integer);

		System.out.println(null == null); 
		System.out.println(null != null); 

	}

}
