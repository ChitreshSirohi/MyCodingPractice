package com.leet.Solution.WiseTechGlobal;

import java.util.*;

public class ResultClosestStraingCity {
    private static final String NONE = "NONE";

    public static List<String> closestStraightCity(List<String> c, List<Integer> x, List<Integer> y, List<String> q) {
        // Write your code here
        List<String> results = new ArrayList<>();
        for (String query:q ) {
            int cityPos= c.indexOf(query);
            final Integer cordx = x.get(cityPos);
            final Integer cordy = y.get(cityPos);
            final List<Tuple<Integer, String>> cityXDistances = extracted(c, x, cityPos, cordx, java.lang.Integer.MAX_VALUE);
            final List<Tuple<Integer, String>> cityYDistances = extracted(c, y, cityPos, cordy, java.lang.Integer.MAX_VALUE);
            if(cityXDistances.isEmpty() && cityYDistances.isEmpty()){
                results.add(NONE);
                continue;
            }
            int distanceX=0;
            if(!cityXDistances.isEmpty()){
                distanceX = cityXDistances.get(0).x;
            }else {
                results.add(cityYDistances.get(0).y);
            }
            int distanceY=0;
            if(!cityYDistances.isEmpty()){
                distanceY = cityYDistances.get(0).x;
            }else {
                results.add(cityXDistances.get(0).y);
            }

        }
        return results;
    }

    private static List<Tuple<Integer, String>> extracted(final List<String> cities, final List<Integer> cordinateList, final int cityPos, final Integer cordinate, int minCordinate) {
        List<Tuple<Integer, String>> distances = new ArrayList<>();
        for(int ctr = 0; ctr< cordinateList.size(); ctr++){
            if(ctr != cityPos){
                final int distance = cordinateList.get(ctr) - cordinate;
                if(distance < minCordinate){
                    minCordinate = distance;
                    Tuple<Integer, String> tuple = new Tuple<>(minCordinate, cities.get(ctr));
                    distances.add(tuple);
                }
            }
        }
        distances.sort((o1, o2) -> {
            if ((int) o1.x == o2.x) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1.y, o2.y);
            }
            return Integer.compare(o1.x, o2.x);
        });
        return distances;
    }



    public static class Tuple<Integer, String> {
        public final Integer x;
        public final String y;
        public Tuple(Integer x, String y) {
            this.x = x;
            this.y = y;
        }
    }

}
