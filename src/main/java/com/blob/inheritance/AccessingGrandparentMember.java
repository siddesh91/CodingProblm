package com.blob.inheritance;

public class AccessingGrandparentMember {

	public static void main(String[] args) {
		Child c= new Child();
		c.print();

	}

}

class Grandparent {
	public void print() {
		System.out.println("Grandparent's Print");
	}
}

class Parent extends Grandparent {
	@Override
	public void print() {
		super.print();
		System.out.println("Parent's Print");
	}
}

class Child extends Parent {
	@Override
	public void print() {
		super.print();
		System.out.println("Child Print");
	}
}
