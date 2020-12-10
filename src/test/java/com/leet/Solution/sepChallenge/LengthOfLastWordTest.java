package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        assertThat(lengthOfLastWord.lengthOfLastWord("Hello World")).isEqualTo(5);
    }
}