package com.example.evan.languageapp;

import android.content.Context;

import android.support.v7.widget.AppCompatButton;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by per6 on 4/17/18.
 */

public class MemoryButton extends AppCompatButton {

    private int row;
    private int collumn;
    private String text;
    protected boolean isMatched;

    public MemoryButton (Context context, int r, int c, String cardText){
        super(context);

        row = r;
        collumn = c;
        text = cardText;

        GridLayout.LayoutParams parameters = new GridLayout.LayoutParams(GridLayout.spec(r), GridLayout.spec(c));
        parameters.width = (int) getResources().getDisplayMetrics().density * 50;
        parameters.height = (int) getResources().getDisplayMetrics().density * 50;

        setLayoutParams(parameters);
    }



    /*public void correct(){
        //if(isMatched)
        //remove item
    }*/

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }


    @Override
    public String getText() {
        return text;
    }

}
