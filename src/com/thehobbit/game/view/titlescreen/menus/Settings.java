package com.thehobbit.game.view.titlescreen.menus;

import com.thehobbit.game.controller.MenuItemController;
import com.thehobbit.game.view.titlescreen.items.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by mintal on 22/05/2017.
 */
public class Settings implements MenuInterface {

    ArrayList<MenuItem> menuItems;

    public Settings(MenuItemController controller) {
        this.menuItems = new ArrayList<>();
        this.menuItems.add(new FullScreen(controller));
        this.menuItems.add(new Back(controller));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void clear() {
        this.menuItems.clear();
    }

    public void update() {

    }

}
