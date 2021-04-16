package com.java.multithreading;

public class ThreadDemoExtendThread extends Thread{
	
	public void run () 
	{
		try {
			
			System.out.println("Thread "+Thread.currentThread()+" is running and active count is :"+Thread.activeCount());
			
			
			
		} catch (Exception e) {
			System.out.println("Thread is not running");
		}
		
		
		
	}

}
