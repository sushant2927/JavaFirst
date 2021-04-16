package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tutorial5Run {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(5) ;//here we have defined the number of threads
	
	for (int i = 0; i < 10; i++) {
		Runnable runnable=new Tutorial5ThreadPool("WorkerThread :"+i);
		service.execute(runnable); 
	}
	
	service.isShutdown();
	
	while (!service.isTerminated()) {
		
	}
	
	System.out.println("All the work is completed");
}
}
