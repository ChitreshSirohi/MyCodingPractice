package com.leet.Solution.sepChallenge;

import java.util.ArrayList;
import java.util.List;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int start =0;
        int end = 1;
        int currGas=0;
        while(start < gas.length){
            if(gas[start] < cost[start]){
                start++;
                end = start+1>=gas.length?0:start+1;
                continue;
            }
            for (int ctr=0;ctr < gas.length;ctr++ ){
                currGas = currGas + gas[start] - cost[start];
                if(currGas < 0){
                    start++;
                    end = start+1>=gas.length?0:start+1;
                    currGas=0;
                    break;
                }
                end = end==gas.length-1?0:end+1;
            }
        }
        if (end==start){
            return start;
        }else {
            return -1;
        }

/*        for (int i=0;i< gas.length;i++){
            if(gas[i] >= cost[i]){
                int gasLeft=0;
                int startPos= i;
                for (int steps=0;steps < gas.length;steps++){
                    gasLeft=gasLeft+gas[startPos]-cost[startPos];
                    startPos = startPos==gas.length-1?0:startPos+1;
                    if(gasLeft<0){
                        break;
                    }
                    if(startPos == i){
                        return startPos;
                    }
                }
            }
        }
        return -1;*/
    }
}
