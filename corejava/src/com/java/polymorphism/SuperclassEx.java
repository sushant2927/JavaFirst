package com.java.polymorphism;

public class SuperclassEx {

	public void print() {
		System.out.println("This is the Super Class");
	}
	
	public static void main(String[] args) {
	SubClass subClass=(SubClass) new SuperclassEx();	
	subClass.print();
	}
	
}
