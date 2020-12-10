package com.leet.Solution;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
public class ThreeSumTest {

    @Test
    public void threeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(nums);
        assertEquals("[[-1, -1, 2], [-1, 0, 1]]", lists.toString());
        nums = new int[]{-1, 0, 1, 2, -1, -4, 4};
        lists = threeSum.threeSum(nums);
        assertEquals("[[-1, -1, 2], [-4, 0, 4], [-1, 0, 1]]", lists.toString());
    }

    @Test
    public void twoSum(){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        final ThreeSum threeSum = new ThreeSum();
        int[] result = threeSum.twoSum(nums, target);
        int[] expected = new int[]{0, 1};
        assertThat(result).containsExactlyInAnyOrder(expected);
        nums = new int[]{0,4,3,0};
        target = 0;
        result = threeSum.twoSum(nums, target);
        expected = new int[]{0, 3};
        assertThat(result).containsExactlyInAnyOrder(expected);
        nums = new int[]{3,2,4};
        target = 6;
        result = threeSum.twoSum(nums, target);
        expected = new int[]{1,2};
        assertThat(result).containsExactlyInAnyOrder(expected);
    }
}