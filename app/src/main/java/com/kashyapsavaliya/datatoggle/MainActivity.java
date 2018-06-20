package com.kashyapsavaliya.datatoggle;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent();
        String aSettings = getResources().getString(R.string.android_settings);
        String aduSettings = getResources().getString(R.string.android_settings_data_usage);
        ComponentName componentName = new ComponentName(aSettings,aduSettings);
        intent.setComponent(componentName);
        startActivity(intent);
        finish();
    }
}
