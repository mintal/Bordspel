package com.thehobbit.game.view.titlescreen;

import com.thehobbit.game.MainApp;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;

/**
 * Created by mintal on 17/05/2017.
 */
public class ViewMediaPlayer extends Pane {

    public ViewMediaPlayer(String source){

        URL src = MainApp.class.getResource(source);
        Media media = new Media(src.toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.fitWidthProperty().bind(this.widthProperty());

        this.getChildren().add(mediaView);
    }

}
