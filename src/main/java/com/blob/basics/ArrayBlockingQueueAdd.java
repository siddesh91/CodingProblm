package com.blob.basics;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueAdd {

	public static void main(String[] args) {
		int capacity = 4;
		
		try {
			
			ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(capacity);
			
			queue.add(766);
			queue.add(432);
			queue.add(456);
			queue.put(119);
			
			System.out.println("Added elements are: " + queue);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
