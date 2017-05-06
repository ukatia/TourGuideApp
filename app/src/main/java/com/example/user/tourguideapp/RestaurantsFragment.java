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

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_layout, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        ArrayList<Place> restaurants = new ArrayList<Place>();

        restaurants.add(new Place(R.string.seven_seas, R.string.seven_seas_address, R.drawable.ic_seven_seas));
        restaurants.add(new Place(R.string.xalaro, R.string.xalaro_address, R.drawable.ic_xalaro));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        PlaceAdapter adapter = new PlaceAdapter(restaurants);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
