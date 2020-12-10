package com.leet.Solution.aprilChallenge;

public class StringShift {
    public String stringShift(String s, int[][] shift) {
        if(s.length() <= 1){
            return s;
        }
        int leftShifts = 0;
        int rightShifts =  0;
        for (final int[] ints : shift) {
            if (ints[0] == 0) {
                leftShifts = leftShifts + ints[1];
            } else {
                rightShifts = rightShifts + ints[1];
            }
        }

        if(leftShifts == rightShifts){
            return s;
        }

        return shiftString(s , (rightShifts - leftShifts));
    }

    public String shiftString(String str , int shift){
        System.out.println("Shift:" + shift);
        int startCharIndex = 0;
        if(shift < 0){
            startCharIndex = (shift*-1)%str.length();
        }else {
            startCharIndex =  (str.length()) - (shift%str.length());
        }
        if(startCharIndex == 0 || startCharIndex == str.length()){
            return str;
        }
        final char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(chars[startCharIndex]);
        for(int ctr=startCharIndex+1; ctr != startCharIndex;ctr++){
            if(ctr == chars.length){
                ctr=0;
            }
            sb.append(chars[ctr]);
        }
        return sb.toString();
    }
}
