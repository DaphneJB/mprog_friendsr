package com.example.friendsr;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        Friend retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");
        TextView name = findViewById(R.id.textName);
        name.setText(retrievedFriend.getName());
        TextView bio = findViewById(R.id.textBio);
        bio.setText(retrievedFriend.getBio());
        RatingBar bar = findViewById(R.id.ratingBar);
        bar.setRating(retrievedFriend.getRating());
        ImageView image = findViewById(R.id.profilePic);
        image.setImageResource(retrievedFriend.getDrawableId());
    }
}
