package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void getTotalSq() {
        HappyNumber hn = new HappyNumber();
        int num = 19;
        assertEquals(82,hn.getTotalSq(num));
        num = 100;
        assertEquals(1,hn.getTotalSq(num));
    }

    @Test
    public void isHappy() {
        HappyNumber hn = new HappyNumber();
        int num = 19;
        assertTrue(hn.isHappy(num));
        num = 1000;
        assertTrue(hn.isHappy(num));
        num = 2;
        assertFalse(hn.isHappy(num));
    }
}