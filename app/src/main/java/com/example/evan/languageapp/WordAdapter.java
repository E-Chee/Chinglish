package com.example.evan.languageapp;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by per6 on 3/23/18.
 */

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.MyViewHolder> {
    private Context context;
    private List<LanguageCard> languageCards;
    private LanguageCard languageCard;
    private ItemPhraseCard itemPhraseCard;

    public WordAdapter(Context context, List<LanguageCard> languageCards) {
        Log.d("languageCard", "WordAdapter: " + languageCards);
        this.context = context;
        this.languageCards = languageCards;
        this.languageCard = languageCards.get(0);
        this.itemPhraseCard = new ItemPhraseCard(0);
    }

    //creates the ViewHolder by inflating the layout and returning it
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_phrase, parent, false);

        return new MyViewHolder(itemView);
    }

    //assigns the appropriate information from the word object to each widget in the layout
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //1. get the object at the position form the list
        LanguageCard languageCard = this.languageCards.get(position);
        //set the textviews/widgets in the viewholder
        holder.chinese.setText(languageCard.getChinese());
        holder.pinyin.setText(languageCard.getPinyin());
        holder.english.setText(languageCard.getEnglish());
    }

    @Override
    public int getItemCount() {
        Log.d("List size", "getItemCount: " + languageCards.size());
        return languageCards.size();
    }

    //inside, we wire widgets for our layout
    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView chinese, pinyin, english;
        private ConstraintLayout constraintLayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            chinese = itemView.findViewById(R.id.chinese);
            pinyin = itemView.findViewById(R.id.pinyin);
            english = itemView.findViewById(R.id.english);
            constraintLayout = itemView.findViewById(R.id.constraints_phrase);

            constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
                    i.putExtra("background info", languageCards.get(getAdapterPosition()).getDesc());
                    context.startActivity(i);
                }
            });

//            constraintLayout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Log.d("view id", "onClick: " + view.getId() + " " + R.id.chinese);
//                    //this is a series of statements to check what the user is clicking, either chinese, english, or pinyin, and sends to correct info to that activity
//                    switch (view.getId()) {
//                        case R.id.constraints_phrase: //for chinese
////                          Log.d("bundle for recyclerview", "onClick: " + bundle.getString("intro paragraph"));
//                            Log.d("checking chinese 1", "chinese ni hao onClick: " + chinese);
//                            Log.d("double check 1", "actual chinese 1: " + languageCards.get(0).getChinese());
//                            if (chinese.getText().equals("你好")) {
//                                Log.d("checking chinese 1", "chinese ni hao onClick: " + chinese);
//                                Log.d("double check 1", "actual chinese 1: " + languageCards.get(0).getChinese());
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info", "This here is an interesting phrase. Nǐ means you, and hǎo means good. " +
//                                        "However, when you put these two together, you get hello. " +
//                                        "This provides some insight into Chinese culture. Imagine a world where you say, \"You are good\" instead of saying hi. " +
//                                        "Kind of strange isn't it?");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("好久不見")) {
//                                Log.d("checking chinese 2", "Chinese hao jiu bu jian onClick: " + chinese);
//                                Log.d("double check 2", "actual chinese 2: " + languageCards.get(1).getChinese());
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","In Chinese, hǎo can mean many things, though most commonly, good. " +
//                                        "In this case however, hǎo becomes an adverb which modifies the word after it, jiǔ. " +
//                                        "Jiǔ means long and bùjiàn literally means no see. " +
//                                        "So when hǎo modifies jiǔ, it means very, resulting in the phrase meaning, “long time no see”.");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("早上好")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This one is relatively self explanatory. " +
//                                        "Zǎoshang means morning and just like in \"hello\", hao means good.");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("你好嗎")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Just like the other phrases, nǐ means “you” and hǎo means “good”. " +
//                                        "The ma in this phrase is a word used to indicate a question. " +
//                                        "When you put it all together, you get “You good?” or more accurately, \"How are you?\"");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("我很好")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The character wǒ means I or me and hén means very. " +
//                                        "When putting it together, you get “I’m very good” or \"I’m great\".");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("馬馬虎虎")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This word doesn’t make much sense when putting together the root words, " +
//                                        "but it means so-so or not good or bad. It’s often used when replying to \"Nǐ hǎo ma?\"");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("我不好")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The word bù/bú means “no” or “not”, so Wǒ bù hǎo means \"I’m not good.\"");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("再見")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The word phrase Zàijiàn means goodbye or bye. When zàijiàn is used, " +
//                                        "it’s inferred the two people will meet again.");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("明天見")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Míngtiān jiàn means see you tomorrow. " +
//                                        "As you may have noticed, it has the same jiàn from Zàijiàn, which means \"meet\"");
//                                context.startActivity(i);
//                            }
//                            else if (chinese.getText().equals("晚安")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This phrase means \"good night\". Wǎn means \"late\" and ān means \"peaceful\".");
//                                context.startActivity(i);
//                            }
//                            break;
//
//                        case R.id.english: //the statements for english
//                            if (english.getText().equals("Hello")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info", "This here is an interesting phrase. Nǐ means you, and hǎo means good. " +
//                                        "However, when you put these two together, you get hello. " +
//                                        "This provides some insight into Chinese culture. Imagine a world where you say, \"You are good\" instead of saying hi. " +
//                                        "Kind of strange isn't it?");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("Long time no see")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","In Chinese, hǎo can mean many things, though most commonly, good. " +
//                                        "In this case however, hǎo becomes an adverb which modifies the word after it, jiǔ. " +
//                                        "Jiǔ means long and bùjiàn literally means no see. " +
//                                        "So when hǎo modifies jiǔ, it means very, resulting in the phrase meaning, “long time no see”.");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("Good morning")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This one is relatively self explanatory. " +
//                                        "Zǎoshang means morning and just like in \"hello\", hao means good.");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("How are you?")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Just like the other phrases, nǐ means “you” and hǎo means “good”. " +
//                                        "The ma in this phrase is a word used to indicate a question. " +
//                                        "When you put it all together, you get “You good?” or more accurately, \"How are you?\"");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("I'm great")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The character wǒ means I or me and hén means very. " +
//                                        "When putting it together, you get “I’m very good” or \"I’m great\".");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("So-so")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This word doesn’t make much sense when putting together the root words, " +
//                                        "but it means so-so or not good or bad. It’s often used when replying to \"Nǐ hǎo ma?\"");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("I'm not so good")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The word bù/bú means “no” or “not”, so Wǒ bù hǎo means \"I’m not good.\"");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("Goodbye")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The word phrase Zàijiàn means goodbye or bye. When zàijiàn is used, " +
//                                        "it’s inferred the two people will meet again.");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("See you tomorrow")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Míngtiān jiàn means see you tomorrow. " +
//                                        "As you may have noticed, it has the same jiàn from Zàijiàn, which means \"meet\"");
//                                context.startActivity(i);
//                            }
//                            else if (english.getText().equals("Good night")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This phrase means \"good night\". Wǎn means \"late\" and ān means \"peaceful\".");
//                                context.startActivity(i);
//                            }
//                            break;
//                        case R.id.pinyin: //the statements for pinyin
//                            if (pinyin.getText().equals("Nǐ hǎo")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info", "This here is an interesting phrase. Nǐ means you, and hǎo means good. " +
//                                        "However, when you put these two together, you get hello. " +
//                                        "This provides some insight into Chinese culture. Imagine a world where you say, \"You are good\" instead of saying hi. " +
//                                        "Kind of strange isn't it?");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Hǎojiǔ bùjiàn")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","In Chinese, hǎo can mean many things, though most commonly, good. " +
//                                        "In this case however, hǎo becomes an adverb which modifies the word after it, jiǔ. " +
//                                        "Jiǔ means long and bùjiàn literally means no see. " +
//                                        "So when hǎo modifies jiǔ, it means very, resulting in the phrase meaning, “long time no see”.");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Zǎoshang hǎo")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This one is relatively self explanatory. " +
//                                        "Zǎoshang means morning and just like in \"hello\", hao means good.");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Nǐ hǎo ma")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Just like the other phrases, nǐ means “you” and hǎo means “good”. " +
//                                        "The ma in this phrase is a word used to indicate a question. " +
//                                        "When you put it all together, you get “You good?” or more accurately, \"How are you?\"");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Wǒ hěn hǎo")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The character wǒ means I or me and hén means very. " +
//                                        "When putting it together, you get “I’m very good” or \"I’m great\".");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Wǒ hái kěyǐ")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Hái means \"or\" or \"also\" and kěyǐ means \"ok\" or \"can\" " +
//                                        "but combined together, these three words mean \"alright\" or \"so-so\".");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Wǒ bù hǎo")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The word bù/bú means “no” or “not”, so Wǒ bù hǎo means \"I’m not good.\"");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Zàijiàn")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","The word phrase Zàijiàn means goodbye or bye. When zàijiàn is used, " +
//                                        "it’s inferred the two people will meet again.");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Míngtiān jiàn")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","Míngtiān jiàn means see you tomorrow. " +
//                                        "As you may have noticed, it has the same jiàn from Zàijiàn, which means \"meet\"");
//                                context.startActivity(i);
//                            }
//                            else if (pinyin.getText().equals("Wǎn'ān")) {
//                                Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
//                                i.putExtra("background info","This phrase means \"good night\". Wǎn means \"late\" and ān means \"peaceful\".");
//                                context.startActivity(i);
//                            }
//                            break;
//                    }
//                }
//            });

        }
    }
}
