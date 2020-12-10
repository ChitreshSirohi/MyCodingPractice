package com.leet.Solution;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int firstZeroIndex = 0;
        boolean zeroFoundFlag = false;
        for (int ctr = 0; ctr < nums.length; ctr++) {
            if(!zeroFoundFlag){
                if (nums[ctr] == 0) {
                    firstZeroIndex = ctr;
                    zeroFoundFlag = true;
                }
            } else if(nums[ctr] !=0){
                swap(ctr,firstZeroIndex,nums);
                firstZeroIndex=ctr;
            }
        }
    }

    private void swap(int from, int to, int[] arr) {
        final int val = arr[from];
        arr[from] = arr[to];
        arr[to] = val;
    }
}
