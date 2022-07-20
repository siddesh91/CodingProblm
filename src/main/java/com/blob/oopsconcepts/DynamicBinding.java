package com.blob.oopsconcepts;

public class DynamicBinding {
	
	public static class SuperClass{
		void print() {
			System.out.println("Print in Super Class");
		}
	}
	
	public static class SubClass extends SuperClass{
		@Override
		void print() {
			System.out.println("Print in Sub Class");
		}
	}

	public static void main(String[] args) {
		SuperClass A = new SuperClass();
		SuperClass B = new SubClass();
		
		A.print();
		B.print();

	}

}
