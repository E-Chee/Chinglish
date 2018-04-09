package com.example.evan.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LessonsActivity extends AppCompatActivity {

    private ImageButton greeting_button, color_button, number_button, grammar_button, conversation_button;
    private TextView greetings, colors, numbers, grammar, conversations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        wireWidgets();
        setOnClickListeners();

    }

    private void wireWidgets() {
        greeting_button = (ImageButton) findViewById(R.id.greeting_button);
        color_button = (ImageButton) findViewById(R.id.color_button);
        number_button = (ImageButton) findViewById(R.id.number_button);
        greetings = (TextView) findViewById(R.id.greetings_textview);
        colors = (TextView) findViewById(R.id.colors_textview);
        numbers = (TextView) findViewById(R.id.numbers_textview);
    }

    private void setOnClickListeners() {
        greeting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LessonsActivity.this, GreetingsLesson.class);
                startActivity(i);
            }
        });
    }

}
