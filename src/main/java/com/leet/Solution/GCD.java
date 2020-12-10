package com.leet.Solution;

import java.util.Arrays;

public class GCD {
    public int generalizedGCD(int num, int[] arr)
    {
        if(num == 1){
            return arr[0];
        }
        // WRITE YOUR CODE HERE
        Arrays.sort(arr);
        final int temp=arr[0];
        if(areAllDivisible(temp,arr)){
            return temp;
        }
        for(int ctr=temp/2;ctr > 1;ctr--){
            if(areAllDivisible(ctr,arr)){
                return ctr;
            }
        }
        return 1;
    }

    private boolean areAllDivisible(final int num, final int[] arr){
        for (final int i : arr) {
            if (i % num == 0) {
                continue;
            }
            return false;
        }
        return true;
    }
}
