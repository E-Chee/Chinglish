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
        lessonOneCards.add(new LanguageCard("你好嗎", "Nǐ hǎo ma", "how are you?"));
        lessonOneCards.add(new LanguageCard("好久不見", "Hǎojiǔ bùjiàn", "long time no see"));
        lessonOneCards.add(new LanguageCard("我很好", "Wǒ hěn hǎo", "I'm great"));
        lessonOneCards.add(new LanguageCard("馬馬虎虎", "Mǎmǎhǔhǔ", "so-so"));
        lessonOneCards.add(new LanguageCard("我不好", "Wǒ bù hǎo", "I'm not so good"));
        lessonOneCards.add(new LanguageCard("再見", "Zàijiàn", "goodbye"));
        lessonOneCards.add(new LanguageCard("明天見", "Míngtiān jiàn", "see you tomorrow"));
        lessonOneCards.add(new LanguageCard("早上好", "Zǎoshang hǎo", "good morning"));
        lessonOneCards.add(new LanguageCard("晚安", "Wǎn'ān", "good night"));
        return lessonOneCards;
    }

    public static List<LanguageCard> getLessonTwoCards() {
        ArrayList<LanguageCard> lessonTwoCards = new ArrayList<LanguageCard>();
        lessonTwoCards.add(new LanguageCard("一", "yī", "one"));
        lessonTwoCards.add(new LanguageCard("二", "èr", "two"));
        lessonTwoCards.add(new LanguageCard("三", "sān", "three"));
        lessonTwoCards.add(new LanguageCard("四", "sì", "four"));
        lessonTwoCards.add(new LanguageCard("五", "wǔ", "five"));
        lessonTwoCards.add(new LanguageCard("六", "liù", "six"));
        lessonTwoCards.add(new LanguageCard("七", "qī", "seven"));
        lessonTwoCards.add(new LanguageCard("八", "bā", "eight"));
        lessonTwoCards.add(new LanguageCard("九", "jiǔ", "nine"));
        lessonTwoCards.add(new LanguageCard("十", "shí", "ten"));
        return lessonTwoCards;
    }
    public static List<LanguageCard> getLessonThreeCards() {
        ArrayList<LanguageCard> lessonThreeCards = new ArrayList<LanguageCard>();
        lessonThreeCards.add(new LanguageCard("紅色", "Hóngsè", "red"));
        lessonThreeCards.add(new LanguageCard("藍色", "Lán sè", "blue"));
        lessonThreeCards.add(new LanguageCard("黃色", "Huángsè", "yellow"));
        lessonThreeCards.add(new LanguageCard("綠色", "Lǜsè", "green"));
        lessonThreeCards.add(new LanguageCard("橙色", "Chéngsè", "orange"));
        lessonThreeCards.add(new LanguageCard("紫色", "Zǐsè", "purple"));
        lessonThreeCards.add(new LanguageCard("棕色", "Zōngsè", "brown"));
        lessonThreeCards.add(new LanguageCard("黑色", "Hēisè", "black"));
        lessonThreeCards.add(new LanguageCard("白色", "Báisè", "gray"));
        lessonThreeCards.add(new LanguageCard("灰色", "Huīsè", "white"));
        return lessonThreeCards;
    }
    public static List<LanguageCard> getLessonFourCards() {
        ArrayList<LanguageCard> lessonFourCards = new ArrayList<LanguageCard>();
        lessonFourCards.add(new LanguageCard("我", "wo3", "I"));
        lessonFourCards.add(new LanguageCard("你", "ni3", "you"));
        lessonFourCards.add(new LanguageCard("和", "hé", "and"));
        lessonFourCards.add(new LanguageCard("的", "de", "a word showing possession"));
        lessonFourCards.add(new LanguageCard("嗎", "ma", "a word indicating a question"));
        lessonFourCards.add(new LanguageCard("不", "bu4/bu2", "no/not"));
        lessonFourCards.add(new LanguageCard("是", "shi4", "is/am/are"));
        lessonFourCards.add(new LanguageCard("也", "yě", "also"));
        lessonFourCards.add(new LanguageCard("得", "de2", "shows degree"));
        lessonFourCards.add(new LanguageCard("得", "de", "auxiliary verb/used after a verb"));
        return lessonFourCards;
    }
    public static List<LanguageCard> getLessonFiveCards() {
        ArrayList<LanguageCard> lessonFiveCards = new ArrayList<LanguageCard>();
        lessonFiveCards.add(new LanguageCard("是的", "shi4de", "yes"));
        lessonFiveCards.add(new LanguageCard("不是", "bu2shi4", "no"));
        lessonFiveCards.add(new LanguageCard("喜歡", "xǐhuān", "like"));
        lessonFiveCards.add(new LanguageCard("謝謝", "xièxiè", "thank you"));
        lessonFiveCards.add(new LanguageCard("不客氣", "bù kèqì", "you're welcome"));
        lessonFiveCards.add(new LanguageCard("對不起", "duìbùqǐ", "sorry"));
        lessonFiveCards.add(new LanguageCard("我叫 _", "wǒ jiào _", "my name is _"));
        lessonFiveCards.add(new LanguageCard("沒關係", "Méiguānxì", "it's ok"));
        lessonFiveCards.add(new LanguageCard("我不知道", "wǒ bù zhīdào", "I don't know"));
        lessonFiveCards.add(new LanguageCard("我愛你", "wǒ ài nǐ", "I love you"));
        return lessonFiveCards;
    }
}

