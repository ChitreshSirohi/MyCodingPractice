package com.leet.Solution;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s== null || s.length() <=1){
            return s;
        }
        String longest =s.substring(0,1);
        int len = s.length();
        int longPal =0;
        s = s.toLowerCase();
        final StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equalsIgnoreCase(s)){
            return s;
        }
        for(int outerCtr =0 ;outerCtr < s.length();outerCtr++){
            for(int inCtr = outerCtr;inCtr<s.length();inCtr++) {
                if (inCtr > outerCtr && s.charAt(outerCtr) == s.charAt(inCtr)) {
                    final String s1 = inCtr >= len? s.substring(outerCtr): s.substring(outerCtr, inCtr+1);
                    sb.setLength(0);
                    sb.append(s1);
                    if (s1.equalsIgnoreCase(sb.reverse().toString()) && s1.length() > longPal) {
                        longest = s1;
                        longPal = s1.length();
                    }
                }
            }
        }

/*        int leftCtr=0;
        int rightCtr = s.length()-1;
        for (;leftCtr < rightCtr; leftCtr++){
            for(;rightCtr > leftCtr;rightCtr--){
                if(s.charAt(rightCtr) == s.charAt(leftCtr) && (rightCtr -leftCtr > longPal)){
                  final String s1 =  s.substring(leftCtr,rightCtr+1);
                  sb.setLength(0);
                  if(s1.equalsIgnoreCase(sb.append(s1).reverse().toString())){
                      longest = s1;
                      longPal = s1.length();
                    }
                }
            }
            rightCtr = s.length()-1;
        }*/
        return longest;
    }
}
