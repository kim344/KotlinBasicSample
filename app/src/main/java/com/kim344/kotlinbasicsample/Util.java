package com.kim344.kotlinbasicsample;

import android.app.Activity;
import android.content.Intent;

public class Util {
    private static int sTheme;
    public final static int APP_THEME = 0;
    public final static int DIM_THEME = 1;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case APP_THEME:
                activity.setTheme(R.style.AppTheme);
                break;
            case DIM_THEME:
                activity.setTheme(R.style.DimTheme);
                break;
        }
    }
}
