package com.leet.Solution.sepChallenge;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        if(s== null || s.trim().length()==0){
            return 0;
        }
        s=s.trim();
        final int lastSpace = s.lastIndexOf(' ');
        if(lastSpace == -1){
            return s.length();
        }

        return s.length()-(lastSpace+1);
    }
}
