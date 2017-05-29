package controller.title;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by mintal on 26/05/2017.
 */
public class MenuController implements Initializable {


    @FXML private Label hostGame;
    @FXML private Label joinGame;
    @FXML private Label settings;
    @FXML private Label exit;
    @FXML private Pane menuPane;
    @FXML private Pane menuPane2;

    Logger log = Logger.getLogger("logger");

    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML private void handleClickOnHostGame() {
        log.info("clicked host game");
        switchInterface("/fxml/title/interface/host.fxml");
    }

    @FXML private void handleClickOnJoinGame() {
        log.info("clicked join game");
        switchInterface("/fxml/title/interface/join.fxml");
    }

    @FXML private void handleClickOnSettings() {
        log.info("clicked settings");
        switchMenu("/fxml/title/menu/settings.fxml");
    }

    @FXML private void handleClickOnFullscreen(){
        log.info("clicked fullscreen");
        Stage stage = (Stage) menuPane.getScene().getWindow();
        stage.setFullScreen(!stage.isFullScreen());
    }

    @FXML private void handleClickOnBack() {
        log.info("clicked back");
        switchMenu("/fxml/title/menu/main.fxml");
    }

    private void switchInterface(String resource) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
        BorderPane temp = (BorderPane) menuPane.getParent();
        try {
            StackPane temp2 = loader.load();
            temp.setCenter(temp2);
            temp.setMargin(temp2,new Insets(150,30,150,30));
        } catch (Exception e) {
            log.warning("failed to set interface.");
        }
    }

    private void switchMenu(String resource) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
        BorderPane temp = (BorderPane) menuPane.getParent();
        try {
            temp.setRight(loader.load());
        } catch (Exception e) {
            log.warning("failed to set interface.");
        }
    }


    @FXML private void handleClickOnExit() {
        log.info("clicked exit");
        System.exit(0);
    }

}
