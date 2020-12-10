package com.leet.Solution.sepChallenge;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totTime=0;
        if(timeSeries.length ==1){
            return duration;
        }
        if(timeSeries.length == 2){
            if(timeSeries[1] - timeSeries[0] >=duration){
                return duration * timeSeries.length;
            }
            return timeSeries[1]-timeSeries[0] + duration;
        }

        for (final int timeSery : timeSeries) {
            if (totTime >= timeSery) {
                totTime = timeSery + duration-1;
            } else {
                //overlapping
                totTime = totTime + duration;
            }
        }
        return totTime;
    }
}
