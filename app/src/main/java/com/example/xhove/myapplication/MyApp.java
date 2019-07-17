package com.example.xhove.myapplication;

import android.app.Application;
import android.os.Debug;
import android.support.v4.os.TraceCompat;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TraceCompat.beginSection(" start ");
        Debug.startMethodTracing();
    }
}
