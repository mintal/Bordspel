package com.thehobbit.game.view.titlescreen;

import com.thehobbit.game.view.titlescreen.menu.TitleScreenSettings;
import javafx.scene.layout.BorderPane;

/**
 * Created by mintal on 17/05/2017.
 */
public class TitleScreenUI extends BorderPane {

    public TitleScreenUI() {
        this.setRight(new TitleScreenSettings());
    }

}
