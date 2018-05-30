package com.example.evan.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;

import java.util.Random;

public class MatchEasyActivity extends AppCompatActivity implements View.OnClickListener{

    private int numElements;
    private MemoryButton[] storedButtons;
    private int[] termIndex;
    private String[] buttonTexts;
    private MemoryButton selectedOne;
    private MemoryButton selectedTwo;
    private Flashcard[] easyTerms;
    private boolean isBusy = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_easy);

        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid_layout_easy);

        int numColumns = gridLayout.getColumnCount();
        int numRows = gridLayout.getRowCount();
        numElements = numColumns * numRows;

        //storage
        storedButtons = new MemoryButton[numElements];

        //what goes on each button
        buttonTexts = new String[numElements];

        easyTerms = (Flashcard[]) getIntent().getParcelableArrayExtra("easyTerms");
        Log.d("LookHere!", "EasyTermArray" + easyTerms);

        fillButtons();
        shuffleButtons();

        //creates MemoryButtons and puts them into the gridView
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numColumns; c++){                                                    //converts from 2d list to 1d;
                MemoryButton tempButton = new MemoryButton(this, r, c, buttonTexts[termIndex[r * numColumns +c]]);
                //give each button an ID? tempButton.setId(View.generateViewId());
                tempButton.setOnClickListener(this);
                //stores buttons
                storedButtons[r * numColumns + c] = tempButton;
                gridLayout.addView(tempButton);
            }
        }
    }

    private void fillButtons() {
        //fills buttonTexts with the 8 of the Chinese and 8 of the Translations
        //STRETCH: Randomize the 8 terms instead of first 8
        for(int i = 0; i < numElements/2 - 1; i++){
            buttonTexts[i] = easyTerms[i].getChinese();
        }
        for(int i = numElements/2; i < numElements; i++){
            buttonTexts[i] = easyTerms[i].getTranslation();
        }
    }

    private void shuffleButtons() {
        //gives termIndex numbers for each term in order
        for(int i = 0; i <numElements; i++){
            termIndex[i] = i;
        }

        //randomizes the order of the indices in termIndex which will be used to randomize the 16 Chinese and Translations
        Random random = new Random();
        for(int i = 0; i < numElements; i++){
            int temp = termIndex[i];
            int swapIndex = random.nextInt(numElements);
            termIndex[i] = termIndex[swapIndex];
            termIndex[swapIndex] = temp;
        }

    }

    @Override
    public void onClick(View view) {
        if(isBusy){
            return;
        }

        MemoryButton button = (MemoryButton) view;

        if(button.isMatched)
            return;

        //The first selected button is null when you clicked a valid button and you've never clicked one before or you restart
        if(selectedOne == null){
            return;
        }

        //If you click the same button twice, don't do anything
        if(selectedOne.getText().equals(button.getText())){
            return;
        }

        //If the chinese matches the translation, set to matched and disable the match
        //figure out a way that you can check if the definition matches with the chinese..
        // - check if they match by seeing if they come from the same flashcard object.
        if(selectedOne.getText().equals(button.getText())){

            button.setMatched(true);
            selectedOne.setMatched(true);
            selectedOne.setEnabled(false);
            selectedTwo.setEnabled(false);

            //make disappear
            selectedOne.setVisibility(View.GONE);

            return;
        }

        else{
            //If the two buttons don't match
            //selectedTwo = button;
            //isBusy = true;



            //IDEAS: Instead of making the memory buttons onClick and putting them in the gridview,
            //       put the buttonTexts[i] (flashcard object) in the gridView and display
            //       buttonTexts[i].getTranslation() or buttonTexts[i].getChinese().
            //       To see if they match, see if buttonTexts[i]=buttonTexts[i]
        }
    }
}
