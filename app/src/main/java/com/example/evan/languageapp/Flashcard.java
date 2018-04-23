package com.example.evan.languageapp;

/**
 * Created by per6 on 3/19/18.
 */

public class Flashcard {

    private int number;
    private String chinese;
    private String pinyin;
    private String translation;
    private boolean star;

    //private Flashcard[] lessonOne, lessonTwo, lessonThree, lessonFour, lessonFive;

    public Flashcard(int number, String chinese, String pinyin, String translation, boolean star) {
        this.number = number;
        this.chinese = chinese;
        this.pinyin = pinyin;
        this.translation = translation;
        this.star = star;
    }

    public Flashcard(String chinese, String translation){
        this.chinese = chinese;
        this.translation = translation;
    }

    public static void main (String[] args){
        Flashcard A1 = new Flashcard("你好 Nǐ hǎo", "Hello");
        Flashcard A2 = new Flashcard("你好嗎 Nǐ hǎo ma?", "How are you?");

        //Flashcard[] lessonOne = {A1, A2, A3, A4, A5, A6, A7, A8, A9, A10};
        //Flashcard[] lessonTwo = {B1, B2, B3, B4, B5, B6, B7, B8, B9, B10};


    }





    //Getters and setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "com.example.evan.languageapp.Flashcard{" +
                "number=" + number +
                ", chinese='" + chinese + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", translation='" + translation + '\'' +
                ", star=" + star +
                '}';
    }

}
