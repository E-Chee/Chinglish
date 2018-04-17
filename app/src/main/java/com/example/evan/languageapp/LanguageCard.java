package com.example.evan.languageapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class LanguageCard {

    private String english, pinyin, chinese;

    public LanguageCard(String chinese, String pinyin, String english) {
        this.english = english;
        this.pinyin = pinyin;
        this.chinese = chinese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return chinese + pinyin + english;
    }

    public static List<LanguageCard> getLessonOneCards() {
        ArrayList<LanguageCard> lessonOneCards = new ArrayList<LanguageCard>();
        lessonOneCards.add(new LanguageCard("你好", "Nǐ hǎo", "hello"));
        lessonOneCards.add(new LanguageCard("好久不見", "Hǎojiǔ bùjiàn", " long time no see"));
        lessonOneCards.add(new LanguageCard("早上好", "Zǎoshang hǎo", "good morning"));
        lessonOneCards.add(new LanguageCard("你好嗎", "Nǐ hǎo ma", "how are you?"));
        lessonOneCards.add(new LanguageCard("我很好", "Wǒ hěn hǎo", "I'm great"));
        lessonOneCards.add(new LanguageCard("馬馬虎虎", "Mǎmǎhǔhǔ", "so-so"));
        lessonOneCards.add(new LanguageCard("我不好", "Wǒ bù hǎo", "I'm not so good"));
        lessonOneCards.add(new LanguageCard("晚安", "Wǎn'ān", "good night"));
        lessonOneCards.add(new LanguageCard("再見", "Zàijiàn", "good bye"));
        lessonOneCards.add(new LanguageCard("明天見", "Míngtiān jiàn", "See you tomorrow"));
        return lessonOneCards;
    }
}
