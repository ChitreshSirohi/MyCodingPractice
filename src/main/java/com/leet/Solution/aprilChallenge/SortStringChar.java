package com.leet.Solution.aprilChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringChar {


    public List<List<String>> groupAnagrams(String[] strs) {
        final HashMap<String, List<String>> map = new HashMap<>();
        for (final String str : strs) {
            final String sortedStr = sortChars(str);
            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(str);
            }else {
                final ArrayList<String> strings = new ArrayList<>();
                map.put(sortedStr,strings );
                strings.add(str);
            }
        }
        return new ArrayList<>(map.values());
    }


    public String sortChars(final String str){
        final char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return  String.valueOf(chars);
    }
}
