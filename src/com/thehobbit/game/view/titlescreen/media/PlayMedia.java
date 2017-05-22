package com.thehobbit.game.view.titlescreen.media;

import com.thehobbit.game.view.titlescreen.TitleScreenScene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;

/**
 * Created by mintal on 22/05/2017.
 */
public class PlayMedia extends Pane {


    public PlayMedia(URL url) {
        Media media = new Media(url.toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.fitWidthProperty().bind(this.widthProperty());
        this.getChildren().add(mediaView);
    }

}
