package com.leet.Solution;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        for(int outerCtr=0;outerCtr< T.length-1;outerCtr++){
            for(int inCtr = outerCtr+1; inCtr<T.length;inCtr++){
                if(T[inCtr] > T[outerCtr]){
                    T[outerCtr]=inCtr-outerCtr;
                    break;
                }
            }
            T[outerCtr]=0;
        }
        return T;
    }
}
