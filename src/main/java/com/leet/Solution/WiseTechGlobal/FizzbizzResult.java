package com.leet.Solution.WiseTechGlobal;

import java.util.stream.IntStream;

public class FizzbizzResult {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static void fizzBuzz(int n) {
        // Write your code here
        IntStream.rangeClosed(1,n).forEach(i -> System.out.println(getFizzBuzz(i)));
        //System.out.println(getFizzBuzz(n));
    }

    public static String getFizzBuzz(int n){
        if(n%3==0 && n%5==0){
            return FIZZ+BUZZ;
        }else if(n%3==0){
            return FIZZ;
        }else if(n%5==0){
            return BUZZ;
        }
        return String.valueOf(n);
    }
}
