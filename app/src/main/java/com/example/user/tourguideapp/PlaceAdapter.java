package com.example.user.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Katia on 05/05/2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {
    private ArrayList<Place> placeData;

    public PlaceAdapter(ArrayList<Place> placeData) {
            this.placeData = placeData;
            }

    // Create new views
    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Create view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // Replace the contents of a view
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get element from the dataset

        holder.name.setText(placeData.get(position).getName());
        holder.address.setText(placeData.get(position).getAddress());
        if (placeData.get(position).hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.image.setImageResource(placeData.get(position).getImageResourceId());
            // Make sure the view is visible
            holder.image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.image.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
            return placeData.size();
            }

    // VieHolder to store each of the component views inside the tag field of the layout
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name;
        private TextView address;
        private ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            address = (TextView) itemView.findViewById(R.id.address);
        }

        @Override
        public void onClick(View view) {
            // Required to declare onClick method
        }
    }
}
