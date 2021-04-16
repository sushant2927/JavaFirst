package com.java.multithreading;

import java.util.Scanner;

class Processer extends Thread {
	private volatile boolean printing = true;

	public void run() {
		int i = 0;
		while (printing) {
			System.out.println("Hello Volatile");
			i++;
			// this thread will keep on printing the Hello Volatile message
			try {
				Thread.sleep(1000);
				if (i % 5 == 0) {
					System.out.println("Printing in slot of 5 and current count is :" + i);
					
					if (i==20) {
						printing=false;
						System.out.println("Max printing limit reached");
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void shutdown() {
		printing = false;

	}

}

//==========================================================

public class Turoial2VolatileInThread {

	public static void main(String[] args) {
		System.out.println("At any time press enter to stop printing");
		Processer p1 = new Processer();
		p1.start();
		Scanner sc = new Scanner(System.in);
		sc.hasNextLine();

		p1.shutdown();

	}

}
