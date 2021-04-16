package com.java.leetcode;

public class TwoSumEx2 {

	public static void main(String[] args) {
		int array[]= {2,7,11,15};
		
		int target=9;
		
		int result[]=twoSum(array,target);
		
		for (int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
			
		}
	}

	private static int[] twoSum(int[] array, int target) {
		
		int res[]=new int[2];
		 res[0]=-1;
		 res[1]=-1;
		
		int left=0;
		int right=array.length-1;
		
		while (left<right) {
			int sum=array[left]+array[right];
			if (sum==target) {
				res[0]=left+1;
				res[1]=right+1;
				
				return res;
			}
			
			else if (sum<target) {
				left++;
			}
			
			else {
				right--;
			}
		}
		return res;
	}
}
