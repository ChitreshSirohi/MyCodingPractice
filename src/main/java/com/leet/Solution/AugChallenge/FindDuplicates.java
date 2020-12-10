package com.leet.Solution.AugChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        final List<Integer> duplicates = new ArrayList<>();
        for (int ctr=0;ctr< nums.length;ctr++){
            if (ctr == nums.length-1){
                break;
            }
            if(nums[ctr] == nums[ctr+1]){
                duplicates.add(nums[ctr]);
                ctr++;
            }
        }
        return duplicates;
    }
}
