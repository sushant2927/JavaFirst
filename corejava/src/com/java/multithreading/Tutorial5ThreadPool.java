package com.java.multithreading;

public class Tutorial5ThreadPool implements Runnable{
private String name;

 public Tutorial5ThreadPool(String name) {
	 this.name=name;
}
	@Override
	public void run() {
		
		System.out.println("Thread started "+name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread ended "+name);
	}

}
