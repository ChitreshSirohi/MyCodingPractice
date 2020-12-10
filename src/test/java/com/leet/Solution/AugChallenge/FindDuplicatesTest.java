package com.leet.Solution.AugChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FindDuplicatesTest {

    @Test
    public void findDuplicates() {
        int[] n = new int[]{4,3,2,7,8,2,3,1};
        int[] n1 = new int[]{3,3};
        int[] n2 = new int[]{3};
        final FindDuplicates findDuplicates = new FindDuplicates();
        assertThat(findDuplicates.findDuplicates(n)).contains(2, 3);
        assertThat(findDuplicates.findDuplicates(n1)).contains(3);
        assertThat(findDuplicates.findDuplicates(n2)).isEmpty();
    }
}