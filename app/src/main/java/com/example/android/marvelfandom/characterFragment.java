package com.example.android.marvelfandom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class characterFragment extends Fragment {

    ArrayList<ListItem> characters;
    GridLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_character, container, false);
        //CardView cardview = (CardView) rootView.findViewById(R.id.cardview);

        characters = new ArrayList<>();
        characters.add(new Character(1,"T'Challa","Black Panther",R.drawable.bp));
        characters.add(new Character(2,"T'Challa","Black Panther",R.drawable.bp));
        characters.add(new Character(3,"T'Challa","Black Panther",R.drawable.bp));
        characters.add(new Character(4,"Tony Stark","Iron man",R.drawable.im));
        characters.add(new Character(5,"T'Challa","Black Panther",R.drawable.bp));
        characters.add(new Character(6,"T'Challa","Black Panther",R.drawable.bp));
        characters.add(new Character(7,"T'Challa","Black Panther",R.drawable.bp));

        RecyclerView newrv = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        Log.d("CHARACTER FRAGMENT", "onCreateView: ");
        //RecycleViewAdapter adapter = new RecycleViewAdapter(getContext(),characters);

        RecycleViewAdapter adapter = new RecycleViewAdapter(getContext(),characters);
        layoutManager = new GridLayoutManager(getContext(),2);
        newrv.setAdapter(adapter);
        newrv.setLayoutManager(layoutManager);




        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter(exampleAdapter);


        return rootView;
    }
}