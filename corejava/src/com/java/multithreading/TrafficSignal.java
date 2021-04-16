package com.java.multithreading;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TrafficSignal {

	String RED,YELLOW,GREEN="";
public static void main(String[] args) throws InterruptedException {
	   
	  LocalTime time=LocalTime.now();
	  String strTime=time.toString();
	  
	  TrafficSignal signal=new TrafficSignal();
	 signal.manageLight(strTime);
	  System.out.println(strTime);
	    
}

public synchronized void sleep() throws InterruptedException{
	Thread t1 =new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
	Thread.sleep(10000);
}
	public void manageLight(String strTime) throws InterruptedException {
		Thread t1Thread=new Thread(new Runnable() {

			public void run() {
			
				System.out.println("RED");
				
				try {
					sleep();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		Thread t2Thread=new Thread(new Runnable() {

			public void run() {
			
				System.out.println("YELLOW");
				
				try {
					sleep();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t3Thread=new Thread(new Runnable() {

			public void run() {
			
				System.out.println("GREEN");
				
				try {
					sleep();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1Thread.start();
		t2Thread.start();
		t3Thread.start();
		
		t1Thread.join();
		t2Thread.join();
		t3Thread.join();
		
	}
}
