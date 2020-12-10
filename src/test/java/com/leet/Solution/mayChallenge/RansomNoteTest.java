package com.leet.Solution.mayChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RansomNoteTest {
    @Test
    public void canConstruct() {
        final RansomNote note = new RansomNote();
        assertThat(note.canConstruct("aa", "ab")).isFalse();
        assertThat(note.canConstruct("aa", "aab")).isTrue();
    }
}