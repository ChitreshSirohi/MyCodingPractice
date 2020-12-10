package com.leet.Solution.JuneChallenge;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int startWindow=0;
        int endWindow=nums.length-1;
        int mid=0;
        while(startWindow <= endWindow){
            mid = startWindow + ((endWindow - startWindow) / 2);
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>target){
                endWindow=mid-1;
            } else {
                startWindow=mid+1;
            }
        }
        return startWindow;
    }
}
