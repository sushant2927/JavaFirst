package com.java.prac;

import java.sql.Timestamp;
import java.util.ArrayList;

public class BigONotation {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,
				1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4,1,2,3,4,5,6,7,8,9,7,8,9,4,5,6,3,4,5,4,5,4,5,4,5,4,5,45,45,4,54,54,54,5,45,4,5,4,5,45,4,5,4,5,4,5,4
				
		};
		int result=sumArray(arr);
		System.out.println(result);
		
		ArrayList al=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]/2==0) {
				al.add(arr[i]);
			}
			
		}
		System.out.println(al);
	}

	void Print() {
		System.out.println("obj working fine");
	};
	
	private static int sumArray(int[] arr) {
		int sum=0;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Start : "+timestamp);
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		
		System.out.println("End : "+timestamp);
		return sum;
	}

}
