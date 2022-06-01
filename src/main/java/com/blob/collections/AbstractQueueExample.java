package com.blob.collections;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueExample {

	public static void main(String[] args) {
		AbstractQueue<Integer> AQ = new LinkedBlockingQueue<>();
		
		AQ.add(10);
		AQ.add(20);
		AQ.add(30);
		
		System.out.println("AbstractQueue contains: " + AQ);
		System.out.println("Head: " + AQ.element());
		AQ.clear();
		System.out.println("AbstractQueue: " + AQ);
		
	}

}
