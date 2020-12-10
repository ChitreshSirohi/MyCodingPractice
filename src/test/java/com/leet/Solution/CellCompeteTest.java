package com.leet.Solution;

import org.assertj.core.api.ListAssert;
import org.junit.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.*;

import static org.junit.Assert.*;

public class CellCompeteTest {

    @Test
    public void cellCompete() {
        final CellCompete cellCompete = new CellCompete();
        int[] i = new int[]{1, 0, 0, 0, 0, 1, 0, 0};
        List<Integer> integers = cellCompete.cellCompete(i, 1);
        assertThat(integers).containsExactly(0, 1, 0, 0, 1, 0, 1, 0);
        i = new int[]{1, 1, 1, 0, 1, 1, 1, 1};
         integers = cellCompete.cellCompete(i, 8);
        assertThat(integers).containsExactly(0, 0, 0, 0, 0, 1, 1, 0);
    }
}