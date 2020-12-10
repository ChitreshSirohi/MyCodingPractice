package com.leet.Solution;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int ctr=0;ctr<nums.length;ctr=ctr+2){
            if(ctr+1 == nums.length){
                return nums[ctr];
            }
            if(nums[ctr] != nums[ctr+1]){
                return nums[ctr];
            }
        }
        return -1;
    }
}
