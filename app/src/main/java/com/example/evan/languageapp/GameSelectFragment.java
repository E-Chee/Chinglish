package com.example.evan.languageapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by per6 on 3/23/18.
 */

public class GameSelectFragment extends Fragment implements View.OnClickListener{

    private Button easyButton, mediumButton, hardButton;
    private TextView matchingText, categoriesText;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Game Selection");
        wireWidgets();
        setOnClickListeners();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_game_select_screen, container, false);
    }

    public void wireWidgets(){
        easyButton = (Button) getView().findViewById(R.id.button_easy);
        mediumButton = (Button) getView().findViewById(R.id.button_medium);
        hardButton = (Button) getView().findViewById(R.id.button_hard);
        matchingText = (TextView) getView().findViewById(R.id.text_matching);
        categoriesText = (TextView) getView().findViewById(R.id.text_categories);
    }

    public void setOnClickListeners(){
        easyButton.setOnClickListener(this);
        mediumButton.setOnClickListener(this);
        hardButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_easy:
                Intent i = new Intent(getActivity(), MatchEasyActivity.class);
                startActivity(i);
                break;
            case R.id.button_medium:
                Intent j = new Intent(getActivity(), MatchMediumActivity.class);
                startActivity(j);
                break;
            case R.id.button_hard:
                Intent k = new Intent(getActivity(), MatchHardActivity.class);
                startActivity(k);
                break;
        }
    }
}
