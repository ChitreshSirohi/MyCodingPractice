package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LeftMostColumnTest {

    @Test
    public void leftMostColumnWithOne() {
        LeftMostColumn column = new LeftMostColumn();
        assertThat(column.leftMostColumnWithOne(null)).isEqualTo(1);
    }
}