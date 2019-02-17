package com.example.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Friend> friends = new ArrayList<>();
        friends.add(new Friend("Arya", "This is Arya Stark", getResources().getIdentifier("arya.png", "", "")));
        friends.add(new Friend("Cersei", "This is Cersei Baratheon", getResources().getIdentifier("cersei.png", "", "")));
        friends.add(new Friend("Daenerys", "This is Daenerys Targaryen", getResources().getIdentifier("daenerys.png", "", "")));
        friends.add(new Friend("Jaime", "This is Jaime Lannister", getResources().getIdentifier("jaime.png", "", "")));
        friends.add(new Friend("Jon", "This is Jon Snow", getResources().getIdentifier("jon.png", "", "")));
        friends.add(new Friend("Jorah", "This is Jorah Mormont", getResources().getIdentifier("jorah.png", "", "")));
        friends.add(new Friend("Margaery", "This is Margaery Tyrell", getResources().getIdentifier("margaery.png", "", "")));
        friends.add(new Friend("Melisandre", "This is Melisandre", getResources().getIdentifier("melisandre.png", "", "")));
        friends.add(new Friend("Sansa", "This is Sansa Stark", getResources().getIdentifier("sansa.png", "", "")));
        friends.add(new Friend("Tyrion", "This is Tyrion Lannister", getResources().getIdentifier("tyrion.png", "", "")));
    }
}
