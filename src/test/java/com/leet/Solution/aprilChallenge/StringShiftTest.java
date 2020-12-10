package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class StringShiftTest {


    @Test
    public void stringShift() {
        final StringShift stringShift = new StringShift();
        assertThat(stringShift.stringShift("abc",new int[][]{{0,1},{1,2}})).isEqualTo("cab");
        int[][] arr = new int[][]{{1,15},{0,18},{0,12},{0,7},{0,7},{1,17},{1,15},{0,9},{1,4},{0,19},{1,16},{0,7},{1,4},{1,17},{1,19},{1,10},{1,2},{0,18},{1,15}};
        assertThat(stringShift.stringShift("yzeuobhwxatulpruiab",new int[][]{{0,1},{1,2}})).isEqualTo("byzeuobhwxatulpruia");
    }

    @Test
    public void shiftString() {
        final StringShift stringShift = new StringShift();
        assertThat(stringShift.shiftString("abc", 1)).isEqualTo("cab");
        assertThat(stringShift.shiftString("abc", -2)).isEqualTo("cab");
        assertThat(stringShift.shiftString("abc", -3)).isEqualTo("abc");
        assertThat(stringShift.shiftString("abc", -4)).isEqualTo("bca");
    }
}