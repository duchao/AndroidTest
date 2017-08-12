package com.youdao.androidtest;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * Created by duchao on 2017/8/12.
 */

public class MetaConfig {
    public boolean mIsDebug = false;
    public String mVendor = "undefined";
    public boolean mCheckBundle = false;
    public boolean mIncludeVendorLogo = false;
    public String mUmengChannel = "undefined";

    public static MetaConfig readFromManifest(Context context) {
        MetaConfig config = new MetaConfig();
        ApplicationInfo appInfo = null;
        try {
            appInfo = context.getPackageManager().getApplicationInfo(
                    context.getPackageName(), PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
            config.mIsDebug = appInfo.metaData.getBoolean("debug", false);
            config.mCheckBundle = appInfo.metaData.getBoolean("check_bundle", false);
            config.mVendor = appInfo.metaData.getString("vendor");
            config.mUmengChannel = appInfo.metaData.getString("UMENG_CHANNEL");

        return config;
    }

}
