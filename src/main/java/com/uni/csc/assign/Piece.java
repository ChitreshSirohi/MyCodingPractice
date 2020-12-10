package com.uni.csc.assign;

public class Piece {
    public String Name, Colour, Position;

    public Piece(){};

    public Piece(String Name, String Colour, String Position){
        this.Name = Name;
        this.Colour = Colour;
        this.Position = Position;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setColour(String Colour){
        this.Colour = Colour;
    }
    public void setPosition(String Position){
        this.Position = Position;
    }
    public String getName(){
        return Name;
    }
    public String getColour(){
        return Colour;
    }
    public String getPosition(){
        return Position;
    }

    public String toString(){
        return ("Name: "+Name+"\nColour: "+"\nPosition");
    }
}
