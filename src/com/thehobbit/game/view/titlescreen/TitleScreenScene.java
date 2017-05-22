package com.thehobbit.game.view.titlescreen;

import com.thehobbit.game.controller.MenuItemController;
import com.thehobbit.game.view.titlescreen.items.Logo;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import com.thehobbit.game.model.Configuration;
import com.thehobbit.game.util.UtilLogger;
import com.thehobbit.game.view.titlescreen.media.PlayMedia;
import com.thehobbit.game.view.titlescreen.menus.Home;
import com.thehobbit.game.view.titlescreen.menus.Settings;

/**
 * Created by mintal on 22/05/2017.
 */
public class TitleScreenScene extends Scene{

    public TitleScreenScene(StackPane root, MenuItemController controller) {
        super(root);

        Menu menu = new Menu();

        Settings settings = new Settings(controller);
        Home home = new Home(controller);
        UtilLogger.log.info("Loading menu's into com.thehobbit.game.controller.");
        controller.loadMainMenu(menu);//Loads the main menu into the controller
        controller.loadMenus(home,settings);//loads the other menus into the controller
        controller.start();//initializes the menus

        PlayMedia video = new PlayMedia(Configuration.videoLocation);//creates video object
        PlayMedia audio = new PlayMedia(Configuration.audioLocation);//creates audio object

        BorderPane interfaceLevel = new BorderPane();

        interfaceLevel.setRight(menu);

        root.getChildren().addAll(video,audio,interfaceLevel); //adding everything to the root

    }



}
