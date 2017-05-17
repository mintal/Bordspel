package com.thehobbit.game.view.titlescreen;

import javafx.scene.layout.BorderPane;

/**
 * Created by mintal on 17/05/2017.
 */
public class TitleScreenUI extends BorderPane {

    public TitleScreenUI(){
        this.setRight(new TitleScreenMenu());
    }

}
