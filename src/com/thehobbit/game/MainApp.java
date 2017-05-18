package com.thehobbit.game;/**
 * Created by mintal on 10/05/2017.
 */

import com.thehobbit.game.view.FPSCounter;
import com.thehobbit.game.view.titlescreen.TitleScreen;
import javafx.application.Application;
import javafx.geometry.Pos;
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
        FPSCounter fpsCounter = new FPSCounter();
        titleScreen.getChildren().add(fpsCounter);
        titleScreen.setAlignment(fpsCounter,Pos.TOP_LEFT);
        primaryStage.setResizable(false);
        System.err.println("Loading scene.");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        System.err.println("Finished Loading scene, showing screen.");
        primaryStage.show();
    }
}
