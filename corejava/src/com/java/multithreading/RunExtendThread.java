package com.java.multithreading;

public class RunExtendThread {
public static void main(String[] args) throws InterruptedException {
	int n=10;
	for (int i = 0; i <n; i++) {
		
		ThreadDemoExtendThread demoExtendThread=new ThreadDemoExtendThread();
		demoExtendThread.start();
		System.out.println("Priority is )"+demoExtendThread.getPriority());
		//demoExtendThread.start();
	}
	
}
}
