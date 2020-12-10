package com.leet.Solution;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeSum {
    public List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> list = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int prime = 0; prime < nums.length-2;prime++){
            for (int ctr1 = prime+1;ctr1<nums.length-1;ctr1++){
                int val = (nums[prime] + nums[ctr1]) * -1;
                int maxLen = 0;
                int ctr2 = ctr1+1;
                if(nums[((nums.length - ctr1) / 2)+ctr1]<val){
                    maxLen = nums.length;
                    ctr2 = ctr1+(nums.length - ctr1) / 2;
                }else {
                    maxLen = ctr1+ ((nums.length - ctr1) / 2) +1;
                }
                for (;ctr2<maxLen && nums[ctr2]<=val ;ctr2++){
                    if(nums[ctr2] == val){
                        final List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[prime]);
                        list1.add(nums[ctr1]);
                        list1.add(nums[ctr2]);
                        Collections.sort(list1);
                        list.add(list1);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for (int prime = 0; prime < nums.length - 2; prime++) {
            for (int ctr1 = prime + 1; ctr1 < nums.length - 1; ctr1++) {
                int val = (nums[prime] + nums[ctr1]) * -1;
                final int i = binarySearchIterative(nums, ctr1+1, nums.length - 1, val);
                if (i != -1) {
                    final List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[prime]);
                    list1.add(nums[ctr1]);
                    list1.add(nums[i]);
                    Collections.sort(list1);
                    list.add(list1);
                }
            }
        }
        return new ArrayList<>(list);
    }


    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }

    public int binarySearchIterative(int arr[],int l, int r,int x){
        int left = l;
        int right = r;
        while(left <=right){
            final int mid = left + ((right - left) / 2);
            if(x == arr[mid]){
                return mid;
            }else if (x < arr[mid] ){
                right = mid-1;
            }else if (x > arr[mid]){
                left = mid+1;
            }
        }
        return -1;
    }

/*    public int[] twoSum(int[] nums, int target) {
       // Arrays.sort(nums);
        for(int ctr=0; ctr < nums.length-1;ctr++){
            final int numToFind =  target - nums[ctr];
            //final int i = binarySearchIterative(nums, ctr, nums.length, numToFind);
            for(int ctr1=ctr+1; ctr1 < nums.length;ctr1++){
                if(nums[ctr1] == numToFind){
                    return new int[]{ctr,ctr1};
                }
            }

        }
        return null;
    }*/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
