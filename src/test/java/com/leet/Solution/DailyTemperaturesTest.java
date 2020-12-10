package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {

    @Test
    public void dailyTemperatures() {
        int[] t = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dt =  new DailyTemperatures();
        int[] output = dt.dailyTemperatures(t);
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, output);
        t = new int[]{73};
        output = dt.dailyTemperatures(t);
        assertArrayEquals(new int[]{0}, output);
    }
}