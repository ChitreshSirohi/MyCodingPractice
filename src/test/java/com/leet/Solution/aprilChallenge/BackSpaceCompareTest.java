package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BackSpaceCompareTest {

    @Test
    public void backspaceCompare() {
        final BackSpaceCompare backSpaceCompare = new BackSpaceCompare();
        String S = "ab#c", T = "ad#c";
        assertThat(backSpaceCompare.backspaceCompare(S, T)).isTrue();
        S = "ab##";
        T = "c#d#";
        assertThat(backSpaceCompare.backspaceCompare(S, T)).isTrue();
        S = "a#c";
        T = "b";
        assertThat(backSpaceCompare.backspaceCompare(S, T)).isFalse();
        S = "#";
        T = "";
        assertThat(backSpaceCompare.backspaceCompare(S, T)).isTrue();
        S = "bxj##tw";
        T = "bxo#j##tw";
        assertThat(backSpaceCompare.backspaceCompare(S, T)).isTrue();
    }
}