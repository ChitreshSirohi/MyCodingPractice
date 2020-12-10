package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CountingElementsTest {

    @Test
    public void countElements() {
        final CountingElements countingElements = new CountingElements();
        int[] arr = new int[]{1, 2, 3};
        assertThat(countingElements.countElements(arr)).isEqualTo(2);
        arr = new int[]{1,1,3,3,5,5,7,7};
        assertThat(countingElements.countElements(arr)).isEqualTo(0);
        arr = new int[]{1,3,2,3,5,0};
        assertThat(countingElements.countElements(arr)).isEqualTo(3);
        arr = new int[]{1,1,2,2};
        assertThat(countingElements.countElements(arr)).isEqualTo(2);
        arr = new int[]{2,9,0,7,6,2,7,7,0};
        assertThat(countingElements.countElements(arr)).isEqualTo(1);
    }
}