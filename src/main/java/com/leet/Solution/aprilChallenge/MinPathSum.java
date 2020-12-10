package com.leet.Solution.aprilChallenge;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int ctr1 = grid.length;
        int ctr2 = grid[0].length;

        int[][] dp = new int[ctr1][ctr2];
        dp[0][0] = grid[0][0];

        // initialize top row
        for (int i = 1; i < ctr2; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        // initialize left column
        for (int j = 1; j < ctr1; j++) {
            dp[j][0] = dp[j - 1][0] + grid[j][0];
        }

        // fill up the dp table
        for (int i = 1; i < ctr1; i++) {
            for (int j = 1; j < ctr2; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                }
            }
        }

        return dp[ctr1 - 1][ctr2 - 1];
    }
}
