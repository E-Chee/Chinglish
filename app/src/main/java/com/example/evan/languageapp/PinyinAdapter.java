package com.example.evan.languageapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by per6 on three/23/18.
 */

public class PinyinAdapter extends RecyclerView.Adapter<PinyinAdapter.MyViewHolder> {
    private Context context;
    private List<LanguageCard> languageCards;
    private LanguageCard languageCard;
    private ItemPhraseCard itemPhraseCard;
    private ItemPinyinCard itemPinyinCard;
    private int pos;

    public PinyinAdapter(Context context, List<LanguageCard> languageCards) {
        Log.d("languageCard", "WordAdapter: " + languageCards);
        this.context = context;
        this.languageCards = languageCards;
        this.pos = 0;
        this.languageCard = languageCards.get(pos);
        this.itemPhraseCard = new ItemPhraseCard(0);
        this.itemPinyinCard = new ItemPinyinCard(0);
    }

    //creates the ViewHolder by inflating the layout and returning it
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pinyin, parent, false);

        return new MyViewHolder(itemView);
    }

    //assigns the appropriate information from the word object to each widget in the layout
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        //one. get the object at the position form the list
        final LanguageCard languageCard = this.languageCards.get(position);
        //set the textviews/widgets in the viewholder
//        holder.tone.setText(languageCard.getTone());
//        holder.explanation.setText(languageCard.getExplanation());
        holder.audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                MediaPlayer m = MediaPlayer.create(view.getContext(), languageCard.getAudio());
//                m.start();
            }
        });
    }

    @Override
    public int getItemCount() {
        Log.d("List size", "getItemCount: " + languageCards.size());
        return languageCards.size();
    }

    //inside, we wire widgets for our layout
    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tone, explanation;
        private ImageButton audio;

        public MyViewHolder(View itemView) {
            super(itemView);
            tone = itemView.findViewById(R.id.tone);
            explanation = itemView.findViewById(R.id.explanation);
            audio = itemView.findViewById(R.id.imageButton);


            final int id = itemView.getId();
        }
    }
}

