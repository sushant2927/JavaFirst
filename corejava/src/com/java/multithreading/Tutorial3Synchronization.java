package com.java.multithreading;

public class Tutorial3Synchronization {
 int count=0;
	public static void main(String[] args) {
		Tutorial3Synchronization synchronization=new Tutorial3Synchronization();
		synchronization.doWork();
	}
	
	public synchronized void increment() {
		
		count++;
	}
	public void doWork() {

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <10000; i++) {
					increment();
				} 
				
			}
		}) ;
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <10000; i++) {
					increment();
				} 
				
			}
		}) ;
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("counter is :"+count);
		
	}
	
}


