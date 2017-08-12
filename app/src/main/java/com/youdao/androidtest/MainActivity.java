package com.youdao.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private MetaConfig metaConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metaConfig = App.getMetaConfig();
        TextView textView = (TextView) findViewById(R.id.unmneg_channle_value);
        textView.setText(metaConfig.mUmengChannel);
        textView = (TextView) findViewById(R.id.vender_value);
        textView.setText(metaConfig.mVendor);
        textView = (TextView) findViewById(R.id.bundle_value);
        textView.setText(String.valueOf(metaConfig.mCheckBundle));
        textView = (TextView) findViewById(R.id.debug_value);
        textView.setText(String.valueOf(metaConfig.mIsDebug));
    }
}
