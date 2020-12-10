package com.leet.Solution;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(!set.contains(n)){
            set.add(n);

            n = getTotalSq(n);

            if(n==1)
                return true;
        }

        return false;
    }

    public int getTotalSq(int n){
        if(n < 10){
            return n*n;
        }
        int nt = n%10;
       return getTotalSq(n/10)+nt*nt;
    }
}
