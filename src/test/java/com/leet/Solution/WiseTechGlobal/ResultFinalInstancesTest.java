package com.leet.Solution.WiseTechGlobal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ResultFinalInstancesTest {

    @Test
    public void finalInstances() {
         List<Integer> ints = Arrays.asList(25,23,1,2,3,4,5,6,7,8,9,10,76,80);

        assertThat(ResultFinalInstances.finalInstances(2, ints)).isEqualTo(2);

         ints = Arrays.asList(5,10,80);
        assertThat(ResultFinalInstances.finalInstances(1, ints)).isEqualTo(2);

        /*ints = Arrays.asList(73, 77, 53, 75, 22, 55, 84, 45, 40, 80, 66, 54, 39, 68, 23, 54, 22, 11, 91, 47, 56, 91, 97, 5, 44, 62, 73, 26, 99, 96, 74, 4, 0, 8, 56, 3, 21, 37, 94, 83, 68, 91, 83, 41, 22, 81, 59, 37, 29, 93, 8, 88, 41, 94, 62, 63, 97, 73, 46, 80, 91, 65, 69, 52, 31, 35, 81, 60, 44, 8, 80, 75, 94, 16, 45, 12, 29, 22, 59, 88, 87, 55, 43, 67, 8, 15, 26, 31, 99, 35, 99, 1, 98);
        assertThat(ResultFinalInstances.finalInstances(46, ints)).isEqualTo(2);*/
    }
}