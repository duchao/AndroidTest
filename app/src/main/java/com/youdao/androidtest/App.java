package com.youdao.androidtest;

import android.app.Application;

/**
 * Created by duchao on 2017/8/12.
 */

public class App extends Application {
    public static MetaConfig metaConfig;
    @Override
    public void onCreate() {
        super.onCreate();
        metaConfig = metaConfig.readFromManifest(this);
    }

    public static MetaConfig getMetaConfig() {
        return metaConfig;
    }
}
