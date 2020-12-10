package com.leet.Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseWords {
    public String reverseWords(String s) {
        final StringTokenizer stringTokenizer = new StringTokenizer(s," ");
        final StringBuilder stringBuilder = new StringBuilder();
        final List<String> words = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            words.add(stringTokenizer.nextToken().trim());
        }
        final StringBuilder sb = new StringBuilder();
        for(int ctr=words.size()-1;ctr >=0 ;ctr--){
            if(ctr == 0){
                sb.append(words.get(ctr));
            }
            else {
                sb.append(words.get(ctr)).append(" ");
            }

        }
        return sb.toString();
    }
}
