package com.leet.Solution.aprilChallenge;

import java.util.*;

public class LeftMostColumn {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        final List<Integer> dimensions = BinaryMatrix.dimensions();
        int rows = dimensions.get(0); // m
        int cols = dimensions.get(1); // n
        int lastGoodRow = -1;
        for(int n=cols-1,m =0; n >= 0 && m<= rows-1;){
            int val = BinaryMatrix.get(m,n);
            if(val == 1){
                lastGoodRow = n;
                n--;
            }else {
                m++;
            }
        }
        return lastGoodRow;
    }
}

interface BinaryMatrix {
     public static int get(int rows, int cols){
         //int[][] mat = new int[][]{{0,0,0,1},{0,0,1,1},{0,1,1,1}};
         int[][] mat = new int[][]{{0,1,1,1},{0,0,1,1},{0,0,1,1}};
         System.out.println();
         return mat[rows][cols];
     }
      public static List<Integer> dimensions(){
          ArrayList<Integer> list = new ArrayList();
          int col = 4;
          int rows = 3;
          list.add(rows);
          list.add(col);

          return list;
      };
  };
