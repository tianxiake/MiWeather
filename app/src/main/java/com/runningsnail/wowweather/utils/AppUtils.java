package com.runningsnail.wowweather.utils;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class AppUtils {

    public static void hiddenStatusBar(Activity activity) {
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public static void showStatusBar(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public static void hiddenNavagationBar(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        View decorView = window.getDecorView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            int visibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(visibility & ~View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    public static void showNavagationBar(Activity activity) {
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    public static void setStatusBarColor(int color) {

    }

    public static void setStatusBarColor(Color color) {

    }

    public static void setNavagationBarColor(int color) {

    }

    public static void setNavagationBarColor(Color color) {

    }

}
