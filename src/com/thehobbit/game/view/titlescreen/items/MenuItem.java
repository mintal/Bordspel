package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import com.thehobbit.game.util.UtilLogger;


/**
 * Created by mintal on 22/05/2017.
 */
public class MenuItem extends StackPane {

    String name;
    MenuItemController controller;

    public MenuItem(String name, MenuItemController controller){
        Label label = new Label(name);
        this.controller = controller;
        label.setFont(new Font("Ringbearer Medium",60));
        label.setTextFill(Color.WHITE);
        this.name = name;
        this.setAlignment(label, Pos.CENTER);
        this.getChildren().add(label);
        this.setOnMouseClicked(this::handleClickAction);
    }

    public MenuItem(Node node, MenuItemController controller) {
        this.controller = controller;
        this.name = node.toString();

        this.setHeight(178.00);

        this.setAlignment(node, Pos.TOP_CENTER);
        this.getChildren().add(node);
        this.setOnMouseClicked(this::handleClickAction);
    }

    /**
     *
     * @param mouseEvent
     * Handles the default action when clicking a menu item
     */

    void handleClickAction(MouseEvent mouseEvent) {
        UtilLogger.log.info("Clicked on menu item: " + this.name + "[" +mouseEvent.getX() + ","+ mouseEvent.getY() + "]");
    }

}
