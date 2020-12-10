package com.leet.Solution.sepChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        int[][] sorted = new int[prices.length][2];
        for (int ctr=0;ctr < prices.length;ctr++){
            sorted[ctr][0] = prices[ctr];
            sorted[ctr][1]=ctr;
        }
        Arrays.sort(sorted, Comparator.comparingInt(o -> o[0]));
        int maxProfit =0;
        for (final int[] ints : sorted) {
            for (int ctr1 = ints[1]; ctr1 < prices.length; ctr1++) {
                if (maxProfit < prices[ctr1] - ints[0]) {
                    maxProfit = prices[ctr1] - ints[0];
                }
            }
        }
        return maxProfit;
    }
}
