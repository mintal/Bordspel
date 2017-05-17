package com.thehobbit.game;/**
 * Created by mintal on 10/05/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainApp_old extends Application implements Initializable {

    public static void main(String[] args) {
        launch(args);
    }

        @FXML
        private Pane path_1;
        private Circle player;

        @Override
        public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
            assert path_1 != null;

            player = new Circle(10, Color.ALICEBLUE);

            player.setLayoutX(path_1.getChildren().get(0).getLayoutX() + player.getRadius());
            player.setLayoutY(path_1.getChildren().get(0).getLayoutY() + player.getRadius());

        path_1.getChildren().add(player);

        for (int i = 0; i < path_1.getChildren().size(); i++) {
            int finalI = i;
            path_1.getChildren().get(i).setOnMouseClicked(event -> {
                player.setLayoutX(path_1.getChildren().get(finalI).getLayoutX() + player.getRadius());
                player.setLayoutY(path_1.getChildren().get(finalI).getLayoutY() + player.getRadius());
            });
        }
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Pane root = FXMLLoader.load(getClass().getResource("resources/fxml/main.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("FXML TEST");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
