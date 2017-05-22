package com.thehobbit.game;

import com.thehobbit.game.controller.MenuItemController;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import com.thehobbit.game.model.Configuration;
import com.thehobbit.game.util.UtilLogger;
import com.thehobbit.game.view.titlescreen.TitleScreenScene;

import java.util.logging.Level;

/**
 * Created by mintal on 22/05/2017.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        UtilLogger.log.setLevel(Level.INFO); //set to Level.INFO for debugging, otherwise Level.SEVERE

        Font.loadFont(Configuration.fontLocation.toExternalForm(),32.0);
        UtilLogger.log.info("Loaded custom font");

        StackPane root = new StackPane();
        root.setPrefSize(1280,720);

        MenuItemController controller = new MenuItemController();
        controller.loadStage(primaryStage);
        UtilLogger.log.info("loaded stage");

        TitleScreenScene scene = new TitleScreenScene(root,controller);
        primaryStage.setScene(scene);

        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
