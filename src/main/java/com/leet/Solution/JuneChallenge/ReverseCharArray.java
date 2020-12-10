package com.leet.Solution.JuneChallenge;

public class ReverseCharArray {
    public void reverseString(char[] s) {
        char temp;
        for (int ctr=0,ptr=s.length-1;ctr<ptr;ctr++,ptr--){
            temp = s[ptr];
            s[ptr] = s[ctr];
            s[ctr]=temp;
        }

    }
}
