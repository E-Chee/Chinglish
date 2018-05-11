package com.example.evan.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by per6 on 3/23/18.
 */

public class FlashCardSelectFragment extends Fragment {

    private ImageButton greeting_button, color_button, number_button, grammar_button, conversation_button;
    private TextView greetings, colors, numbers, grammar, conversations;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Flashcard Selection");

        wireWidgets();
        setOnClickListeners();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_flashcard_select_screen, container, false);
    }

    private void wireWidgets() {
        greeting_button = (ImageButton) getView().findViewById(R.id.greeting_button);
        color_button = (ImageButton) getView().findViewById(R.id.color_button);
        number_button = (ImageButton) getView().findViewById(R.id.number_button);
        grammar_button = (ImageButton) getView().findViewById(R.id.grammar_button);
        conversation_button = (ImageButton) getView().findViewById(R.id.conversation_button);
        greetings = (TextView) getView().findViewById(R.id.greetings_textview);
        colors = (TextView) getView().findViewById(R.id.colors_textview);
        numbers = (TextView) getView().findViewById(R.id.numbers_textview);

    }

    private void setOnClickListeners() {
        greeting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), GreetingsFlashcardActivity.class);
                startActivity(i);
            }
        });
        color_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(getActivity(), ColorsFlashcardActivity.class);
                startActivity(o);
            }
        });

        number_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getActivity(), NumbersFlashcardActivity.class);
                startActivity(p);
            }
        });
        grammar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getActivity(), GrammarFlashcardActivity.class);
                startActivity(j);
            }
        });

        conversation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getActivity(), ConversationFlashcardActivity.class);
                startActivity(k);
            }
        });




    }

}
