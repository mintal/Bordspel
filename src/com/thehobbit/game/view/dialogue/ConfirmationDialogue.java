package com.thehobbit.game.view.dialogue;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

/**
 * Created by mintal on 17/05/2017.
 */
public class ConfirmationDialogue {

    public ConfirmationDialogue(String title, String header, String context){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(context);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
           System.exit(0);
        }
    }

}
