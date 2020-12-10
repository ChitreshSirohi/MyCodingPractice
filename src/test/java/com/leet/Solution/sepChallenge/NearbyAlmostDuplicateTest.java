package com.leet.Solution.sepChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NearbyAlmostDuplicateTest {

    @Test
    public void containsNearbyAlmostDuplicate() {
        int[] nums=new int[]{1,2,3,1};
        NearbyAlmostDuplicate nearbyAlmostDuplicate = new NearbyAlmostDuplicate();
        assertThat(nearbyAlmostDuplicate.containsNearbyAlmostDuplicate(nums, 3, 0)).isTrue();
        nums=new int[]{1,0,1,1};
        assertThat(nearbyAlmostDuplicate.containsNearbyAlmostDuplicate(nums, 1, 2)).isTrue();
        nums=new int[]{1,5,9,1,5,9};
        assertThat(nearbyAlmostDuplicate.containsNearbyAlmostDuplicate(nums, 2, 3)).isFalse();
        nums=new int[]{-1,-1};
        assertThat(nearbyAlmostDuplicate.containsNearbyAlmostDuplicate(nums, 1, -1)).isFalse();
        nums=new int[]{-1,2147483647};
        assertThat(nearbyAlmostDuplicate.containsNearbyAlmostDuplicate(nums, 1, 2147483647)).isFalse();
        nums=new int[]{2147483647,-2147483647};
        assertThat(nearbyAlmostDuplicate.containsNearbyAlmostDuplicate(nums, 1, 2147483647)).isFalse();
    }
}