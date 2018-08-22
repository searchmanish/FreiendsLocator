package com.m.freiendslocator;

import android.app.Application;

import com.backendless.Backendless;

public class BackendApplication extends Application {
    public  static  final String APPLICATION_ID ="702166DB-6E0B-0D9A-FFEB-04F6052F0600";
    public static final String API_KEY ="B1BE0748-D85B-2206-FF4B-A6403EBAA400";
    public static  final String  SERVER_URL="https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID,API_KEY);
    }
}
