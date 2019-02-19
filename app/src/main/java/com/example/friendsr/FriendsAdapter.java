package com.example.friendsr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class FriendsAdapter extends ArrayAdapter<Friend> {
    private ArrayList<Friend>friends;

    public FriendsAdapter( Context context, int resource, ArrayList<Friend>objects) {
        super(context, resource, objects);
        friends = objects;
        System.out.println("item: " + friends.get(0).getDrawableId());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        ImageView view = convertView.findViewById(R.id.profile);
        view.setImageResource(friends.get(position).getDrawableId());
        TextView textV = convertView.findViewById(R.id.text);
        textV.setText(friends.get(position).getName());
        return convertView;

    }
}
