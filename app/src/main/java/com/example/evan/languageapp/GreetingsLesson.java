package com.example.evan.languageapp;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GreetingsLesson extends AppCompatActivity {
    private AnimatorSet cardIn, cardOut;
    private Boolean mIsBackVisible=false;
    private View front, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        findViews();
        loadAnimations();
        changeCameraDistance();

    }

    private void changeCameraDistance() {
        //so that when flipped the cards still fit in the screen
        int distance = 8000;
        float scale = getResources().getDisplayMetrics().density * distance;
        front.setCameraDistance(scale);
        back.setCameraDistance(scale);

    }

    private void loadAnimations() {
        cardIn= (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.animation);
        cardOut = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.backanimation);
    }

    private void findViews() {
        back= findViewById(R.id.card_back);
        front = findViewById(R.id.card_front);
    }

    public void flipCard(View view) {
        if (!mIsBackVisible) {
            cardIn.setTarget(front);
            cardOut.setTarget(back);
            cardIn.start();
            cardOut.start();
            mIsBackVisible = true;
        } else {
            cardIn.setTarget(back);
            cardOut.setTarget(front);
            cardIn.start();
            cardOut.start();
            mIsBackVisible = false;
        }
    }
}

