package com.youdao.androidtest;

import android.content.Context;

import java.util.Properties;

/**
 * Created by duchao on 2017/8/12.
 */

public class FeatureConfig extends Properties {
    /**
     *
     */
    private static final long serialVersionUID = 2372045762394344683L;

    private Context mContext;
    public boolean mEnableNOS = false;
    public boolean mAppUpdate = false;
    public boolean mAd = false;
    public boolean mSplash = false;

    public FeatureConfig(Context context) {
        mContext = context;
        initValue();
    }

    private void initValue() {
        if (BuildConfig.DEBUG) {
        } else {
            mEnableNOS = BuildConfig.isEnableNos;
            mAppUpdate = BuildConfig.isEnableKeyAppUpdate;
            mSplash = BuildConfig.isEnableKeySplash;
            mAd = BuildConfig.isEnableKeyAd;
        }
    }

    private void initDefaultValues() {
        mEnableNOS = false;
        mAppUpdate = false;
        mAd = false;
        mSplash = false;
    }
}

