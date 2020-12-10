package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void reverseWords() {
        ReverseWords reverseWords = new ReverseWords();
        String input = "the sky is blue";
        assertEquals("blue is sky the", reverseWords.reverseWords(input));
        input = "  hello world!  ";
        assertEquals("world! hello", reverseWords.reverseWords(input));
    }
}