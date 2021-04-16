package com.java.prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodeEqualsRunner {
	
	public static void main(String[] args) {
		
		
		Map<HashCodeEquals, String> map=new HashMap<HashCodeEquals, String>();
		HashCodeEquals codeEquals1=new HashCodeEquals(111, "Alex Jason",20201010);
		HashCodeEquals codeEquals2=new HashCodeEquals(111, "Mike Henry",20201110);
		HashCodeEquals codeEquals3=new HashCodeEquals(111, "Alex Jason",20201010);
		
		map.put(codeEquals1, "emp1");
		map.put(codeEquals2, "emp2");
		map.put(codeEquals3, "emp3");
		
		
		
		
		// for (Map.Entry<String,String> entry : gfg.entrySet()) 
		for ( Entry<HashCodeEquals, String> entry : map.entrySet()) {
			
			System.out.println("Key :-"+entry.getKey()+"  Value :-"+entry.getValue());
		}
		
		System.out.println(codeEquals1==codeEquals3);
		
		System.out.println(codeEquals1.equals(codeEquals3));
		HashSet<HashCodeEquals> set=new HashSet<HashCodeEquals>();
		
		set.add(codeEquals1);
		set.add(codeEquals2);
		set.add(codeEquals3);
		
		
		
		
		System.out.println(set);
	}

}
