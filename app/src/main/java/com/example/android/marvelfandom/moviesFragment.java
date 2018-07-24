package com.example.android.marvelfandom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.marvelfandom.Character;
import com.example.android.marvelfandom.R;
import com.example.android.marvelfandom.RecycleViewAdapter;

import java.util.ArrayList;

public class moviesFragment extends Fragment {

    ArrayList<ListItem> movies;
    GridLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_character, container, false);
        //CardView cardview = (CardView) rootView.findViewById(R.id.cardview);
        movies = new ArrayList<>();
        movies.add(new Movies("Captain America: The First Avenger","2002","8.3",R.drawable.c1));
        movies.add(new Movies("Iron Man","2002","8.4",R.drawable.i1));
        movies.add(new Movies("Captain America: The First Avenger","2002","8.3",R.drawable.c1));
        movies.add(new Movies("Iron Man","2002","8.4",R.drawable.i1));
        movies.add(new Movies("Captain America: The First Avenger","2002","8.3",R.drawable.c1));
        movies.add(new Movies("Iron Man","2002","8.4",R.drawable.i1));
        movies.add(new Movies("Captain America: The First Avenger","2002","8.3",R.drawable.c1));
        movies.add(new Movies("Iron Man","2002","8.4",R.drawable.i1));
        movies.add(new Movies("Captain America: The First Avenger","2002","8.3",R.drawable.c1));
        movies.add(new Movies("Iron Man","2002","8.4",R.drawable.i1));


        RecycleViewAdapter adapter = new RecycleViewAdapter(getContext(),movies);

        RecyclerView newrv = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        Log.d("CHARACTER FRAGMENT", "onCreateView: ");
        //RecycleViewAdapter adapter = new RecycleViewAdapter(getContext(),characters);

        layoutManager = new GridLayoutManager(getContext(),2);
        newrv.setAdapter(adapter);
        newrv.setLayoutManager(layoutManager);
        return rootView;

    }
}