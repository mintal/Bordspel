package com.thehobbit.game.Temp;

/**
 * Created by tobie on 24/05/2017.
 */
public abstract class Tile {
    int position;

    public void Tile(int position){
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
