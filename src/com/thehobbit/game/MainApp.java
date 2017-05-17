package com.thehobbit.game;/**
 * Created by mintal on 10/05/2017.
 */

import com.thehobbit.game.view.titlescreen.TitleScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        TitleScreen titleScreen = new TitleScreen();
        Scene scene = new Scene(titleScreen);

        primaryStage.setMinWidth(1280);
        primaryStage.setMinHeight(720);

        primaryStage.setMaxWidth(1920);
        primaryStage.setMaxHeight(1080);
        System.err.println("Loading scene.");
        primaryStage.setScene(scene);
        System.err.println("Finished Loading scene, showing screen.");
        primaryStage.show();
    }
}
