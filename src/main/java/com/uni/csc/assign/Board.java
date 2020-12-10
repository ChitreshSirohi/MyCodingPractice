package com.uni.csc.assign;

import java.util.Arrays;

public class Board {
    public String[][] board;

    public Board(){}

    public Board(String[][] board){
        this.board = board;
    }
    public void setBoard(String[][] board){
        this.board = board;
    }
    public String[][] getBoard(){
        return board;
    }
    public void fill(String[][] arr){
        for(int i=0; i<8; i++){
            Arrays.fill(arr[i]," - ");
        }
    }

    public void display(String[][] arr){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

}
