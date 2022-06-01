package com.blob.methods;

public class PassByValue {

	public static void main(String[] args) {
		Test t = new Test(50);
		
		change(t);
		
		System.out.println("New value: " + t.x);

	}
	
	public static void change(Test t) {
		t.x = 10;
	}

}

class Test{
	int x;
	Test(int i){
		x =i;
	}
	public Test() {
		x =0;	
	}
}
