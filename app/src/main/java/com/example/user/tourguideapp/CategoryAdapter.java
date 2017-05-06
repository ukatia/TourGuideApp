package com.example.user.tourguideapp;

/**
 * Created by Katia on 04/05/2017.
 */


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    //App context
    private final Context context;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new MonumentsFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else if (position == 3) {
            return new RestaurantsFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.sights);
        } else if (position == 1) {
            return context.getString(R.string.monuments);
        } else if (position == 2) {
            return context.getString(R.string.museums);
        } else if (position == 3) {
            return context.getString(R.string.restaurants);
        } else {
            return context.getString(R.string.shopping);
        }
    }
}