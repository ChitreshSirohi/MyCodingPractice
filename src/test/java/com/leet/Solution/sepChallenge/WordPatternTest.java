package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WordPatternTest {

    @Test
    public void wordPattern() {
        WordPattern wordPattern = new WordPattern();
        assertThat(wordPattern.wordPattern("abba", "dog cat cat dog")).isTrue();
        assertThat(wordPattern.wordPattern("abba", "dog dog dog dog")).isFalse();
        assertThat(wordPattern.wordPattern("aaaa", "dog cat cat dog")).isFalse();
        assertThat(wordPattern.wordPattern("abba", "dog cat cat fish")).isFalse();

    }
}