package com.leet.Solution.aprilChallenge;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];

        temp1[0]=1;
        temp2[nums.length-1]=1;

        //scan from left to right
        for(int ctr=0; ctr<nums.length-1; ctr++){
            temp1[ctr+1] = nums[ctr] * temp1[ctr];
        }

        //scan from right to left
        for(int ctr=nums.length-1; ctr>0; ctr--){
            temp2[ctr-1] = temp2[ctr] * nums[ctr];
        }

        for(int ctr=0; ctr<nums.length; ctr++){
            result[ctr] = temp1[ctr] * temp2[ctr];
        }

        return result;

    }
}
