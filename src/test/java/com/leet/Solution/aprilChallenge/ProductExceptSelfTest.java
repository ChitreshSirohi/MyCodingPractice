package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ProductExceptSelfTest {

    @Test
    public void productExceptSelf() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] arr = new int[]{1, 2, 3, 4};
        assertThat(productExceptSelf.productExceptSelf(arr)).containsExactly(24, 12, 8, 6);

    }
}