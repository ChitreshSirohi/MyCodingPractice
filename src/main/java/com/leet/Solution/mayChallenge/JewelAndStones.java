package com.leet.Solution.mayChallenge;

public class JewelAndStones {
    public int numJewelsInStones(String J, String S) {
        final char[] jewels = J.toCharArray();
        final char[] stones = S.toCharArray();
        int j=0;
        for (char jewel: jewels) {
            for (char stone:stones) {
                if(jewel == stone){
                    j++;
                }
            }
        }
        return j;
    }
}
