package com.thehobbit.game.view.titlescreen.menu;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

/**
 * Created by mintal on 17/05/2017.
 */
public class TitleScreenMenu extends VBox {

    public ArrayList<TitleScreenMenuItem> menuItems;

    public TitleScreenMenu(){
        this.menuItems = new ArrayList<>();
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: rgba(0,0,0,0.2)");
        this.setMinWidth(400.00);
    }

    public ArrayList<TitleScreenMenuItem> getMenuItems() {
        return menuItems;
    }

    public void generateMenuItems(){
        this.getChildren().addAll(this.getMenuItems());
    }

}
