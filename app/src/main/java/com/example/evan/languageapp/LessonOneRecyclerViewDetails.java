package com.example.evan.languageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LessonOneRecyclerViewDetails extends AppCompatActivity {

    private TextView title, bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_recycler_view_details);

        Intent i = getIntent();
        String body = i.getParcelableExtra("background info");

        WireWidgets();
        bodyText.setText(body);
    }

    private void WireWidgets() {
        title = (TextView) findViewById(R.id.background_title);
        bodyText = (TextView) findViewById(R.id.background_body);
    }
}