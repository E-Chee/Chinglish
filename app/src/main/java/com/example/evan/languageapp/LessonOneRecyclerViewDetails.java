package com.example.evan.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LessonOneRecyclerViewDetails extends AppCompatActivity {
    private TextView title, bodyText, question, answerA, answerB, answerC, answerD;
    private Button a, b, c, d;
    private int score;
    private boolean answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_recycler_view_details);

        Intent i = getIntent();
        String body = i.getStringExtra("background info");
        Log.d("body text", "onCreate the body text was: " + body);

        WireWidgets();
        score=0;

        bodyText.setText(body);
        Log.d("body text 2", "onCreate after setting the body text was: " + body);
        if(bodyText.getText() == null)
            bodyText.setText("IT DIDN'T LOAD LUL");
    }



    private void WireWidgets() {
        title = (TextView) findViewById(R.id.background_title);
        bodyText = (TextView) findViewById(R.id.background_body);
        question = (TextView) findViewById(R.id.textView_question);
        answerA = (TextView) findViewById(R.id.textView_a);
        answerB = (TextView) findViewById(R.id.textView_b);
        answerC = (TextView) findViewById(R.id.textView_c);
        answerD = (TextView) findViewById(R.id.textView_d);
        a = (Button) findViewById(R.id.button_a);
        b = (Button) findViewById(R.id.button_b);
        c = (Button) findViewById(R.id.button_c);
        d = (Button) findViewById(R.id.button_d);
    }



    private void incorrect() {
        score--;
        Toast.makeText(this, "NICE TRY, BUT NOT NICE ENOUGH", Toast.LENGTH_SHORT).show();


    }

    private void correct() {
        score++;
        Toast.makeText(this, "YOU DID IT", Toast.LENGTH_SHORT).show();
    }



}
