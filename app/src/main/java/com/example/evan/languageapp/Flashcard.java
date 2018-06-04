package com.example.evan.languageapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by per6 on 3/19/18.
 */

public class Flashcard implements Parcelable{

    private int number;
    private String chinese;
    private String pinyin;
    private String translation;
    private boolean star;

    //private Flashcard[] lessonOne, lessonTwo, lessonThree, lessonFour, lessonFive;

    public Flashcard(){
        super();
    }

    public Flashcard(Parcel parcel){
        this.chinese = parcel.readString();
        this.translation = parcel.readString();
    }


    public Flashcard(int number, String chinese, String pinyin, String translation) {
        this.number = number;
        this.chinese = chinese;
        this.pinyin = pinyin;
        this.translation = translation;
        this.star = false;
    }

    public Flashcard(String chinese, String translation){
        this.chinese = chinese;
        this.translation = translation;
    }

    public static void main (String[] args){
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

        Flashcard E1 = new Flashcard("是的 shìde", "Yes");                          //Lesson 5 Conversations
        Flashcard E2 = new Flashcard("不是 búshì", "No");
        Flashcard E3 = new Flashcard("喜歡 xǐhuān", "Like");
        Flashcard E4 = new Flashcard("謝謝 xièxiè", "Thank you");
        Flashcard E5 = new Flashcard("不客氣 bù kèqì", "You're welcome");
        Flashcard E6 = new Flashcard("對不起 duìbùqǐ", "Sorry");
        Flashcard E7 = new Flashcard("我叫 ___ wǒ jiào ___", "My name is ___");
        Flashcard E8 = new Flashcard("沒關係 Méiguānxì", "It's ok");
        Flashcard E9 = new Flashcard("我不知道 wǒ bù zhīdào", "I don't know");
        Flashcard E10 = new Flashcard("我愛你 wǒ ài nǐ", "I love you");


        Flashcard[] lessonOne = {A1, A2, A3, A4, A5, A6, A7, A8, A9, A10};                             //Lesson One
        Flashcard[] lessonTwo = {B1, B2, B3, B4, B5, B6, B7, B8, B9, B10};
        Flashcard[] lessonThree = {C1, C2, C3, C4, C5, C6, C7, C8, C9, C10};
        Flashcard[] lessonFour = {D1, D2, D3, D4, D5, D6, D7, D8, D9, D10};
        Flashcard[] lessonFive = {E1, E2, E3, E4, E5, E6, E7, E8, E9, E10};


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

    public boolean getStarStatus() {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.chinese);
        parcel.writeString(this.translation);
    }

    public static final Creator<Flashcard> CREATOR = new Creator<Flashcard>() {
        @Override
        public Flashcard createFromParcel(Parcel parcel) {
            return new Flashcard(parcel);
        }

        @Override
        public Flashcard[] newArray(int i) {
            return new Flashcard[i];
        }
    };


}
