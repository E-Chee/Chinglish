package com.example.evan.languageapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class LanguageCard {

    private String english, pinyin, chinese, desc;
    private String tone, explanation;
    private int audio;

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }


    public LanguageCard(String chinese, String pinyin, String english, String desc) {
        this.english = english;
        this.pinyin = pinyin;
        this.chinese = chinese;
    }

    public LanguageCard(String tone, String explanation, int audio) {
        this.tone = tone;
        this.explanation = explanation;
        this.audio = audio;
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

    public static List<LanguageCard> getLessonOneCards(Context context) {
        ArrayList<LanguageCard> lessonOneCards = new ArrayList<LanguageCard>();
        lessonOneCards.add(new LanguageCard("你好", "Nǐ hǎo", "Hello", context.getString(R.string.lesson_1_card_1)));
        lessonOneCards.add(new LanguageCard("好久不見", "Hǎojiǔ bùjiàn", "Long time no see", context.getString(R.string.lesson_1_card_2)));
        lessonOneCards.add(new LanguageCard("早上好", "Zǎoshàng hǎo", "Good morning", context.getString(R.string.lesson_1_card_3)));
        lessonOneCards.add(new LanguageCard("你好嗎", "Nǐ hǎo ma", "How are you?", context.getString(R.string.lesson_1_card_4)));
        lessonOneCards.add(new LanguageCard("我很好", "Wǒ hěn hǎo", "I'm great", context.getString(R.string.lesson_1_card_5)));
        lessonOneCards.add(new LanguageCard("我還可以", "Wǒ hái kěyǐ", "I'm alright", context.getString(R.string.lesson_1_card_6)));
        lessonOneCards.add(new LanguageCard("我不好", "Wǒ bù hǎo", "I'm not so good", context.getString(R.string.lesson_1_card_7)));
        lessonOneCards.add(new LanguageCard("再見", "Zàijiàn", "Good bye", context.getString(R.string.lesson_1_card_8)));
        lessonOneCards.add(new LanguageCard("明天見", "Míngtiān jiàn", "See you tomorrow", context.getString(R.string.lesson_1_card_9)));
        lessonOneCards.add(new LanguageCard("晚安", "Wǎn'ān", "Good night",context.getString(R.string.lesson_1_card_10)));
        return lessonOneCards;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static List<LanguageCard> getLessonTwoCards() {
        ArrayList<LanguageCard> lessonTwoCards = new ArrayList<LanguageCard>();
        lessonTwoCards.add(new LanguageCard("一", "yī", "one", ""));
        lessonTwoCards.add(new LanguageCard("二", "èr", "two",""));
        lessonTwoCards.add(new LanguageCard("三", "sān", "three",""));
        lessonTwoCards.add(new LanguageCard("四", "sì", "four",""));
        lessonTwoCards.add(new LanguageCard("五", "wǔ", "five",""));
        lessonTwoCards.add(new LanguageCard("六", "liù", "six",""));
        lessonTwoCards.add(new LanguageCard("七", "qī", "seven",""));
        lessonTwoCards.add(new LanguageCard("八", "bā", "eight",""));
        lessonTwoCards.add(new LanguageCard("九", "jiǔ", "nine",""));
        lessonTwoCards.add(new LanguageCard("十", "shí", "ten",""));
        return lessonTwoCards;
    }

    public static List<LanguageCard> getLessonThreeCards() {
        ArrayList<LanguageCard> lessonThreeCards = new ArrayList<LanguageCard>();
        lessonThreeCards.add(new LanguageCard("紅色", "Hóngsè", "red",""));
        lessonThreeCards.add(new LanguageCard("藍色", "Lán sè", "blue",""));
        lessonThreeCards.add(new LanguageCard("黃色", "Huángsè", "yellow",""));
        lessonThreeCards.add(new LanguageCard("綠色", "Lǜsè", "green",""));
        lessonThreeCards.add(new LanguageCard("橙色", "Chéngsè", "orange",""));
        lessonThreeCards.add(new LanguageCard("紫色", "Zǐsè", "purple",""));
        lessonThreeCards.add(new LanguageCard("棕色", "Zōngsè", "brown",""));
        lessonThreeCards.add(new LanguageCard("黑色", "Hēisè", "black",""));
        lessonThreeCards.add(new LanguageCard("白色", "Báisè", "white",""));
        lessonThreeCards.add(new LanguageCard("灰色", "Huīsè", "gray",""));
        return lessonThreeCards;
    }

    public static List<LanguageCard> getLessonFourCards(Context context) {
        ArrayList<LanguageCard> lessonFourCards = new ArrayList<LanguageCard>();
        lessonFourCards.add(new LanguageCard("我", "wǒ", "I",context.getString(R.string.lesson_4_card_1)));
        lessonFourCards.add(new LanguageCard("你", "nǐ", "you",context.getString(R.string.lesson_4_card_2)));
        lessonFourCards.add(new LanguageCard("和", "hé", "and",context.getString(R.string.lesson_4_card_3)));
        lessonFourCards.add(new LanguageCard("的", "de", "a word showing possession",context.getString(R.string.lesson_4_card_4)));
        lessonFourCards.add(new LanguageCard("嗎", "ma", "a word indicating a question",context.getString(R.string.lesson_4_card_5)));
        lessonFourCards.add(new LanguageCard("不", "bù/bú", "no / not",context.getString(R.string.lesson_4_card_6)));
        lessonFourCards.add(new LanguageCard("是", "shì", "is / am / are",context.getString(R.string.lesson_4_card_7)));
        lessonFourCards.add(new LanguageCard("也", "yě", "also",context.getString(R.string.lesson_4_card_8)));
        lessonFourCards.add(new LanguageCard("得", "dé", "shows degree",context.getString(R.string.lesson_4_card_9)));
        lessonFourCards.add(new LanguageCard("得", "de", "auxiliary verb / used after a verb",context.getString(R.string.lesson_4_card_10)));
        return lessonFourCards;
    }

    public static List<LanguageCard> getLessonFiveCards(Context context) {
        ArrayList<LanguageCard> lessonFiveCards = new ArrayList<LanguageCard>();
        lessonFiveCards.add(new LanguageCard("是的", "shìde", "yes",context.getString(R.string.lesson_5_card_1)));
        lessonFiveCards.add(new LanguageCard("不是", "búshì", "no",context.getString(R.string.lesson_5_card_2)));
        lessonFiveCards.add(new LanguageCard("喜歡", "xǐhuān", "like",context.getString(R.string.lesson_5_card_3)));
        lessonFiveCards.add(new LanguageCard("謝謝", "xièxiè", "thank you",context.getString(R.string.lesson_5_card_4)));
        lessonFiveCards.add(new LanguageCard("不客氣", "bú kèqì", "you're welcome",context.getString(R.string.lesson_5_card_5)));
        lessonFiveCards.add(new LanguageCard("對不起", "duìbùqǐ", "sorry",context.getString(R.string.lesson_5_card_6)));
        lessonFiveCards.add(new LanguageCard("我叫 _", "wǒ jiào _", "my name is _",context.getString(R.string.lesson_5_card_7)));
        lessonFiveCards.add(new LanguageCard("沒關係", "Méiguānxì", "it's ok",context.getString(R.string.lesson_5_card_8)));
        lessonFiveCards.add(new LanguageCard("我不知道", "wǒ bù zhīdào", "I don't know",context.getString(R.string.lesson_5_card_9)));
        lessonFiveCards.add(new LanguageCard("我愛你", "wǒ ài nǐ", "I love you",context.getString(R.string.lesson_5_card_10)));
        return lessonFiveCards;
    }

    public static List<LanguageCard> getPinyinCards(Context context){
        ArrayList<LanguageCard> pinyinCards= new ArrayList<LanguageCard>();
        pinyinCards.add(new LanguageCard("1st Tone", "Flat tone is marked with a line over a vowel such as \"a\" + \"-\" = \"ā\".", R.raw.one));
        pinyinCards.add(new LanguageCard("2nd Tone", "Rising tone is marked with a rising line over a vowel such as \"a\" + \"´\" = \"á\".", R.raw.two));
        pinyinCards.add(new LanguageCard("3rd Tone", "Falling-rising tone is marked with a hook over a vowel such as \"a\" + \"v\" = \"ă\"", R.raw.three));
        pinyinCards.add(new LanguageCard("4th Tone", "Falling tone is marked with a falling line over a vowel such as \"a\" + \"`\" = \"à\".", R.raw.four));
        pinyinCards.add(new LanguageCard("Neutral Tone", "Also called toneless tone (called “light sound” in Chinese), no marking is put above any vowel. For example, \"a\" + \" \" = \"a\".", R.raw.four));
        return pinyinCards;
    }

}

