package com.leet.Solution.aprilChallenge;

import java.util.HashMap;

public class ContigousArray {
    public int findMaxLength(int[] nums) {
        final HashMap<Integer, Integer> integerHashMap = new HashMap<Integer, Integer>();
        int sum = 0;
        int maxLength = 0;
        final int length = nums.length;

        for (int i = 0; i < length; i++) {
            nums[i] = (nums[i] == 0) ? -1 : 1;
        }

        // Traverse through the given array

        for (int i = 0; i < length; i++) {
            // Add current element to sum

            sum += nums[i];

            // To handle sum=0 at last index

            if (sum == 0) {
                maxLength = i + 1;
            }

            // If this sum is seen before, then update max_len
            // if required

            if (integerHashMap.containsKey(sum + length)) {
                if (maxLength < i - integerHashMap.get(sum + length)) {
                    maxLength = i - integerHashMap.get(sum + length);
                }
            }
            else // Else put this sum in hash table
                integerHashMap.put(sum + length, i);
        }

        for (int i = 0; i < length; i++) {
            nums[i] = (nums[i] == -1) ? 0 : 1;
        }

        return maxLength;
    }
}
