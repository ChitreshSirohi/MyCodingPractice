package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class GasStationTest {

    @Test
    public void canCompleteCircuit() {
        GasStation gasStation = new GasStation();
        assertThat(gasStation.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2})).isEqualTo(3);
        assertThat(gasStation.canCompleteCircuit(new int[]{2,3,4},new int[]{3,4,3})).isEqualTo(-1);
    }
}