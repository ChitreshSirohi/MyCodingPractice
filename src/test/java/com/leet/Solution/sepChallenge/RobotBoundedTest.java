package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RobotBoundedTest {

    @Test
    public void isRobotBounded() {
        RobotBounded robotBounded = new RobotBounded();
        assertThat(robotBounded.isRobotBounded("GGLLGG")).isTrue();
        assertThat(robotBounded.isRobotBounded("GG")).isFalse();
        assertThat(robotBounded.isRobotBounded("GL")).isTrue();
        assertThat(robotBounded.isRobotBounded("LLGRL")).isTrue();
        assertThat(robotBounded.isRobotBounded("GLRLGLLGLGRGLGL")).isTrue();
        assertThat(robotBounded.isRobotBounded("GLGLGGLGL")).isFalse();
        assertThat(robotBounded.isRobotBounded("GLRLGLLGLGRGLGL")).isTrue();
        assertThat(robotBounded.isRobotBounded("LLLRLLLRLLGLLGGRGLLLGGLRRRRRGLRLRLRLGGRGRGRLLLLLLGLLRLGLGLRLGGGRR")).isFalse();
    }
}