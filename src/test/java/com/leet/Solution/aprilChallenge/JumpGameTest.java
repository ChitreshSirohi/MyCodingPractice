package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class JumpGameTest {

    @Test
    public void canJump() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int[] nums1 = new int[]{3,2,1,0,4};
        JumpGame jumpGame = new JumpGame();
        assertThat(jumpGame.canJump(nums)).isTrue();
        assertThat(jumpGame.canJump(nums1)).isFalse();

    }
}