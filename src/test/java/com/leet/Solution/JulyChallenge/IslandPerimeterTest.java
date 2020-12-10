package com.leet.Solution.JulyChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IslandPerimeterTest {

    @Test
    public void islandPerimeter() {
        int[][] grid = new int[][]{{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        assertThat(islandPerimeter.islandPerimeter(grid)).isEqualTo(16);
    }
}