package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MaximalSquareTest {

    @Test
    public void maximalSquare() {
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        MaximalSquare maximalSquare = new MaximalSquare();
        assertThat(maximalSquare.maximalSquare(matrix)).isEqualTo(2);
    }
}