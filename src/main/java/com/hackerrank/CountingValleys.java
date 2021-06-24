package com.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        if (steps == 0) {
            return 0;
        }
        int valleys = 0;
        final int seaLevel = 0;
        int ellevation = 0;
        int valley = 0;
        for (int ctr = 0; ctr < steps; ctr++) {
            if (path.charAt(ctr) == 'U') {
                ellevation++;
            } else {
                ellevation--;
            }
            if (ellevation < valley) {
                valley = ellevation;
            }
            if (valley < seaLevel && ellevation == seaLevel) {
                valleys++;
                valley = seaLevel;
            }

        }
        return valleys;
    }

    static int jumpingOnClouds(int[] c) {
        //0 ,1 ,0,1,0,0,0
        if (c.length <= 2) {
            return 1;
        }

        int ctr = 0;
        int jumps = 0;
        while (ctr < c.length - 1) {
            if (ctr + 2 == c.length) {
                return ++jumps;
            }
            if (c[ctr + 2] == 1) {
                ctr = ctr + 1;
                jumps++;
            } else {
                ctr = ctr + 2;
                jumps++;
            }
        }
        return jumps;
    }

    static long repeatedString(String s, long n) {
        final int len = s.length();
        long num = 0;
        for (int ctr = 0; ctr < len; ctr++) {
            if (s.charAt(ctr) == 'a') {
                num++;
            }
        }
        final long o = n / len;
        final long remainder = n % len;
        num = o * num;
        if (remainder == 0) {
            return num;
        }
        for (int ctr = 0; ctr < remainder; ctr++) {
            if (s.charAt(ctr) == 'a') {
                num++;
            }
        }
        return num;
    }

    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Integer> after = new HashMap<>();
        HashMap<Long, Integer> before = new HashMap<>();
        for (Long l : arr) {
            if (after.containsKey(l)) {
                final Integer integer = after.get(l);
                after.put(l, integer + 1);
            } else {
                after.put(l, 1);
            }
        }
        int count;
        for (Long l : arr) {
            long condition1 = l / r;
            long condition2 = l * r;
            if (before.containsKey(condition1)) {

            }

        }

        return 0l;
    }
}
