package com.java.prac;

public class MatrixTest {
	
	public static void main(String[] args) {
		
		int arr[][]= {{2,7,8},{5,5,7},{1,2,1}};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println(" ");
		}
		
		System.out.println("Linear search starts");
		
		int pArray[]= {7,4,8,7,11,45,1,8,6,7,2,4};
		int val=45;int check = 0;
		for (int i = 0; i < pArray.length; i++) {
			check=-1;
			if (pArray[i]==val) {
				System.out.println("we found the key at : "+pArray[i]);
				check=1;
			}
			
		}
	
		if (check==(-1)) {
			System.out.println("key does not exist");
		}
		System.out.println("Linear search ends");
		
		System.out.println("Binary search starts");
		int qArray[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int start=0,arrlen=qArray.length-1;
		int binaryCheck=0;
		int BinaryVal=10;
		while (start<=arrlen) {
			 binaryCheck=-1;
			int m=start+(arrlen-1)/2;
			if (qArray[m]==BinaryVal) {
				binaryCheck=1;
			}
			
			if (qArray[m]<BinaryVal) {
			start=m+1;
			
			}
			
			else {
				arrlen=m-1;
				
			}
		}
		
		if (binaryCheck==1) {
			System.out.println("Binary search success");
		}
		
		else {
			System.out.println("Binary search failss");
		}
		
		System.out.println("Binary search ends");
	}

}
