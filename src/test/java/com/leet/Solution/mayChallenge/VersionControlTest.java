package com.leet.Solution.mayChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class VersionControlTest {


    @Test
    public void firstBadVersion() {
        VersionControl vc = new VersionControl();
        vc.setVersion(new int[]{0,0,0,0,1,1,1});
        assertThat(vc.firstBadVersion(7)).isEqualTo(5);
        vc.setVersion(new int[]{0,1});
        assertThat(vc.firstBadVersion(2)).isEqualTo(2);
    }
}