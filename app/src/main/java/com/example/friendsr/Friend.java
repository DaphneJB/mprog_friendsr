package com.example.friendsr;

import java.io.Serializable;

public class Friend implements Serializable {
    private String name, bio;
    private int drawableId;
    private float rating;

    public Friend(String theName, String theBio, int aDrawableId) {
        name = theName;
        bio = theBio;
        drawableId = aDrawableId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getDrawableId() {

        return drawableId;
    }

    public float getRating() {

        return rating;
    }

    public void setRating(int rating) {

        this.rating = rating;
    }
}
