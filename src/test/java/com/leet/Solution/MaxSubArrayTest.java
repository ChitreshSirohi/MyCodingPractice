package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {
        final MaxSubArray maxSubArray = new MaxSubArray();
        int[] num = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6,maxSubArray.maxSubArray(num));
    }
}