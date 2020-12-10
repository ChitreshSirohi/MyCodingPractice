package com.leet.Solution.aprilChallenge;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1){
            return stones[0];
        }
        final List<Integer> stoneList = Arrays.stream(stones).boxed().sorted().collect(Collectors.toList());
        final int ctr=stoneList.size()-1;
        while(stoneList.get(ctr-1) != 0){
            final int i = stoneList.get(ctr ) - stoneList.get(ctr - 1);
            if(i == 0){
                stoneList.set(ctr, i);
            }else {
                stoneList.set(ctr, 0);
            }
            stoneList.set(ctr-1, i);
            Collections.sort(stoneList);
        }
        return stoneList.get(ctr);
    }

}
