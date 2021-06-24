package com.hackerrank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CountingValleysTest {

    @Test
    public void countingValleys() {
        assertThat(CountingValleys.countingValleys(8, "UDDDUDUU")).isEqualTo(1);
    }

    @Test
    public void jumpingOnClouds() {
        //0 0 1 0 0 1 0
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0})).isEqualTo(4);
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0 ,0 ,0, 0, 1, 0})).isEqualTo(3);
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0 ,0 ,1, 0, 0, 1,0,0})).isEqualTo(5);
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0 ,0 ,0,0,0})).isEqualTo(2);
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0 ,0 ,1,0,0})).isEqualTo(3);
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0 ,0 ,1,0,0})).isEqualTo(3);
        assertThat(CountingValleys.jumpingOnClouds(new int[]{0 ,1 ,0,1,0,0,0})).isEqualTo(3);
    }

    @Test
    public void repeatedString() {
        assertThat(CountingValleys.repeatedString("a", 1000000000000L)).isEqualTo(1000000000000L);
        assertThat(CountingValleys.repeatedString("aba", 10L)).isEqualTo(7L);
    }

    @Test
    public void countTriplets() {
         List<Long> longs = Arrays.asList(1L, 5L, 5L, 25L, 125L);

        assertThat(CountingValleys.countTriplets(longs, 5L)).isEqualTo(4);
        longs = Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L);
        assertThat(CountingValleys.countTriplets(longs, 3L)).isEqualTo(6);
    }
}