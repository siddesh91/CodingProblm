package com.blob.oopsconcepts;

public class OverrideStaticMethods {

	public static void main(String[] args) {
		Base obj = new Derived();
		obj.display();
		obj.print();

	}

}

class Base{
	
	public static void display() {
		System.out.println("Static method from Base");
	}
	
	public void print() {
		System.out.println("Non-static method from Base");
	}
}


class Derived extends Base{
	
	public static void display() {
		System.out.println("Static method from Derived");
	}
	
	public void print() {
		System.out.println("Non-static method from Derived");
	}
}