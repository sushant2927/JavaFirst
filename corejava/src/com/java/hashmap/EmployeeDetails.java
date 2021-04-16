package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeDetails {

	public static void main(String[] args) {

		Employee ep1 = new Employee();

		ep1.setEid(111);
		ep1.setEname("Sushant Sharma");
		ep1.setEsalary(90000);

		Employee ep2 = new Employee();

		ep2.setEid(111);
		ep2.setEname("Sushant Sharma");
		ep2.setEsalary(90000);

		Employee ep3 = new Employee();

		ep3.setEid(222);
		ep3.setEname("Tulana Kundu");
		ep3.setEsalary(90000);
		
		HashMap hm=new HashMap();
		
		hm.put("ep1", ep1);
		hm.put("ep2", ep2);
		hm.put("ep3", ep3);
		
		System.out.println(hm.size());
	
	Iterator it=hm.entrySet().iterator();
	
	while (it.hasNext()) {
		Map.Entry mapEntry = (Map.Entry) it.next();
		
		System.out.println(mapEntry.getValue());
		
	}
		
	}
}
