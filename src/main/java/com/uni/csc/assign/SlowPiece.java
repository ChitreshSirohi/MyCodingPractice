package com.uni.csc.assign;

public class SlowPiece extends Piece{

    public SlowPiece(){};

    public SlowPiece(String Name, String Colour, String Position){
        super(Name,Colour,Position);
    }
    public void moveLeft(int x, int y, int Space, String[][] arr){
        arr[x-1][y-1-Space] = arr[x-1][y-1];
        String moved;

    }
    public String moveRight(int x, int y, int Space, String[][] arr){
        arr[x-1][y-1+Space] = arr[x-1][y-1];
        String moved = arr[x-1][y-1+Space];
        return moved;
    }







}
