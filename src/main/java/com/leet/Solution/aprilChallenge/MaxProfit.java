package com.leet.Solution.aprilChallenge;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit =0 ;
        int stockPrice = 0;
        boolean bought = false;
        for(int day=0;day<prices.length;day++){
            if(!bought ) {
                if (day+1<prices.length && prices[day] < prices[day + 1]) {
                    stockPrice = prices[day];
                    bought = true;
                }
            }else {
                if(stockPrice < prices[day]){
                    if(day+1<prices.length && prices[day] < prices[day+1]){
                        continue;
                    }
                    maxProfit = maxProfit + prices[day] - stockPrice;
                    stockPrice = 0;
                    bought = false;
                }
            }

        }
        return maxProfit;
    }
}
