package com.leet.Solution;

import org.junit.Test;
import static org.junit.Assert.*;


public class LengthOfLongestSubstringTest{
    @Test
    public void lengthOfLongestSubstring() {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        String inputString = "abcabcbb";
        assertEquals(3,lengthOfLongestSubstring.lengthOfLongestSubstring(inputString));

        inputString = "bbbbbbb";
        assertEquals(1,lengthOfLongestSubstring.lengthOfLongestSubstring(inputString));

        inputString = "pwwkew";
        assertEquals(3,lengthOfLongestSubstring.lengthOfLongestSubstring(inputString));

        inputString = "chitresh sirohi chitreshsirohi";
        assertEquals(8,lengthOfLongestSubstring.lengthOfLongestSubstring(inputString));

        inputString = "aab";
        assertEquals(2,lengthOfLongestSubstring.lengthOfLongestSubstring(inputString));
    }
}
