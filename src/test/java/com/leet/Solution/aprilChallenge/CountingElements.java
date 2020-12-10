package com.leet.Solution.aprilChallenge;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a:arr) {
            if(map.containsKey(a)){
                final Integer val = map.get(a);
                map.put(a, val +1);
            }else {
                map.put(a,1);
            }
        }
        int result = 0;
        for (Integer entry: map.keySet()) {

            if (map.containsKey(entry + 1)) {
                result += map.get(entry);
            }
        }
        return result;
    }
}
