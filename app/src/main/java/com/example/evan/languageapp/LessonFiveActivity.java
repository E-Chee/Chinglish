package com.example.evan.languageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;

public class LessonFiveActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private WordAdapter adapter;
    private List<LanguageCard> results;
    private TextView lessonTitle, lessonIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);

        //wire widgets
        wireWidgets();
        //create a layout manager for the recyclerview
        layoutManager = new LinearLayoutManager(this);
        //set the layout manager to the recyclerview
        recyclerView.setLayoutManager(layoutManager);
        //set the default animator to the recyclerview
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //create the adapter
        initRecyclerView();
        adapter = new WordAdapter(this, results);
        //set the adapter
        recyclerView.setAdapter(adapter);
    }

    private void wireWidgets() {
        recyclerView = findViewById(R.id.recycler_view);
        lessonTitle = findViewById(R.id.lesson_title);
        lessonIntro = findViewById(R.id.lesson_intro);
    }

    private void initRecyclerView() {
        //results = LanguageCard.getLessonFiveCards();
    }
}