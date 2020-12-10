package com.leet.Solution.sepChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        final int threshold = Math.abs(nums.length/3);
        final List<Integer> list = new ArrayList<>();
        int sameNumber=1;
        Arrays.sort(nums);
        for (int a=0;a<nums.length;a++) {
            if(a+1 < nums.length && nums[a] == nums[a+1]){
                sameNumber++;
                continue;
            }else if(sameNumber > threshold){
                list.add(nums[a]);
            }
            sameNumber =1;

        }
        return list;
    }
}
