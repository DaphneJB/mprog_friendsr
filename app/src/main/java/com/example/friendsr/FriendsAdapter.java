package com.example.friendsr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/* Represents an adapter that takes a list of friends and formats it to display*/

public class FriendsAdapter extends ArrayAdapter<Friend> {
    private ArrayList<Friend>friends;

    public FriendsAdapter( Context context, int resource, ArrayList<Friend>objects) {
        super(context, resource, objects);
        friends = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        ImageView view = convertView.findViewById(R.id.profile);
        view.setImageResource(friends.get(position).getDrawableId()); //sets the profile pic of the friend
        TextView textV = convertView.findViewById(R.id.text); //sets the name of the friend
        textV.setText(friends.get(position).getName());
        return convertView;

    }
}
