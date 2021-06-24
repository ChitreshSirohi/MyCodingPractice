package com.leet.Solution.WiseTechGlobal;

import java.util.List;

public class ResultFinalInstances {
    public final static int MAX_INSTANCES = 200000000;
    public final static int INTERVAL= 9;
    public static final int LOWER_CONSUMPTION_LIMIT = 25;
    public static final int UPPER_CONSUMPTION_LIMIT = 60;

    public static int finalInstances(int instances, List<Integer> averageUtil) {
        // Write your code here
        int tempInstances=instances;
        for(int ctr=0;ctr < averageUtil.size();ctr++){
            if(averageUtil.get(ctr) >= LOWER_CONSUMPTION_LIMIT && averageUtil.get(ctr) <= UPPER_CONSUMPTION_LIMIT){
                continue;
            }
            if(averageUtil.get(ctr) < LOWER_CONSUMPTION_LIMIT){
                if(tempInstances == 1){
                    continue;
                }
                tempInstances= (int) Math.ceil(tempInstances/2.0);
                if(ctr + INTERVAL < averageUtil.size()){
                    ctr=ctr+INTERVAL;
                    continue;
                }
                return tempInstances;
            }else {
                if(tempInstances * 2 <= MAX_INSTANCES){
                    tempInstances = tempInstances * 2;
                    if(ctr + INTERVAL < averageUtil.size()){
                        ctr=ctr+INTERVAL;
                        continue;
                    }
                    return tempInstances;
                }
            }
        }
        return tempInstances;
    }

}
