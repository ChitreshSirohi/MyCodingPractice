package com.leet.Solution.JulyChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TaskSchedulerTest {

    @Test
    public void leastInterval() {
        char[] chars = new char[]{'A','A','A','B','B','B'};
        assertThat(new TaskScheduler().leastInterval(chars, 2)).isEqualTo(8);
        assertThat(new TaskScheduler().leastInterval(chars, 0)).isEqualTo(6);
        chars = new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'};
        assertThat(new TaskScheduler().leastInterval(chars, 2)).isEqualTo(16);
    }
}