package com.java.multithreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo td = new ThreadDemo();
		td.start();
		td.sleep(10000);
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("printing doc #" + doc + " printer 1");
		}

	}

	public void run() {
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("printing doc #" + doc + " printer 2");
		}
	}

}
