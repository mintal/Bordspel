package com.thehobbit.game.view.titlescreen;

import com.thehobbit.game.view.dialogue.ConfirmationDialogue;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by mintal on 17/05/2017.
 */
public class TitleScreenMenu extends VBox {

    public TitleScreenMenu(){
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: rgba(0,0,0,0.2)");
        this.setMinWidth(400.00);
        mainMenu();
    }

    private void mainMenu(){
        this.getChildren().clear();

        TitleScreenMenuItem hostGame = new TitleScreenMenuItem("Host Game", event -> {
            System.out.println("clicked host game.");
        });

        TitleScreenMenuItem joinGame = new TitleScreenMenuItem("Join Game", event -> {
            System.out.println("clicked join game.");
        });

        TitleScreenMenuItem settings = new TitleScreenMenuItem("Settings", event -> {
            System.out.println("switching to settings.");
            settingsMenu();
        });

        TitleScreenMenuItem exitGame = new TitleScreenMenuItem("Exit", event -> {
            this.getChildren().add(new ConfirmationDialogue("Exit","are you sure you want to exit?", event1 -> System.exit(0)));
        });

        this.getChildren().addAll(hostGame,joinGame,settings,exitGame);
    }

    private void settingsMenu(){
        this.getChildren().clear();

        TitleScreenMenuItem fullscreen = new TitleScreenMenuItem("Displaymode", event -> {
            Stage stage = (Stage) this.getScene().getWindow();
            stage.setFullScreen(!stage.isFullScreen());
        }, 64);

        TitleScreenMenuItem back = new TitleScreenMenuItem("Back", event -> {
            System.out.println("switching to main menu.");
           mainMenu();
        });

        this.getChildren().addAll(fullscreen,back);

    }
}
