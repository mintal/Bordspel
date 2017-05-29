package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import javafx.scene.input.MouseEvent;

/**
 * Created by mintal on 22/05/2017.
 */
public class FullScreen extends MenuItem {

    public FullScreen(MenuItemController controller) {
        super("fullscreen", controller);
    }

    void handleClickAction(MouseEvent mouseEvent) {
        super.handleClickAction(mouseEvent);
        controller.handleFullScreenButton();
    }


}
