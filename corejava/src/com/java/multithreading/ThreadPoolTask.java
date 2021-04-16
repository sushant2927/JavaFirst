package com.java.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPoolTask implements Runnable{

	String name;
	
	public ThreadPoolTask(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		
		try {
		for (int i = 0; i < 5; i++) {
			
			if (i==0) {
				Date d=new Date();
				SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm:ss");
				
				System.out.println("Initializing time for taske name- "+name+" "+dateFormat.format(d));
			}
			
			else {
				Date d=new Date();
				SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm:ss");
				
				System.out.println("Executing time for taske name- "+name+" "+dateFormat.format(d));
			}
		
				Thread.sleep(1000);
			}
		System.out.println(name+" Completed");
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

}
