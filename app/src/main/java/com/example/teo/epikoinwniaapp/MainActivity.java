package com.example.teo.epikoinwniaapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.security.Policy;

public class MainActivity extends AppCompatActivity {

    ImageButton mapButton;
    ImageButton btnSwitch;

    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapButton = (ImageButton) findViewById(R.id.map_btn);
        btnSwitch = (ImageButton) findViewById(R.id.btnSwitch);


        mapButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentLoadMapActivity = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intentLoadMapActivity);
            }
        });



    }



}
