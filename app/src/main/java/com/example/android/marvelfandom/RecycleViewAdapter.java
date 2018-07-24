package com.example.android.marvelfandom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context mContext;
    private ArrayList<ListItem> items;

    public RecycleViewAdapter(Context mContext, ArrayList<ListItem> Items) {
        this.mContext = mContext;
        this.items = Items;
        Log.d("RECYCLE VIEW ADAPTER", "IN CONSTRUCTOR: ");
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getListItemType();
    }


    public static class MovieViewHolder extends ViewHolder {

        TextView textview;
        ImageView imageview;

        public MovieViewHolder(View itemView) {
            super(itemView);

            this.textview = (TextView) itemView.findViewById(R.id.movie_card_text);
            this.imageview = (ImageView) itemView.findViewById(R.id.movie_card_image);
        }

        public void bindType(ListItem item) {
            textview.setText(((Movies) item).getName());
            imageview.setImageResource(((Movies) item).getImage_id());
        }
    }

    public static class CharacterViewHolder extends ViewHolder {

        TextView textview;
        ImageView imageview;

        public CharacterViewHolder(View itemView) {
            super(itemView);

            this.textview = (TextView) itemView.findViewById(R.id.card_text);
            this.imageview = (ImageView) itemView.findViewById(R.id.card_image);
        }

        public void bindType(ListItem item) {
            textview.setText(((Character) item).getName());
            imageview.setImageResource(((Character) item).getImage_id());
        }
    }
    /*@NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.character_card,parent,false);
        return new MyViewHolder(view);

    }*/

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        View view = null;
        switch (type) {
            case ListItem.CHARACTER:
                view = LayoutInflater
                        .from(viewGroup.getContext())
                        .inflate(R.layout.character_card, viewGroup, false);
                return new CharacterViewHolder(view);
            case ListItem.MOVIE:
                view = LayoutInflater
                        .from(viewGroup.getContext())
                        .inflate(R.layout.movie_card, viewGroup, false);
                return new MovieViewHolder(view);
        }
        return null;
    }
    /*
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.char_name.setText(characters.get(position).getName());
        holder.char_img.setImageResource(characters.get(position).getImage_id());
    }*/

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int pos) {
        ListItem item = items.get(pos);
        viewHolder.bindType(item);
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    /*public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView char_name;
        ImageView char_img;
        public MyViewHolder(View itemView) {
            super(itemView);
            Log.d("RecycleAdapter", "Initialising contents of cards ");
            char_name = (TextView) itemView.findViewById(R.id.card_text);
            char_img = (ImageView) itemView.findViewById(R.id.card_image);
        }
    }*/
}
