package com.java.multithreading;

public class ThreadDemoImplementRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Print ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
