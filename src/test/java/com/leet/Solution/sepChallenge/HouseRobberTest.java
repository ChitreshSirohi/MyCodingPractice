package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HouseRobberTest {

    @Test
    public void rob() {
        HouseRobber houseRobber = new HouseRobber();
        assertThat(houseRobber.rob(new int[]{1,2,3,1})).isEqualTo(4);
        assertThat(houseRobber.rob(new int[]{2,3,2})).isEqualTo(4);
        assertThat(houseRobber.rob(new int[]{2,1,1,2})).isEqualTo(4);
        assertThat(houseRobber.rob(new int[]{2,7,9,3,1})).isEqualTo(12);
        assertThat(houseRobber.rob(new int[]{8,2,8,9,2})).isEqualTo(18);
    }
}