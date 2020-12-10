package com.leet.Solution.sepChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class NearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(final int[] nums, final int k, final int t) {
        /*final int[] sortedCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedCopy);*/
        final int[][] valueIndexPair = new int[nums.length][2];
        for (int index=0; index< nums.length;index++) {
            valueIndexPair[index][0]=nums[index];
            valueIndexPair[index][1]=index;
        }
        Arrays.sort(valueIndexPair, Comparator.comparingInt(o -> o[0]));
        for (int ctr=0;ctr < valueIndexPair.length;ctr++){
            for (int ctr1=ctr+1;ctr1< valueIndexPair.length && Math.abs((long)valueIndexPair[ctr1][0]-valueIndexPair[ctr][0]) <=t;ctr1++){
                if(Math.abs((long)valueIndexPair[ctr1][1]-valueIndexPair[ctr][1]) <= k){
                    return true;
                }
            }
        }

/*        for(int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if(j-i>k){
                    break;
                }
               // final long i1 = (long)nums[j] - nums[i];
                if(Math.abs((long)nums[j] - nums[i]) <= t){
                    if(Math.abs((long)j-i) <= k){
                        return true;
                    }
                }
            }
        }*/
        return false;
    }
}
