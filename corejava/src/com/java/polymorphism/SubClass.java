package com.java.polymorphism;

public class SubClass extends SuperclassEx{

	public static void main(String[] args) {
		SuperclassEx superclassEx=new SuperclassEx();
		superclassEx.print();//prints msg from super class
		
		SuperclassEx superclassEx1=new SubClass();// superclass obj refers to sub class
		superclassEx1.print();//PRINTS MSG FROM SUB CLASS
		
		SubClass subClass =new SubClass();
		subClass.print();//prints msg from sub class
		
		SubClass subClass1=(SubClass) new SuperclassEx();//SuperclassEx cannot be cast to SubClass
		subClass1.print();
	
		
	}
	
	public void print() {
		System.out.println("This is the Sub Class");
	}
}
