package com.thehobbit.game.model;

import com.thehobbit.game.MainApp;

import java.net.URL;

/**
 * Created by mintal on 22/05/2017.
 */
public class Configuration {

    public static final URL fontLocation = MainApp.class.getResource("resources/fonts/ringbearer.TTF");
    public static URL videoLocation = MainApp.class.getResource("resources/videos/title_screen.mp4");
    public static URL audioLocation = MainApp.class.getResource("resources/audio/main_theme.mp3");
    public static URL logoLocation = MainApp.class.getResource("resources/images/logo.png");
}
