package com.leet.Solution.amazon;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class NumberAmazonTreasureTrucks
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int numberAmazonTreasureTrucks(char[][] grid){

        //boolean[][] visitedArray = new boolean[grid.length][grid[0].length];
        int rows=grid.length;
        int cols=grid[0].length;
        int noOfIslands=0;
        for (int row=0;row<rows;row++){
            for (int col=0;col<cols;col++){
                if(grid[row][col]=='1'){
                    dfs(grid,row,col,rows,cols);
                    noOfIslands++;
                }
            }
        }


 
    return noOfIslands;
}
    private boolean isWithinBoundaryAndValid(char[][] grid, int row, int col ){
        if(row < 0 || grid.length <= row){
            return false;
        }else if (col < 0 || grid[0].length <= col ){
            return false;
        }
        if(grid[row][col] != '1'){
            return false;
        }
        return true;
    }

    private void dfs(char[][] grid,int row,int col,int rows, int cols ){
        if(isWithinBoundaryAndValid(grid,row,col)){
            grid[row][col]='X';
            dfs( grid, row+1, col, rows, cols);
            dfs( grid, row-1, col, rows, cols);
            dfs( grid, row, col+1, rows, cols);
            dfs( grid, row, col-1, rows, cols);
        }
    }


}