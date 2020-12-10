package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RepeatedSubstringPatternTest {

    @Test
    public void repeatedSubstringPattern() {

        final RepeatedSubstringPattern repeatedSubstringPattern= new RepeatedSubstringPattern();
        assertThat(repeatedSubstringPattern.repeatedSubstringPattern("ababab")).isTrue();
        assertThat(repeatedSubstringPattern.repeatedSubstringPattern("abab")).isTrue();
        assertThat(repeatedSubstringPattern.repeatedSubstringPattern("bb")).isTrue();
        assertThat(repeatedSubstringPattern.repeatedSubstringPattern("abac")).isFalse();
        assertThat(repeatedSubstringPattern.repeatedSubstringPattern("aba")).isFalse();
        assertThat(repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc")).isTrue();

    }
}