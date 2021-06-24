package com.leet.Solution.amazon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberAmazonTreasureTrucksTest {

    @Test
    public void numberAmazonTreasureTrucks() {
        char[][] grid= new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberAmazonTreasureTrucks numberAmazonTreasureTrucks = new NumberAmazonTreasureTrucks();
        assertThat(numberAmazonTreasureTrucks.numberAmazonTreasureTrucks(grid)).isEqualTo(1);
        grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        assertThat(numberAmazonTreasureTrucks.numberAmazonTreasureTrucks(grid)).isEqualTo(3);
    }
}