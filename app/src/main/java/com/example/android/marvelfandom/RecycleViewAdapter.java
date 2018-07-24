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

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Character> characters;

    public RecycleViewAdapter(Context mContext, ArrayList<Character> characters) {
        this.mContext = mContext;
        this.characters = characters;
        Log.d("RECYCLE VIEW ADAPTER", "IN CONSTRUCTOR: ");
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.character_card,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.char_name.setText(characters.get(position).getName());
        holder.char_img.setImageResource(characters.get(position).getImage_id());
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView char_name;
        ImageView char_img;
        public MyViewHolder(View itemView) {
            super(itemView);
            Log.d("RecycleAdapter", "Initialising contents of cards ");
            char_name = (TextView) itemView.findViewById(R.id.card_text);
            char_img = (ImageView) itemView.findViewById(R.id.card_image);
        }
    }
}
