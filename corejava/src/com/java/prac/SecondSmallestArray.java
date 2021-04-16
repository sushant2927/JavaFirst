package com.java.prac;

import java.util.Arrays;

public class SecondSmallestArray {
public static void main(String[] args) {
	int arr[]= {0,4,1,7,3};
	int N=5;
System.out.println(print2Smallest(arr,N));
}

static int print2Smallest(int arr[], int n) 
{int curr=0;
int near=arr[0];
Arrays.sort(arr);

for(int i=0;i<n; i++){
   curr=arr[i]*arr[i];
   if(curr<=(near*near)){
       near=arr[i];
   } 
}
return near;} 


}
