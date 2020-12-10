package com.leet.Solution.JuneChallenge;

import java.util.*;

public class CheapestPrice {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // Build the graph
        HashMap<Integer, ArrayList<int[]>> flightMap = new HashMap<>();
        for (final int[] flight : flights) {
            flightMap.computeIfAbsent(flight[0], x -> new ArrayList<>()).add(new int[]{flight[1], flight[2]});
        }
        int stops=0;
        int maxPrice = Integer.MAX_VALUE;
        Queue<int[]> cityQueue = new LinkedList<>();
        cityQueue.offer(new int[]{src, 0});
        int[] currentCity;
        while (cityQueue.size() != 0) {
            int size = cityQueue.size();
            for (int i = 0; i < size; i++) {
                currentCity = cityQueue.poll();
                if (currentCity[0] == dst) {
                    maxPrice = Math.min(currentCity[1], maxPrice);
                }
                final ArrayList<int[]> flightsFromCurCity = flightMap.get(currentCity[0]);
                if (flightsFromCurCity==null) {
                    continue;
                }
                for (int[] flight : flightsFromCurCity) {
                    if (currentCity[1] + flight[1] < maxPrice) {
                        cityQueue.offer(new int[]{flight[0], currentCity[1]+ flight[1]});
                    }
                }
            }
            if(stops++ > K){
                break;
            }
        }
        return maxPrice == Integer.MAX_VALUE ? -1:maxPrice;
    }
}
