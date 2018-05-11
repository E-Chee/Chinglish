package com.example.evan.languageapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 4/27/18.
 */

public class VocabGenerator {

    public static List<Vocab> getGreetings()
    {
        List<Vocab> words;
        words = new ArrayList<>();
        words.add(new Vocab("你好", "Nǐ hǎo", "Hello"));
        words.add(new Vocab("你好嗎", "Nǐ hǎo ma", "How are you"));
        words.add(new Vocab("好久不見", "Hǎojiǔ bùjiàn", "Long time no see"));
        words.add(new Vocab("我很好", "Wǒ hěn hǎo", "I’m great"));
        words.add(new Vocab("馬馬虎虎", "Mǎmǎhǔhǔ", "So-so"));
        words.add(new Vocab("我不好", "Wǒ bù hǎo", "I’m not so good"));
        words.add(new Vocab("再見", "Zàijiàn", "Goodbye"));
        words.add(new Vocab("明天見", "Míngtiān jiàn", "See you tomorrow"));
        words.add(new Vocab("早上好", "Zǎoshang hǎo", "Good morning"));
        words.add(new Vocab("晚安", "Wǎn'ān", "Good night"));
        return words;
    }

    public static List<Vocab> getColors()
    {
        List<Vocab> words;
        words = new ArrayList<>();
        words.add(new Vocab("紅色", "Hóngsè", "Red"));
        words.add(new Vocab("藍色", "Lán sè", "Blue"));
        words.add(new Vocab("黃色", "Huángsè", "Yellow"));
        words.add(new Vocab("綠色", "Lǜsè", "Green"));
        words.add(new Vocab("橙色", "Chéngsè", "Orange"));
        words.add(new Vocab("紫色", "Zǐsè", "Purple"));
        words.add(new Vocab("棕色", "Zōngsè", "Brown"));
        words.add(new Vocab("黑色", "Hēisè", "Black"));
        words.add(new Vocab("白色", "Báisè", "White"));
        words.add(new Vocab("灰色", "Huīsè", "Gray"));
        return words;
    }

    public static List<Vocab> getNumbers()
    {
        List<Vocab> words;
        words = new ArrayList<>();
        words.add(new Vocab("一", "yī", "One"));
        words.add(new Vocab("二", "èr", "Two"));
        words.add(new Vocab("三", "sān", "Three"));
        words.add(new Vocab("四", "sì", "Four"));
        words.add(new Vocab("五", "wǔ", "Five"));
        words.add(new Vocab("六", "liù", "Six"));
        words.add(new Vocab("七", "qī", "Seven"));
        words.add(new Vocab("八", "bā", "Eight"));
        words.add(new Vocab("九", "jiǔ", "Nine"));
        words.add(new Vocab("十", "shí", "Ten"));
        return words;
    }

    public static List<Vocab> getGrammar()
    {
        List<Vocab> words;
        words = new ArrayList<>();
        words.add(new Vocab("我", "wǒ", "I"));
        words.add(new Vocab("你", "nǐ", "You"));
        words.add(new Vocab("和", "hé", "And"));
        words.add(new Vocab("的", "de", "a word showing possession"));
        words.add(new Vocab("嗎", "ma", "a word indicating a question"));
        words.add(new Vocab("不", "bù/bú", "no/not"));
        words.add(new Vocab("是", "shì", "is/am/are"));
        words.add(new Vocab("也", "yě", "also"));
        words.add(new Vocab("得", "dé", "shows degree"));
        words.add(new Vocab("得", "de", "auxiliary verb used after a verb"));
        return words;
    }

    public static List<Vocab> getConvesations()
    {
        List<Vocab> words;
        words = new ArrayList<>();
        words.add(new Vocab("是的", "shìde", "Yes"));
        words.add(new Vocab("不是", "búshì", "No"));
        words.add(new Vocab("喜歡", "xǐhuān", "Like"));
        words.add(new Vocab("謝謝", "xièxiè", "Thank you"));
        words.add(new Vocab("不客氣", "bù kèqì", "You're Welcome"));
        words.add(new Vocab("對不起", "duìbùqǐ", "Sorry"));
        words.add(new Vocab("我叫", "wǒ jiào _", "My name is _"));
        words.add(new Vocab("沒關係", "Méiguānxì", "It's okay"));
        words.add(new Vocab("我不知道", "wǒ bù zhīdào", "I don't know"));
        words.add(new Vocab("我愛你", "wǒ ài nǐ", "I love you"));
        return words;
    }
}
