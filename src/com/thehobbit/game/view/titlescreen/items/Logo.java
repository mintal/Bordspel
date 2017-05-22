package com.thehobbit.game.view.titlescreen.items;

import com.thehobbit.game.controller.MenuItemController;
import com.thehobbit.game.model.Configuration;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by mintal on 22/05/2017.
 */
public class Logo extends  MenuItem {
    public Logo(MenuItemController controller) {
        super(new ImageView(new Image(Configuration.logoLocation.toExternalForm())), controller);
    }
}
