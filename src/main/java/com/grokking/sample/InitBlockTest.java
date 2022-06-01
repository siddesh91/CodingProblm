package com.grokking.sample;

class Parents {
	
	

	{
		System.out.println("Parent class Init block 1");
	}
	
	static {
		System.out.println("Parent class static block 1");
	}


	public Parents() {
		System.out.println("Parent constructor called");
	}

	{
		System.out.println("Parent class Init block 2");
	}
	
	static {
		System.out.println("Parent class static block 2");
	}

}


class Child extends Parents{
	{
		System.out.println("Child class Init block 1");
	}
	
	static {
		System.out.println("Child class static block 1");
	}



	public Child() {
		System.out.println("Child constructor called");
	}

	{
		System.out.println("Child class Init block 2");
	}
	
	static {
		System.out.println("Child class static block 2");
	}

}

/**
 * @author siddsawa
 *
 */
/**
 * @author siddsawa
 *
 */
public class InitBlockTest {
	
	public static void main(String[] args) {
		new Child();
	}

}
