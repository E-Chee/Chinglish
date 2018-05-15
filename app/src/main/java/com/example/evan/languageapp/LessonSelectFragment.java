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

public class LessonSelectFragment extends Fragment implements View.OnClickListener {

    private ImageButton greetingButton, colorButton, numberButton, grammarButton, conversationButton, pinyinButton;
    private TextView greetings, colors, numbers, grammar, conversations, pinyin;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Lesson Selection");

        wireWidgets();
        setOnClickListeners();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lesson_select_screen, container, false);
    }

    private void wireWidgets() {
        greetingButton = (ImageButton) getView().findViewById(R.id.greeting_button);
        colorButton = (ImageButton) getView().findViewById(R.id.color_button);
        numberButton = (ImageButton) getView().findViewById(R.id.number_button);
        grammarButton = (ImageButton) getView().findViewById(R.id.grammar_button);
        conversationButton = (ImageButton) getView().findViewById(R.id.conversation_button);
        pinyinButton = (ImageButton) getView().findViewById(R.id.pinyin_button);
        greetings = (TextView) getView().findViewById(R.id.greetings_textview);
        colors = (TextView) getView().findViewById(R.id.colors_textview);
        numbers = (TextView) getView().findViewById(R.id.numbers_textview);
        grammar = (TextView) getView().findViewById(R.id.grammar_textview);
        conversations = (TextView) getView().findViewById(R.id.grammar_textview);
        pinyin = (TextView) getView().findViewById(R.id.pinyin_textView);
    }

    private void setOnClickListeners() {
        greetingButton.setOnClickListener(this);
        numberButton.setOnClickListener(this);
        colorButton.setOnClickListener(this);
        grammarButton.setOnClickListener(this);
        conversationButton.setOnClickListener(this);
        pinyinButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.greeting_button:
                Intent i = new Intent(getActivity(), LessonOneActivity.class);
                startActivity(i);
                break;
            case R.id.number_button:
                Intent j = new Intent(getActivity(), LessonTwoActivity.class);
                startActivity(j);
                break;
            case R.id.color_button:
                Intent k = new Intent(getActivity(), LessonThreeActivity.class);
                startActivity(k);
                break;
            case R.id.grammar_button:
                Intent a = new Intent(getActivity(), LessonFourActivity.class);
                startActivity(a);
                break;
            case R.id.conversation_button:
                Intent b = new Intent(getActivity(), LessonFiveActivity.class);
                startActivity(b);
                break;
            case R.id.pinyin_button:
                Intent c = new Intent(getActivity(), PinyinLessonActivity.class);
                startActivity(c);
                break;

        }


    }


}