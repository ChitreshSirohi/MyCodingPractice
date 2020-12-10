package com.leet.Solution.mayChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FrequecySortTest {

    @Test
    public void frequencySort() {
        FrequecySort frequecySort = new FrequecySort();
        assertThat(frequecySort.frequencySort("tree")).isEqualTo("eert");
    }
}