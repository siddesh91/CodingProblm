package com.grokking.sample;



public class TestAnonymousInner {

	private int x=10;
	private static String HELLO="HELLO";
	public static void main() {
		System.out.println("Overloaded Main method");
	}
	public void dummy() {
		System.out.println("dummy");
	}
	public void print() {
		int y=20;
		final int z=30;
		int w=40;
		Parent p=new Parent() {
			static final int w=50;
			int hem=60;
			public void display() {
				System.out.println("display method in anonymous class");
				System.out.println("Enclosing class x:" +x);
				System.out.println("Enclosing class constant:" +HELLO);
				main();
				dummy();
				System.out.println("Enclosing block y :" +y);
				System.out.println("Enclosing block z :" +z);
				System.out.println("Enclosing block hem :" +hem);
				System.out.println("Variable shadowing :" +w);
			}
			
			
		};
		
		p.display();
	}
	public static void main(String[] args) {
		TestAnonymousInner obj=new TestAnonymousInner();
		obj.print();



	}
}

class Parent{
	public void display() {
		System.out.println("display method in parent class");
	}
}
