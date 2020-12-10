package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PartitionLabelsTest {

    @Test
    public void partitionLabels() {
        final PartitionLabels partitionLabels = new PartitionLabels();
        assertThat(partitionLabels.partitionLabels("ababcbacadefegdehijhklij")).containsExactly(9,7,8);
        assertThat(partitionLabels.partitionLabels("aaaaaa")).containsExactly(6);
        assertThat(partitionLabels.partitionLabels("aaaab")).containsExactly(4,1);
        assertThat(partitionLabels.partitionLabels("abaccbdeffed")).containsExactly(6,6);
    }
}