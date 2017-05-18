package com.thehobbit.game.view.titlescreen.menu;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Created by mintal on 17/05/2017.
 */
public class TitleScreenMenuItem extends StackPane {

    private String name;
    private EventHandler onMouseClicked;
    private double size = 72.0;

    public TitleScreenMenuItem(String name, EventHandler onMouseClicked){
        this.name = name;
        this.onMouseClicked = onMouseClicked;

        Label label = new Label(this.name);
        label.setAlignment(Pos.CENTER);
        label.setContentDisplay(ContentDisplay.CENTER);
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Ringbearer Medium",this.size)); //to-do: add correct family font

        this.setOnMouseClicked(this.onMouseClicked);
        this.getChildren().add(label);

        this.setPadding(new Insets(10,10,10,10));

        this.setAlignment(Pos.CENTER);
    }

    public TitleScreenMenuItem(String name, EventHandler onMouseClicked, int size){
        this.name = name;
        this.onMouseClicked = onMouseClicked;
        this.size = size;

        Label label = new Label(this.name);
        label.setAlignment(Pos.CENTER);
        label.setContentDisplay(ContentDisplay.CENTER);
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Ringbearer Medium",this.size)); //to-do: add correct family font

        this.setOnMouseClicked(this.onMouseClicked);
        this.getChildren().add(label);

        this.setPadding(new Insets(10,10,10,10));

        this.setAlignment(Pos.CENTER);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOnClicked(EventHandler onMouseClicked) {
        this.onMouseClicked = onMouseClicked;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
