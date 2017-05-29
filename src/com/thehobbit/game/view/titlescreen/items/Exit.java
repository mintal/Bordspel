package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import javafx.scene.input.MouseEvent;

/**
 * Created by mintal on 22/05/2017.
 */
public class Exit extends MenuItem {

    public Exit(MenuItemController controller) {
        super("exit", controller);
    }

    void handleClickAction(MouseEvent mouseEvent) {
        super.handleClickAction(mouseEvent);
        controller.handleExitButton();
    }


}
