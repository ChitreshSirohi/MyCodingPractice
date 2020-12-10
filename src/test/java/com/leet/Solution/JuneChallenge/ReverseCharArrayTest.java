package com.leet.Solution.JuneChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ReverseCharArrayTest {

    @Test
    public void reverseString() {
        ReverseCharArray reverseCharArray = new ReverseCharArray();
        char[] s = new char[]{'h','e','l','l','o'};
        reverseCharArray.reverseString(s);
        assertThat(s).containsExactly('o','l','l','e','h');
         s = new char[]{'H','a','n','n','a','h'};
        reverseCharArray.reverseString(s);
        assertThat(s).containsExactly('h','a','n','n','a','H');
    }
}