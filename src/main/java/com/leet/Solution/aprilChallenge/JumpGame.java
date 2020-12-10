package com.leet.Solution.aprilChallenge;

import java.util.Arrays;
import java.util.List;

public class JumpGame {
    public boolean canJump(int[] nums) {
        final List<int[]> ints = Arrays.asList(nums);
        int pos = 0;
        while(pos < nums.length){
            pos = pos + nums[pos];
            if(pos == nums.length){
                return true;
            }
        }
        return false;
    }
}
