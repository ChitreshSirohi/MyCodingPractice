package com.leet.Solution.JuneChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 6)).isEqualTo(3);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
        assertThat(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
    }
}