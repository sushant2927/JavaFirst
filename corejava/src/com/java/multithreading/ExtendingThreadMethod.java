package com.java.multithreading;

public class ExtendingThreadMethod extends Thread{

	//main method will be like main thread
	public static void main(String[] args) {
		
		System.out.println("Printing started");
		ExtendingThreadMethod etm=new ExtendingThreadMethod();
		etm.start();
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
