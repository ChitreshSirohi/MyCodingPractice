package com.leet.Solution.aprilChallenge;

import java.util.Stack;

public class ValidParenthesis {


    public boolean checkValidString(String s) {
        Stack<Integer> parenthesisStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        if(s.isEmpty()){
            return true;
        }
        if(s.length() == 1){
            return '*' == s.charAt(0);
        }
        if(')' == s.charAt(0)){
            return false;
        }


        for(int ctr=0; ctr < s.length();ctr++){
            if('(' == s.charAt(ctr)){
                parenthesisStack.push(ctr);
            }else if(')' == s.charAt(ctr)){
                if(parenthesisStack.isEmpty()){
                    if (starStack.isEmpty()){
                        return false;
                    }
                    starStack.pop();
                }else {
                    parenthesisStack.pop();
                }
            }else if('*' == s.charAt(ctr)){
                starStack.push(ctr);
            }
        }
        if(parenthesisStack.isEmpty()){
            return true;
        }
        while (!parenthesisStack.isEmpty()){
            if(starStack.isEmpty()){
                return false;
            }
            if(parenthesisStack.peek() < starStack.peek()){
                parenthesisStack.pop();
                starStack.pop();
                continue;
            }
            return false;
        }
        return true;

    }

}
