package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber sn = new SingleNumber();
        int[] input = new int[]{4,1,2,1,2};
        int i = sn.singleNumber(input);
        assertEquals(4, i);

        input = new int[]{2,2,1};
        i = sn.singleNumber(input);
        assertEquals(1, i);
    }
}