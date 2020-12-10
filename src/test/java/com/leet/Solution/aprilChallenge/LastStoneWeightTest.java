package com.leet.Solution.aprilChallenge;

import org.junit.Test;


import static org.assertj.core.api.Assertions.*;



public class LastStoneWeightTest {

    @Test
    public void lastStoneWeight() {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();;
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        assertThat(lastStoneWeight.lastStoneWeight(stones)).isEqualTo(1);
    }
}