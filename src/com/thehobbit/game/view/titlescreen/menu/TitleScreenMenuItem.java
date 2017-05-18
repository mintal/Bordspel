package com.thehobbit.game.view.titlescreen;

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

    public TitleScreenMenuItem(String name, EventHandler onMouseClicked){
        Label label = new Label(name);
        label.setAlignment(Pos.CENTER);
        label.setContentDisplay(ContentDisplay.CENTER);
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Ringbearer Medium",72.0)); //to-do: add correct family font

        this.setOnMouseClicked(onMouseClicked);
        this.getChildren().add(label);

        this.setPadding(new Insets(10,10,10,10));

        this.setAlignment(Pos.CENTER);
    }

    public TitleScreenMenuItem(String name, EventHandler onMouseClicked, int size){
        Label label = new Label(name);
        label.setAlignment(Pos.CENTER);
        label.setContentDisplay(ContentDisplay.CENTER);
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Ringbearer Medium",size)); //to-do: add correct family font

        this.setOnMouseClicked(onMouseClicked);
        this.getChildren().add(label);

        this.setPadding(new Insets(10,10,10,10));

        this.setAlignment(Pos.CENTER);
    }

}
