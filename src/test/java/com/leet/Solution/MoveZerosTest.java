package com.leet.Solution;

import org.junit.Test;

import static org.junit.Assert.*;


public class MoveZerosTest {

    @Test
    public void moveZeroes() {
        final MoveZeros moveZeros = new MoveZeros();
        int[] arr = new int[]{0,0,0,1};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1,0,0,0},arr);

        arr = new int[]{0, 1, 0, 3, 12};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1,3,12,0,0},arr);

        arr = new int[]{0,0,0,0};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{0,0,0,0},arr);
        arr = new int[]{0,1,1,0};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1,1,0,0},arr);

        arr = new int[]{1,2,3,4};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1,2,3,4},arr);
    }
}