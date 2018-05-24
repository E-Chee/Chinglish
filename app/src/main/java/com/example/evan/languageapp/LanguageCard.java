package com.example.evan.languageapp;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 3/27/18.
 */

public class LanguageCard implements Parcelable{

    private String english;
    private String pinyin;
    private String chinese;
    private String desc;
    private Quiz quiz;


    public LanguageCard(String chinese, String pinyin, String english, String desc, Quiz quiz) {
        this.english = english;
        this.pinyin = pinyin;
        this.chinese = chinese;
        this.desc = desc;
        this.quiz = quiz;
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

    public Quiz getQuiz() {
        Log.d("quiz 1", "getQuiz: " + quiz);
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return chinese + pinyin + english;
    }

    public static List<LanguageCard> getLessonFourCards(Context context) {
        ArrayList<LanguageCard> lessonOneCards = new ArrayList<LanguageCard>();
        List<Quiz> quizzes = Quiz.generateLessonFourQuestions();
        lessonOneCards.add(new LanguageCard("你好", "Nǐ hǎo", "Hello", context.getString(R.string.lesson_1_card_1), quizzes.get(0)));
//        lessonOneCards.add(new LanguageCard("好久不見", "Hǎojiǔ bùjiàn", "Long time no see", context.getString(R.string.lesson_1_card_2), quizzes.get(1)));
//        lessonOneCards.add(new LanguageCard("早上好", "Zǎoshàng hǎo", "Good morning", context.getString(R.string.lesson_1_card_3), quizzes.get(2)));
//        lessonOneCards.add(new LanguageCard("你好嗎", "Nǐ hǎo ma", "How are you?", context.getString(R.string.lesson_1_card_4), quizzes.get(3)));
//        lessonOneCards.add(new LanguageCard("我很好", "Wǒ hěn hǎo", "I'm great", context.getString(R.string.lesson_1_card_5), quizzes.get(4)));
//        lessonOneCards.add(new LanguageCard("我還可以", "Wǒ hái kěyǐ", "I'm alright", context.getString(R.string.lesson_1_card_6), quizzes.get(5)));
//        lessonOneCards.add(new LanguageCard("我不好", "Wǒ bù hǎo", "I'm not so good", context.getString(R.string.lesson_1_card_7), quizzes.get(6)));
//        lessonOneCards.add(new LanguageCard("再見", "Zàijiàn", "Good bye", context.getString(R.string.lesson_1_card_8), quizzes.get(7)));
//        lessonOneCards.add(new LanguageCard("明天見", "Míngtiān jiàn", "See you tomorrow", context.getString(R.string.lesson_1_card_9), quizzes.get(8)));
//        lessonOneCards.add(new LanguageCard("晚安", "Wǎn'ān", "Good night",context.getString(R.string.lesson_1_card_10), quizzes.get(9)));
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
        List<Quiz> quizzes = Quiz.generateLessonTwoQuestions();
        lessonTwoCards.add(new LanguageCard("一", "yī", "one", "", quizzes.get(0)));
//        lessonTwoCards.add(new LanguageCard("二", "èr", "two","", quizzes.get(1)));
//        lessonTwoCards.add(new LanguageCard("三", "sān", "three","", quizzes.get(2)));
//        lessonTwoCards.add(new LanguageCard("四", "sì", "four","", quizzes.get(3)));
//        lessonTwoCards.add(new LanguageCard("五", "wǔ", "five","", quizzes.get(4)));
//        lessonTwoCards.add(new LanguageCard("六", "liù", "six","", quizzes.get(5)));
//        lessonTwoCards.add(new LanguageCard("七", "qī", "seven","", quizzes.get(6)));
//        lessonTwoCards.add(new LanguageCard("八", "bā", "eight","", quizzes.get(7)));
//        lessonTwoCards.add(new LanguageCard("九", "jiǔ", "nine","", quizzes.get(8)));
//        lessonTwoCards.add(new LanguageCard("十", "shí", "ten","", quizzes.get(9)));
        return lessonTwoCards;
    }

    public static List<LanguageCard> getLessonThreeCards() {
        ArrayList<LanguageCard> lessonThreeCards = new ArrayList<LanguageCard>();
        List<Quiz> quizzes = Quiz.generateLessonThreeQuestions();
        lessonThreeCards.add(new LanguageCard("紅色", "Hóngsè", "red","", quizzes.get(0)));
//        lessonThreeCards.add(new LanguageCard("藍色", "Lán sè", "blue","", quizzes.get(1)));
//        lessonThreeCards.add(new LanguageCard("黃色", "Huángsè", "yellow","", quizzes.get(2)));
//        lessonThreeCards.add(new LanguageCard("綠色", "Lǜsè", "green","", quizzes.get(3)));
//        lessonThreeCards.add(new LanguageCard("橙色", "Chéngsè", "orange","", quizzes.get(4)));
//        lessonThreeCards.add(new LanguageCard("紫色", "Zǐsè", "purple","", quizzes.get(5)));
//        lessonThreeCards.add(new LanguageCard("棕色", "Zōngsè", "brown","", quizzes.get(6)));
//        lessonThreeCards.add(new LanguageCard("黑色", "Hēisè", "black","", quizzes.get(7)));
//        lessonThreeCards.add(new LanguageCard("白色", "Báisè", "white","", quizzes.get(8)));
//        lessonThreeCards.add(new LanguageCard("灰色", "Huīsè", "gray","", quizzes.get(9)));
        return lessonThreeCards;
    }

    public static List<LanguageCard> getLessonOneCards(Context context) {
        ArrayList<LanguageCard> lessonFourCards = new ArrayList<LanguageCard>();
        List<Quiz> quizzes = Quiz.generateLessonOneQuestions();
        lessonFourCards.add(new LanguageCard("我", "wǒ", "I",context.getString(R.string.lesson_4_card_1), quizzes.get(0)));
        lessonFourCards.add(new LanguageCard("你", "nǐ", "you",context.getString(R.string.lesson_4_card_2), quizzes.get(1)));
        lessonFourCards.add(new LanguageCard("和", "hé", "and",context.getString(R.string.lesson_4_card_3), quizzes.get(2)));
        lessonFourCards.add(new LanguageCard("的", "de", "a word showing possession",context.getString(R.string.lesson_4_card_4), quizzes.get(3)));
        lessonFourCards.add(new LanguageCard("嗎", "ma", "a word indicating a quiz",context.getString(R.string.lesson_4_card_5), quizzes.get(4)));
        lessonFourCards.add(new LanguageCard("不", "bù/bú", "no / not",context.getString(R.string.lesson_4_card_6), quizzes.get(5)));
        lessonFourCards.add(new LanguageCard("是", "shì", "is / am / are",context.getString(R.string.lesson_4_card_7), quizzes.get(6)));
        lessonFourCards.add(new LanguageCard("也", "yě", "also",context.getString(R.string.lesson_4_card_8), quizzes.get(7)));
        lessonFourCards.add(new LanguageCard("得", "dé", "shows degree",context.getString(R.string.lesson_4_card_9), quizzes.get(8)));
        lessonFourCards.add(new LanguageCard("得", "de", "auxiliary verb / used after a verb",context.getString(R.string.lesson_4_card_10), quizzes.get(9)));
        return lessonFourCards;
    }

    public static List<LanguageCard> getLessonFiveCards(Context context) {
        ArrayList<LanguageCard> lessonFiveCards = new ArrayList<LanguageCard>();
        List<Quiz> quizzes = Quiz.generateLessonFiveQuestions();
        lessonFiveCards.add(new LanguageCard("是的", "shìde", "yes",context.getString(R.string.lesson_5_card_1), quizzes.get(0)));
//        lessonFiveCards.add(new LanguageCard("不是", "búshì", "no",context.getString(R.string.lesson_5_card_2), quizzes.get(1)));
//        lessonFiveCards.add(new LanguageCard("喜歡", "xǐhuān", "like",context.getString(R.string.lesson_5_card_3), quizzes.get(2)));
//        lessonFiveCards.add(new LanguageCard("謝謝", "xièxiè", "thank you",context.getString(R.string.lesson_5_card_4), quizzes.get(3)));
//        lessonFiveCards.add(new LanguageCard("不客氣", "bú kèqì", "you're welcome",context.getString(R.string.lesson_5_card_5), quizzes.get(4)));
//        lessonFiveCards.add(new LanguageCard("對不起", "duìbùqǐ", "sorry",context.getString(R.string.lesson_5_card_6), quizzes.get(5)));
//        lessonFiveCards.add(new LanguageCard("我叫 _", "wǒ jiào _", "my name is _",context.getString(R.string.lesson_5_card_7), quizzes.get(6)));
//        lessonFiveCards.add(new LanguageCard("沒關係", "Méiguānxì", "it's ok",context.getString(R.string.lesson_5_card_8), quizzes.get(7)));
//        lessonFiveCards.add(new LanguageCard("我不知道", "wǒ bù zhīdào", "I don't know",context.getString(R.string.lesson_5_card_9), quizzes.get(8)));
//        lessonFiveCards.add(new LanguageCard("我愛你", "wǒ ài nǐ", "I love you",context.getString(R.string.lesson_5_card_10), quizzes.get(9)));
        return lessonFiveCards;
    }

    protected LanguageCard(Parcel in) {
        english = in.readString();
        pinyin = in.readString();
        chinese = in.readString();
        desc = in.readString();
        quiz = (Quiz) in.readValue(Quiz.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(english);
        dest.writeString(pinyin);
        dest.writeString(chinese);
        dest.writeString(desc);
        dest.writeValue(quiz);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<LanguageCard> CREATOR = new Parcelable.Creator<LanguageCard>() {
        @Override
        public LanguageCard createFromParcel(Parcel in) {
            return new LanguageCard(in);
        }

        @Override
        public LanguageCard[] newArray(int size) {
            return new LanguageCard[size];
        }
    };
}
