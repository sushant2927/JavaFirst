package com.java.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerLaptop {
public static void main(String[] args) {
	List<Laptop> list=new ArrayList();
	
	list.add(new Laptop("Dell", 8, 16000));
	list.add(new Laptop("Acer", 4, 6000));
	list.add(new Laptop("Acer", 4, 6000));
	list.add(new Laptop("Asus", 16, 180000));
	

Collections.sort(list);
for (Laptop l : list) {
	System.out.println(l);
}


	
}
}
