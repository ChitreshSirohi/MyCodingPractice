package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement majorityElement = new MajorityElement();
        assertThat(majorityElement.majorityElement(new int[]{3, 2, 3})).containsExactly(3);
        assertThat(majorityElement.majorityElement(new int[]{1})).containsExactly(1);
        assertThat(majorityElement.majorityElement(new int[]{1,2})).containsExactly(1,2);
        assertThat(majorityElement.majorityElement(new int[]{2,2})).containsExactly(2);
        assertThat(majorityElement.majorityElement(new int[]{1,1,1,3,3,2,2,2})).containsExactly(1,2);
        assertThat(majorityElement.majorityElement(new int[]{1,1,1,3,3,2,2,2,3,3})).containsExactly(3);
    }
}