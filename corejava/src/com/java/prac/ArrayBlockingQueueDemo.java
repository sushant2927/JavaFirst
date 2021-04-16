package com.java.prac;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {

	
	public static void main(String[] args) {
		int capacity=3;
		
	ArrayBlockingQueue<Integer> ABQ=new ArrayBlockingQueue<Integer>(capacity);
	
	ABQ.add(1);
	ABQ.add(2);
	ABQ.add(3);
	ABQ.add(4);
	
	System.out.println(ABQ);
	
	ABQ.remove(2);
	
	ABQ.add(4);
	System.out.println(ABQ);
	
	}
}
