package com.leet.Solution.mayChallenge;


import org.assertj.core.groups.Tuple;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequecySort {
    public String frequencySort(String s) {
        final StringBuffer buffer = new StringBuffer();
        final Map<Character, Integer> countMap = new HashMap<>();
        s.chars().forEach(ch -> countMap.put((char) ch, countMap.getOrDefault((char) ch, 0) + 1));
        countMap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(characterIntegerEntry ->
                {
                    IntStream.range(0, characterIntegerEntry.getValue()).forEach(i -> buffer.append(characterIntegerEntry.getKey()));
                });
        return buffer.toString();
    }
}
