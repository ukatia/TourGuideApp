package com.example.user.tourguideapp;

/**
 * Created by Katia on 05/05/2017.
 */

public class Place {

    // Name of the place
    private final int name;

    // Address of the place
    private final int address;

    // Image resource ID of the place
    private int imageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructors - Create a new Place object
    public Place(int name, int address) {
        this.name = name;
        this.address = address;
    }

    public Place(int name, int address, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    // Get the name of the place
    public int getName() {
        return name;
    }

    // Get the address of the place
    public int getAddress() { return address; }

    // Get the image resource ID of the place
    public int getImageResourceId() {
        return imageResourceId;
    }

    // Returns whether or not there is an image for this [;ace.
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
