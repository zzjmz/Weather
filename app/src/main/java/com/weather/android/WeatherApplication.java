package com.weather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class WeatherApplication extends Application {
    public static  final String TOKEN = "kecbuhDaNTrlueAW";
    @SuppressLint("StaticFieldLeak")
    static public Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context =getApplicationContext();
    }
}
