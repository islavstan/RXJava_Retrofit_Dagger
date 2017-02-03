package com.islavstan.myrxdaggerapp;

import android.app.Application;

import com.islavstan.myrxdaggerapp.deps.DaggerDeps;
import com.islavstan.myrxdaggerapp.deps.Deps;



public class App extends Application {

    private static Deps component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDeps.create();
    }

    public static Deps getComponent() {
        return component;
    }

}

