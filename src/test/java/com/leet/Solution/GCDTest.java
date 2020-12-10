package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void generalizedGCD() {
        final GCD gcd = new GCD();;
        final int num = 5;
        int[] arr = new int[]{2, 4, 6, 8, 10};
        assertEquals(2,gcd.generalizedGCD(5, arr));
        arr = new int[]{2, 3,4, 5, 6};
        assertEquals(1,gcd.generalizedGCD(5, arr));
        arr = new int[]{17,34,68};
        assertEquals(17,gcd.generalizedGCD(3, arr));
        arr = new int[]{17,33,68};
        assertEquals(1,gcd.generalizedGCD(3, arr));
    }
}