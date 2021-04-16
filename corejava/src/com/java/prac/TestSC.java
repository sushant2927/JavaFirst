package com.java.prac;

public class TestSC {
	
	public static void main(String[] args) {
		SuperClass SC=new ChildClass();
		
	ChildClass CC=(ChildClass) new SuperClass();
		SC.printResult();
		//CC.printResult();
	}
	
	public String abc() {
		return null;}

}
