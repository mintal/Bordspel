package com.thehobbit.game.controller;

import javafx.stage.Stage;
import com.thehobbit.game.util.UtilLogger;
import com.thehobbit.game.view.titlescreen.Menu;
import com.thehobbit.game.view.titlescreen.items.MenuItem;
import com.thehobbit.game.view.titlescreen.menus.MenuInterface;

import java.util.ArrayList;

/**
 * Created by mintal on 22/05/2017.
 */
public class MenuItemController {

    Stage stage;
    ArrayList<MenuInterface> menus;
    Menu menu;
    ArrayList<MenuItem> homeMenu, settingsMenu;


    public MenuItemController() {
        this.menus = new ArrayList<>();
    }

    public void loadMainMenu(Menu menu) {
        this.menu = menu;
    }

    public void loadMenus(MenuInterface... menu) {
        for(MenuInterface m : menu) {
            this.menus.add(m);
        }
    }

    public void start(){
        this.homeMenu = this.menus.get(0).getMenuItems();
        this.settingsMenu = this.menus.get(1).getMenuItems();
        this.menu.setMenu(this.homeMenu,this);
        UtilLogger.log.info("Initialized menus in com.thehobbit.game.controller.");
    }

    public void handleBackButton() {
        this.menu.setMenu(this.homeMenu, this);
    }

    public void handleSettingsButton(){
        this.menu.setMenu(this.settingsMenu,this);
    }


    public void handleExitButton() {
        System.exit(0);
    }

    public void handleFullScreenButton() {
        this.stage.setFullScreen(!this.stage.isFullScreen());
    }

    public void loadStage(Stage primaryStage) {
        this.stage = primaryStage;
    }
}
