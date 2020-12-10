package com.leet.Solution.aprilChallenge;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;



public class RotatedSortedArrayTest {

    @Test
    public void search() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        RotatedSortedArray rotatedSortedArray = new RotatedSortedArray();
        assertThat(rotatedSortedArray.search(nums, 3)).isEqualTo(-1);
        assertThat(rotatedSortedArray.search(nums, 0)).isEqualTo(4);
        nums = new int[]{1};
        assertThat(rotatedSortedArray.search(nums, 1)).isEqualTo(0);
        nums = new int[]{1,3,5};
        assertThat(rotatedSortedArray.search(nums, 3)).isEqualTo(1);
    }
}