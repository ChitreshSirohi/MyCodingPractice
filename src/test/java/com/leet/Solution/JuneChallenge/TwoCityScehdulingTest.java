package com.leet.Solution.JuneChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TwoCityScehdulingTest {

    @Test
    public void twoCitySchedCost() {
        final TwoCityScehduling twoCityScehduling = new TwoCityScehduling();
        int[][] cities = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertThat(twoCityScehduling.twoCitySchedCost(cities)).isEqualTo(110);
        assertThat(cities).containsExactly(new int[][]{{400, 50}, {30, 200}, {10, 20},{30, 20} });
        int[][] cities1 = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        assertThat(twoCityScehduling.twoCitySchedCost(cities1)).isEqualTo(1859);
    }
}