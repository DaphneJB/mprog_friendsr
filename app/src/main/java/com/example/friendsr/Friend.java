package com.example.friendsr;

import java.io.Serializable;
/* Represents a friend with a name, a bio and a profile pic */

public class Friend implements Serializable {
    private String name, bio;
    private int drawableId;
    private float rating;

    //creates a friend with a given name, bio and drawableId
    public Friend(String theName, String theBio, int aDrawableId) {
        name = theName;
        bio = theBio;
        drawableId = aDrawableId;
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

    public void setRating(float rating) {
        this.rating = rating;
    }
}
