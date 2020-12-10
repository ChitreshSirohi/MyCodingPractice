package com.leet.Solution;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ptr1 = 0;
        int ptr2 = 0;
        if(s.length() <= 1){
            return s.length();
        }
        final HashSet<Character> set = new HashSet<Character>();
        int maxlen = 0;
        int ctr = 0;
        while(ptr1 < s.length() && ptr2 < s.length()){
            final char charAt = s.charAt(ptr2);
            if(set.contains(charAt)){
                ptr1 = s.indexOf(charAt, ptr1)+1;
                maxlen = Math.max(set.size(), maxlen);
                for(;ctr <ptr1;ctr++){
                    set.remove(s.charAt(ctr));
                }
            }
             set.add(charAt);
             ptr2+=1;
        }
        return Math.max(set.size(), maxlen);
    }
}