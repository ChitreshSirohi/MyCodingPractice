package com.leet.Solution.JuneChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CheapestPriceTest {

    @Test
    public void findCheapestPrice() {
        final CheapestPrice cheapestPrice = new CheapestPrice();
        assertThat(cheapestPrice.findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,1)).isEqualTo(200);
        assertThat(cheapestPrice.findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,0)).isEqualTo(500);
        assertThat(cheapestPrice.findCheapestPrice(4,new int[][]{{0,1,1},{0,2,5},{1,2,1},{2,3,1}},0,3,1)).isEqualTo(6);
    }
}