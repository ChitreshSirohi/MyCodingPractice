package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

public class SortStringCharTest {

    @Test
    public void groupAnagrams() {
        SortStringChar sortStringChar = new SortStringChar();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        final List<List<String>> lists = sortStringChar.groupAnagrams(strs);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ate");
        list1.add("eat");
        list1.add("tea");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("nat");
        list2.add("tan");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("bat");
        ArrayList<List<String>> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        lists.sort((o1, o2) -> Integer.compare(o2.size(), o1.size()));
        IntStream.range(0, mainList.size()).forEach(i -> assertThat(lists.get(i)).containsExactlyInAnyOrder(mainList.get(i).stream().toArray(String[]::new)));
    }
}