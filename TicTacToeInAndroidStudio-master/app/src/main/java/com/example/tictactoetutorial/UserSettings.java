package com.example.tictactoetutorial;

import android.app.Application;

public class UserSettings extends Application {

    public static final String PREFERENCES = "prefrences";
    public static final String Custom_THEME = "CustomTHeme";
    public static final String DARK_THEME = "DarkTheme";
    public static final String LIGHT_THEME = "LightTheme";

    private String customTheme;

    public String getCustomTheme() {
        return customTheme;
    }

    public void setCustomTheme(String customTheme) {
        this.customTheme = customTheme;
    }
}
