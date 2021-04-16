package com.java.matrix;

public class MatrixLowerTriangle {
public static void main(String[] args) {
	int row,col;
	
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	row=a.length;
	col=a[0].length;
	
	if (row!=col) {
		System.out.println("Matrix is not square matrix");
	}
	
	else {
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				if (j>i) {
					System.out.print("0");
				}
				
				else {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	
}
}
