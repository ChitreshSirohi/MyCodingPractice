package com.leet.Solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CellCompete {
    public List<Integer> cellCompete(int[] states, int days)
    {
         for(int daysCtr=0;daysCtr<days;daysCtr++) {
             int prevVal=0;
            for (int ctr = 0; ctr < states.length; ctr++) {
                final int temp;
                {
                    final int t = (prevVal + (ctr + 1 == states.length ? 0 : states[ctr + 1]));
                    temp = t == 1 ? 1:0;
                }
                prevVal = states[ctr];
                states[ctr] = temp;
            }
        }
        return Arrays.stream(states).boxed().collect(Collectors.toList());
    }
}
