package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import javafx.scene.input.MouseEvent;

/**
 * Created by mintal on 22/05/2017.
 */
public class HostGame extends MenuItem {

    public HostGame(MenuItemController controller) {
        super("host game", controller);
    }

    void handleClickAction(MouseEvent mouseEvent) {
        super.handleClickAction(mouseEvent);
        //com.thehobbit.game.controller.handleBackButton();
    }


}
