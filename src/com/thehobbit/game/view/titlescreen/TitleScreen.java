package com.thehobbit.game.view.titlescreen;

import javafx.scene.layout.StackPane;

/**
 * Created by mintal on 17/05/2017.
 */
public class TitleScreen extends StackPane {

    public TitleScreen(){
        TitleScreenUI userInterface = new TitleScreenUI();
        TitleScreenMediaPlayer screenBackground = new TitleScreenMediaPlayer("resources/videos/title_screen.mp4");
        TitleScreenMediaPlayer audioBackground = new TitleScreenMediaPlayer("resources/audio/main_theme.mp3");


        this.getChildren().addAll(screenBackground,audioBackground,userInterface);
        this.setMinSize(1280,720);
        this.setMaxSize(1920,1080);
    }

}
