package com.leet.Solution.JulyChallenge;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        int totRows = grid.length;
        int totCols = grid[0].length;
        for (int row=0;row < grid.length;row++) {
            for (int col=0;col < grid[row].length;col++){
                if(grid[row][col] == 1){
                    if( col-1 < 0){
                        perimeter++;
                    }else if(grid[row][col-1] == 0){
                        perimeter++;
                    }
                    if( col+1 == totCols){
                        perimeter++;
                    }else if(grid[row][col+1] == 0){
                        perimeter++;
                    }
                    if( row-1 < 0){
                        perimeter++;
                    }else if(grid[row-1][col] == 0){
                        perimeter++;
                    }
                    if( row+1 == totRows){
                        perimeter++;
                    }else if(grid[row+1][col] == 0){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
