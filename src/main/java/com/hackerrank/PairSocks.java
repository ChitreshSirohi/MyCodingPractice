package com.hackerrank;

import java.util.Arrays;

public class PairSocks {
    static int sockMerchant(int n, int[] ar) {
        if(ar == null || n <=1){
            return 0;
        }

        Arrays.sort(ar);
        int pair=0;
        for(int ctr=0;ctr+1<ar.length;ctr++){
            if(ar[ctr] == ar[ctr+1]){
                pair++;
                ctr++;
            }
        }
        return pair;
    }
}
