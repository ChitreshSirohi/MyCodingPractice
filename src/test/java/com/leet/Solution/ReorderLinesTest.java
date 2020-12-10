package com.leet.Solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

import static org.junit.Assert.*;

public class ReorderLinesTest {

    @Test
    public void testReorderLines() {
        int lfsize = 5;
        List<String> list = new ArrayList<>();
        list.add("a1 act zoo fg hj");
        list.add("g3 9 2 3 1");
        list.add("g1 9 2 3 1");
        list.add("a1 off dog cat t");
        List<String> list1 = new ArrayList<>();
        list1.add("a1 act zoo fg hj");
        list1.add("a1 off dog cat t");
        list1.add("g1 9 2 3 1");
        list1.add("g3 9 2 3 1");


        ReorderLines reorderLines = new ReorderLines();
        final List<String> strings = reorderLines.reorderLines(5, list);
        assertThat(list1).containsExactlyInAnyOrder(String.valueOf(strings));
    }
}