package com.thehobbit.game.view.titlescreen;

import com.thehobbit.game.controller.MenuItemController;
import com.thehobbit.game.view.titlescreen.items.Logo;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import com.thehobbit.game.view.titlescreen.items.MenuItem;
import com.thehobbit.game.view.titlescreen.menus.MenuInterface;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by mintal on 22/05/2017.
 */
public class Menu extends VBox implements MenuInterface {


    private ArrayList<MenuItem> menuItems;

    public Menu(){
        this.menuItems = new ArrayList<>();
        this.menuItems.addAll(menuItems);
        this.setMinSize(477, Window.HEIGHT);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: rgba(0,0,0,0.3);");
    }

    /**
     * adds all the menuItems as children to this object
     */

    public void update(){
        this.getChildren().addAll(menuItems);
    }

    /**
     *
     * @param menu
     * @param controller
     *
     * sets the menu to the given menu parameter
     */

    public void setMenu(Collection<MenuItem> menu, MenuItemController controller) {
        clear();
        Logo logo = new Logo(controller);
        this.menuItems.add(logo);
        this.menuItems.addAll(menu);
        update();

    }

    /**
     * Clears menuItems and the children of this object
     */

    public void clear(){
        this.getChildren().clear();
        this.menuItems.clear();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }




}
