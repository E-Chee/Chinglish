package com.example.evan.languageapp;

/**
 * Created by per6 on 4/11/18.
 */

public class Vocab {

    private String word, pinyin, eng;
    private int pos;


    public Vocab() {
        word = "";
        pinyin = "";
        eng = "";

    }

    public Vocab(String word, String pinyin, String eng) {
        this.word = word;
        this.pinyin = pinyin;
        this.eng = eng;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", pinyin=" + pinyin +
                ", english definition=" + eng +
                '}';
    }
}
