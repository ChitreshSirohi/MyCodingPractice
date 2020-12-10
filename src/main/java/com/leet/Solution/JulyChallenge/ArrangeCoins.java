package com.leet.Solution.JulyChallenge;

public class  ArrangeCoins{
    public int arrangeCoins(int n) {

        if(n==0){
            return 0;
        }
        if( n < 3){
            return 1;
        }
        long temp = 1,ctr=2;

        while(temp < n){
            ctr+=1;
            temp = ((ctr*ctr)-ctr)/2 + ctr;
            if(temp == n){
                return (int)ctr;
            }
        }
        return (int)ctr-1;
    }
}

