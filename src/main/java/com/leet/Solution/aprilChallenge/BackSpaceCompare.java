package com.leet.Solution.aprilChallenge;

public class BackSpaceCompare {
    public boolean backspaceCompare(String S, String T) {
        return getFinalString(S).equals(getFinalString(T));
    }

    private String getFinalString(final String S) {
        StringBuilder sb1 = new StringBuilder();
        int removeChar = 0;
        char ch = "#".charAt(0);
        for(int ctr=S.length()-1;ctr >= 0;ctr--){
            if(S.charAt(ctr) == ch){
                removeChar++;
            } else {
                if(removeChar == 0){
                    sb1.append(S.charAt(ctr));
                }else{
                    if(S.charAt(ctr) != ch){
                        removeChar--;
                    }
                }
            }
        }
        return sb1.toString();
    }
}
