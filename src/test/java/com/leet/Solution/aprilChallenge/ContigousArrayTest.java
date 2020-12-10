package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
public class ContigousArrayTest {
    @Test
    public void findMaxLengthTest(){
        int[] arr = new int[]{0, 1, 0};
        ContigousArray contigousArray = new ContigousArray();
        assertThat(contigousArray.findMaxLength(arr)).isEqualTo(2);
    }
}