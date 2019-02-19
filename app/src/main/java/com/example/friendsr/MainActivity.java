package com.example.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friend> friends = new ArrayList<>();
        friends.add(new Friend("Arya", "This is Arya Stark", getResources().getIdentifier("drawable/arya", "drawable", getPackageName())));
        friends.add(new Friend("Cersei", "This is Cersei Baratheon", getResources().getIdentifier("drawable/cersei", "drawable", getPackageName())));
        friends.add(new Friend("Daenerys", "This is Daenerys Targaryen", getResources().getIdentifier("drawable/daenerys", "drawable", getPackageName())));
        friends.add(new Friend("Jaime", "This is Jaime Lannister", getResources().getIdentifier("drawable/jaime", "drawable", getPackageName())));
        friends.add(new Friend("Jon", "This is Jon Snow", getResources().getIdentifier("drawable/jon", "drawable", getPackageName())));
        friends.add(new Friend("Jorah", "This is Jorah Mormont", getResources().getIdentifier("drawable/jorah", "drawable", getPackageName())));
        friends.add(new Friend("Margaery", "This is Margaery Tyrell", getResources().getIdentifier("drawable/margaery", "drawable", getPackageName())));
        friends.add(new Friend("Melisandre", "This is Melisandre", getResources().getIdentifier("drawable/melisandre", "drawable", getPackageName())));
        friends.add(new Friend("Sansa", "This is Sansa Stark", getResources().getIdentifier("drawable/sansa", "drawable", getPackageName())));
        friends.add(new Friend("Tyrion", "This is Tyrion Lannister", getResources().getIdentifier("drawable/tyrion", "drawable", getPackageName())));

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        GridView view = findViewById(R.id.grid);
        view.setOnItemClickListener(new clickListener());
        view.setAdapter(adapter);
    }

    private class clickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            System.out.println("friend: " + clickedFriend.getName());
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);

        }
    }
}
