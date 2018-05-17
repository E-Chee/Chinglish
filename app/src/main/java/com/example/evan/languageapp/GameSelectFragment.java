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
    private Flashcard[] easyTerms, mediumTerms, hardTerms;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Game Selection");

        wireWidgets();
        setOnClickListeners();

        Flashcard A1 = new Flashcard("你好 Nǐ hǎo", "Hello");                         //Lesson 1 Greetings and Farewells
        Flashcard A2 = new Flashcard("你好嗎 Nǐ hǎo ma?", "How are you?");
        Flashcard A3 = new Flashcard("好久不見 Hǎojiǔ bùjiàn", "Long time no see" );
        Flashcard A4 = new Flashcard("我很好 Wǒ hěn hǎo", "I’m great");
        Flashcard A5 = new Flashcard("馬馬虎虎 Mǎmǎhǔhǔ", "So-so");
        Flashcard A6 = new Flashcard("我不好 Wǒ bù hǎo", "I’m not so good");
        Flashcard A7 = new Flashcard("再見 Zàijiàn", "Goodbye");
        Flashcard A8 = new Flashcard("明天見 Míngtiān jiàn", "See you tomorrow");
        Flashcard A9 = new Flashcard("早上好 Zǎoshang hǎo", "Good Morning");
        Flashcard A10 = new Flashcard("晚安 Wǎn'ān", "Good night");

        Flashcard B1 = new Flashcard("一 yī", "One");                                //Lesson 2 Numbers
        Flashcard B2 = new Flashcard("二 èr", "Two");
        Flashcard B3 = new Flashcard("三 sān", "Three");
        Flashcard B4 = new Flashcard("四 sì", "Four");
        Flashcard B5 = new Flashcard("五 wǔ", "Five");
        Flashcard B6 = new Flashcard("六 liù", "Six");
        Flashcard B7 = new Flashcard("七 qī", "Seven");
        Flashcard B8 = new Flashcard("八 bā", "Eight");
        Flashcard B9 = new Flashcard("九 jiǔ", "Nine");
        Flashcard B10 = new Flashcard("十 shí", "Ten");

        Flashcard C1 = new Flashcard("紅色 Hóngsè", "Red");                           //Lesson 3 Colors
        Flashcard C2 = new Flashcard("藍色 Lán sè", "Blue");
        Flashcard C3 = new Flashcard("黃色 Huángsè", "Yellow");
        Flashcard C4 = new Flashcard("綠色 Lǜsè", "Green");
        Flashcard C5 = new Flashcard("橙色 Chéngsè", "Orange");
        Flashcard C6 = new Flashcard("紫色 Zǐsè", "Purple");
        Flashcard C7 = new Flashcard("棕色 Zōngsè", "Brown");
        Flashcard C8 = new Flashcard("黑色 Hēisè", "Black");
        Flashcard C9 = new Flashcard("白色 Báisè", "White");
        Flashcard C10 = new Flashcard("灰色 Huīsè", "Gray");

        Flashcard D1 = new Flashcard("我 wǒ", "I");                                 //Lesson 4 Grammar
        Flashcard D2 = new Flashcard("你 nǐ", "You");
        Flashcard D3 = new Flashcard("和 hé", "And");
        Flashcard D4 = new Flashcard("的 de", "A word showing possession");
        Flashcard D5 = new Flashcard("嗎 ma", "A word indicating a question");
        Flashcard D6 = new Flashcard("不 bù/bú", "No / Not");
        Flashcard D7 = new Flashcard("是 shì", "Is / Am / Are");
        Flashcard D8 = new Flashcard("也 yě", "Also");
        Flashcard D9 = new Flashcard("得 dé", "Shows degree");
        Flashcard D10 = new Flashcard("得 de", "Auxiliary verb / Used after a verb");

        Flashcard E1 = new Flashcard("是的 shì4de", "Yes");                          //Lesson 5 Conversations
        Flashcard E2 = new Flashcard("不是 búshi4", "No");
        Flashcard E3 = new Flashcard("喜歡 xǐhuān", "Like");
        Flashcard E4 = new Flashcard("謝謝 xièxiè", "Thank you");
        Flashcard E5 = new Flashcard("不客氣 bù kèqì", "You're welcome");
        Flashcard E6 = new Flashcard("對不起 duìbùqǐ", "Sorry");
        Flashcard E7 = new Flashcard("我叫 ___ wǒ jiào ___", "My name is ___");
        Flashcard E8 = new Flashcard("沒關係 Méiguānxì", "It's ok");
        Flashcard E9 = new Flashcard("我不知道 wǒ bù zhīdào", "I don't know");
        Flashcard E10 = new Flashcard("我愛你 wǒ ài nǐ", "I love you");

        //easy: terms from lesson 1
        easyTerms = new Flashcard[]{A1, A2, A3, A4, A5, A6, A7, A8, A9, A10};
        //medium: terms from lessons 2 & 3
        mediumTerms = new Flashcard[]{B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10};
        //hard: terms form lessons 4 & 5
        hardTerms = new Flashcard[]{D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10};
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
                //sends easyTerms array of flashcards to easy activity
                i.putExtra("easy", easyTerms);
                startActivity(i);
                break;
            case R.id.button_medium:
                Intent j = new Intent(getActivity(), MatchMediumActivity.class);
                j.putExtra("medium", mediumTerms);
                startActivity(j);
                break;
            case R.id.button_hard:
                Intent k = new Intent(getActivity(), MatchHardActivity.class);
                k.putExtra("hard", hardTerms);
                startActivity(k);
                break;
        }
    }
}
