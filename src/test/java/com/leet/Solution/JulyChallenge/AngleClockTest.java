package com.leet.Solution.JulyChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AngleClockTest {

    @Test
    public void angleClock() {
        AngleClock clock = new AngleClock();
        assertThat(clock.angleClock(12, 30)).isEqualTo(165);
        assertThat(clock.angleClock(3, 30)).isEqualTo(75);
        assertThat(clock.angleClock(3, 15)).isEqualTo(7.5);
        assertThat(clock.angleClock(4, 50)).isEqualTo(155);
        assertThat(clock.angleClock(12, 0)).isEqualTo(0);
    }
}