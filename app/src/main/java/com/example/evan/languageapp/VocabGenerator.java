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
        words.add(new Vocab("word1", "pinyin1", "eng1"));
        words.add(new Vocab("word2", "pinyin2", "eng2"));
        words.add(new Vocab("word3", "pinyin3", "eng3"));
        return words;
    }
}
