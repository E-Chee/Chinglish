package com.example.evan.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewDetails extends AppCompatActivity {
    private TextView title, bodyText, question, answerA, answerB, answerC, answerD;
    private Button buttonA, buttonB, buttonC, buttonD;
    private int score;
    private boolean answer;
    private LanguageCard body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_details);

        Intent i = getIntent();
        body = i.getParcelableExtra("background info");
        Log.d("body text", "onCreate the body text was: " + body);

        WireWidgets();
        setOnClickListeners();
        score=0;

        bodyText.setText(body.getDesc());
        Log.d("body text 2", "onCreate after setting the body text was: " + body);
        if(bodyText.getText() == null) {
            bodyText.setText("IT DIDN'T LOAD LUL");
        }

        displayQuiz();
    }

    private void WireWidgets() {
        title = (TextView) findViewById(R.id.background_title);
        bodyText = (TextView) findViewById(R.id.background_body);
        question = (TextView) findViewById(R.id.textView_question);
        answerA = (TextView) findViewById(R.id.answer_a);
        answerB = (TextView) findViewById(R.id.answer_b);
        answerC = (TextView) findViewById(R.id.answer_c);
        answerD = (TextView) findViewById(R.id.answer_d);
        buttonA = (Button) findViewById(R.id.button_a);
        buttonB = (Button) findViewById(R.id.button_b);
        buttonC = (Button) findViewById(R.id.button_c);
        buttonD = (Button) findViewById(R.id.button_d);
    }

    private void setOnClickListeners() {
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswerA();
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswerB();
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswerC();
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswerD();
            }
        });
    }

    private void checkAnswerA() {
        String correctAnswer = body.getQuiz().getCorrectAnswer();
        if(buttonA.getText().equals(correctAnswer)) {
            correct();
        }
        else {
            incorrect();
        }
    }

    private void checkAnswerB() {
        String correctAnswer = body.getQuiz().getCorrectAnswer();
        if(buttonB.getText().equals(correctAnswer)) {
            correct();
        }
        else {
            incorrect();
        }
    }

    private void checkAnswerC() {
        String correctAnswer = body.getQuiz().getCorrectAnswer();
        if(buttonC.getText().equals(correctAnswer)) {
            correct();
        }
        else {
            incorrect();
        }
    }

    private void checkAnswerD() {
        String correctAnswer = body.getQuiz().getCorrectAnswer();
        if(buttonD.getText().equals(correctAnswer)) {
            correct();
        }
        else {
            incorrect();
        }
    }

    private void incorrect() {
        score--;
        Toast.makeText(this, "NICE TRY LUL", Toast.LENGTH_SHORT).show();
    }

    private void correct() {
        score++;
        Toast.makeText(this, "YOU DID IT! :D", Toast.LENGTH_SHORT).show();
    }

    private void displayQuiz() {
        question.setText(body.getQuiz().getQuestion());
        answerA.setText("A. " + body.getQuiz().getAnswerA());
        answerB.setText("B. " + body.getQuiz().getAnswerB());
        answerC.setText("C. " + body.getQuiz().getAnswerC());
        answerD.setText("D. " + body.getQuiz().getAnswerD());
        Log.d("question 2", "getQuiz: " + body.getQuiz().getAnswerA());
    }

}
