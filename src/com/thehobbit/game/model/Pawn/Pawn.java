package com.thehobbit.game.model.Pawn;

/**
 * Created by tobie on 24/05/2017.
 */
public class Pawn {
    int position;
    String color;
    boolean isCaptured;


    public void Pawn(int position, String color, boolean isCaptured){
        this.position = position;
        this.isCaptured = isCaptured;
        this.color = color;
    }

    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return position;
    }
    public void setCaptured(boolean isCaptured){
        this.isCaptured = isCaptured;
    }
    public boolean getCaptured(){
        return isCaptured;
    }
    public String getColor(){
        return color;
    }
}
