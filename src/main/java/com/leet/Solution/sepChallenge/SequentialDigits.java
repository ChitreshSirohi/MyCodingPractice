package com.leet.Solution.sepChallenge;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        char[] fixed = "123456789".toCharArray();
        char[] lowChar = (low+"").toCharArray();
        final char[] highChar = (high + "").toCharArray();
        int startPos = "123456789".indexOf(lowChar[0]);
        for (int i=0;i<=highChar.length-lowChar.length;i++){
            for (int j=startPos,k=startPos+lowChar.length+i;k<=9;j++,k++){

                final int r1 = Integer.parseInt("123456789".substring(j, k));
                if( r1 >= low && r1 <=high){
                    list.add(r1);
                }
            }
            startPos = 0;
        }
        return list;
    }


}
