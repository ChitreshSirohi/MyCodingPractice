package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FindTheDifferenceTest {

    @Test
    public void findTheDifference() {
        FindTheDifference findTheDifference = new FindTheDifference();
        assertThat(findTheDifference.findTheDifference("abcd", "abcde")).isEqualTo('e');
    }
}