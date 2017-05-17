package com.thehobbit.game.model.player;

import java.util.ArrayList;

/**
 * Created by mintal on 17/05/2017.
 */
public class PlayerList {
    private ArrayList<Player> playerList;

    public PlayerList(){
        this.playerList = new ArrayList<>();
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void addPlayers(Player... players) {
        if(players.length + this.playerList.size() < 4) {
            for (Player p : players) {
                this.playerList.add(p);
            }
        } else {
            System.err.println("Not enough space for more players than 4");
        }
    }
}
