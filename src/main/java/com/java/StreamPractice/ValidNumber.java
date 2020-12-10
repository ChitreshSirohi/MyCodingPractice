package com.java.StreamPractice;

public class ValidNumber {
    public boolean isNumber(String s) {

        if(!s.trim().toLowerCase().matches("[+-e\\d]*")){
            return false;
        }
        try{
            Double.valueOf(s.trim());
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
