package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {

    @Test
    public void maxProfit() {
        MaxProfit maxProfit = new MaxProfit();;
        int[] stocksDays = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(7,maxProfit.maxProfit(stocksDays));
        stocksDays = new int[]{1,2,3,4,5};
        assertEquals(4,maxProfit.maxProfit(stocksDays));
        stocksDays = new int[]{7,6,4,3,1};
        assertEquals(0,maxProfit.maxProfit(stocksDays));
        stocksDays = new int[]{2,1,2,0,1};
        assertEquals(2,maxProfit.maxProfit(stocksDays));
    }
}