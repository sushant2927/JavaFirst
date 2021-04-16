package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumEx1 {

	
	public static void main(String[] args) {
		int array[]= {2,7,11,15};
		
		int target=18;
	
		int result[]=twoSum(array,target);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	
	}

	private static int[] twoSum(int[] array, int target) {
	int res[]=new int[2];
	
	res[0]=-1;
	res[1]=-1;
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	
	if (array==null||array.length==0) {
	return res;
	}
	
	for (int i = 0; i < array.length; i++) {
		int other=target-array[i];
		
		if (map.containsKey(other)) {
			res[0]=map.get(other);
			res[1]=i;
			return res;
			
		}
		map.put(array[i], i);
	}
	
		return res;
	}
}
