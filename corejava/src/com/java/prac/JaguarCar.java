package com.java.prac;

public class JaguarCar extends Car{

	public static void main(String[] args) {
		Car c=new Car();
		c.accelerate();
		c.breaks();
		
		JaguarCar JC= new JaguarCar();
		JC.accelerate();
		JC.breaks();
		
		Car c1=new JaguarCar();
		c1.accelerate();
		c1.breaks();
		
		JaguarCar jc1=(JaguarCar) new Car();
		jc1.accelerate();
		jc1.breaks();
		
	}
	
	void accelerate(){System.out.println("Jaguar speed is 210Km/hr");}
	void breaks(){System.out.println("Jaguar speed slows in 5secs");}

	
}
