package com.leet.Solution.mayChallenge;

import org.assertj.core.internal.IterableElementComparisonStrategy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        final List<Integer> notes = ransomNote.chars().boxed().collect(Collectors.toList());
        final List<Integer> collect = magazine.chars().boxed().collect(Collectors.toList());
        final Map<Integer, Long> map = collect.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Integer note:notes) {
            final Long integer = map.get(note);
            if(integer == null){
                return false;
            }
            if(integer == 1){
                map.remove(note);
            }else {
                map.put(note, integer - 1);
            }
        }
        return true;
    }
}
