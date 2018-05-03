package com.example.evan.languageapp;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NumbersFlashcardAdapter extends RecyclerView.Adapter<NumbersFlashcardAdapter.MyViewHolder> {
    private Context context;
    //    private List<Vocab> chWords; //data
//    private List<Vocab> pinyin;
//    private List<Vocab> engWords;
    private List<Vocab> words;


    public NumbersFlashcardAdapter(Context context, List<Vocab> words ) {
        this.context = context;
        this.words = words;

    }

    //Inflates the layout we created and returns it
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.numbersflashcard_item, parent, false);

        return new MyViewHolder(itemView);
    }

    //The number of items in your list
//    @Override
//    public int getItemCount() {
//        return words;
//    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView chText, pinyinText, engText;
        private View back, front;
        private AnimatorSet cardIn, cardOut;
        private boolean mIsBackVisible = false;

        public MyViewHolder(View itemView) {

            super(itemView);

            cardIn = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.animation);
            cardOut = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.backanimation);


            chText = (TextView) itemView.findViewById(R.id.textView_chWord);
            pinyinText = (TextView) itemView.findViewById(R.id.textView_pinyin);
            engText = (TextView) itemView.findViewById(R.id.textView_engWord);
            back = itemView.findViewById(R.id.card_back);
            front = itemView.findViewById(R.id.card_front);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!mIsBackVisible) {

                        cardIn.setTarget(back);
                        cardOut.setTarget(front);
                        cardIn.start();
                        cardOut.start();
                        mIsBackVisible = true;
                    } else {
                        cardIn.setTarget(front);
                        cardOut.setTarget(back);
                        cardIn.start();

                        cardOut.start();
                        mIsBackVisible = false;
                    }
                }

            });
        }

        public void changeCameraDistance() {
            int distance = 10000;
            float scale = context.getResources().getDisplayMetrics().density * distance;
            front.setCameraDistance(scale);
            back.setCameraDistance(scale);
        }




    }

    //Assigns the data from your list to the views & widgets in your layout
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Vocab word = words.get(position);
        holder.chText.setText(word.getWord());
        holder.pinyinText.setText(word.getPinyin());
        holder.engText.setText(word.getEng());
        holder.changeCameraDistance();

    }

    @Override
    public int getItemCount() {
        return words.size();
    }

}


