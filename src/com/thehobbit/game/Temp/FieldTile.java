package com.thehobbit.game.Temp;

/**
 * Created by tobie on 24/05/2017.
 */
public class FieldTile extends Tile {
    int position;
    int[] coordinates = new array[2];
    boolean isFull;
    boolean hasEffect;
    enum Kind {ADVENTURE, DICE, RIVENDALE, VALE}
    Kind kind;


    public void FieldTile(int position, int[] coordiantes, boolean isFull, boolean hasEffect, Kind kind){
        this.position = position;
        this.coordinates = coordiantes;
        this.isFull = isFull;
        this.hasEffect = hasEffect;
        this.kind = kind;
    }

    public int[] getCoordinates() {
        return coordinates;
    }
    public void setFull(boolean full) {
        this.isFull = full;
    }
    public boolean getFull(){
        return this.isFull;
    }
    public void setHasEffect(boolean hasEffect) {
        this.hasEffect = hasEffect;
    }
    public boolean getHasEffect(){
        return this.hasEffect;
    }
    public Kind getKind() {
        return this.kind;
    }
}
