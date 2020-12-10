package com.leet.Solution.JulyChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ReverseBitsTest {

    @Test
    public void reverseBits() {
        ReverseBits reverseBits = new ReverseBits();
        assertThat(reverseBits.reverseBits(43261596)).isEqualTo(964176192);
    }
}