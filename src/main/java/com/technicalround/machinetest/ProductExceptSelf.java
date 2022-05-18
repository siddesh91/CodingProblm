package com.technicalround.machinetest;

import java.util.Arrays;

public class ProductExceptSelf {

	public int[] productExceptSelf(int[] nums) {

		int[] result = new int[nums.length];

		result[nums.length-1]=1;
		for(int i=nums.length-2; i>=0; i--){
			result[i]=result[i+1]*nums[i+1];
		}

		int left=1;
		for(int i=0; i<nums.length; i++){
			result[i]=result[i]*left;
			left = left*nums[i];
		}

		return result;

	}

	public static void main(String[] args) {
		int[] change = {1,2,3,4};
		

		ProductExceptSelf self = new ProductExceptSelf();
		int[] printarr = self.productExceptSelf(change);		
		System.out.println(Arrays.toString(printarr));

	}

}
