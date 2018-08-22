package com.m.freiendslocator;

import android.app.Application;

import com.backendless.Backendless;

public class BackendApplication extends Application {
    public  static  final String APPLICATION_ID ="XXXXXXXXXXXX";
    public static final String API_KEY ="XXXXXXXXXXXXXXXXXXXXXXX";
    public static  final String  SERVER_URL="https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID,API_KEY);
    }
}
