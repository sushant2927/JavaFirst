package com.java.matrix;

public class MatrixIsEqual {
public static void main(String[] args) {
	boolean flag=true;
	int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
	
	int row1, row2 , col1, col2 ;
	
	row1=a.length;
	col1=a[0].length;
	
	row2=a.length;
	col2=a[0].length;
	
	
	if (row1!=row2||col1!=col2) {
		System.err.println("Matrix is not equal");
	}
	
	else {
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				
			if (a[i][j]!=b[i][j]) {
				flag=false;
				
				break;
				
			}	
				
			}
		}
		
		if (flag) {
			
			System.out.println("Matrix is equal");
			
		}
		else {
			System.out.println("Matrix is not equal");
		}
	}
}
}
