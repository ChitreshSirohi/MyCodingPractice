package com.leet.Solution.JuneChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScehduling {
    public int twoCitySchedCost(int[][] costs) {
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                return Math.abs(o2[0] - o2[1]) - Math.abs(o1[0] - o1[1]);
            }
        };
        Arrays.sort(costs,comparator);
        int city1 = 0;
        int city2 = 0;
        int total = 0;
        for (final int[] city : costs) {
            if (city[0] < city[1]) {
                if (city1 < costs.length / 2) {
                    total += city[0];
                    city1++;
                } else {
                    total += city[1];
                    city2++;
                }
            } else {
                if (city2 < costs.length / 2) {
                    total += city[1];
                    city2++;
                } else {
                    total += city[0];
                    city1++;
                }
            }
        }
        return total;
    }
}

