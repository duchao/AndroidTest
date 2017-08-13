package com.youdao.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private MetaConfig metaConfig;
    private FeatureConfig featureConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metaConfig = App.getMetaConfig();
        featureConfig = App.getFeatureConfig();
        TextView textView = (TextView) findViewById(R.id.unmneg_channle_value);
        textView.setText(metaConfig.mUmengChannel);
        textView = (TextView) findViewById(R.id.vender_value);
        textView.setText(metaConfig.mVendor);
        textView = (TextView) findViewById(R.id.bundle_value);
        textView.setText(String.valueOf(metaConfig.mCheckBundle));
        textView = (TextView) findViewById(R.id.debug_value);
        textView.setText(String.valueOf(metaConfig.mIsDebug));
        textView = (TextView) findViewById(R.id.nos_value);
        textView.setText(String.valueOf(featureConfig.mEnableNOS));
        textView = (TextView) findViewById(R.id.ad_value);
        textView.setText(String.valueOf(featureConfig.mAd));
        textView = (TextView) findViewById(R.id.splash_value);
        textView.setText(String.valueOf(featureConfig.mSplash));
        textView = (TextView) findViewById(R.id.update_value);
        textView.setText(String.valueOf(featureConfig.mAppUpdate));
    }
}
