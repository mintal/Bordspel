package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import javafx.scene.input.MouseEvent;

/**
 * Created by mintal on 22/05/2017.
 */
public class Settings extends MenuItem {

    public Settings(MenuItemController controller) {
        super("settings", controller);
    }

    void handleClickAction(MouseEvent event){
        super.handleClickAction(event);
        controller.handleSettingsButton();
    }

}
