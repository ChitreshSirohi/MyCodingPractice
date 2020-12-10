package com.leet.Solution.sepChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {

        final int[][] tripCopy = Arrays.copyOf(trips, trips.length);
        Arrays.sort(trips, Comparator.comparingInt(o -> o[1]));
        Arrays.sort(tripCopy, Comparator.comparingInt(o -> o[2]));
        int currentPassngersNos = 0;
        int tripCompleted=0;
        for (final int[] trip:trips) {
            if(trip[0] > capacity){
                return false;
            }
            currentPassngersNos = currentPassngersNos+trip[0];
            while(trip[1] >=tripCopy[tripCompleted][2]){
                currentPassngersNos=currentPassngersNos-tripCopy[tripCompleted][0];
                tripCompleted++;
            }
            if(currentPassngersNos <=capacity){
                continue;
            }
                return false;
        }
        return true;
    }
}
