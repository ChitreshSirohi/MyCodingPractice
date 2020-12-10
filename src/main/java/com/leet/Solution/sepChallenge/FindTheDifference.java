package com.leet.Solution.sepChallenge;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        final char[] orig = s.toCharArray();
        final char[] shuff = t.toCharArray();
        int s1=0;
        int s2=0;
        for(int i=0;i<shuff.length;i++){
            s2= s2+shuff[i];
            if(i<shuff.length-1) {
                s1 = s1 + orig[i];
            }
        }
        return (char) (s2-s1);
    }
}
