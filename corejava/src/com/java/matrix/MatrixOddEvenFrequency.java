package com.java.matrix;

public class MatrixOddEvenFrequency {
public static void main(String[] args) {
	
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	
	int countOdd=0, countEven=0,row,col;
	
	row=a.length;
	
	col=a[0].length;
	
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			if (a[i][j]%2==0) {
				countEven++;
			}
			
			else {
				countOdd++;
			}
		}
	}
	
	System.out.println("Even count :"+countEven+"  Odd count :"+countOdd);
}
}
