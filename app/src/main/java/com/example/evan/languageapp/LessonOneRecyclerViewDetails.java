package com.example.evan.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class LessonOneRecyclerViewDetails extends AppCompatActivity {

    private TextView title, bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_recycler_view_details);

        Intent i = getIntent();
        String body = i.getStringExtra("background info");
        Log.d("body text", "onCreate the body text was: " + body);

        WireWidgets();
        bodyText.setText(body);
        Log.d("body text 2", "onCreate after setting the body text was: " + body);
        if(bodyText.getText() == null)
            bodyText.setText("IT DIDN'T LOAD LUL");
    }

    private void WireWidgets() {
        title = (TextView) findViewById(R.id.background_title);
        bodyText = (TextView) findViewById(R.id.background_body);
    }

}
