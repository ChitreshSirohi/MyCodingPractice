package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CarPoolingTest {

    @Test
    public void carPooling() {
        CarPooling carPooling = new CarPooling();
        int[][] trips = new int[][]{{2,1,5},{3,3,7}};
        assertThat(carPooling.carPooling(trips,4)).isFalse();
        assertThat(carPooling.carPooling(new int[][]{{2,1,5},{3,3,7}},5)).isTrue();
        assertThat(carPooling.carPooling(new int[][]{{2,1,5},{3,5,7}},3)).isTrue();
        assertThat(carPooling.carPooling(new int[][]{{3,2,7},{3,7,9},{8,3,9}},11)).isTrue();
        assertThat(carPooling.carPooling(new int[][]{{3,2,8},{4,4,6},{10,8,9}},11)).isTrue();
        assertThat(carPooling.carPooling(new int[][]{{3,2,20},{2,7,9},{2,10,11},{2,11,13}},5)).isTrue();

    }
}