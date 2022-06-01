package com.blob.basics;

interface SampleInterface{
	public void displayClass();
}

class BoundTest<T extends SampleClass & SampleInterface >{
	private T objRef;
	
	public BoundTest(T obj) {
		this.objRef = obj;
	}
	
	public void doRunTest() {
		this.objRef.displayClass();
	}
}


class SampleClass implements SampleInterface{
	
	@Override
	public void displayClass() {
		System.out.println("Inside supper Class A");
		
	}
}

public class BoundedTypesGenerics02 {	

	public static void main(String[] args) {
		BoundTest<SampleClass> b = new BoundTest<>(new SampleClass());
		b.doRunTest();

	}

}
