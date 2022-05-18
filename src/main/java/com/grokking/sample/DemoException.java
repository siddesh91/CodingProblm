package com.grokking.sample;

class MyException1 extends Exception {
	public MyException1() {
		System.out.println("Exception 1 thrown");
	}
}


class MyException2 extends Exception {
	
	public MyException2() {
		System.out.println("Exception 2 thrown");
	}
}

public class DemoException {
	
	public static void method1() throws Exception{
		try {
			System.out.println("5");
			throw new MyException1();
		}catch(Exception e){
			System.out.println("6");
			throw new MyException2();
		} finally {
			System.out.println("7");
			throw new Exception();
		}
	}

	public static void main(String[] args) throws Exception{
		try {
			System.out.println("1");
			method1();			
			System.out.println("2");
		}
		catch(Exception e){
			System.out.println("3");
			throw new MyException2();
		} finally {
			System.out.println("4");
			throw new MyException1();
		}

	}

}
