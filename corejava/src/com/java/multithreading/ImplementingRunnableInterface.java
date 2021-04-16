package com.java.multithreading;

public class ImplementingRunnableInterface implements Runnable{

	//main method will be like main thread
	public static void main(String[] args) {
		
		System.out.println("Printing started");
		Runnable r=new ImplementingRunnableInterface();
		Thread task=new Thread(r);
	
		task.start();
		r=new Yourtask();
		task=new Thread(r);
		task.setDaemon(true);
		task.start();
		for (int doc = 0; doc <=10; doc++) {
			System.out.println("printing doc #"+doc+" printer1");
		}
		System.out.println("Printing finished");

	}

	public void run() {
		for (int doc = 0; doc <=10; doc++) {
			System.out.println("printing doc #"+doc+" printer2");
		}
	}
}

 class Yourtask implements Runnable
{

	@Override
	public void run() {
		for (int doc = 0; doc <=10; doc++) {
			System.out.println("printing doc #"+doc+" printer3");
		}
		
	}
	
}