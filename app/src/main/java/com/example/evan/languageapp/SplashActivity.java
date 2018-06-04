package com.example.evan.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Evan on 6/3/2018.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(this, HomeScreenActivity.class);
        startActivity(i);
        finish();
    }
}
