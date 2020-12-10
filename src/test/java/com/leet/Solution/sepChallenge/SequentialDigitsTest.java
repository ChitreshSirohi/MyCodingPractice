package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SequentialDigitsTest {

    @Test
    public void sequentialDigits() {
    }

    @Test
    public void addNum() {
        SequentialDigits sequentialDigits = new SequentialDigits();
        assertThat(sequentialDigits.sequentialDigits(100, 300)).containsExactly(123, 234);
        assertThat(sequentialDigits.sequentialDigits(1000, 13000)).containsExactly(1234,2345,3456,4567,5678,6789,12345);
        assertThat(sequentialDigits.sequentialDigits(58, 155)).containsExactly(67,78,89,123);
        assertThat(sequentialDigits.sequentialDigits(58, 101)).containsExactly(67,78,89);
    }
}