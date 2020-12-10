package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MaxProfitTest {

    @Test
    public void maxProfit() {
        MaxProfit maxProfit = new MaxProfit();
        assertThat(maxProfit.maxProfit(new int[]{7,1,5,3,6,4})).isEqualTo(5);
        assertThat(maxProfit.maxProfit(new int[]{7,6,4,3,1})).isEqualTo(0);
        assertThat(maxProfit.maxProfit(new int[]{2,10,1,8,7})).isEqualTo(8);
    }
}