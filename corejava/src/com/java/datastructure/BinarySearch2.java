package com.java.datastructure;

public class BinarySearch2 {

	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		int first=0;
		int last=array.length-1;
		int findValue=15;
		
		binarySearch(array,first,last,findValue);
		
	}

	private static void binarySearch(int[] array, int first, int last, int findValue) {
		
		int mid=(first+last)/2;
		int icheck=0;
		while (first <= last) {

			if (array[mid] == findValue) {
				icheck = 1;

				break;

			}

			else if (array[mid] < findValue) {
				first = mid + 1;
			}

			else {
				last = mid - 1;
			}
			
			mid=(first+last)/2;
		}
		
		if (icheck==1) {
			System.out.println("we found the key at :"+ mid);
		}
		
		else {
			System.out.println("we are not able to find the key");
		}
		
	}
	
}
