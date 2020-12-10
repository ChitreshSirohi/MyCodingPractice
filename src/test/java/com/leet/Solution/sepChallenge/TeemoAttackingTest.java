package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TeemoAttackingTest {

    @Test
    public void findPoisonedDuration() {
        TeemoAttacking teemoAttacking = new TeemoAttacking();
        assertThat(teemoAttacking.findPoisonedDuration(new int[]{1, 4}, 2)).isEqualTo(4);
        assertThat(teemoAttacking.findPoisonedDuration(new int[]{1, 2}, 2)).isEqualTo(3);
        assertThat(teemoAttacking.findPoisonedDuration(new int[]{1, 2,3,4}, 2)).isEqualTo(5);
        assertThat(teemoAttacking.findPoisonedDuration(new int[]{1, 2,3,4,5}, 5)).isEqualTo(9);
        assertThat(teemoAttacking.findPoisonedDuration(new int[]{1, 2,3,4,9}, 2)).isEqualTo(7);
        assertThat(teemoAttacking.findPoisonedDuration(new int[]{1, 2,3,4,5,6,7,8,9}, 1)).isEqualTo(9);
    }
}