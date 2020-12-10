package com.leet.Solution.aprilChallenge;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }
        int[][] dup = new int[matrix.length + 1][matrix[0].length + 1];
        final int tempRow = 0;
        for (int ctr = 0; ctr < dup[tempRow].length; ctr++) {
            dup[tempRow][ctr] = 0;
        }
        final int tempCol = 0;
        for (int ctr = 0; ctr < dup.length; ctr++) {
            dup[tempCol][ctr] = 0;
        }
        int maxLast = 0;
        for (int row = 1; row < dup[0].length; row++) {
            for (int col = 1; col < dup.length; col++) {
                if (row == 1 || col == 1) {
                    dup[row][col] = matrix[row - 1][col - 1];
                    continue;
                }
                if (matrix[row - 1][col - 1] == '1') {
                    dup[row][col] = 1 + Math.min(Math.min(dup[row - 1][col], dup[row][col - 1]), dup[row - 1][col - 1]);
                    if (dup[row][col] > maxLast) {
                        maxLast = dup[row][col];
                    }
                }
            }
        }
        return maxLast*maxLast;
    }
}


