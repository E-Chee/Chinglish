package com.example.evan.languageapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by per6 on 3/23/18.
 */

public class HomeScreenFragment extends Fragment {

    private TextView appTitle;
    private Button lessons, flashcards, games;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        wireWidgets();
        setOnClickListeners();

        getActivity().setTitle("Home Screen");
    }


    public void wireWidgets() {

        appTitle = (TextView) getView().findViewById(R.id.text_app_title);
        lessons = (Button) getView().findViewById(R.id.button_lessons);
        flashcards = (Button) getView().findViewById(R.id.button_flashcards);
        games = (Button) getView().findViewById(R.id.button_games);
    }

    private void setOnClickListeners() {
        lessons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();

                fm.beginTransaction()
                        .replace(R.id.fragment_container, new LessonSelectFragment())
                        .commit();
            }
        });
        flashcards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();

                fm.beginTransaction()
                        .replace(R.id.fragment_container, new FlashCardSelectFragment())
                        .commit();
            }
        });
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();

                fm.beginTransaction()
                        .replace(R.id.fragment_container, new GameSelectFragment())
                        .commit();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_screen, container, false);
    }
}
