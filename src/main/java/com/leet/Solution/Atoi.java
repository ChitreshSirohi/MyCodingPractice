package com.leet.Solution;

public class Atoi {
    public int myAtoi(String str) {
        final char[] chars = str.trim().toCharArray();
        final boolean plus;
        final StringBuilder stringBuffer = new StringBuilder();
        if(chars.length > 0){
            int ctr=0;
            plus = chars[0] != 45;
            if(chars[0] == 45 || chars[0] == 43){
                ctr=1;
                if(chars.length == 1){
                    return 0;
                }
            }else if(chars[0] > 57 || chars[0] < 48){
                return 0;
            }

            for (;ctr<chars.length;ctr++) {
                if(chars[ctr] == 48 && stringBuffer.length() == 0){
                    continue;
                }
                if(chars[ctr] <= 57 && chars[ctr] >= 48){
                    stringBuffer.append(chars[ctr]);
                }else {
                    break;
                }
            }
            if(stringBuffer.length() == 0){
                return 0;
            }
            if(stringBuffer.length() > 10){
                return plus ?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }else {
                final String signedNumber = (plus ? "" : "-") + stringBuffer.toString();
                if(stringBuffer.length() < 10){
                    return Integer.parseInt(signedNumber);
                }else {
                    final long num = Long.parseLong(signedNumber);
                    if(plus){
                        if(num > Integer.MAX_VALUE){
                            return Integer.MAX_VALUE;
                        }
                        return (int)num;
                    }else {
                        if (num < Integer.MIN_VALUE){
                            return Integer.MIN_VALUE;
                        }
                        return (int)num;
                    }
                }
            }
        }
        return 0;
    }
}
