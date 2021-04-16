package com.java.prac;

import java.util.HashMap;
import java.util.LinkedList;

public class CollectionPrac {
public static void main(String[] args) {

	
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	
	hm.put(111, "qwe");
	hm.put(222, "asd");
	hm.put(444, "asd");
	hm.put(333, "rty");
	
	System.out.println(hm);
	System.out.println(hm.get(222).hashCode());
	System.out.println(hm.get(444).hashCode());
	
	System.out.println();
		/*
		 * HashMap<Integer, String> hm1=(HashMap<Integer, String>) hm.clone();
		 * System.out.println(hm1); System.out.println(hm.containsKey(111));
		 * System.out.println(hm.equals(hm1)); System.out.println(hm1.getOrDefault(111,
		 * "rty")); System.out.println(hm.hashCode());
		 * 
		 * System.out.println(hm.hashCode()); System.out.println(hm1.hashCode());
		 * System.out.println(hm.entrySet()); System.out.println(hm.putIfAbsent(111,
		 * "qwe")); System.out.println(hm1);
		 */
		/*
		 * LinkedList<String> linkedList =new LinkedList<String>();
		 * 
		 * linkedList.add("lmn"); linkedList.add("pqr"); linkedList.add("xyz");
		 * 
		 * System.out.println(linkedList);
		 */
		/*
		 * ArrayList<String> arraylist=new ArrayList<String>();
		 * 
		 * arraylist.add("abc"); arraylist.add("pqr"); arraylist.add("abc");
		 * 
		 * System.out.println(arraylist);
		 * 
		 * Collections.sort(arraylist);
		 * 
		 * System.out.println("Sorted :"+arraylist);
		 * 
		 * arraylist.spliterator(); System.out.println();
		 */
	
	
}
}
