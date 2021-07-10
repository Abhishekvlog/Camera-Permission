package com.example.camerapermission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mbtnCameraPermission;
    private static final int REQ_CAMERA_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsAndListener();
    }

    private void initViewsAndListener() {
        mbtnCameraPermission = findViewById(R.id.btnCameraPermission);
        mbtnCameraPermission.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.btnCameraPermission:
               ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CAMERA},REQ_CAMERA_CODE);
               break;
       }

    }
}