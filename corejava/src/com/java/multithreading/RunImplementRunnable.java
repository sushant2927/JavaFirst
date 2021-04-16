package com.java.multithreading;

public class RunImplementRunnable {
public static void main(String[] args) {
	
	
	
	for (int i = 0; i < 10; i++) {
		Thread t1=new Thread(new ThreadDemoImplementRunnable());
		t1.start();
	}
	
	
}
}
