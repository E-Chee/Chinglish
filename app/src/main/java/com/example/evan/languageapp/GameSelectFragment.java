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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by per6 on 3/23/18.
 */

public class GameSelectFragment extends Fragment implements View.OnClickListener{

    private Button easyButton, mediumButton, hardButton;
    private TextView matchingText, categoriesText;
    private Gamecard[] easyTermsArr, mediumTermsArr, hardTermsArr;
    private ArrayList<Gamecard> easyTerms, mediumTerms, hardTerms;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Game Selection");

        wireWidgets();
        setOnClickListeners();

        //Lesson 1 Greetings and Farewells
            //chinese primary
        Gamecard A1 = new Gamecard("你好 Nǐ hǎo", "Hello");
        Gamecard A2 = new Gamecard("你好嗎 Nǐ hǎo ma?", "How are you?");
        Gamecard A3 = new Gamecard("好久不見 Hǎojiǔ bùjiàn", "Long time no see" );
        Gamecard A4 = new Gamecard("我很好 Wǒ hěn hǎo", "I’m great");
        Gamecard A5 = new Gamecard("馬馬虎虎 Mǎmǎhǔhǔ", "So-so");
        Gamecard A6 = new Gamecard("我不好 Wǒ bù hǎo", "I’m not so good");
        Gamecard A7 = new Gamecard("再見 Zàijiàn", "Goodbye");
        Gamecard A8 = new Gamecard("明天見 Míngtiān jiàn", "See you tomorrow");
        Gamecard A9 = new Gamecard("早上好 Zǎoshang hǎo", "Good Morning");
        Gamecard A10 = new Gamecard("晚安 Wǎn'ān", "Good night");
            //translation primary
        Gamecard A11 = new Gamecard("Hello", "你好 Nǐ hǎo");
        Gamecard A12 = new Gamecard("How are you?", "你好嗎 Nǐ hǎo ma?");
        Gamecard A13 = new Gamecard("Long time no see", "好久不見 Hǎojiǔ bùjiàn" );
        Gamecard A14 = new Gamecard("I’m great", "我很好 Wǒ hěn hǎo");
        Gamecard A15 = new Gamecard("So-so", "馬馬虎虎 Mǎmǎhǔhǔ");
        Gamecard A16 = new Gamecard("I’m not so good", "我不好 Wǒ bù hǎo");
        Gamecard A17 = new Gamecard("Goodbye", "再見 Zàijiàn");
        Gamecard A18 = new Gamecard("See you tomorrow", "明天見 Míngtiān jiàn");
        Gamecard A19 = new Gamecard("Good Morning", "早上好 Zǎoshang hǎo");
        Gamecard A20 = new Gamecard("Good night", "晚安 Wǎn'ān");

        //Lesson 2 Numbers
            //chinese primary
        Gamecard B1 = new Gamecard("一 yī", "One");
        Gamecard B2 = new Gamecard("二 èr", "Two");
        Gamecard B3 = new Gamecard("三 sān", "Three");
        Gamecard B4 = new Gamecard("四 sì", "Four");
        Gamecard B5 = new Gamecard("五 wǔ", "Five");
        Gamecard B6 = new Gamecard("六 liù", "Six");
        Gamecard B7 = new Gamecard("七 qī", "Seven");
        Gamecard B8 = new Gamecard("八 bā", "Eight");
        Gamecard B9 = new Gamecard("九 jiǔ", "Nine");
        Gamecard B10 = new Gamecard("十 shí", "Ten");
            //translation primary
        Gamecard B11 = new Gamecard("One", "一 yī");
        Gamecard B12 = new Gamecard("Two", "二 èr");
        Gamecard B13 = new Gamecard("Three", "三 sān");
        Gamecard B14 = new Gamecard("Four", "四 sì");
        Gamecard B15 = new Gamecard("Five", "五 wǔ");
        Gamecard B16 = new Gamecard("Six", "六 liù");
        Gamecard B17 = new Gamecard("Seven", "七 qī");
        Gamecard B18 = new Gamecard("Eight", "八 bā");
        Gamecard B19 = new Gamecard("Nine", "九 jiǔ");
        Gamecard B20 = new Gamecard("Ten", "十 shí");

        //Lesson 3 Colors
            //chinese primary
        Gamecard C1 = new Gamecard("紅色 Hóngsè", "Red");
        Gamecard C2 = new Gamecard("藍色 Lán sè", "Blue");
        Gamecard C3 = new Gamecard("黃色 Huángsè", "Yellow");
        Gamecard C4 = new Gamecard("綠色 Lǜsè", "Green");
        Gamecard C5 = new Gamecard("橙色 Chéngsè", "Orange");
        Gamecard C6 = new Gamecard("紫色 Zǐsè", "Purple");
        Gamecard C7 = new Gamecard("棕色 Zōngsè", "Brown");
        Gamecard C8 = new Gamecard("黑色 Hēisè", "Black");
        Gamecard C9 = new Gamecard("白色 Báisè", "White");
        Gamecard C10 = new Gamecard("灰色 Huīsè", "Gray");
            //translation primary
        Gamecard C11 = new Gamecard("Red", "紅色 Hóngsè");
        Gamecard C12 = new Gamecard("Blue", "藍色 Lán sè");
        Gamecard C13 = new Gamecard("Yellow", "黃色 Huángsè");
        Gamecard C14 = new Gamecard("Green", "綠色 Lǜsè");
        Gamecard C15 = new Gamecard("Orange", "橙色 Chéngsè");
        Gamecard C16 = new Gamecard("Purple", "紫色 Zǐsè");
        Gamecard C17 = new Gamecard("Brown", "棕色 Zōngsè");
        Gamecard C18 = new Gamecard("Black", "黑色 Hēisè");
        Gamecard C19 = new Gamecard("White", "白色 Báisè");
        Gamecard C20 = new Gamecard("Grey", "灰色 Huīsè");

        //Lesson 4 Grammar
            //chinese primary
        Gamecard D1 = new Gamecard("我 wǒ", "I");
        Gamecard D2 = new Gamecard("你 nǐ", "You");
        Gamecard D3 = new Gamecard("和 hé", "And");
        Gamecard D4 = new Gamecard("的 de", "A word showing possession");
        Gamecard D5 = new Gamecard("嗎 ma", "A word indicating a question");
        Gamecard D6 = new Gamecard("不 bù/bú", "No / Not");
        Gamecard D7 = new Gamecard("是 shì", "Is / Am / Are");
        Gamecard D8 = new Gamecard("也 yě", "Also");
        Gamecard D9 = new Gamecard("得 dé", "Shows degree");
        Gamecard D10 = new Gamecard("得 de", "Auxiliary verb / Used after a verb");
            //translation primary
        Gamecard D11 = new Gamecard("I", "我 wǒ");
        Gamecard D12 = new Gamecard("You", "你 nǐ");
        Gamecard D13 = new Gamecard("And", "和 hé");
        Gamecard D14 = new Gamecard("A word showing possession", "的 de");
        Gamecard D15 = new Gamecard("A word indicating a question", "嗎 ma");
        Gamecard D16 = new Gamecard("No / Not", "不 bù/bú");
        Gamecard D17 = new Gamecard("Is / Am / Are", "是 shì");
        Gamecard D18 = new Gamecard("Also", "也 yě");
        Gamecard D19 = new Gamecard("Shows degree", "得 dé");
        Gamecard D20 = new Gamecard("Auxiliary verb / Used after a verb", "得 de");


        //Lesson 5 Conversations
            //chinese primary
        Gamecard E1 = new Gamecard("是的 shì4de", "Yes");
        Gamecard E2 = new Gamecard("不是 búshi4", "No");
        Gamecard E3 = new Gamecard("喜歡 xǐhuān", "Like");
        Gamecard E4 = new Gamecard("謝謝 xièxiè", "Thank you");
        Gamecard E5 = new Gamecard("不客氣 bù kèqì", "You're welcome");
        Gamecard E6 = new Gamecard("對不起 duìbùqǐ", "Sorry");
        Gamecard E7 = new Gamecard("我叫 ___ wǒ jiào ___", "My name is ___");
        Gamecard E8 = new Gamecard("沒關係 Méiguānxì", "It's ok");
        Gamecard E9 = new Gamecard("我不知道 wǒ bù zhīdào", "I don't know");
        Gamecard E10 = new Gamecard("我愛你 wǒ ài nǐ", "I love you");
            //translation primary
        Gamecard E11 = new Gamecard("Yes", "是的 shì4de");
        Gamecard E12 = new Gamecard("No", "不是 búshi4");
        Gamecard E13 = new Gamecard("Like", "喜歡 xǐhuān");
        Gamecard E14 = new Gamecard("Thank you", "謝謝 xièxiè");
        Gamecard E15 = new Gamecard("You're welcome", "不客氣 bù kèqì");
        Gamecard E16 = new Gamecard("Sorry", "對不起 duìbùqǐ");
        Gamecard E17 = new Gamecard("My name is ___", "我叫 ___ wǒ jiào ___");
        Gamecard E18 = new Gamecard("It's ok", "沒關係 Méiguānxì");
        Gamecard E19 = new Gamecard("I don't know", "我不知道 wǒ bù zhīdào");
        Gamecard E20 = new Gamecard("I love you", "我愛你 wǒ ài nǐ");

        //STRETCH GOAL: randomize the terms put in teach list..

        //easy: terms from lesson 1; 4x4; 16 cards, 8 terms
        easyTermsArr = new Gamecard[]{A1, A2, A3, A4, A5, A6, A7, A8, A11, A12, A13, A14, A15, A16, A17, A18};
        easyTerms = new ArrayList<>();
        easyTerms.addAll(Arrays.asList(easyTermsArr)); //puts array terms into an arraylist

        //medium: terms from lessons 2 & 3; 4x5; 20 cards, 10 terms
        mediumTermsArr = new Gamecard[]{B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20};
        mediumTerms = new ArrayList<>();
        mediumTerms.addAll(Arrays.asList(mediumTermsArr));

        //hard: terms form lessons 4 & 5; 4x6; 24 cards, 12 terms
        hardTermsArr = new Gamecard[]{D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, E1, E2, D11, D12, D13, D14, D15, D16, D17, D18, D19, D20, E11, E12};
        hardTerms = new ArrayList<>();
        hardTerms.addAll(Arrays.asList(hardTermsArr));
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
                Intent i = new Intent(getActivity(), MatchEasyTwo.class);
                //sends easyTerms array of Gamecards to easy activity
                i.putParcelableArrayListExtra("easy", easyTerms);
                startActivity(i);
                break;
            case R.id.button_medium:
                Intent j = new Intent(getActivity(), MatchMediumActivity.class);
                j.putParcelableArrayListExtra("medium", mediumTerms);
                startActivity(j);
                break;
            case R.id.button_hard:
                Intent k = new Intent(getActivity(), MatchHardActivity.class);
                k.putParcelableArrayListExtra("hard", hardTerms);
                startActivity(k);
                break;
        }
    }
}
