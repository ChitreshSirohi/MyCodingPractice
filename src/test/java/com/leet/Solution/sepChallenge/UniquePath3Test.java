package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class UniquePath3Test {

    @Test
    public void uniquePathsIII() {
        UniquePath3 uniquePath3 = new UniquePath3();
        int[][] grid = new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        assertThat(uniquePath3.uniquePathsIII(grid)).isEqualTo(2);
    }
}