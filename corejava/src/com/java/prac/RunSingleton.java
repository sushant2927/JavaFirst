package com.java.prac;

public class RunSingleton {

	
	
	public static void main(String[] args) {
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		x.printUniqueCode();
		y.printUniqueCode();
		z.printUniqueCode();
		x.s=(x.s).toUpperCase();
		RunSingleton runSingleton=new RunSingleton();
		RunSingleton runSingleton2=new RunSingleton();
		System.out.println("RunSingleton unique code :"+System.identityHashCode(runSingleton));
		System.out.println("RunSingleton unique code :"+System.identityHashCode(runSingleton2));
		
		System.out.println("From x:="+x.s);
		System.out.println("From y:="+y.s);
		System.out.println("From z:="+z.s);
	}

}
