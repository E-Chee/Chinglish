package com.example.evan.languageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridLayout;

import java.util.List;

public class MatchEasyTwo extends AppCompatActivity implements View.OnClickListener{

    private int numElements;
    private String[] cardTexts;
    private List<Gamecard> easyTerms;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
//    private GameWordAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_easy_two);

        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid_layout_easy);
        wireWidgets();

        int numColumns = gridLayout.getColumnCount();
        int numRows = gridLayout.getRowCount();
        numElements = numColumns * numRows;

//        easyTerms = (ArrayList<Gamecard>) getIntent().getParcelableArrayExtra("easyTerms");

        //create a layout manager for the recyclerview
        layoutManager = new LinearLayoutManager(this);
        //set the layout manager to the recyclerview
        recyclerView.setLayoutManager(layoutManager);
        //set the default animator to the recyclerview
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //create the adapter
        //initRecyclerView();
//        adapter = new GameWordAdapter(this, easyTerms);
        //set the adapter
//        recyclerView.setAdapter(adapter);

    }

    private void wireWidgets() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    //private void initRecyclerView() {
    //    easyTerms = Gamecard.getLessonOneCards(this);
    //}

    @Override
    public void onClick(View v) {

    }
}
