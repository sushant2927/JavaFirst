package com.java.prac;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashTable {
	
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm =new HashMap<String, Integer>();
		
		hm.put("hm1", 111);
		hm.put("hm2", 222);
		hm.put("hm3", 333);
		hm.put("hm4", 444);
		hm.put("hm5", 555);
		System.out.println("Hash map entries :"+hm);
		
		HashMap<String, Integer> hm1 =new HashMap<String, Integer>();
		hm1=(HashMap<String, Integer>) hm.clone();
		System.out.println("Clone hashmap "+hm1);
		
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		
		ht.put("ht1", 111);
		ht.put("ht2", 222);
		ht.put("ht3", 333);
		ht.put("ht4", 444);
		ht.put("ht5", 555);
		//ht.put("ht6", null);
	//	ht.put("ht7", null);
		System.out.println("Hash Table entries :"+ht);
		
		Hashtable<String, Integer> ht1=new Hashtable<String, Integer>();
		
		ht1=(Hashtable<String, Integer>) ht.clone();
		
		System.out.println("Clone hashtable "+ht1);
	}

}
