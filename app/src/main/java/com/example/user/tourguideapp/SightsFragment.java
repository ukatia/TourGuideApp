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

public class SightsFragment extends Fragment {
    public SightsFragment() {
        // Empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_layout, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        ArrayList<Place> sights = new ArrayList<Place>();

        sights.add(new Place(R.string.white_tower, R.string.white_tower_address, R.drawable.ic_white_tower));
        sights.add(new Place(R.string.aristotelous_square, R.string.aristotelous_square_address, R.drawable.ic_aristotelous_square));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        PlaceAdapter adapter = new PlaceAdapter(sights);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
