package com.leet.Solution.sepChallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(final String s) {
        final char lastChar = s.charAt(s.length() - 1);
        int pos = s.indexOf(lastChar);
        if(pos==s.length()-1){
            return false;
        }
        while(pos < s.length()-1){
            final String repString;
            if(s.length()%(pos+1) == 0){
                repString=s.substring(0,pos+1);
                int occ =0;
                final int nos = s.length()/(pos+1);
                final Matcher matcher = Pattern.compile(repString).matcher(s);
                while (matcher.find()){
                    occ++;
                }
                if(occ == nos){
                    return true;
                }
            }
            pos=s.indexOf(lastChar,pos+1);
        }
        return false;
    }
}
