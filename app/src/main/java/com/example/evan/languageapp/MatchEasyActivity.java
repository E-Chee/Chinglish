package com.example.evan.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;

public class MatchEasyActivity extends AppCompatActivity {

    private int numElements;
    private MemoryButton[] buttons;
    private int[] locations;
    private String[] buttonChinese;
    private String[] buttonDefinition;
    private MemoryButton selectedOne;
    private MemoryButton selectedTwo;

    private boolean isBusy = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_easy);

        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid_layout_easy);

        int numColumns = gridLayout.getColumnCount();
        int numRows = gridLayout.getRowCount();

        numElements = numColumns * numRows;

        buttons = new MemoryButton[numElements];
        buttonChinese = new String[numElements / 2];
        buttonDefinition = new String[numElements / 2];



    }
}
