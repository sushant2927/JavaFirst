package com.java.datastructure;

public class BinarySearch {

	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println("length of arr "+arr.length);
		int x=10;
		
	int index=	bnarySearch(arr,x);
	
	if (index==-1) {
		System.out.println("X is not there is the arr list");
	}
	
	else {
		System.out.println("X is at :"+index);
	}
	}

	public static int bnarySearch(int[] arr, int x) {
		
		int l=0,r=arr.length-1;
		
		
		
		while (l<=r) {
			int m=l+(r-1)/2;
			if (arr[m]==x) {
				return m;
			}
			
			if (arr[m]<x) {
				l=m+1;
			}
			
			else {
				r=m-1;
			}
			
		}
		
		return -1;
	}
}
