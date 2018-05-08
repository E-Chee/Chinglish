package com.example.evan.languageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Evan on 5/7/2018.
 */

public class ItemPhraseCard extends AppCompatActivity {
    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_phrase);
    }

    public ItemPhraseCard(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
