package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import javafx.scene.input.MouseEvent;

/**
 * Created by mintal on 22/05/2017.
 */
public class Back extends MenuItem {

    public Back(MenuItemController controller) {
        super("back", controller);
    }

    void handleClickAction(MouseEvent mouseEvent) {
        super.handleClickAction(mouseEvent);
        controller.handleBackButton();
    }


}
