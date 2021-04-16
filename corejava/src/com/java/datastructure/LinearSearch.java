package com.java.datastructure;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("length of arr "+arr.length);
		int x=50;
		
	int index=	search(arr,x);
	
	if (index==-1) {
		System.out.println("X is not there is the arr list");
	}
	
	else {
		System.out.println("X is at :"+index);
	}
	}

	public static int search(int[] arr, int x) {
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==x) {
				return i;
			}
			
		}
		
		
		return -1;
	}
	
	
}
