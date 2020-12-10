package com.leet.Solution.sepChallenge;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        final String[] s1 = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        final char[] chars = pattern.toCharArray();
        if(s1.length != chars.length){
            return false;
        }
        for (int i=0;i < chars.length;i++){
            if(map.containsKey(chars[i])){
                if(map.get(chars[i]).equals(s1[i])){
                    continue;
                }
                return false;
            }
            if(map.containsValue(s1[i])){
                return false;
            }
            map.put(chars[i], s1[i]);
        }
        return true;
    }
}
