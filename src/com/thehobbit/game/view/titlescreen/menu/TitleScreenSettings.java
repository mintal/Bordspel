package com.thehobbit.game.view.titlescreen.menu;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by mintal on 18/05/2017.
 */
public class TitleScreenSettings extends TitleScreenMenu {

    public TitleScreenSettings(){
        super();
        this.menuItems.add(createFullScreenItem());
        this.generateMenuItems();
    }

    private TitleScreenMenuItem createFullScreenItem(){
        TitleScreenMenuItem item = new TitleScreenMenuItem("display",event -> {
            Stage stage = (Stage) this.getScene().getWindow();
            stage.setFullScreen(!stage.isFullScreen());
        });
        return item;
    }

}
