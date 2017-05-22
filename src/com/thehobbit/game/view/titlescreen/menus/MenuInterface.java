package com.thehobbit.game.view.titlescreen.menus;

import com.thehobbit.game.controller.MenuItemController;
import com.thehobbit.game.view.titlescreen.items.MenuItem;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by mintal on 22/05/2017.
 */
public interface MenuInterface {

    ArrayList<MenuItem> getMenuItems();

    void clear();
    void update();

    }
