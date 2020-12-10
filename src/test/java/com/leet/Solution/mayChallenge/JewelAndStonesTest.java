package com.leet.Solution.mayChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class JewelAndStonesTest {

    @Test
    public void numJewelsInStones() {
        JewelAndStones jewelAndStones = new JewelAndStones();
        assertThat(jewelAndStones.numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3);
    }
}