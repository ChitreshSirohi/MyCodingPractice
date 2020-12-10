package com.leet.Solution;

import java.util.Arrays;
import java.util.Comparator;

public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        int[][] result = new int[intervals.length][1];
        int counter=0;
        for(int ctr=0; ctr < intervals.length - 1;ctr++){
            for(int ctr1=ctr+1;ctr1<intervals.length;ctr1++){
                if(intervals[ctr][1] >= intervals[ctr+1][0]){
                    intervals[ctr][1] = intervals[ctr + 1][1];
                    //result[counter][0]=intervals[]
                }
            }

        }
        return null;
    }
}
