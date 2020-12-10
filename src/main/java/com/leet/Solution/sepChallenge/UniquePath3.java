package com.leet.Solution.sepChallenge;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UniquePath3 {
    int totalPath;
    int totalEdges;
    public int uniquePathsIII(int[][] grid) {
        int x=0,y=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 0){
                    this.totalEdges++;
                }else if(grid[i][j] == 1){
                    x=i;
                    y=j;
                }
            }
        }
        dfs(grid,x,y, this.totalEdges);
        return this.totalPath;
    }

    private void dfs(int[][] grid,int i, int j, int totalEdges){
        // boundary conditions
        if(i<0 || j < 0 || i> grid.length -1 || j>grid[0].length-1 || grid[i][j] == -1 || (grid[i][j] ==2 && totalEdges !=0) || grid[i][j]==99 ){
            return;
        }
        if(grid[i][j] == 2 && totalEdges==0){
            this.totalPath++;
        }
        if(grid[i][j] == 0){
            totalEdges--;
        }
        final int temp = grid[i][j];
        grid[i][j] = 99;

        dfs(grid,i-1,j,totalEdges);
        dfs(grid,i+1,j,totalEdges);
        dfs(grid,i,j+1,totalEdges);
        dfs(grid,i,j-1,totalEdges);
        grid[i][j]=temp;
    }
}
