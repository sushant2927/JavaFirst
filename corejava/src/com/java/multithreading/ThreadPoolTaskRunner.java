package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTaskRunner {
static final int MAX_T=3; 
	public static void main(String[] args) {
		Runnable r1=new ThreadPoolTask("TASK 1 ");
		Runnable r2=new ThreadPoolTask("TASK 2 ");
		Runnable r3=new ThreadPoolTask("TASK 3 ");
		Runnable r4=new ThreadPoolTask("TASK 4 ");
		Runnable r5=new ThreadPoolTask("TASK 5 ");
		
		ExecutorService executorService=Executors.newFixedThreadPool(MAX_T);
		
		executorService.execute(r1);
		executorService.execute(r2);
		executorService.execute(r3);
		executorService.execute(r4);
		executorService.execute(r5);
		
		executorService.shutdown();

		
	}
}
