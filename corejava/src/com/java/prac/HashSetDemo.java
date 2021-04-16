package com.java.prac;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
	
	String s1=new String("India");
	String s2=new String("India");
	String s3=new String("France");
	String s4=new String("France");
	
	Set<String> set=new HashSet<>();
	set.add(s1);
	set.add(s2);
	set.add(s3);
	set.add(s4);
	System.out.println(set);
	
}
}
