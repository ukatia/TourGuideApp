package com.example.user.tourguideapp;
;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Katia on 04/05/2017.
 */

public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_layout, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        ArrayList<Place> museums = new ArrayList<Place>();

        museums.add(new Place(R.string.archaeological_museum, R.string.archaeological_museum_address));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        PlaceAdapter adapter = new PlaceAdapter(museums);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
