package com.example.evan.languageapp;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ConversationFlashcardActivity extends AppCompatActivity {
    private AnimatorSet cardIn, cardOut;
    private Boolean mIsBackVisible = false;
    private View front, back;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private GreetingsFlashcardAdapter adapter;
    private List<Vocab> words;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversations_flashcard);

        words = new ArrayList<>();
        words.addAll(VocabGenerator.getConvesations());


        //wire the recycler view
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //create a layout manager for the recyclerview

        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(recyclerView);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        //set the default animator to the recyclerview
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //create the adapter
        adapter = new GreetingsFlashcardAdapter(this, words);
        //set the adapter
        recyclerView.setAdapter(adapter);


        //loadAnimations();
        //changeCameraDistance();

    }
}