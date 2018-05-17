package com.example.evan.languageapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class LanguageCard {

    private String english, pinyin, chinese, desc;

    public LanguageCard(String chinese, String pinyin, String english, String desc) {
        this.english = english;
        this.pinyin = pinyin;
        this.chinese = chinese;
        this.desc = desc;
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
//        lessonOneCards.add(new LanguageCard("早上好", "Zǎoshang hǎo", "Good morning"));
//        lessonOneCards.add(new LanguageCard("你好嗎", "Nǐ hǎo ma", "How are you?"));
//        lessonOneCards.add(new LanguageCard("我很好", "Wǒ hěn hǎo", "I'm great"));
//        lessonOneCards.add(new LanguageCard("我還可以", "Wǒ hái kěyǐ", "I'm alright"));
//        lessonOneCards.add(new LanguageCard("我不好", "Wǒ bù hǎo", "I'm not so good"));
//        lessonOneCards.add(new LanguageCard("再見", "Zàijiàn", "Good bye"));
//        lessonOneCards.add(new LanguageCard("明天見", "Míngtiān jiàn", "See you tomorrow"));
//        lessonOneCards.add(new LanguageCard("晚安", "Wǎn'ān", "Good night"));
        return lessonOneCards;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

//    public static List<LanguageCard> getLessonTwoCards() {
//        ArrayList<LanguageCard> lessonTwoCards = new ArrayList<LanguageCard>();
//        lessonTwoCards.add(new LanguageCard("一", "yī", "one"));
//        lessonTwoCards.add(new LanguageCard("二", "èr", "two"));
//        lessonTwoCards.add(new LanguageCard("三", "sān", "three"));
//        lessonTwoCards.add(new LanguageCard("四", "sì", "four"));
//        lessonTwoCards.add(new LanguageCard("五", "wǔ", "five"));
//        lessonTwoCards.add(new LanguageCard("六", "liù", "six"));
//        lessonTwoCards.add(new LanguageCard("七", "qī", "seven"));
//        lessonTwoCards.add(new LanguageCard("八", "bā", "eight"));
//        lessonTwoCards.add(new LanguageCard("九", "jiǔ", "nine"));
//        lessonTwoCards.add(new LanguageCard("十", "shí", "ten"));
//        return lessonTwoCards;
//    }
//
//    public static List<LanguageCard> getLessonThreeCards() {
//        ArrayList<LanguageCard> lessonThreeCards = new ArrayList<LanguageCard>();
//        lessonThreeCards.add(new LanguageCard("紅色", "Hóngsè", "red"));
//        lessonThreeCards.add(new LanguageCard("藍色", "Lán sè", "blue"));
//        lessonThreeCards.add(new LanguageCard("黃色", "Huángsè", "yellow"));
//        lessonThreeCards.add(new LanguageCard("綠色", "Lǜsè", "green"));
//        lessonThreeCards.add(new LanguageCard("橙色", "Chéngsè", "orange"));
//        lessonThreeCards.add(new LanguageCard("紫色", "Zǐsè", "purple"));
//        lessonThreeCards.add(new LanguageCard("棕色", "Zōngsè", "brown"));
//        lessonThreeCards.add(new LanguageCard("黑色", "Hēisè", "black"));
//        lessonThreeCards.add(new LanguageCard("白色", "Báisè", "white"));
//        lessonThreeCards.add(new LanguageCard("灰色", "Huīsè", "gray"));
//        return lessonThreeCards;
//    }
//
//    public static List<LanguageCard> getLessonFourCards() {
//        ArrayList<LanguageCard> lessonFourCards = new ArrayList<LanguageCard>();
//        lessonFourCards.add(new LanguageCard("我", "wǒ", "I"));
//        lessonFourCards.add(new LanguageCard("你", "nǐ", "you"));
//        lessonFourCards.add(new LanguageCard("和", "hé", "and"));
//        lessonFourCards.add(new LanguageCard("的", "de", "a word showing possession"));
//        lessonFourCards.add(new LanguageCard("嗎", "ma", "a word indicating a question"));
//        lessonFourCards.add(new LanguageCard("不", "bù/bú", "no / not"));
//        lessonFourCards.add(new LanguageCard("是", "shì", "is / am / are"));
//        lessonFourCards.add(new LanguageCard("也", "yě", "also"));
//        lessonFourCards.add(new LanguageCard("得", "dé", "shows degree"));
//        lessonFourCards.add(new LanguageCard("得", "de", "auxiliary verb / used after a verb"));
//        return lessonFourCards;
//    }
//
//    public static List<LanguageCard> getLessonFiveCards() {
//        ArrayList<LanguageCard> lessonFiveCards = new ArrayList<LanguageCard>();
//        lessonFiveCards.add(new LanguageCard("是的", "shìde", "yes"));
//        lessonFiveCards.add(new LanguageCard("不是", "búshì", "no"));
//        lessonFiveCards.add(new LanguageCard("喜歡", "xǐhuān", "like"));
//        lessonFiveCards.add(new LanguageCard("謝謝", "xièxiè", "thank you"));
//        lessonFiveCards.add(new LanguageCard("不客氣", "bù kèqì", "you're welcome"));
//        lessonFiveCards.add(new LanguageCard("對不起", "duìbùqǐ", "sorry"));
//        lessonFiveCards.add(new LanguageCard("我叫 _", "wǒ jiào _", "my name is _"));
//        lessonFiveCards.add(new LanguageCard("沒關係", "Méiguānxì", "it's ok"));
//        lessonFiveCards.add(new LanguageCard("我不知道", "wǒ bù zhīdào", "I don't know"));
//        lessonFiveCards.add(new LanguageCard("我愛你", "wǒ ài nǐ", "I love you"));
//        return lessonFiveCards;
//    }
//}
