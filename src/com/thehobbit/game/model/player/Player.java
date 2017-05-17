package com.thehobbit.game.model.player;

import javafx.scene.paint.Color;

/**
 * Created by mintal on 17/05/2017.
 */
public class Player {

    private int playerNumber;
    private Color playerColor;

    private int playerLocation;
    private boolean isPlayerTurn;

    public Player(int playerNumber, Color playerColor, int playerLocation) {
        this.playerNumber = playerNumber;
        this.playerColor = playerColor;
        this.playerLocation = playerLocation;
    }


    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        isPlayerTurn = playerTurn;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
