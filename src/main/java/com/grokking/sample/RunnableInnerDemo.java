package com.grokking.sample;

public class RunnableInnerDemo {

	public static void main(String[] args) {
		Thread T = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1");
				
			}
		});
		
		
		T.start();
		
		System.out.println("main thread");
		

	}

}
