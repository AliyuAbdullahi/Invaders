package com.invaders.game.screen;

/**
 * Created by aliyuabdullahi on 9/6/16.
 */
public class ScreenManager {
    private static Screen currentScreen;

    public static void setScreen(Screen screen) {
        if (currentScreen != null)
            currentScreen.dispose();
        currentScreen = screen;
        currentScreen.create();
    }

    public static Screen getCurrentScreen() {
        return currentScreen;
    }
}
