package com.grokking.sample;

class ParentclassObj{
	String x = "Parent's x";
	
	public void print() {
		System.out.println(x);
	}
}

class ChildclassObj extends ParentclassObj{
	String x = "Child's x";
	
	public void print() {
		System.out.println(x);
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
		ParentclassObj obj = new ChildclassObj();
		System.out.println(obj.x);
		obj.print();

	}

}
