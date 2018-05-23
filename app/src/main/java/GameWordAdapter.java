import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.evan.languageapp.Gamecard;
import com.example.evan.languageapp.ItemPhraseCard;
import com.example.evan.languageapp.LanguageCard;
import com.example.evan.languageapp.LessonOneRecyclerViewDetails;
import com.example.evan.languageapp.R;
import com.example.evan.languageapp.WordAdapter;

import java.util.List;

/**
 * Created by per6 on 5/21/18.
 */

public class GameWordAdapter extends RecyclerView.Adapter<GameWordAdapter.MyViewHolder>{

    private Context context;
    private List<Gamecard> gamecards;
    private Gamecard gamecard;

    public GameWordAdapter(Context context, List<Gamecard> gamecards) {
        Log.d("gamecard", "GameWordAdapter: " + gamecards);
        this.context = context;
        this.gamecards = gamecards;
        this.gamecard = gamecards.get(0);
    }

    //creates the ViewHolder by inflating the layout and returning it
    @Override
    public GameWordAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_phrase, parent, false);

        return new GameWordAdapter.MyViewHolder(itemView);
    }

    //assigns the appropriate information from the word object to each widget in the layout
    @Override
    public void onBindViewHolder(GameWordAdapter.MyViewHolder holder, int position) {
        //1. get the object at the position form the list
        Gamecard gamecard = this.gamecards.get(position);
        //set the textviews/widgets in the viewholder
        holder.primary.setText(gamecard.getPrimary());
        holder.translation.setText(gamecard.getTranslation());

    }

    @Override
    public int getItemCount() {
        Log.d("List size", "getItemCount: " + gamecards.size());
        return gamecards.size();
    }

    //inside, we wire widgets for our layout
    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView primary, translation;
        private ConstraintLayout constraintLayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            primary = itemView.findViewById(R.id.primary);
            translation = itemView.findViewById(R.id.translation);
            constraintLayout = itemView.findViewById(R.id.constraints_phrase);

            constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), LessonOneRecyclerViewDetails.class);
                    i.putExtra("background info", gamecards.get(getAdapterPosition()).getDesc());
                    context.startActivity(i);
                }
            });
        }
    }
}
