package com.leet.Solution.JulyChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ArrangeCoinsTest {

    @Test
    public void arrangeCoins() {
        ArrangeCoins coins = new ArrangeCoins();
        assertThat(coins.arrangeCoins(5)).isEqualTo(2);
        assertThat(coins.arrangeCoins(0)).isEqualTo(0);
        assertThat(coins.arrangeCoins(1)).isEqualTo(1);
        assertThat(coins.arrangeCoins(2)).isEqualTo(1);
        assertThat(coins.arrangeCoins(3)).isEqualTo(2);
        assertThat(coins.arrangeCoins(8)).isEqualTo(3);
        assertThat(coins.arrangeCoins(10)).isEqualTo(4);
        assertThat(coins.arrangeCoins(1804289383)).isEqualTo(60070);

    }
}