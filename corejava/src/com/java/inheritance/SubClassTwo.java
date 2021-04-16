package com.java.inheritance;

public class SubClassTwo extends SubClassOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MULTILEVEL INHERITANCE");
		SubClassTwo subClassTwo= new SubClassTwo();
		subClassTwo.methodOne();
		subClassTwo.methodTwo();
		
		System.out.println("SubClassTwo cast to SuperClass");
		SuperClass superClass=new SubClassTwo();
		superClass.methodOne();
		superClass.methodTwo();
	}

}
