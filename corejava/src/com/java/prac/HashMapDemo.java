package com.java.prac;

import java.util.HashMap;

public class HashMapDemo {
	
	int id;
	
	public HashMapDemo(int id) {
		this.id=id;
	}
public static void main(String[] args) {
	
	
	HashMap<HashMapDemo, String> hm=new HashMap<HashMapDemo, String>();
	HashMapDemo employee=new HashMapDemo(1);
	HashMapDemo Employees2=new HashMapDemo(1);
	hm.put(employee	, "one");
	hm.put(Employees2, "one");
	
	System.out.println(hm);
	 
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HashMapDemo other = (HashMapDemo) obj;
	if (id != other.id)
		return false;
	return true;
}


}


class Employees{
	

}