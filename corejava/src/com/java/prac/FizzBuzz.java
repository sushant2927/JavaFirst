package com.java.prac;

import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FizzBuzz {
public static void main(String[] args) {
	
	
	List<String> list =new ArrayList<String>();
	list.add("Sushant");
	list.add("Sushant");
	list.add("Tulana");
	list.add("Sushant");
	list.add("Sushant");
	list.add("Tulana");
	list.add("Sushant");
	
	
	Map<String, Integer>printList=Print(list);
	
	System.out.println(printList);
}

private static Map<String, Integer> Print(List<String> list) {
	Map<String, Integer> valueMap=new HashMap<String, Integer>();
	Map<String, Integer> map=new HashMap<String, Integer>();
	for (String string : list) {
	
	
	if (map.get(string)!=null) {
		map.put(string, map.get(string)+1);
	}
	
	else {
		map.put(string, 1);
	}
	

	}
	Set<String> set=map.keySet();
	
	Iterator<String> itr=set.iterator();
	
	while (itr.hasNext()) {
		String string2 = (String) itr.next();
		valueMap.put(string2, map.get(string2));
		
	}
	return valueMap;
	
}
}
