package com.java.multithreading;

public class TestMultiThreading {

	public static void main(String[] args) {
	System.out.println("Sytem started the process");

	Printer printer =new Printer();
	MyThread myThread=new MyThread(printer);
	YourThread yourThread =new YourThread(printer);
	myThread.start();
	yourThread.start();
	printer.printDocs(10, "Learn_Multi_Threading.pdf");
	
	System.out.println("Sytem finished the process");
	}

}

class Printer{
	void printDocs(int numOfCopies ,String docName) {
		for (int i = 1; i <numOfCopies; i++) {
			System.out.println("Printed copy #"+i+" "+docName);
		}
	}
	
}

class MyThread extends Thread {
	
	Printer prf;
	
	public MyThread(Printer p) {
		prf=p;
	}
	
	public void run() {
		prf.printDocs(10, "LearningSpring.pdf");
	}
}

class YourThread extends Thread {
	
	Printer prf;
	
	public YourThread(Printer p) {
		prf=p;
	}
	
	public void run() {
		prf.printDocs(10, "LearningHibernates.pdf");
	}
}