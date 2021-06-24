package com.hackerrank;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PairSocksTest {

    @Test
    public void sockMerchant() {
        assertThat(PairSocks.sockMerchant(7, new int[]{1, 2, 1, 2, 1, 3, 2})).isEqualTo(2);
    }
}