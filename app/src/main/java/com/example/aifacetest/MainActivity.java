package com.example.aifacetest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.mnnkit.monitor.MNNMonitor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MNNMonitor.setMonitorEnable(true);
    }

    public void onFaceDetection(View v) {
        startActivity(new Intent(MainActivity.this, FaceDetectionActivity.class));
    }

    public void onHandGestureDetection(View v) {
        startActivity(new Intent(MainActivity.this, HandGestureDetectionActivity.class));
    }

    public void onPortraitSegmentation(View v) {
        startActivity(new Intent(MainActivity.this, PortraitSegmentationActivity.class));
    }
}