package com.leet.Solution.sepChallenge;

import java.util.*;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        final List<Integer> labelsList = new ArrayList<>();
        if(S.isEmpty() || S.length()==1){
            labelsList.add(S.length());
            return labelsList;
        }
        final Map<Character, Integer> charMap = new HashMap<>();
        final char[] chars = S.toCharArray();
        char mayBeChar;
        int index = 0;
        int prevVal=0;
        int lastIndexOf=0;
        while (index < S.length()){
            mayBeChar = chars[index];
            lastIndexOf = Math.max(S.lastIndexOf(mayBeChar), lastIndexOf);
            charMap.put(mayBeChar,lastIndexOf+1);
            index++;
            while (index < S.length() && charMap.containsKey(chars[index])){
                index++;
            }
            if(index >= lastIndexOf){
                final Integer max = charMap.values().stream().max(Integer::compareTo).get();
                labelsList.add(max-prevVal);
                prevVal=max;
                charMap.clear();
            }
        }
        return labelsList;
    }
}
