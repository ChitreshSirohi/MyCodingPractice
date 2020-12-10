package com.leet.Solution.aprilChallenge;

public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] == target)
            return 0;
            return -1;
        }
        if(nums.length == 0){
            return -1;
        }
        int left =0;
        int right = nums.length-1;
        for(;left <= right;left++,right--){
            if(nums[left] == target){
                return left;
            }
            if(nums[right] == target){
                return right;
            }
        }
        return -1;
    }
}
