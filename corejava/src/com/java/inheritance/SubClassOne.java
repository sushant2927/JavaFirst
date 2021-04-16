package com.java.inheritance;

public class SubClassOne extends SuperClass{

	public static void main(String[] args) {
		
		System.out.println("SINGLE INHERITANCE");
		// TODO Auto-generated method stub
		SuperClass SC=new SuperClass();
		SC.methodOne();
		SC.methodTwo();
	System.out.println("method called from subclass object");
		SubClassOne subClassOne=new SubClassOne();
		subClassOne.methodOne();//using object of subclass calling method of super class
		subClassOne.methodTwo();//using object of subclass calling method of super class
		
		
		//java.lang.ClassCastException: com.java.inheritance.SuperClass cannot be cast to com.java.inheritance.SubClassOne
		/*
		 * SubClassOne subClassOne2=(SubClassOne) new SuperClass();
		 * subClassOne2.methodOne(); subClassOne2.methodTwo();
		 */
		System.out.println("SubClass cast to SuperClass");
		SuperClass superClass=new SubClassOne();
		superClass.methodOne();
		superClass.methodTwo();
		}
	public void methodOne() {
		System.out.println("methodOne working for SubClass");
	}
	
	protected void methodTwo() {
		System.out.println("methodTwo working for SubClass");
	}
	
	private void methodThree() {
		System.out.println("methodThree working for SuperClasss");
	}
}
