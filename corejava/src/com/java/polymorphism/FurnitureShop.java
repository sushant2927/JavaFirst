package com.java.polymorphism;

public class FurnitureShop {
public static void main(String[] args) {
	Furniture furniture=new Table();
	furniture.addLegs();
	
	Furniture furniture2=new Chair();
	furniture2.addLegs();
}
	
}


 class Table extends Furniture{

	@Override
	public void addLegs() {
	System.out.println("Table purchased");
		
	}
	 
	 
 }
 
 class Chair extends Furniture{

	@Override
	public void addLegs() {
	System.out.println("Chair purchased");
		
	}
	 
	 
 }